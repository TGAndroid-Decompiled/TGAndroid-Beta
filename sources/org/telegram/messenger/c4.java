package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class c4 implements Utilities.Callback {
    public final int f19911a = 0;
    public final long f19912b;
    public final BaseController f19913c;
    public final Object d;

    public c4(GiftAuctionController giftAuctionController, long j10, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState) {
        this.f19913c = giftAuctionController;
        this.f19912b = j10;
        this.d = tL_StarGiftAuctionState;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f19911a) {
            case 0:
                ((GiftAuctionController) this.f19913c).lambda$subscribeToGiftAuctionStateInternal$0(this.f19912b, (TL_payments.TL_StarGiftAuctionState) this.d, (ArrayList) obj);
                return;
            default:
                ((TranslateController) this.f19913c).lambda$checkTranslation$4((MessageObject) this.d, this.f19912b, (TLRPC.TL_textWithEntities) obj);
                return;
        }
    }

    public c4(TranslateController translateController, MessageObject messageObject, long j10) {
        this.f19913c = translateController;
        this.d = messageObject;
        this.f19912b = j10;
    }
}
