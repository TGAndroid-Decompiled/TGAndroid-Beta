package org.telegram.messenger;

import org.telegram.messenger.PasskeysController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class oh implements Utilities.Callback2 {
    public final int f17215a;
    public final long f17216b;
    public final Object f17217c;
    public final Object d;

    public oh(Object obj, Object obj2, long j3, int i10) {
        this.f17215a = i10;
        this.f17217c = obj;
        this.d = obj2;
        this.f17216b = j3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f17215a) {
            case 0:
                PasskeysController.AnonymousClass1.lambda$onResult$0((org.telegram.ui.ActionBar.c2) this.f17217c, (Utilities.Callback3) this.d, this.f17216b, (TLRPC.auth_Authorization) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                ((BotForumHelper) this.f17217c).lambda$performSendBotTopicCreate$5(this.f17216b, (String) this.d, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                ((GiftAuctionController) this.f17217c).lambda$getOrRequestAuction$12((Utilities.Callback2) this.d, this.f17216b, (TL_payments.TL_StarGiftAuctionState) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }

    public oh(BotForumHelper botForumHelper, long j3, String str) {
        this.f17215a = 1;
        this.f17217c = botForumHelper;
        this.f17216b = j3;
        this.d = str;
    }
}
