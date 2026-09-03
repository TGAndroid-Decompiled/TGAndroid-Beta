package org.telegram.messenger;

import org.telegram.messenger.PasskeysController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class rh implements Utilities.Callback2 {
    public final int f18302a;
    public final long f18303b;
    public final Object f18304c;
    public final Object d;

    public rh(Object obj, Object obj2, long j10, int i10) {
        this.f18302a = i10;
        this.f18304c = obj;
        this.d = obj2;
        this.f18303b = j10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18302a) {
            case 0:
                PasskeysController.AnonymousClass1.lambda$onResult$0((org.telegram.ui.ActionBar.d2) this.f18304c, (Utilities.Callback3) this.d, this.f18303b, (TLRPC.auth_Authorization) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                ((BotForumHelper) this.f18304c).lambda$performSendBotTopicCreate$5(this.f18303b, (String) this.d, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                ((GiftAuctionController) this.f18304c).lambda$getOrRequestAuction$12((Utilities.Callback2) this.d, this.f18303b, (TL_payments.TL_StarGiftAuctionState) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }

    public rh(BotForumHelper botForumHelper, long j10, String str) {
        this.f18302a = 1;
        this.f18304c = botForumHelper;
        this.f18303b = j10;
        this.d = str;
    }
}
