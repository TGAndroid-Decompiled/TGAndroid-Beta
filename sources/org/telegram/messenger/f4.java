package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class f4 implements Utilities.Callback {
    public final int f17163a = 0;
    public final long f17164b;
    public final BaseController f17165c;
    public final Object d;

    public f4(GiftAuctionController giftAuctionController, long j10, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState) {
        this.f17165c = giftAuctionController;
        this.f17164b = j10;
        this.d = tL_StarGiftAuctionState;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f17163a) {
            case 0:
                ((GiftAuctionController) this.f17165c).lambda$subscribeToGiftAuctionStateInternal$0(this.f17164b, (TL_payments.TL_StarGiftAuctionState) this.d, (ArrayList) obj);
                return;
            default:
                ((TranslateController) this.f17165c).lambda$checkTranslation$4((MessageObject) this.d, this.f17164b, (TLRPC.TL_textWithEntities) obj);
                return;
        }
    }

    public f4(TranslateController translateController, MessageObject messageObject, long j10) {
        this.f17165c = translateController;
        this.d = messageObject;
        this.f17164b = j10;
    }
}
