package org.telegram.messenger;

import org.telegram.messenger.PasskeysController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class rh implements Utilities.Callback2 {
    public final int f19899a;
    public final long f19900b;
    public final Object f19901c;
    public final Object d;

    public rh(Object obj, Object obj2, long j10, int i10) {
        this.f19899a = i10;
        this.f19901c = obj;
        this.d = obj2;
        this.f19900b = j10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f19899a) {
            case 0:
                PasskeysController.AnonymousClass1.lambda$onResult$0((org.telegram.ui.ActionBar.d2) this.f19901c, (Utilities.Callback3) this.d, this.f19900b, (TLRPC.auth_Authorization) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                ((BotForumHelper) this.f19901c).lambda$performSendBotTopicCreate$5(this.f19900b, (String) this.d, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                ((GiftAuctionController) this.f19901c).lambda$getOrRequestAuction$12((Utilities.Callback2) this.d, this.f19900b, (TL_payments.TL_StarGiftAuctionState) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }

    public rh(BotForumHelper botForumHelper, long j10, String str) {
        this.f19899a = 1;
        this.f19901c = botForumHelper;
        this.f19900b = j10;
        this.d = str;
    }
}
