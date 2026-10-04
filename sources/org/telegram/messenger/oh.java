package org.telegram.messenger;

import org.telegram.messenger.PasskeysController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class oh implements Utilities.Callback2 {
    public final int f18808a;
    public final long f18809b;
    public final Object f18810c;
    public final Object d;

    public oh(Object obj, Object obj2, long j3, int i10) {
        this.f18808a = i10;
        this.f18810c = obj;
        this.d = obj2;
        this.f18809b = j3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18808a) {
            case 0:
                PasskeysController.AnonymousClass1.lambda$onResult$0((org.telegram.ui.ActionBar.b2) this.f18810c, (Utilities.Callback3) this.d, this.f18809b, (TLRPC.auth_Authorization) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                ((BotForumHelper) this.f18810c).lambda$performSendBotTopicCreate$5(this.f18809b, (String) this.d, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                ((GiftAuctionController) this.f18810c).lambda$getOrRequestAuction$12((Utilities.Callback2) this.d, this.f18809b, (TL_payments.TL_StarGiftAuctionState) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }

    public oh(BotForumHelper botForumHelper, long j3, String str) {
        this.f18808a = 1;
        this.f18810c = botForumHelper;
        this.f18809b = j3;
        this.d = str;
    }
}
