package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class d4 implements Utilities.Callback {
    public final int f17471a = 0;
    public final long f17472b;
    public final BaseController f17473c;
    public final Object d;

    public d4(GiftAuctionController giftAuctionController, long j3, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState) {
        this.f17473c = giftAuctionController;
        this.f17472b = j3;
        this.d = tL_StarGiftAuctionState;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f17471a) {
            case 0:
                ((GiftAuctionController) this.f17473c).lambda$subscribeToGiftAuctionStateInternal$0(this.f17472b, (TL_payments.TL_StarGiftAuctionState) this.d, (ArrayList) obj);
                return;
            default:
                ((TranslateController) this.f17473c).lambda$checkTranslation$4((MessageObject) this.d, this.f17472b, (TLRPC.TL_textWithEntities) obj);
                return;
        }
    }

    public d4(TranslateController translateController, MessageObject messageObject, long j3) {
        this.f17473c = translateController;
        this.d = messageObject;
        this.f17472b = j3;
    }
}
