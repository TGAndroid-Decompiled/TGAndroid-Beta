package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.tgnet.TLRPC$MessageEntity;

public final class MediaDataController$$ExternalSyntheticLambda152 implements Comparator {
    public static final MediaDataController$$ExternalSyntheticLambda152 INSTANCE = new MediaDataController$$ExternalSyntheticLambda152();

    private MediaDataController$$ExternalSyntheticLambda152() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$getTextStyleRuns$161;
        lambda$getTextStyleRuns$161 = MediaDataController.lambda$getTextStyleRuns$161((TLRPC$MessageEntity) obj, (TLRPC$MessageEntity) obj2);
        return lambda$getTextStyleRuns$161;
    }
}
