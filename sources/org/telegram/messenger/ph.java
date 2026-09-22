package org.telegram.messenger;

import org.telegram.messenger.PasskeysController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class ph implements Utilities.Callback2 {
    public final int f17301a;
    public final long f17302b;
    public final Object f17303c;
    public final Object d;

    public ph(Object obj, Object obj2, long j3, int i10) {
        this.f17301a = i10;
        this.f17303c = obj;
        this.d = obj2;
        this.f17302b = j3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f17301a) {
            case 0:
                PasskeysController.AnonymousClass1.lambda$onResult$0((org.telegram.ui.ActionBar.b2) this.f17303c, (Utilities.Callback3) this.d, this.f17302b, (TLRPC.auth_Authorization) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                ((BotForumHelper) this.f17303c).lambda$performSendBotTopicCreate$5(this.f17302b, (String) this.d, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                ((GiftAuctionController) this.f17303c).lambda$getOrRequestAuction$12((Utilities.Callback2) this.d, this.f17302b, (TL_payments.TL_StarGiftAuctionState) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }

    public ph(BotForumHelper botForumHelper, long j3, String str) {
        this.f17301a = 1;
        this.f17303c = botForumHelper;
        this.f17302b = j3;
        this.d = str;
    }
}
