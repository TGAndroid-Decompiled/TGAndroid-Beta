package org.telegram.messenger;

import com.android.billingclient.api.Purchase;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.wk0;
public final class c implements wk0, c5.j {
    public final Object f15788a;
    public final Object f15789b;
    public final Object f15790c;

    public c(Object obj, Object obj2, Object obj3) {
        this.f15788a = obj;
        this.f15789b = obj2;
        this.f15790c = obj3;
    }

    @Override
    public void a(c5.h hVar, String str) {
        BillingController.lambda$consumeGiftPurchase$12((TLRPC.InputStorePaymentPurpose) this.f15788a, (Purchase) this.f15789b, (Runnable) this.f15790c, hVar, str);
    }

    @Override
    public int run() {
        int lambda$scrollToFragmentRow$24;
        lambda$scrollToFragmentRow$24 = AndroidUtilities.lambda$scrollToFragmentRow$24((org.telegram.ui.ActionBar.n2) this.f15788a, (String) this.f15789b, (ll0) this.f15790c);
        return lambda$scrollToFragmentRow$24;
    }
}
