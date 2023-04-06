package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.tgnet.TLRPC$TL_topPeer;
public final class MediaDataController$$ExternalSyntheticLambda160 implements Comparator {
    public static final MediaDataController$$ExternalSyntheticLambda160 INSTANCE = new MediaDataController$$ExternalSyntheticLambda160();

    private MediaDataController$$ExternalSyntheticLambda160() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$increasePeerRaiting$144;
        lambda$increasePeerRaiting$144 = MediaDataController.lambda$increasePeerRaiting$144((TLRPC$TL_topPeer) obj, (TLRPC$TL_topPeer) obj2);
        return lambda$increasePeerRaiting$144;
    }
}
