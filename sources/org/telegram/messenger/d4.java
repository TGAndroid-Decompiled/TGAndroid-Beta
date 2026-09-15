package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class d4 implements Utilities.Callback {
    public final int f15937a = 0;
    public final long f15938b;
    public final BaseController f15939c;
    public final Object d;

    public d4(GiftAuctionController giftAuctionController, long j3, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState) {
        this.f15939c = giftAuctionController;
        this.f15938b = j3;
        this.d = tL_StarGiftAuctionState;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f15937a) {
            case 0:
                ((GiftAuctionController) this.f15939c).lambda$subscribeToGiftAuctionStateInternal$0(this.f15938b, (TL_payments.TL_StarGiftAuctionState) this.d, (ArrayList) obj);
                return;
            default:
                ((TranslateController) this.f15939c).lambda$checkTranslation$4((MessageObject) this.d, this.f15938b, (TLRPC.TL_textWithEntities) obj);
                return;
        }
    }

    public d4(TranslateController translateController, MessageObject messageObject, long j3) {
        this.f15939c = translateController;
        this.d = messageObject;
        this.f15938b = j3;
    }
}
