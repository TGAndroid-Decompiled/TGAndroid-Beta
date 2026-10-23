package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class i4 implements Utilities.Callback {
    public final int f18582a = 0;
    public final long f18583b;
    public final BaseController f18584c;
    public final Object d;

    public i4(GiftAuctionController giftAuctionController, long j10, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState) {
        this.f18584c = giftAuctionController;
        this.f18583b = j10;
        this.d = tL_StarGiftAuctionState;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18582a) {
            case 0:
                ((GiftAuctionController) this.f18584c).lambda$subscribeToGiftAuctionStateInternal$0(this.f18583b, (TL_payments.TL_StarGiftAuctionState) this.d, (ArrayList) obj);
                return;
            default:
                ((TranslateController) this.f18584c).lambda$checkTranslation$4((MessageObject) this.d, this.f18583b, (TLRPC.TL_textWithEntities) obj);
                return;
        }
    }

    public i4(TranslateController translateController, MessageObject messageObject, long j10) {
        this.f18584c = translateController;
        this.d = messageObject;
        this.f18583b = j10;
    }
}
