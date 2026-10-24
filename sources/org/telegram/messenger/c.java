package org.telegram.messenger;

import com.android.billingclient.api.Purchase;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.wl0;
public final class c implements wl0, c5.k {
    public final Object f18050a;
    public final Object f18051b;
    public final Object f18052c;

    public c(Object obj, Object obj2, Object obj3) {
        this.f18050a = obj;
        this.f18051b = obj2;
        this.f18052c = obj3;
    }

    @Override
    public void a(c5.i iVar, String str) {
        BillingController.lambda$consumeGiftPurchase$12((TLRPC.InputStorePaymentPurpose) this.f18050a, (Purchase) this.f18051b, (Runnable) this.f18052c, iVar, str);
    }

    @Override
    public int run() {
        int lambda$scrollToFragmentRow$24;
        lambda$scrollToFragmentRow$24 = AndroidUtilities.lambda$scrollToFragmentRow$24((org.telegram.ui.ActionBar.o2) this.f18050a, (String) this.f18051b, (lm0) this.f18052c);
        return lambda$scrollToFragmentRow$24;
    }
}
