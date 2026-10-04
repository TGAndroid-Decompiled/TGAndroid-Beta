package org.telegram.messenger;

import org.telegram.messenger.PasskeysController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class oh implements Utilities.Callback2 {
    public final int f18804a;
    public final long f18805b;
    public final Object f18806c;
    public final Object d;

    public oh(Object obj, Object obj2, long j3, int i10) {
        this.f18804a = i10;
        this.f18806c = obj;
        this.d = obj2;
        this.f18805b = j3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18804a) {
            case 0:
                PasskeysController.AnonymousClass1.lambda$onResult$0((org.telegram.ui.ActionBar.b2) this.f18806c, (Utilities.Callback3) this.d, this.f18805b, (TLRPC.auth_Authorization) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                ((BotForumHelper) this.f18806c).lambda$performSendBotTopicCreate$5(this.f18805b, (String) this.d, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                ((GiftAuctionController) this.f18806c).lambda$getOrRequestAuction$12((Utilities.Callback2) this.d, this.f18805b, (TL_payments.TL_StarGiftAuctionState) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }

    public oh(BotForumHelper botForumHelper, long j3, String str) {
        this.f18804a = 1;
        this.f18806c = botForumHelper;
        this.f18805b = j3;
        this.d = str;
    }
}
