package org.telegram.messenger;

import android.text.util.Linkify;
public final class l implements Linkify.MatchFilter {
    @Override
    public final boolean acceptMatch(CharSequence charSequence, int i9, int i10) {
        boolean lambda$static$7;
        lambda$static$7 = AndroidUtilities.lambda$static$7(charSequence, i9, i10);
        return lambda$static$7;
    }
}
