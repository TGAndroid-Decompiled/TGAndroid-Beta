package org.telegram.messenger;

import com.android.billingclient.api.Purchase;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.sl0;
public final class f implements fl0, p2.i {
    public final Object f18615a;
    public final Object f18616b;
    public final Object f18617c;

    public f(Object obj, Object obj2, Object obj3) {
        this.f18615a = obj;
        this.f18616b = obj2;
        this.f18617c = obj3;
    }

    @Override
    public void a(p2.h hVar, String str) {
        BillingController.lambda$consumeGiftPurchase$12((TLRPC.InputStorePaymentPurpose) this.f18615a, (Purchase) this.f18616b, (Runnable) this.f18617c, hVar, str);
    }

    @Override
    public int run() {
        int lambda$scrollToFragmentRow$24;
        lambda$scrollToFragmentRow$24 = AndroidUtilities.lambda$scrollToFragmentRow$24((org.telegram.ui.ActionBar.p2) this.f18615a, (String) this.f18616b, (sl0) this.f18617c);
        return lambda$scrollToFragmentRow$24;
    }
}
