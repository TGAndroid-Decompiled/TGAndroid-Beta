package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class l4 implements Utilities.Callback {
    public final int f20568a = 0;
    public final long f20569b;
    public final BaseController f20570c;
    public final Object d;

    public l4(GiftAuctionController giftAuctionController, long j10, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState) {
        this.f20570c = giftAuctionController;
        this.f20569b = j10;
        this.d = tL_StarGiftAuctionState;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f20568a) {
            case 0:
                ((GiftAuctionController) this.f20570c).lambda$subscribeToGiftAuctionStateInternal$0(this.f20569b, (TL_payments.TL_StarGiftAuctionState) this.d, (ArrayList) obj);
                return;
            default:
                ((TranslateController) this.f20570c).lambda$checkTranslation$4((MessageObject) this.d, this.f20569b, (TLRPC.TL_textWithEntities) obj);
                return;
        }
    }

    public l4(TranslateController translateController, MessageObject messageObject, long j10) {
        this.f20570c = translateController;
        this.d = messageObject;
        this.f20569b = j10;
    }
}
