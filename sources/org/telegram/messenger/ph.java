package org.telegram.messenger;

import org.telegram.messenger.PasskeysController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class ph implements Utilities.Callback2 {
    public final int f18716a;
    public final long f18717b;
    public final Object f18718c;
    public final Object d;

    public ph(Object obj, Object obj2, long j3, int i10) {
        this.f18716a = i10;
        this.f18718c = obj;
        this.d = obj2;
        this.f18717b = j3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18716a) {
            case 0:
                PasskeysController.AnonymousClass1.lambda$onResult$0((org.telegram.ui.ActionBar.b2) this.f18718c, (Utilities.Callback3) this.d, this.f18717b, (TLRPC.auth_Authorization) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                ((BotForumHelper) this.f18718c).lambda$performSendBotTopicCreate$5(this.f18717b, (String) this.d, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                ((GiftAuctionController) this.f18718c).lambda$getOrRequestAuction$12((Utilities.Callback2) this.d, this.f18717b, (TL_payments.TL_StarGiftAuctionState) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }

    public ph(BotForumHelper botForumHelper, long j3, String str) {
        this.f18716a = 1;
        this.f18718c = botForumHelper;
        this.f18717b = j3;
        this.d = str;
    }
}
