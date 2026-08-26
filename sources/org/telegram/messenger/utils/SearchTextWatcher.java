package org.telegram.messenger.utils;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import org.telegram.ui.ActionBar.ActionBarMenuItem;

public final class SearchTextWatcher implements TextWatcher {
    public boolean doNotCloseAfterFieldEmpty;
    public final EditText editText;
    public final ActionBarMenuItem.ActionBarMenuItemSearchListener listener;
    public boolean searchIsExpanded;
    public String searchQuery;

    public SearchTextWatcher(EditText editText, ActionBarMenuItem.ActionBarMenuItemSearchListener actionBarMenuItemSearchListener) {
        this.listener = actionBarMenuItemSearchListener;
        this.editText = editText;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String string = editable.toString();
        boolean zIsEmpty = TextUtils.isEmpty(this.searchQuery);
        boolean zIsEmpty2 = TextUtils.isEmpty(string);
        if (zIsEmpty && !zIsEmpty2) {
            toggleSearch(true);
        }
        this.searchQuery = string;
        this.listener.onTextChanged(this.editText);
        if (zIsEmpty || !zIsEmpty2 || this.doNotCloseAfterFieldEmpty) {
            return;
        }
        toggleSearch(false);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void setDoNotCloseAfterFieldEmpty() {
        this.doNotCloseAfterFieldEmpty = true;
    }

    public final void toggleSearch(boolean z) {
        if (this.searchIsExpanded == z) {
            return;
        }
        ActionBarMenuItem.ActionBarMenuItemSearchListener actionBarMenuItemSearchListener = this.listener;
        actionBarMenuItemSearchListener.onPreToggleSearch();
        if (actionBarMenuItemSearchListener.canToggleSearch()) {
            if (z) {
                actionBarMenuItemSearchListener.onSearchExpand();
            } else {
                actionBarMenuItemSearchListener.onSearchCollapse();
            }
            this.searchIsExpanded = z;
        }
    }
}
