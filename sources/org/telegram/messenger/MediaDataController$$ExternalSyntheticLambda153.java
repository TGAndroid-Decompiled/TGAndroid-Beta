package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.tgnet.TLRPC$MessageEntity;

public final class MediaDataController$$ExternalSyntheticLambda153 implements Comparator {
    public static final MediaDataController$$ExternalSyntheticLambda153 INSTANCE = new MediaDataController$$ExternalSyntheticLambda153();

    private MediaDataController$$ExternalSyntheticLambda153() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$static$143;
        lambda$static$143 = MediaDataController.lambda$static$143((TLRPC$MessageEntity) obj, (TLRPC$MessageEntity) obj2);
        return lambda$static$143;
    }
}
