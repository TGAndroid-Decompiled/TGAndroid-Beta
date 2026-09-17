package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class c4 implements Utilities.Callback {
    public final int f17352a = 0;
    public final long f17353b;
    public final BaseController f17354c;
    public final Object d;

    public c4(GiftAuctionController giftAuctionController, long j3, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState) {
        this.f17354c = giftAuctionController;
        this.f17353b = j3;
        this.d = tL_StarGiftAuctionState;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f17352a) {
            case 0:
                ((GiftAuctionController) this.f17354c).lambda$subscribeToGiftAuctionStateInternal$0(this.f17353b, (TL_payments.TL_StarGiftAuctionState) this.d, (ArrayList) obj);
                return;
            default:
                ((TranslateController) this.f17354c).lambda$checkTranslation$4((MessageObject) this.d, this.f17353b, (TLRPC.TL_textWithEntities) obj);
                return;
        }
    }

    public c4(TranslateController translateController, MessageObject messageObject, long j3) {
        this.f17354c = translateController;
        this.d = messageObject;
        this.f17353b = j3;
    }
}
