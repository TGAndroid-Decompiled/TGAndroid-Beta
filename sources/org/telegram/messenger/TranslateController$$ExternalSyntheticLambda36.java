package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;

public final class TranslateController$$ExternalSyntheticLambda36 implements Utilities.Callback {
    public final int $r8$classId = 1;
    public final BaseController f$0;
    public final Object f$1;
    public final long f$2;

    public TranslateController$$ExternalSyntheticLambda36(GiftAuctionController giftAuctionController, long j, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState) {
        this.f$0 = giftAuctionController;
        this.f$2 = j;
        this.f$1 = tL_StarGiftAuctionState;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((TranslateController) this.f$0).lambda$checkTranslation$4((MessageObject) this.f$1, this.f$2, (TLRPC.TL_textWithEntities) obj);
                break;
            default:
                ((GiftAuctionController) this.f$0).lambda$subscribeToGiftAuctionStateInternal$0(this.f$2, (TL_payments.TL_StarGiftAuctionState) this.f$1, (ArrayList) obj);
                break;
        }
    }

    public TranslateController$$ExternalSyntheticLambda36(TranslateController translateController, MessageObject messageObject, long j) {
        this.f$0 = translateController;
        this.f$1 = messageObject;
        this.f$2 = j;
    }
}
