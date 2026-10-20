package org.telegram.messenger;

import com.android.billingclient.api.Purchase;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.ul0;
public final class c implements ul0, c5.k {
    public final Object f17999a;
    public final Object f18000b;
    public final Object f18001c;

    public c(Object obj, Object obj2, Object obj3) {
        this.f17999a = obj;
        this.f18000b = obj2;
        this.f18001c = obj3;
    }

    @Override
    public void a(c5.i iVar, String str) {
        BillingController.lambda$consumeGiftPurchase$12((TLRPC.InputStorePaymentPurpose) this.f17999a, (Purchase) this.f18000b, (Runnable) this.f18001c, iVar, str);
    }

    @Override
    public int run() {
        int lambda$scrollToFragmentRow$24;
        lambda$scrollToFragmentRow$24 = AndroidUtilities.lambda$scrollToFragmentRow$24((org.telegram.ui.ActionBar.n2) this.f17999a, (String) this.f18000b, (jm0) this.f18001c);
        return lambda$scrollToFragmentRow$24;
    }
}
