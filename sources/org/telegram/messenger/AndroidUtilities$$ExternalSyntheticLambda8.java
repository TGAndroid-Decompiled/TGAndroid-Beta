package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.messenger.AndroidUtilities;

public final class AndroidUtilities$$ExternalSyntheticLambda8 implements Comparator {
    public static final AndroidUtilities$$ExternalSyntheticLambda8 INSTANCE = new AndroidUtilities$$ExternalSyntheticLambda8();

    private AndroidUtilities$$ExternalSyntheticLambda8() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$pruneOverlaps$1;
        lambda$pruneOverlaps$1 = AndroidUtilities.lambda$pruneOverlaps$1((AndroidUtilities.LinkSpec) obj, (AndroidUtilities.LinkSpec) obj2);
        return lambda$pruneOverlaps$1;
    }
}
