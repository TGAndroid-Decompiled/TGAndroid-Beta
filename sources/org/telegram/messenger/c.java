package org.telegram.messenger;

import com.android.billingclient.api.Purchase;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.xk0;
public final class c implements xk0, c5.j {
    public final Object f15779a;
    public final Object f15780b;
    public final Object f15781c;

    public c(Object obj, Object obj2, Object obj3) {
        this.f15779a = obj;
        this.f15780b = obj2;
        this.f15781c = obj3;
    }

    @Override
    public void a(c5.h hVar, String str) {
        BillingController.lambda$consumeGiftPurchase$12((TLRPC.InputStorePaymentPurpose) this.f15779a, (Purchase) this.f15780b, (Runnable) this.f15781c, hVar, str);
    }

    @Override
    public int run() {
        int lambda$scrollToFragmentRow$24;
        lambda$scrollToFragmentRow$24 = AndroidUtilities.lambda$scrollToFragmentRow$24((org.telegram.ui.ActionBar.n2) this.f15779a, (String) this.f15780b, (ml0) this.f15781c);
        return lambda$scrollToFragmentRow$24;
    }
}
