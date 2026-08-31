package org.telegram.messenger;

import android.text.util.Linkify;
public final class k implements Linkify.MatchFilter {
    @Override
    public final boolean acceptMatch(CharSequence charSequence, int i10, int i11) {
        boolean lambda$static$7;
        lambda$static$7 = AndroidUtilities.lambda$static$7(charSequence, i10, i11);
        return lambda$static$7;
    }
}
