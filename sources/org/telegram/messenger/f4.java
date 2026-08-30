package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class f4 implements Utilities.Callback {
    public final int f17183a = 0;
    public final long f17184b;
    public final BaseController f17185c;
    public final Object d;

    public f4(GiftAuctionController giftAuctionController, long j10, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState) {
        this.f17185c = giftAuctionController;
        this.f17184b = j10;
        this.d = tL_StarGiftAuctionState;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f17183a) {
            case 0:
                ((GiftAuctionController) this.f17185c).lambda$subscribeToGiftAuctionStateInternal$0(this.f17184b, (TL_payments.TL_StarGiftAuctionState) this.d, (ArrayList) obj);
                return;
            default:
                ((TranslateController) this.f17185c).lambda$checkTranslation$4((MessageObject) this.d, this.f17184b, (TLRPC.TL_textWithEntities) obj);
                return;
        }
    }

    public f4(TranslateController translateController, MessageObject messageObject, long j10) {
        this.f17185c = translateController;
        this.d = messageObject;
        this.f17184b = j10;
    }
}
