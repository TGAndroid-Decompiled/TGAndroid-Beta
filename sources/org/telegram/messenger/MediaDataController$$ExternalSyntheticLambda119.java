package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.tgnet.TLRPC$MessageEntity;

public final class MediaDataController$$ExternalSyntheticLambda119 implements Comparator {
    public static final MediaDataController$$ExternalSyntheticLambda119 INSTANCE = new MediaDataController$$ExternalSyntheticLambda119();

    private MediaDataController$$ExternalSyntheticLambda119() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$getTextStyleRuns$130;
        lambda$getTextStyleRuns$130 = MediaDataController.lambda$getTextStyleRuns$130((TLRPC$MessageEntity) obj, (TLRPC$MessageEntity) obj2);
        return lambda$getTextStyleRuns$130;
    }
}
