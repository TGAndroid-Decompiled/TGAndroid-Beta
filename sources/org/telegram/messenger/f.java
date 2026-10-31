package org.telegram.messenger;

import android.text.util.Linkify;
public final class f implements Linkify.MatchFilter {
    @Override
    public final boolean acceptMatch(CharSequence charSequence, int i10, int i11) {
        if (i10 == 0 || charSequence.charAt(i10 - 1) != '@') {
            return true;
        }
        return false;
    }
}
