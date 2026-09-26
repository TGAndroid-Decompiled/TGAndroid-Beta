package org.telegram.messenger;

import com.android.billingclient.api.Purchase;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.xl0;
public final class c implements il0, c5.j {
    public final Object f16037a;
    public final Object f16038b;
    public final Object f16039c;

    public c(Object obj, Object obj2, Object obj3) {
        this.f16037a = obj;
        this.f16038b = obj2;
        this.f16039c = obj3;
    }

    @Override
    public void a(c5.h hVar, String str) {
        BillingController.lambda$consumeGiftPurchase$12((TLRPC.InputStorePaymentPurpose) this.f16037a, (Purchase) this.f16038b, (Runnable) this.f16039c, hVar, str);
    }

    @Override
    public int run() {
        int lambda$scrollToFragmentRow$24;
        lambda$scrollToFragmentRow$24 = AndroidUtilities.lambda$scrollToFragmentRow$24((org.telegram.ui.ActionBar.m2) this.f16037a, (String) this.f16038b, (xl0) this.f16039c);
        return lambda$scrollToFragmentRow$24;
    }
}
