package org.telegram.messenger;

import com.android.billingclient.api.Purchase;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.wm0;
public final class c implements hm0, c5.j {
    public final Object f17215a;
    public final Object f17216b;
    public final Object f17217c;

    public c(Object obj, Object obj2, Object obj3) {
        this.f17215a = obj;
        this.f17216b = obj2;
        this.f17217c = obj3;
    }

    @Override
    public void a(c5.h hVar, String str) {
        BillingController.lambda$consumeGiftPurchase$12((TLRPC.InputStorePaymentPurpose) this.f17215a, (Purchase) this.f17216b, (Runnable) this.f17217c, hVar, str);
    }

    @Override
    public int run() {
        int lambda$scrollToFragmentRow$24;
        lambda$scrollToFragmentRow$24 = AndroidUtilities.lambda$scrollToFragmentRow$24((org.telegram.ui.ActionBar.m2) this.f17215a, (String) this.f17216b, (wm0) this.f17217c);
        return lambda$scrollToFragmentRow$24;
    }
}
