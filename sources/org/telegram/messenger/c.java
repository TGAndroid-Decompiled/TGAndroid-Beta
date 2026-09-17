package org.telegram.messenger;

import com.android.billingclient.api.Purchase;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.xk0;
public final class c implements xk0, c5.j {
    public final Object f15799a;
    public final Object f15800b;
    public final Object f15801c;

    public c(Object obj, Object obj2, Object obj3) {
        this.f15799a = obj;
        this.f15800b = obj2;
        this.f15801c = obj3;
    }

    @Override
    public void a(c5.h hVar, String str) {
        BillingController.lambda$consumeGiftPurchase$12((TLRPC.InputStorePaymentPurpose) this.f15799a, (Purchase) this.f15800b, (Runnable) this.f15801c, hVar, str);
    }

    @Override
    public int run() {
        int lambda$scrollToFragmentRow$24;
        lambda$scrollToFragmentRow$24 = AndroidUtilities.lambda$scrollToFragmentRow$24((org.telegram.ui.ActionBar.o2) this.f15799a, (String) this.f15800b, (ml0) this.f15801c);
        return lambda$scrollToFragmentRow$24;
    }
}
