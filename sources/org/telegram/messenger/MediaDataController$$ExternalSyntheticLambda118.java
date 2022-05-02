package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.tgnet.TLRPC$MessageEntity;

public final class MediaDataController$$ExternalSyntheticLambda118 implements Comparator {
    public static final MediaDataController$$ExternalSyntheticLambda118 INSTANCE = new MediaDataController$$ExternalSyntheticLambda118();

    private MediaDataController$$ExternalSyntheticLambda118() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$static$112;
        lambda$static$112 = MediaDataController.lambda$static$112((TLRPC$MessageEntity) obj, (TLRPC$MessageEntity) obj2);
        return lambda$static$112;
    }
}
