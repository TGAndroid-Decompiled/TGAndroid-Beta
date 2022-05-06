package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.tgnet.TLRPC$MessageEntity;

public final class MediaDataController$$ExternalSyntheticLambda120 implements Comparator {
    public static final MediaDataController$$ExternalSyntheticLambda120 INSTANCE = new MediaDataController$$ExternalSyntheticLambda120();

    private MediaDataController$$ExternalSyntheticLambda120() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$static$115;
        lambda$static$115 = MediaDataController.lambda$static$115((TLRPC$MessageEntity) obj, (TLRPC$MessageEntity) obj2);
        return lambda$static$115;
    }
}
