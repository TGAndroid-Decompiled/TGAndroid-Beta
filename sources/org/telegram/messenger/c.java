package org.telegram.messenger;

import com.android.billingclient.api.Purchase;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.wm0;
public final class c implements hm0, c5.j {
    public final Object f17216a;
    public final Object f17217b;
    public final Object f17218c;

    public c(Object obj, Object obj2, Object obj3) {
        this.f17216a = obj;
        this.f17217b = obj2;
        this.f17218c = obj3;
    }

    @Override
    public void a(c5.h hVar, String str) {
        BillingController.lambda$consumeGiftPurchase$12((TLRPC.InputStorePaymentPurpose) this.f17216a, (Purchase) this.f17217b, (Runnable) this.f17218c, hVar, str);
    }

    @Override
    public int run() {
        int lambda$scrollToFragmentRow$24;
        lambda$scrollToFragmentRow$24 = AndroidUtilities.lambda$scrollToFragmentRow$24((org.telegram.ui.ActionBar.m2) this.f17216a, (String) this.f17217b, (wm0) this.f17218c);
        return lambda$scrollToFragmentRow$24;
    }
}
