package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class d4 implements Utilities.Callback {
    public final int f16122a = 0;
    public final long f16123b;
    public final BaseController f16124c;
    public final Object d;

    public d4(GiftAuctionController giftAuctionController, long j3, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState) {
        this.f16124c = giftAuctionController;
        this.f16123b = j3;
        this.d = tL_StarGiftAuctionState;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f16122a) {
            case 0:
                ((GiftAuctionController) this.f16124c).lambda$subscribeToGiftAuctionStateInternal$0(this.f16123b, (TL_payments.TL_StarGiftAuctionState) this.d, (ArrayList) obj);
                return;
            default:
                ((TranslateController) this.f16124c).lambda$checkTranslation$4((MessageObject) this.d, this.f16123b, (TLRPC.TL_textWithEntities) obj);
                return;
        }
    }

    public d4(TranslateController translateController, MessageObject messageObject, long j3) {
        this.f16124c = translateController;
        this.d = messageObject;
        this.f16123b = j3;
    }
}
