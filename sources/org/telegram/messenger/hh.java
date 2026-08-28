package org.telegram.messenger;

import org.telegram.messenger.PasskeysController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class hh implements Utilities.Callback2 {
    public final int f20517a;
    public final long f20518b;
    public final Object f20519c;
    public final Object d;

    public hh(Object obj, Object obj2, long j10, int i9) {
        this.f20517a = i9;
        this.f20519c = obj;
        this.d = obj2;
        this.f20518b = j10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f20517a) {
            case 0:
                PasskeysController.AnonymousClass1.lambda$onResult$0((org.telegram.ui.ActionBar.c2) this.f20519c, (Utilities.Callback3) this.d, this.f20518b, (TLRPC.auth_Authorization) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                ((BotForumHelper) this.f20519c).lambda$performSendBotTopicCreate$5(this.f20518b, (String) this.d, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                ((GiftAuctionController) this.f20519c).lambda$getOrRequestAuction$12((Utilities.Callback2) this.d, this.f20518b, (TL_payments.TL_StarGiftAuctionState) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }

    public hh(BotForumHelper botForumHelper, long j10, String str) {
        this.f20517a = 1;
        this.f20519c = botForumHelper;
        this.f20518b = j10;
        this.d = str;
    }
}
