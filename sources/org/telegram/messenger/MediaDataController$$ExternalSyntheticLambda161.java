package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.tgnet.TLRPC$TL_topPeer;
public final class MediaDataController$$ExternalSyntheticLambda161 implements Comparator {
    public static final MediaDataController$$ExternalSyntheticLambda161 INSTANCE = new MediaDataController$$ExternalSyntheticLambda161();

    private MediaDataController$$ExternalSyntheticLambda161() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$increaseInlineRaiting$141;
        lambda$increaseInlineRaiting$141 = MediaDataController.lambda$increaseInlineRaiting$141((TLRPC$TL_topPeer) obj, (TLRPC$TL_topPeer) obj2);
        return lambda$increaseInlineRaiting$141;
    }
}
