package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class h4 implements Utilities.Callback {
    public final int f18494a = 0;
    public final long f18495b;
    public final BaseController f18496c;
    public final Object d;

    public h4(GiftAuctionController giftAuctionController, long j10, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState) {
        this.f18496c = giftAuctionController;
        this.f18495b = j10;
        this.d = tL_StarGiftAuctionState;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18494a) {
            case 0:
                ((GiftAuctionController) this.f18496c).lambda$subscribeToGiftAuctionStateInternal$0(this.f18495b, (TL_payments.TL_StarGiftAuctionState) this.d, (ArrayList) obj);
                return;
            default:
                ((TranslateController) this.f18496c).lambda$checkTranslation$4((MessageObject) this.d, this.f18495b, (TLRPC.TL_textWithEntities) obj);
                return;
        }
    }

    public h4(TranslateController translateController, MessageObject messageObject, long j10) {
        this.f18496c = translateController;
        this.d = messageObject;
        this.f18495b = j10;
    }
}
