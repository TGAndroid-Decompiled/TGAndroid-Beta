package org.telegram.messenger;

import org.telegram.messenger.PasskeysController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class kh implements Utilities.Callback2 {
    public final int f18800a;
    public final long f18801b;
    public final Object f18802c;
    public final Object d;

    public kh(Object obj, Object obj2, long j10, int i10) {
        this.f18800a = i10;
        this.f18802c = obj;
        this.d = obj2;
        this.f18801b = j10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18800a) {
            case 0:
                PasskeysController.AnonymousClass1.lambda$onResult$0((org.telegram.ui.ActionBar.b2) this.f18802c, (Utilities.Callback3) this.d, this.f18801b, (TLRPC.auth_Authorization) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                ((BotForumHelper) this.f18802c).lambda$performSendBotTopicCreate$5(this.f18801b, (String) this.d, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                ((GiftAuctionController) this.f18802c).lambda$getOrRequestAuction$12((Utilities.Callback2) this.d, this.f18801b, (TL_payments.TL_StarGiftAuctionState) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }

    public kh(BotForumHelper botForumHelper, long j10, String str) {
        this.f18800a = 1;
        this.f18802c = botForumHelper;
        this.f18801b = j10;
        this.d = str;
    }
}
