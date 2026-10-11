package org.telegram.messenger;

import com.android.billingclient.api.Purchase;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.rm0;
public final class c implements cm0, c5.j {
    public final Object f17501a;
    public final Object f17502b;
    public final Object f17503c;

    public c(Object obj, Object obj2, Object obj3) {
        this.f17501a = obj;
        this.f17502b = obj2;
        this.f17503c = obj3;
    }

    @Override
    public void a(c5.h hVar, String str) {
        BillingController.lambda$consumeGiftPurchase$12((TLRPC.InputStorePaymentPurpose) this.f17501a, (Purchase) this.f17502b, (Runnable) this.f17503c, hVar, str);
    }

    @Override
    public int run() {
        int lambda$scrollToFragmentRow$24;
        lambda$scrollToFragmentRow$24 = AndroidUtilities.lambda$scrollToFragmentRow$24((org.telegram.ui.ActionBar.m2) this.f17501a, (String) this.f17502b, (rm0) this.f17503c);
        return lambda$scrollToFragmentRow$24;
    }
}
