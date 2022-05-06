package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.tgnet.TLRPC$TL_topPeer;

public final class MediaDataController$$ExternalSyntheticLambda122 implements Comparator {
    public static final MediaDataController$$ExternalSyntheticLambda122 INSTANCE = new MediaDataController$$ExternalSyntheticLambda122();

    private MediaDataController$$ExternalSyntheticLambda122() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$increaseInlineRaiting$107;
        lambda$increaseInlineRaiting$107 = MediaDataController.lambda$increaseInlineRaiting$107((TLRPC$TL_topPeer) obj, (TLRPC$TL_topPeer) obj2);
        return lambda$increaseInlineRaiting$107;
    }
}
