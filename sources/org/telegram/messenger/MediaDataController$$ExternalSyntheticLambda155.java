package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.tgnet.TLRPC$TL_topPeer;

public final class MediaDataController$$ExternalSyntheticLambda155 implements Comparator {
    public static final MediaDataController$$ExternalSyntheticLambda155 INSTANCE = new MediaDataController$$ExternalSyntheticLambda155();

    private MediaDataController$$ExternalSyntheticLambda155() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$increasePeerRaiting$138;
        lambda$increasePeerRaiting$138 = MediaDataController.lambda$increasePeerRaiting$138((TLRPC$TL_topPeer) obj, (TLRPC$TL_topPeer) obj2);
        return lambda$increasePeerRaiting$138;
    }
}
