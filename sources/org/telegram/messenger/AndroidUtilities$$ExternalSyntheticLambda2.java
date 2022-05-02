package org.telegram.messenger;

import android.text.util.Linkify;

public final class AndroidUtilities$$ExternalSyntheticLambda2 implements Linkify.MatchFilter {
    public static final AndroidUtilities$$ExternalSyntheticLambda2 INSTANCE = new AndroidUtilities$$ExternalSyntheticLambda2();

    private AndroidUtilities$$ExternalSyntheticLambda2() {
    }

    @Override
    public final boolean acceptMatch(CharSequence charSequence, int i, int i2) {
        boolean lambda$static$2;
        lambda$static$2 = AndroidUtilities.lambda$static$2(charSequence, i, i2);
        return lambda$static$2;
    }
}
