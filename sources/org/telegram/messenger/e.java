package org.telegram.messenger;

import com.android.billingclient.api.Purchase;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.xl0;
public final class e implements xl0, d5.k {
    public final Object f19936a;
    public final Object f19937b;
    public final Object f19938c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f19936a = obj;
        this.f19937b = obj2;
        this.f19938c = obj3;
    }

    @Override
    public void a(d5.i iVar, String str) {
        BillingController.lambda$consumeGiftPurchase$12((TLRPC.InputStorePaymentPurpose) this.f19936a, (Purchase) this.f19937b, (Runnable) this.f19938c, iVar, str);
    }

    @Override
    public int run() {
        int lambda$scrollToFragmentRow$24;
        lambda$scrollToFragmentRow$24 = AndroidUtilities.lambda$scrollToFragmentRow$24((org.telegram.ui.ActionBar.r2) this.f19936a, (String) this.f19937b, (nm0) this.f19938c);
        return lambda$scrollToFragmentRow$24;
    }
}
