package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.tgnet.TLRPC$TL_topPeer;

public final class MediaDataController$$ExternalSyntheticLambda123 implements Comparator {
    public static final MediaDataController$$ExternalSyntheticLambda123 INSTANCE = new MediaDataController$$ExternalSyntheticLambda123();

    private MediaDataController$$ExternalSyntheticLambda123() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$increasePeerRaiting$110;
        lambda$increasePeerRaiting$110 = MediaDataController.lambda$increasePeerRaiting$110((TLRPC$TL_topPeer) obj, (TLRPC$TL_topPeer) obj2);
        return lambda$increasePeerRaiting$110;
    }
}
