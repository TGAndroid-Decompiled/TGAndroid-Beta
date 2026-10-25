package org.telegram.messenger;

import org.telegram.messenger.PasskeysController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class oh implements Utilities.Callback2 {
    public final int f20886a;
    public final long f20887b;
    public final Object f20888c;
    public final Object d;

    public oh(Object obj, Object obj2, long j10, int i10) {
        this.f20886a = i10;
        this.f20888c = obj;
        this.d = obj2;
        this.f20887b = j10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f20886a) {
            case 0:
                PasskeysController.AnonymousClass1.lambda$onResult$0((org.telegram.ui.ActionBar.e2) this.f20888c, (Utilities.Callback3) this.d, this.f20887b, (TLRPC.auth_Authorization) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                ((GiftAuctionController) this.f20888c).lambda$getOrRequestAuction$12((Utilities.Callback2) this.d, this.f20887b, (TL_payments.TL_StarGiftAuctionState) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
