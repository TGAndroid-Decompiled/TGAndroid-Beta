package org.telegram.messenger;

import com.android.billingclient.api.Purchase;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.zl0;
public final class c implements kl0, c5.j {
    public final Object f16054a;
    public final Object f16055b;
    public final Object f16056c;

    public c(Object obj, Object obj2, Object obj3) {
        this.f16054a = obj;
        this.f16055b = obj2;
        this.f16056c = obj3;
    }

    @Override
    public void a(c5.h hVar, String str) {
        BillingController.lambda$consumeGiftPurchase$12((TLRPC.InputStorePaymentPurpose) this.f16054a, (Purchase) this.f16055b, (Runnable) this.f16056c, hVar, str);
    }

    @Override
    public int run() {
        int lambda$scrollToFragmentRow$24;
        lambda$scrollToFragmentRow$24 = AndroidUtilities.lambda$scrollToFragmentRow$24((org.telegram.ui.ActionBar.m2) this.f16054a, (String) this.f16055b, (zl0) this.f16056c);
        return lambda$scrollToFragmentRow$24;
    }
}
