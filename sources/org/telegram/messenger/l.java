package org.telegram.messenger;

import android.text.util.Linkify;

public final class l implements Linkify.MatchFilter {
    @Override
    public final boolean acceptMatch(CharSequence charSequence, int i10, int i11) {
        return AndroidUtilities.lambda$static$7(charSequence, i10, i11);
    }
}
