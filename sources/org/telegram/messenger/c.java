package org.telegram.messenger;

import com.android.billingclient.api.Purchase;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.wl0;
public final class c implements hl0, c5.j {
    public final Object f16022a;
    public final Object f16023b;
    public final Object f16024c;

    public c(Object obj, Object obj2, Object obj3) {
        this.f16022a = obj;
        this.f16023b = obj2;
        this.f16024c = obj3;
    }

    @Override
    public void a(c5.h hVar, String str) {
        BillingController.lambda$consumeGiftPurchase$12((TLRPC.InputStorePaymentPurpose) this.f16022a, (Purchase) this.f16023b, (Runnable) this.f16024c, hVar, str);
    }

    @Override
    public int run() {
        int lambda$scrollToFragmentRow$24;
        lambda$scrollToFragmentRow$24 = AndroidUtilities.lambda$scrollToFragmentRow$24((org.telegram.ui.ActionBar.m2) this.f16022a, (String) this.f16023b, (wl0) this.f16024c);
        return lambda$scrollToFragmentRow$24;
    }
}
