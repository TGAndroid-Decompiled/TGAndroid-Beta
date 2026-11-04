package org.telegram.messenger;

import android.text.util.Linkify;
public final class f implements Linkify.MatchFilter {
    @Override
    public final boolean acceptMatch(CharSequence charSequence, int i3, int i10) {
        if (i3 == 0 || charSequence.charAt(i3 - 1) != '@') {
            return true;
        }
        return false;
    }
}
