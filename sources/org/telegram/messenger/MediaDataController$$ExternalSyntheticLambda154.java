package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.tgnet.TLRPC$TL_topPeer;

public final class MediaDataController$$ExternalSyntheticLambda154 implements Comparator {
    public static final MediaDataController$$ExternalSyntheticLambda154 INSTANCE = new MediaDataController$$ExternalSyntheticLambda154();

    private MediaDataController$$ExternalSyntheticLambda154() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$increaseInlineRaiting$135;
        lambda$increaseInlineRaiting$135 = MediaDataController.lambda$increaseInlineRaiting$135((TLRPC$TL_topPeer) obj, (TLRPC$TL_topPeer) obj2);
        return lambda$increaseInlineRaiting$135;
    }
}
