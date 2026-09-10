package org.telegram.messenger;

import com.android.billingclient.api.Purchase;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.vl0;
public final class c implements gl0, c5.j {
    public final Object f14820a;
    public final Object f14821b;
    public final Object f14822c;

    public c(Object obj, Object obj2, Object obj3) {
        this.f14820a = obj;
        this.f14821b = obj2;
        this.f14822c = obj3;
    }

    @Override
    public void a(c5.h hVar, String str) {
        BillingController.lambda$consumeGiftPurchase$12((TLRPC.InputStorePaymentPurpose) this.f14820a, (Purchase) this.f14821b, (Runnable) this.f14822c, hVar, str);
    }

    @Override
    public int run() {
        int lambda$scrollToFragmentRow$24;
        lambda$scrollToFragmentRow$24 = AndroidUtilities.lambda$scrollToFragmentRow$24((org.telegram.ui.ActionBar.p2) this.f14820a, (String) this.f14821b, (vl0) this.f14822c);
        return lambda$scrollToFragmentRow$24;
    }
}
