package org.telegram.messenger;

import android.text.util.Linkify;

public final class AndroidUtilities$$ExternalSyntheticLambda3 implements Linkify.MatchFilter {
    public static final AndroidUtilities$$ExternalSyntheticLambda3 INSTANCE = new AndroidUtilities$$ExternalSyntheticLambda3();

    private AndroidUtilities$$ExternalSyntheticLambda3() {
    }

    @Override
    public final boolean acceptMatch(CharSequence charSequence, int i, int i2) {
        boolean lambda$static$2;
        lambda$static$2 = AndroidUtilities.lambda$static$2(charSequence, i, i2);
        return lambda$static$2;
    }
}
