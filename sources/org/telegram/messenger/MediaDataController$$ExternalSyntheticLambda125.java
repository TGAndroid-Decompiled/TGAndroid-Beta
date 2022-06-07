package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.tgnet.TLRPC$MessageEntity;

public final class MediaDataController$$ExternalSyntheticLambda125 implements Comparator {
    public static final MediaDataController$$ExternalSyntheticLambda125 INSTANCE = new MediaDataController$$ExternalSyntheticLambda125();

    private MediaDataController$$ExternalSyntheticLambda125() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$getTextStyleRuns$138;
        lambda$getTextStyleRuns$138 = MediaDataController.lambda$getTextStyleRuns$138((TLRPC$MessageEntity) obj, (TLRPC$MessageEntity) obj2);
        return lambda$getTextStyleRuns$138;
    }
}
