package org.telegram.messenger;

import org.telegram.messenger.PasskeysController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class oh implements Utilities.Callback2 {
    public final int f16970a;
    public final long f16971b;
    public final Object f16972c;
    public final Object d;

    public oh(Object obj, Object obj2, long j3, int i10) {
        this.f16970a = i10;
        this.f16972c = obj;
        this.d = obj2;
        this.f16971b = j3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f16970a) {
            case 0:
                PasskeysController.AnonymousClass1.lambda$onResult$0((org.telegram.ui.ActionBar.b2) this.f16972c, (Utilities.Callback3) this.d, this.f16971b, (TLRPC.auth_Authorization) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                ((BotForumHelper) this.f16972c).lambda$performSendBotTopicCreate$5(this.f16971b, (String) this.d, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                ((GiftAuctionController) this.f16972c).lambda$getOrRequestAuction$12((Utilities.Callback2) this.d, this.f16971b, (TL_payments.TL_StarGiftAuctionState) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }

    public oh(BotForumHelper botForumHelper, long j3, String str) {
        this.f16970a = 1;
        this.f16972c = botForumHelper;
        this.f16971b = j3;
        this.d = str;
    }
}
