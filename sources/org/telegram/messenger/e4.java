package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;

public final class e4 implements Utilities.Callback {

    public final int f20102a = 0;

    public final long f20103b;

    public final BaseController f20104c;
    public final Object d;

    public e4(GiftAuctionController giftAuctionController, long j10, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState) {
        this.f20104c = giftAuctionController;
        this.f20103b = j10;
        this.d = tL_StarGiftAuctionState;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f20102a) {
            case 0:
                ((GiftAuctionController) this.f20104c).lambda$subscribeToGiftAuctionStateInternal$0(this.f20103b, (TL_payments.TL_StarGiftAuctionState) this.d, (ArrayList) obj);
                break;
            default:
                ((TranslateController) this.f20104c).lambda$checkTranslation$4((MessageObject) this.d, this.f20103b, (TLRPC.TL_textWithEntities) obj);
                break;
        }
    }

    public e4(TranslateController translateController, MessageObject messageObject, long j10) {
        this.f20104c = translateController;
        this.d = messageObject;
        this.f20103b = j10;
    }
}
