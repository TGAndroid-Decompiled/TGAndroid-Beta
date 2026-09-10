package org.telegram.messenger;

import org.telegram.messenger.PasskeysController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class xh implements Utilities.Callback2 {
    public final int f16997a;
    public final long f16998b;
    public final Object f16999c;
    public final Object d;

    public xh(Object obj, Object obj2, long j3, int i10) {
        this.f16997a = i10;
        this.f16999c = obj;
        this.d = obj2;
        this.f16998b = j3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f16997a) {
            case 0:
                PasskeysController.AnonymousClass1.lambda$onResult$0((org.telegram.ui.ActionBar.d2) this.f16999c, (Utilities.Callback3) this.d, this.f16998b, (TLRPC.auth_Authorization) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                ((BotForumHelper) this.f16999c).lambda$performSendBotTopicCreate$5(this.f16998b, (String) this.d, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                ((GiftAuctionController) this.f16999c).lambda$getOrRequestAuction$12((Utilities.Callback2) this.d, this.f16998b, (TL_payments.TL_StarGiftAuctionState) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }

    public xh(BotForumHelper botForumHelper, long j3, String str) {
        this.f16997a = 1;
        this.f16999c = botForumHelper;
        this.f16998b = j3;
        this.d = str;
    }
}
