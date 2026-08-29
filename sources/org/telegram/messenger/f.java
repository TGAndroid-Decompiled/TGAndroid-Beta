package org.telegram.messenger;

import com.android.billingclient.api.Purchase;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.wk0;
public final class f implements wk0, p2.h {
    public final Object f20181a;
    public final Object f20182b;
    public final Object f20183c;

    public f(Object obj, Object obj2, Object obj3) {
        this.f20181a = obj;
        this.f20182b = obj2;
        this.f20183c = obj3;
    }

    @Override
    public void a(p2.g gVar, String str) {
        BillingController.lambda$consumeGiftPurchase$12((TLRPC.InputStorePaymentPurpose) this.f20181a, (Purchase) this.f20182b, (Runnable) this.f20183c, gVar, str);
    }

    @Override
    public int run() {
        int lambda$scrollToFragmentRow$24;
        lambda$scrollToFragmentRow$24 = AndroidUtilities.lambda$scrollToFragmentRow$24((org.telegram.ui.ActionBar.o2) this.f20181a, (String) this.f20182b, (jl0) this.f20183c);
        return lambda$scrollToFragmentRow$24;
    }
}
