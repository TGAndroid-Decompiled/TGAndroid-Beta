package org.telegram.messenger;

import com.android.billingclient.api.Purchase;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.wk0;
public final class f implements wk0, c5.j {
    public final Object f17594a;
    public final Object f17595b;
    public final Object f17596c;

    public f(Object obj, Object obj2, Object obj3) {
        this.f17594a = obj;
        this.f17595b = obj2;
        this.f17596c = obj3;
    }

    @Override
    public void a(c5.h hVar, String str) {
        BillingController.lambda$consumeGiftPurchase$12((TLRPC.InputStorePaymentPurpose) this.f17594a, (Purchase) this.f17595b, (Runnable) this.f17596c, hVar, str);
    }

    @Override
    public int run() {
        int lambda$scrollToFragmentRow$24;
        lambda$scrollToFragmentRow$24 = AndroidUtilities.lambda$scrollToFragmentRow$24((org.telegram.ui.ActionBar.n2) this.f17594a, (String) this.f17595b, (ll0) this.f17596c);
        return lambda$scrollToFragmentRow$24;
    }
}
