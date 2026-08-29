package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class e4 implements Utilities.Callback {
    public final int f20092a = 0;
    public final long f20093b;
    public final BaseController f20094c;
    public final Object d;

    public e4(GiftAuctionController giftAuctionController, long j10, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState) {
        this.f20094c = giftAuctionController;
        this.f20093b = j10;
        this.d = tL_StarGiftAuctionState;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f20092a) {
            case 0:
                ((GiftAuctionController) this.f20094c).lambda$subscribeToGiftAuctionStateInternal$0(this.f20093b, (TL_payments.TL_StarGiftAuctionState) this.d, (ArrayList) obj);
                return;
            default:
                ((TranslateController) this.f20094c).lambda$checkTranslation$4((MessageObject) this.d, this.f20093b, (TLRPC.TL_textWithEntities) obj);
                return;
        }
    }

    public e4(TranslateController translateController, MessageObject messageObject, long j10) {
        this.f20094c = translateController;
        this.d = messageObject;
        this.f20093b = j10;
    }
}
