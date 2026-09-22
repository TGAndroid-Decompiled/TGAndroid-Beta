package org.telegram.messenger;

import com.android.billingclient.api.Purchase;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.yl0;
public final class c implements jl0, c5.j {
    public final Object f16028a;
    public final Object f16029b;
    public final Object f16030c;

    public c(Object obj, Object obj2, Object obj3) {
        this.f16028a = obj;
        this.f16029b = obj2;
        this.f16030c = obj3;
    }

    @Override
    public void a(c5.h hVar, String str) {
        BillingController.lambda$consumeGiftPurchase$12((TLRPC.InputStorePaymentPurpose) this.f16028a, (Purchase) this.f16029b, (Runnable) this.f16030c, hVar, str);
    }

    @Override
    public int run() {
        int lambda$scrollToFragmentRow$24;
        lambda$scrollToFragmentRow$24 = AndroidUtilities.lambda$scrollToFragmentRow$24((org.telegram.ui.ActionBar.n2) this.f16028a, (String) this.f16029b, (yl0) this.f16030c);
        return lambda$scrollToFragmentRow$24;
    }
}
