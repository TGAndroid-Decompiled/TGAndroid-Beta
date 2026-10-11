package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class e4 implements Utilities.Callback {
    public final int f17700a = 0;
    public final long f17701b;
    public final BaseController f17702c;
    public final Object d;

    public e4(GiftAuctionController giftAuctionController, long j3, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState) {
        this.f17702c = giftAuctionController;
        this.f17701b = j3;
        this.d = tL_StarGiftAuctionState;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f17700a) {
            case 0:
                ((GiftAuctionController) this.f17702c).lambda$subscribeToGiftAuctionStateInternal$0(this.f17701b, (TL_payments.TL_StarGiftAuctionState) this.d, (ArrayList) obj);
                return;
            default:
                ((TranslateController) this.f17702c).lambda$checkTranslation$4((MessageObject) this.d, this.f17701b, (TLRPC.TL_textWithEntities) obj);
                return;
        }
    }

    public e4(TranslateController translateController, MessageObject messageObject, long j3) {
        this.f17702c = translateController;
        this.d = messageObject;
        this.f17701b = j3;
    }
}
