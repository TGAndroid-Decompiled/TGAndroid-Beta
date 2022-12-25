package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.messenger.SharedConfig;

public final class SharedConfig$$ExternalSyntheticLambda5 implements Comparator {
    public static final SharedConfig$$ExternalSyntheticLambda5 INSTANCE = new SharedConfig$$ExternalSyntheticLambda5();

    private SharedConfig$$ExternalSyntheticLambda5() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$checkKeepMedia$1;
        lambda$checkKeepMedia$1 = SharedConfig.lambda$checkKeepMedia$1((SharedConfig.FileInfoInternal) obj, (SharedConfig.FileInfoInternal) obj2);
        return lambda$checkKeepMedia$1;
    }
}
