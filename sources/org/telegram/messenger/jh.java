package org.telegram.messenger;

import org.telegram.messenger.PasskeysController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class jh implements Utilities.Callback2 {
    public final int f18709a;
    public final long f18710b;
    public final Object f18711c;
    public final Object d;

    public jh(Object obj, Object obj2, long j10, int i10) {
        this.f18709a = i10;
        this.f18711c = obj;
        this.d = obj2;
        this.f18710b = j10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18709a) {
            case 0:
                PasskeysController.AnonymousClass1.lambda$onResult$0((org.telegram.ui.ActionBar.b2) this.f18711c, (Utilities.Callback3) this.d, this.f18710b, (TLRPC.auth_Authorization) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                ((BotForumHelper) this.f18711c).lambda$performSendBotTopicCreate$5(this.f18710b, (String) this.d, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                ((GiftAuctionController) this.f18711c).lambda$getOrRequestAuction$12((Utilities.Callback2) this.d, this.f18710b, (TL_payments.TL_StarGiftAuctionState) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }

    public jh(BotForumHelper botForumHelper, long j10, String str) {
        this.f18709a = 1;
        this.f18711c = botForumHelper;
        this.f18710b = j10;
        this.d = str;
    }
}
