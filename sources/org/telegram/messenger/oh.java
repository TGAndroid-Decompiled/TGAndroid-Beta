package org.telegram.messenger;

import org.telegram.messenger.PasskeysController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class oh implements Utilities.Callback2 {
    public final int f21184a;
    public final long f21185b;
    public final Object f21186c;
    public final Object d;

    public oh(Object obj, Object obj2, long j10, int i10) {
        this.f21184a = i10;
        this.f21186c = obj;
        this.d = obj2;
        this.f21185b = j10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f21184a) {
            case 0:
                PasskeysController.AnonymousClass1.lambda$onResult$0((org.telegram.ui.ActionBar.c2) this.f21186c, (Utilities.Callback3) this.d, this.f21185b, (TLRPC.auth_Authorization) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                ((BotForumHelper) this.f21186c).lambda$performSendBotTopicCreate$5(this.f21185b, (String) this.d, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                ((GiftAuctionController) this.f21186c).lambda$getOrRequestAuction$12((Utilities.Callback2) this.d, this.f21185b, (TL_payments.TL_StarGiftAuctionState) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }

    public oh(BotForumHelper botForumHelper, long j10, String str) {
        this.f21184a = 1;
        this.f21186c = botForumHelper;
        this.f21185b = j10;
        this.d = str;
    }
}
