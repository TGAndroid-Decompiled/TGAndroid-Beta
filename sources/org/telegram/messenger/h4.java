package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class h4 implements Utilities.Callback {
    public final int f17369a = 0;
    public final long f17370b;
    public final BaseController f17371c;
    public final Object d;

    public h4(GiftAuctionController giftAuctionController, long j10, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState) {
        this.f17371c = giftAuctionController;
        this.f17370b = j10;
        this.d = tL_StarGiftAuctionState;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f17369a) {
            case 0:
                ((GiftAuctionController) this.f17371c).lambda$subscribeToGiftAuctionStateInternal$0(this.f17370b, (TL_payments.TL_StarGiftAuctionState) this.d, (ArrayList) obj);
                return;
            default:
                ((TranslateController) this.f17371c).lambda$checkTranslation$4((MessageObject) this.d, this.f17370b, (TLRPC.TL_textWithEntities) obj);
                return;
        }
    }

    public h4(TranslateController translateController, MessageObject messageObject, long j10) {
        this.f17371c = translateController;
        this.d = messageObject;
        this.f17370b = j10;
    }
}
