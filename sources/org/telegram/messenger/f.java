package org.telegram.messenger;

import android.text.util.Linkify;
public final class f implements Linkify.MatchFilter {
    @Override
    public final boolean acceptMatch(CharSequence charSequence, int i7, int i10) {
        if (i7 == 0 || charSequence.charAt(i7 - 1) != '@') {
            return true;
        }
        return false;
    }
}
