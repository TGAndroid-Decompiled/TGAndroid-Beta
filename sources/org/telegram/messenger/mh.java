package org.telegram.messenger;

import org.telegram.messenger.PasskeysController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class mh implements Utilities.Callback2 {
    public final int f19058a;
    public final long f19059b;
    public final Object f19060c;
    public final Object d;

    public mh(Object obj, Object obj2, long j10, int i10) {
        this.f19058a = i10;
        this.f19060c = obj;
        this.d = obj2;
        this.f19059b = j10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f19058a) {
            case 0:
                PasskeysController.AnonymousClass1.lambda$onResult$0((org.telegram.ui.ActionBar.c2) this.f19060c, (Utilities.Callback3) this.d, this.f19059b, (TLRPC.auth_Authorization) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                ((GiftAuctionController) this.f19060c).lambda$getOrRequestAuction$12((Utilities.Callback2) this.d, this.f19059b, (TL_payments.TL_StarGiftAuctionState) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
