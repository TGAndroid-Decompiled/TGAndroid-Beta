package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.tgnet.TLRPC$MessageEntity;

public final class MediaDataController$$ExternalSyntheticLambda121 implements Comparator {
    public static final MediaDataController$$ExternalSyntheticLambda121 INSTANCE = new MediaDataController$$ExternalSyntheticLambda121();

    private MediaDataController$$ExternalSyntheticLambda121() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$getTextStyleRuns$133;
        lambda$getTextStyleRuns$133 = MediaDataController.lambda$getTextStyleRuns$133((TLRPC$MessageEntity) obj, (TLRPC$MessageEntity) obj2);
        return lambda$getTextStyleRuns$133;
    }
}
