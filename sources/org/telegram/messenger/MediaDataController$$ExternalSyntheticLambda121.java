package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.tgnet.TLRPC$TL_topPeer;

public final class MediaDataController$$ExternalSyntheticLambda121 implements Comparator {
    public static final MediaDataController$$ExternalSyntheticLambda121 INSTANCE = new MediaDataController$$ExternalSyntheticLambda121();

    private MediaDataController$$ExternalSyntheticLambda121() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$increaseInlineRaiting$104;
        lambda$increaseInlineRaiting$104 = MediaDataController.lambda$increaseInlineRaiting$104((TLRPC$TL_topPeer) obj, (TLRPC$TL_topPeer) obj2);
        return lambda$increaseInlineRaiting$104;
    }
}
