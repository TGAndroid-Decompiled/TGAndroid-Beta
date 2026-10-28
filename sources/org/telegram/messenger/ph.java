package org.telegram.messenger;

import org.telegram.messenger.PasskeysController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class ph implements Utilities.Callback2 {
    public final int f20973a;
    public final long f20974b;
    public final Object f20975c;
    public final Object d;

    public ph(Object obj, Object obj2, long j10, int i10) {
        this.f20973a = i10;
        this.f20975c = obj;
        this.d = obj2;
        this.f20974b = j10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f20973a) {
            case 0:
                PasskeysController.AnonymousClass1.lambda$onResult$0((org.telegram.ui.ActionBar.e2) this.f20975c, (Utilities.Callback3) this.d, this.f20974b, (TLRPC.auth_Authorization) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                ((GiftAuctionController) this.f20975c).lambda$getOrRequestAuction$12((Utilities.Callback2) this.d, this.f20974b, (TL_payments.TL_StarGiftAuctionState) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
