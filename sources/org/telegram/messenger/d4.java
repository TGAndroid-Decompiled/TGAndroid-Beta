package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class d4 implements Utilities.Callback {
    public final int f16159a = 0;
    public final long f16160b;
    public final BaseController f16161c;
    public final Object d;

    public d4(GiftAuctionController giftAuctionController, long j3, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState) {
        this.f16161c = giftAuctionController;
        this.f16160b = j3;
        this.d = tL_StarGiftAuctionState;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f16159a) {
            case 0:
                ((GiftAuctionController) this.f16161c).lambda$subscribeToGiftAuctionStateInternal$0(this.f16160b, (TL_payments.TL_StarGiftAuctionState) this.d, (ArrayList) obj);
                return;
            default:
                ((TranslateController) this.f16161c).lambda$checkTranslation$4((MessageObject) this.d, this.f16160b, (TLRPC.TL_textWithEntities) obj);
                return;
        }
    }

    public d4(TranslateController translateController, MessageObject messageObject, long j3) {
        this.f16161c = translateController;
        this.d = messageObject;
        this.f16160b = j3;
    }
}
