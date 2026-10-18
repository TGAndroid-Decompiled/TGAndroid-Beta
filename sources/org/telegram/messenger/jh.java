package org.telegram.messenger;

import org.telegram.messenger.PasskeysController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class jh implements Utilities.Callback2 {
    public final int f18715a;
    public final long f18716b;
    public final Object f18717c;
    public final Object d;

    public jh(Object obj, Object obj2, long j10, int i10) {
        this.f18715a = i10;
        this.f18717c = obj;
        this.d = obj2;
        this.f18716b = j10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18715a) {
            case 0:
                PasskeysController.AnonymousClass1.lambda$onResult$0((org.telegram.ui.ActionBar.b2) this.f18717c, (Utilities.Callback3) this.d, this.f18716b, (TLRPC.auth_Authorization) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                ((BotForumHelper) this.f18717c).lambda$performSendBotTopicCreate$5(this.f18716b, (String) this.d, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                ((GiftAuctionController) this.f18717c).lambda$getOrRequestAuction$12((Utilities.Callback2) this.d, this.f18716b, (TL_payments.TL_StarGiftAuctionState) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }

    public jh(BotForumHelper botForumHelper, long j10, String str) {
        this.f18715a = 1;
        this.f18717c = botForumHelper;
        this.f18716b = j10;
        this.d = str;
    }
}
