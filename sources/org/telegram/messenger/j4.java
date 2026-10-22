package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class j4 implements Utilities.Callback {
    public final int f18649a = 0;
    public final long f18650b;
    public final BaseController f18651c;
    public final Object d;

    public j4(GiftAuctionController giftAuctionController, long j10, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState) {
        this.f18651c = giftAuctionController;
        this.f18650b = j10;
        this.d = tL_StarGiftAuctionState;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18649a) {
            case 0:
                ((GiftAuctionController) this.f18651c).lambda$subscribeToGiftAuctionStateInternal$0(this.f18650b, (TL_payments.TL_StarGiftAuctionState) this.d, (ArrayList) obj);
                return;
            default:
                ((TranslateController) this.f18651c).lambda$checkTranslation$4((MessageObject) this.d, this.f18650b, (TLRPC.TL_textWithEntities) obj);
                return;
        }
    }

    public j4(TranslateController translateController, MessageObject messageObject, long j10) {
        this.f18651c = translateController;
        this.d = messageObject;
        this.f18650b = j10;
    }
}
