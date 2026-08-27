package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;

public final class lh implements Utilities.Callback2 {

    public final int f20896a;

    public final long f20897b;

    public final Object f20898c;
    public final Object d;

    public lh(Object obj, Object obj2, long j10, int i10) {
        this.f20896a = i10;
        this.f20898c = obj;
        this.d = obj2;
        this.f20897b = j10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f20896a) {
            case 0:
                PasskeysController.AnonymousClass1.lambda$onResult$0((org.telegram.ui.ActionBar.b2) this.f20898c, (Utilities.Callback3) this.d, this.f20897b, (TLRPC.auth_Authorization) obj, (TLRPC.TL_error) obj2);
                break;
            case 1:
                ((BotForumHelper) this.f20898c).lambda$performSendBotTopicCreate$5(this.f20897b, (String) this.d, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                ((GiftAuctionController) this.f20898c).lambda$getOrRequestAuction$12((Utilities.Callback2) this.d, this.f20897b, (TL_payments.TL_StarGiftAuctionState) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }

    public lh(BotForumHelper botForumHelper, long j10, String str) {
        this.f20896a = 1;
        this.f20898c = botForumHelper;
        this.f20897b = j10;
        this.d = str;
    }
}
