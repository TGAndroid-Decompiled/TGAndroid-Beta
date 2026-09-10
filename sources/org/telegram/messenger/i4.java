package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class i4 implements Utilities.Callback {
    public final int f15424a = 0;
    public final long f15425b;
    public final BaseController f15426c;
    public final Object d;

    public i4(GiftAuctionController giftAuctionController, long j3, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState) {
        this.f15426c = giftAuctionController;
        this.f15425b = j3;
        this.d = tL_StarGiftAuctionState;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f15424a) {
            case 0:
                ((GiftAuctionController) this.f15426c).lambda$subscribeToGiftAuctionStateInternal$0(this.f15425b, (TL_payments.TL_StarGiftAuctionState) this.d, (ArrayList) obj);
                return;
            default:
                ((TranslateController) this.f15426c).lambda$checkTranslation$4((MessageObject) this.d, this.f15425b, (TLRPC.TL_textWithEntities) obj);
                return;
        }
    }

    public i4(TranslateController translateController, MessageObject messageObject, long j3) {
        this.f15426c = translateController;
        this.d = messageObject;
        this.f15425b = j3;
    }
}
