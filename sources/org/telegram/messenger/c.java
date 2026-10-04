package org.telegram.messenger;

import com.android.billingclient.api.Purchase;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.zl0;
public final class c implements jl0, c5.j {
    public final Object f17479a;
    public final Object f17480b;
    public final Object f17481c;

    public c(Object obj, Object obj2, Object obj3) {
        this.f17479a = obj;
        this.f17480b = obj2;
        this.f17481c = obj3;
    }

    @Override
    public void a(c5.h hVar, String str) {
        BillingController.lambda$consumeGiftPurchase$12((TLRPC.InputStorePaymentPurpose) this.f17479a, (Purchase) this.f17480b, (Runnable) this.f17481c, hVar, str);
    }

    @Override
    public int run() {
        int lambda$scrollToFragmentRow$24;
        lambda$scrollToFragmentRow$24 = AndroidUtilities.lambda$scrollToFragmentRow$24((org.telegram.ui.ActionBar.n2) this.f17479a, (String) this.f17480b, (zl0) this.f17481c);
        return lambda$scrollToFragmentRow$24;
    }
}
