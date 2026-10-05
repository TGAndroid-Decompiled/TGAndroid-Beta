package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class d4 implements Utilities.Callback {
    public final int f17628a = 0;
    public final long f17629b;
    public final BaseController f17630c;
    public final Object d;

    public d4(GiftAuctionController giftAuctionController, long j3, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState) {
        this.f17630c = giftAuctionController;
        this.f17629b = j3;
        this.d = tL_StarGiftAuctionState;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f17628a) {
            case 0:
                ((GiftAuctionController) this.f17630c).lambda$subscribeToGiftAuctionStateInternal$0(this.f17629b, (TL_payments.TL_StarGiftAuctionState) this.d, (ArrayList) obj);
                return;
            default:
                ((TranslateController) this.f17630c).lambda$checkTranslation$4((MessageObject) this.d, this.f17629b, (TLRPC.TL_textWithEntities) obj);
                return;
        }
    }

    public d4(TranslateController translateController, MessageObject messageObject, long j3) {
        this.f17630c = translateController;
        this.d = messageObject;
        this.f17629b = j3;
    }
}
