package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class f4 implements Utilities.Callback {
    public final int f18627a = 0;
    public final long f18628b;
    public final BaseController f18629c;
    public final Object d;

    public f4(GiftAuctionController giftAuctionController, long j10, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState) {
        this.f18629c = giftAuctionController;
        this.f18628b = j10;
        this.d = tL_StarGiftAuctionState;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18627a) {
            case 0:
                ((GiftAuctionController) this.f18629c).lambda$subscribeToGiftAuctionStateInternal$0(this.f18628b, (TL_payments.TL_StarGiftAuctionState) this.d, (ArrayList) obj);
                return;
            default:
                ((TranslateController) this.f18629c).lambda$checkTranslation$4((MessageObject) this.d, this.f18628b, (TLRPC.TL_textWithEntities) obj);
                return;
        }
    }

    public f4(TranslateController translateController, MessageObject messageObject, long j10) {
        this.f18629c = translateController;
        this.d = messageObject;
        this.f18628b = j10;
    }
}
