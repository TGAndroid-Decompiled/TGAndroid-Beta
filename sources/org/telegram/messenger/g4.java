package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class g4 implements Utilities.Callback {
    public final int f18416a = 0;
    public final long f18417b;
    public final BaseController f18418c;
    public final Object d;

    public g4(GiftAuctionController giftAuctionController, long j10, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState) {
        this.f18418c = giftAuctionController;
        this.f18417b = j10;
        this.d = tL_StarGiftAuctionState;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18416a) {
            case 0:
                ((GiftAuctionController) this.f18418c).lambda$subscribeToGiftAuctionStateInternal$0(this.f18417b, (TL_payments.TL_StarGiftAuctionState) this.d, (ArrayList) obj);
                return;
            default:
                ((TranslateController) this.f18418c).lambda$checkTranslation$4((MessageObject) this.d, this.f18417b, (TLRPC.TL_textWithEntities) obj);
                return;
        }
    }

    public g4(TranslateController translateController, MessageObject messageObject, long j10) {
        this.f18418c = translateController;
        this.d = messageObject;
        this.f18417b = j10;
    }
}
