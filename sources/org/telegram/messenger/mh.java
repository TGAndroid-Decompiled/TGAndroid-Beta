package org.telegram.messenger;

import org.telegram.messenger.PasskeysController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class mh implements Utilities.Callback2 {
    public final int f18994a;
    public final long f18995b;
    public final Object f18996c;
    public final Object d;

    public mh(Object obj, Object obj2, long j10, int i10) {
        this.f18994a = i10;
        this.f18996c = obj;
        this.d = obj2;
        this.f18995b = j10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18994a) {
            case 0:
                PasskeysController.AnonymousClass1.lambda$onResult$0((org.telegram.ui.ActionBar.b2) this.f18996c, (Utilities.Callback3) this.d, this.f18995b, (TLRPC.auth_Authorization) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                ((GiftAuctionController) this.f18996c).lambda$getOrRequestAuction$12((Utilities.Callback2) this.d, this.f18995b, (TL_payments.TL_StarGiftAuctionState) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
