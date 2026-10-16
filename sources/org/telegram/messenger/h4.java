package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class h4 implements Utilities.Callback {
    public final int f17066a = 0;
    public final long f17067b;
    public final BaseController f17068c;
    public final Object d;

    public h4(GiftAuctionController giftAuctionController, long j10, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState) {
        this.f17068c = giftAuctionController;
        this.f17067b = j10;
        this.d = tL_StarGiftAuctionState;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f17066a) {
            case 0:
                ((GiftAuctionController) this.f17068c).lambda$subscribeToGiftAuctionStateInternal$0(this.f17067b, (TL_payments.TL_StarGiftAuctionState) this.d, (ArrayList) obj);
                return;
            default:
                ((TranslateController) this.f17068c).lambda$checkTranslation$4((MessageObject) this.d, this.f17067b, (TLRPC.TL_textWithEntities) obj);
                return;
        }
    }

    public h4(TranslateController translateController, MessageObject messageObject, long j10) {
        this.f17068c = translateController;
        this.d = messageObject;
        this.f17067b = j10;
    }
}
