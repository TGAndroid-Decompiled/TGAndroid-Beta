package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
public final class TopicsController$$ExternalSyntheticLambda26 implements RequestDelegate {
    public static final TopicsController$$ExternalSyntheticLambda26 INSTANCE = new TopicsController$$ExternalSyntheticLambda26();

    private TopicsController$$ExternalSyntheticLambda26() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        TopicsController.lambda$toggleShowTopic$14(tLObject, tLRPC$TL_error);
    }
}
