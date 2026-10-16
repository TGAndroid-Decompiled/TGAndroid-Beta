package org.telegram.messenger;

import com.android.billingclient.api.Purchase;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.xl0;
public final class c implements xl0, c5.k {
    public final Object f16607a;
    public final Object f16608b;
    public final Object f16609c;

    public c(Object obj, Object obj2, Object obj3) {
        this.f16607a = obj;
        this.f16608b = obj2;
        this.f16609c = obj3;
    }

    @Override
    public void a(c5.i iVar, String str) {
        BillingController.lambda$consumeGiftPurchase$12((TLRPC.InputStorePaymentPurpose) this.f16607a, (Purchase) this.f16608b, (Runnable) this.f16609c, iVar, str);
    }

    @Override
    public int run() {
        int lambda$scrollToFragmentRow$24;
        lambda$scrollToFragmentRow$24 = AndroidUtilities.lambda$scrollToFragmentRow$24((org.telegram.ui.ActionBar.m2) this.f16607a, (String) this.f16608b, (mm0) this.f16609c);
        return lambda$scrollToFragmentRow$24;
    }
}
