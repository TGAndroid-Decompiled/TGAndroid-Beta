package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.tgnet.TLRPC$MessageEntity;
public final class MediaDataController$$ExternalSyntheticLambda159 implements Comparator {
    public static final MediaDataController$$ExternalSyntheticLambda159 INSTANCE = new MediaDataController$$ExternalSyntheticLambda159();

    private MediaDataController$$ExternalSyntheticLambda159() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$getTextStyleRuns$168;
        lambda$getTextStyleRuns$168 = MediaDataController.lambda$getTextStyleRuns$168((TLRPC$MessageEntity) obj, (TLRPC$MessageEntity) obj2);
        return lambda$getTextStyleRuns$168;
    }
}
