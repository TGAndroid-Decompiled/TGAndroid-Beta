package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.tgnet.TLRPC$TL_topPeer;

public final class MediaDataController$$ExternalSyntheticLambda120 implements Comparator {
    public static final MediaDataController$$ExternalSyntheticLambda120 INSTANCE = new MediaDataController$$ExternalSyntheticLambda120();

    private MediaDataController$$ExternalSyntheticLambda120() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$increasePeerRaiting$107;
        lambda$increasePeerRaiting$107 = MediaDataController.lambda$increasePeerRaiting$107((TLRPC$TL_topPeer) obj, (TLRPC$TL_topPeer) obj2);
        return lambda$increasePeerRaiting$107;
    }
}
