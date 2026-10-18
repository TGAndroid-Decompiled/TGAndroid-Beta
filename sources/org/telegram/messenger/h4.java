package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class h4 implements Utilities.Callback {
    public final int f18491a = 0;
    public final long f18492b;
    public final BaseController f18493c;
    public final Object d;

    public h4(GiftAuctionController giftAuctionController, long j10, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState) {
        this.f18493c = giftAuctionController;
        this.f18492b = j10;
        this.d = tL_StarGiftAuctionState;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18491a) {
            case 0:
                ((GiftAuctionController) this.f18493c).lambda$subscribeToGiftAuctionStateInternal$0(this.f18492b, (TL_payments.TL_StarGiftAuctionState) this.d, (ArrayList) obj);
                return;
            default:
                ((TranslateController) this.f18493c).lambda$checkTranslation$4((MessageObject) this.d, this.f18492b, (TLRPC.TL_textWithEntities) obj);
                return;
        }
    }

    public h4(TranslateController translateController, MessageObject messageObject, long j10) {
        this.f18493c = translateController;
        this.d = messageObject;
        this.f18492b = j10;
    }
}
