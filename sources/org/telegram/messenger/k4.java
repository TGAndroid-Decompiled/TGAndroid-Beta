package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class k4 implements Utilities.Callback {
    public final int f20483a = 0;
    public final long f20484b;
    public final BaseController f20485c;
    public final Object d;

    public k4(GiftAuctionController giftAuctionController, long j10, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState) {
        this.f20485c = giftAuctionController;
        this.f20484b = j10;
        this.d = tL_StarGiftAuctionState;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f20483a) {
            case 0:
                ((GiftAuctionController) this.f20485c).lambda$subscribeToGiftAuctionStateInternal$0(this.f20484b, (TL_payments.TL_StarGiftAuctionState) this.d, (ArrayList) obj);
                return;
            default:
                ((TranslateController) this.f20485c).lambda$checkTranslation$4((MessageObject) this.d, this.f20484b, (TLRPC.TL_textWithEntities) obj);
                return;
        }
    }

    public k4(TranslateController translateController, MessageObject messageObject, long j10) {
        this.f20485c = translateController;
        this.d = messageObject;
        this.f20484b = j10;
    }
}
