package org.telegram.messenger;

import com.android.billingclient.api.Purchase;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.vl0;
public final class c implements gl0, c5.j {
    public final Object f16013a;
    public final Object f16014b;
    public final Object f16015c;

    public c(Object obj, Object obj2, Object obj3) {
        this.f16013a = obj;
        this.f16014b = obj2;
        this.f16015c = obj3;
    }

    @Override
    public void a(c5.h hVar, String str) {
        BillingController.lambda$consumeGiftPurchase$12((TLRPC.InputStorePaymentPurpose) this.f16013a, (Purchase) this.f16014b, (Runnable) this.f16015c, hVar, str);
    }

    @Override
    public int run() {
        int lambda$scrollToFragmentRow$24;
        lambda$scrollToFragmentRow$24 = AndroidUtilities.lambda$scrollToFragmentRow$24((org.telegram.ui.ActionBar.n2) this.f16013a, (String) this.f16014b, (vl0) this.f16015c);
        return lambda$scrollToFragmentRow$24;
    }
}
