package org.telegram.messenger.utils;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import org.telegram.ui.ActionBar.ActionBarMenuItem;

public class SearchTextWatcher implements TextWatcher {
    private boolean doNotCloseAfterFieldEmpty;
    private final EditText editText;
    public final ActionBarMenuItem.ActionBarMenuItemSearchListener listener;
    private boolean searchIsExpanded;
    private String searchQuery;
    private final boolean toggleByFocus;

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public SearchTextWatcher(EditText editText, ActionBarMenuItem.ActionBarMenuItemSearchListener actionBarMenuItemSearchListener) {
        this(editText, actionBarMenuItemSearchListener, false);
    }

    public SearchTextWatcher(EditText editText, ActionBarMenuItem.ActionBarMenuItemSearchListener actionBarMenuItemSearchListener, boolean z) {
        this.listener = actionBarMenuItemSearchListener;
        this.editText = editText;
        this.toggleByFocus = z;
    }

    public void setDoNotCloseAfterFieldEmpty() {
        this.doNotCloseAfterFieldEmpty = true;
    }

    @Override
    public void afterTextChanged(Editable editable) {
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

    public boolean toggleSearch(boolean z) {
        if (this.searchIsExpanded == z) {
            return false;
        }
        this.listener.onPreToggleSearch();
        if (!this.listener.canToggleSearch()) {
            return false;
        }
        if (z) {
            this.listener.onSearchExpand();
        } else {
            this.listener.onSearchCollapse();
        }
        this.searchIsExpanded = z;
        return true;
    }
}
