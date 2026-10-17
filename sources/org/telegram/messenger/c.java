package org.telegram.messenger;

import com.android.billingclient.api.Purchase;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.tl0;
public final class c implements tl0, c5.k {
    public final Object f17989a;
    public final Object f17990b;
    public final Object f17991c;

    public c(Object obj, Object obj2, Object obj3) {
        this.f17989a = obj;
        this.f17990b = obj2;
        this.f17991c = obj3;
    }

    @Override
    public void a(c5.i iVar, String str) {
        BillingController.lambda$consumeGiftPurchase$12((TLRPC.InputStorePaymentPurpose) this.f17989a, (Purchase) this.f17990b, (Runnable) this.f17991c, iVar, str);
    }

    @Override
    public int run() {
        int lambda$scrollToFragmentRow$24;
        lambda$scrollToFragmentRow$24 = AndroidUtilities.lambda$scrollToFragmentRow$24((org.telegram.ui.ActionBar.n2) this.f17989a, (String) this.f17990b, (im0) this.f17991c);
        return lambda$scrollToFragmentRow$24;
    }
}
