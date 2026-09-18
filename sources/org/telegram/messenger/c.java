package org.telegram.messenger;

import com.android.billingclient.api.Purchase;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.wl0;
public final class c implements hl0, c5.j {
    public final Object f15979a;
    public final Object f15980b;
    public final Object f15981c;

    public c(Object obj, Object obj2, Object obj3) {
        this.f15979a = obj;
        this.f15980b = obj2;
        this.f15981c = obj3;
    }

    @Override
    public void a(c5.h hVar, String str) {
        BillingController.lambda$consumeGiftPurchase$12((TLRPC.InputStorePaymentPurpose) this.f15979a, (Purchase) this.f15980b, (Runnable) this.f15981c, hVar, str);
    }

    @Override
    public int run() {
        int lambda$scrollToFragmentRow$24;
        lambda$scrollToFragmentRow$24 = AndroidUtilities.lambda$scrollToFragmentRow$24((org.telegram.ui.ActionBar.n2) this.f15979a, (String) this.f15980b, (wl0) this.f15981c);
        return lambda$scrollToFragmentRow$24;
    }
}
