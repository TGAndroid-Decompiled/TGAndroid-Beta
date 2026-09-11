package org.telegram.messenger;

import com.android.billingclient.api.Purchase;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.wk0;
public final class f implements wk0, c5.j {
    public final Object f17607a;
    public final Object f17608b;
    public final Object f17609c;

    public f(Object obj, Object obj2, Object obj3) {
        this.f17607a = obj;
        this.f17608b = obj2;
        this.f17609c = obj3;
    }

    @Override
    public void a(c5.h hVar, String str) {
        BillingController.lambda$consumeGiftPurchase$12((TLRPC.InputStorePaymentPurpose) this.f17607a, (Purchase) this.f17608b, (Runnable) this.f17609c, hVar, str);
    }

    @Override
    public int run() {
        int lambda$scrollToFragmentRow$24;
        lambda$scrollToFragmentRow$24 = AndroidUtilities.lambda$scrollToFragmentRow$24((org.telegram.ui.ActionBar.n2) this.f17607a, (String) this.f17608b, (ll0) this.f17609c);
        return lambda$scrollToFragmentRow$24;
    }
}
