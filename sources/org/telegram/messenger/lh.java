package org.telegram.messenger;

import org.telegram.messenger.PasskeysController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class lh implements Utilities.Callback2 {
    public final int f18897a;
    public final long f18898b;
    public final Object f18899c;
    public final Object d;

    public lh(Object obj, Object obj2, long j10, int i10) {
        this.f18897a = i10;
        this.f18899c = obj;
        this.d = obj2;
        this.f18898b = j10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18897a) {
            case 0:
                PasskeysController.AnonymousClass1.lambda$onResult$0((org.telegram.ui.ActionBar.b2) this.f18899c, (Utilities.Callback3) this.d, this.f18898b, (TLRPC.auth_Authorization) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                ((GiftAuctionController) this.f18899c).lambda$getOrRequestAuction$12((Utilities.Callback2) this.d, this.f18898b, (TL_payments.TL_StarGiftAuctionState) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
