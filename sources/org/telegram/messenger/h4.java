package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class h4 implements Utilities.Callback {
    public final int f17748a = 0;
    public final long f17749b;
    public final BaseController f17750c;
    public final Object d;

    public h4(GiftAuctionController giftAuctionController, long j3, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState) {
        this.f17750c = giftAuctionController;
        this.f17749b = j3;
        this.d = tL_StarGiftAuctionState;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f17748a) {
            case 0:
                ((GiftAuctionController) this.f17750c).lambda$subscribeToGiftAuctionStateInternal$0(this.f17749b, (TL_payments.TL_StarGiftAuctionState) this.d, (ArrayList) obj);
                return;
            default:
                ((TranslateController) this.f17750c).lambda$checkTranslation$4((MessageObject) this.d, this.f17749b, (TLRPC.TL_textWithEntities) obj);
                return;
        }
    }

    public h4(TranslateController translateController, MessageObject messageObject, long j3) {
        this.f17750c = translateController;
        this.d = messageObject;
        this.f17749b = j3;
    }
}
