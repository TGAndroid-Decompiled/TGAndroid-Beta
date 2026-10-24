package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class j4 implements Utilities.Callback {
    public final int f18717a = 0;
    public final long f18718b;
    public final BaseController f18719c;
    public final Object d;

    public j4(GiftAuctionController giftAuctionController, long j10, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState) {
        this.f18719c = giftAuctionController;
        this.f18718b = j10;
        this.d = tL_StarGiftAuctionState;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18717a) {
            case 0:
                ((GiftAuctionController) this.f18719c).lambda$subscribeToGiftAuctionStateInternal$0(this.f18718b, (TL_payments.TL_StarGiftAuctionState) this.d, (ArrayList) obj);
                return;
            default:
                ((TranslateController) this.f18719c).lambda$checkTranslation$4((MessageObject) this.d, this.f18718b, (TLRPC.TL_textWithEntities) obj);
                return;
        }
    }

    public j4(TranslateController translateController, MessageObject messageObject, long j10) {
        this.f18719c = translateController;
        this.d = messageObject;
        this.f18718b = j10;
    }
}
