package org.telegram.messenger.utils;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.UsersSelectActivity;

public final class SearchTextWatcher implements TextWatcher {
    public boolean doNotCloseAfterFieldEmpty;
    public final UsersSelectActivity.AnonymousClass4 editText;
    public final OKLCH listener;
    public boolean searchIsExpanded;
    public String searchQuery;

    public SearchTextWatcher(UsersSelectActivity.AnonymousClass4 anonymousClass4, OKLCH oklch) {
        this.listener = oklch;
        this.editText = anonymousClass4;
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
        OKLCH oklch = this.listener;
        if (oklch.canToggleSearch()) {
            if (z) {
                oklch.onSearchExpand();
            } else {
                oklch.onSearchCollapse();
            }
            this.searchIsExpanded = z;
        }
    }
}
