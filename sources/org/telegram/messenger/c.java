package org.telegram.messenger;

import com.android.billingclient.api.Purchase;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.zl0;
public final class c implements jl0, c5.j {
    public final Object f17484a;
    public final Object f17485b;
    public final Object f17486c;

    public c(Object obj, Object obj2, Object obj3) {
        this.f17484a = obj;
        this.f17485b = obj2;
        this.f17486c = obj3;
    }

    @Override
    public void a(c5.h hVar, String str) {
        BillingController.lambda$consumeGiftPurchase$12((TLRPC.InputStorePaymentPurpose) this.f17484a, (Purchase) this.f17485b, (Runnable) this.f17486c, hVar, str);
    }

    @Override
    public int run() {
        int lambda$scrollToFragmentRow$24;
        lambda$scrollToFragmentRow$24 = AndroidUtilities.lambda$scrollToFragmentRow$24((org.telegram.ui.ActionBar.n2) this.f17484a, (String) this.f17485b, (zl0) this.f17486c);
        return lambda$scrollToFragmentRow$24;
    }
}
