package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.tgnet.TLRPC$MessageEntity;
public final class MediaDataController$$ExternalSyntheticLambda158 implements Comparator {
    public static final MediaDataController$$ExternalSyntheticLambda158 INSTANCE = new MediaDataController$$ExternalSyntheticLambda158();

    private MediaDataController$$ExternalSyntheticLambda158() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$static$149;
        lambda$static$149 = MediaDataController.lambda$static$149((TLRPC$MessageEntity) obj, (TLRPC$MessageEntity) obj2);
        return lambda$static$149;
    }
}
