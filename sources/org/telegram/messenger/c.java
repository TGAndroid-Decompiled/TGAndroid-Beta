package org.telegram.messenger;

import com.android.billingclient.api.Purchase;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.tl0;
public final class c implements tl0, c5.k {
    public final Object f17990a;
    public final Object f17991b;
    public final Object f17992c;

    public c(Object obj, Object obj2, Object obj3) {
        this.f17990a = obj;
        this.f17991b = obj2;
        this.f17992c = obj3;
    }

    @Override
    public void a(c5.i iVar, String str) {
        BillingController.lambda$consumeGiftPurchase$12((TLRPC.InputStorePaymentPurpose) this.f17990a, (Purchase) this.f17991b, (Runnable) this.f17992c, iVar, str);
    }

    @Override
    public int run() {
        int lambda$scrollToFragmentRow$24;
        lambda$scrollToFragmentRow$24 = AndroidUtilities.lambda$scrollToFragmentRow$24((org.telegram.ui.ActionBar.n2) this.f17990a, (String) this.f17991b, (im0) this.f17992c);
        return lambda$scrollToFragmentRow$24;
    }
}
