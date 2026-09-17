package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class c4 implements Utilities.Callback {
    public final int f17325a = 0;
    public final long f17326b;
    public final BaseController f17327c;
    public final Object d;

    public c4(GiftAuctionController giftAuctionController, long j3, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState) {
        this.f17327c = giftAuctionController;
        this.f17326b = j3;
        this.d = tL_StarGiftAuctionState;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f17325a) {
            case 0:
                ((GiftAuctionController) this.f17327c).lambda$subscribeToGiftAuctionStateInternal$0(this.f17326b, (TL_payments.TL_StarGiftAuctionState) this.d, (ArrayList) obj);
                return;
            default:
                ((TranslateController) this.f17327c).lambda$checkTranslation$4((MessageObject) this.d, this.f17326b, (TLRPC.TL_textWithEntities) obj);
                return;
        }
    }

    public c4(TranslateController translateController, MessageObject messageObject, long j3) {
        this.f17327c = translateController;
        this.d = messageObject;
        this.f17326b = j3;
    }
}
