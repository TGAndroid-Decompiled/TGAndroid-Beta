package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.tgnet.TLRPC$MessageEntity;

public final class MediaDataController$$ExternalSyntheticLambda126 implements Comparator {
    public static final MediaDataController$$ExternalSyntheticLambda126 INSTANCE = new MediaDataController$$ExternalSyntheticLambda126();

    private MediaDataController$$ExternalSyntheticLambda126() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$static$120;
        lambda$static$120 = MediaDataController.lambda$static$120((TLRPC$MessageEntity) obj, (TLRPC$MessageEntity) obj2);
        return lambda$static$120;
    }
}
