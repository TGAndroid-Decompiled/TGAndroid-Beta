package org.telegram.messenger;

import com.android.billingclient.api.Purchase;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.yl0;
public final class c implements jl0, c5.j {
    public final Object f16038a;
    public final Object f16039b;
    public final Object f16040c;

    public c(Object obj, Object obj2, Object obj3) {
        this.f16038a = obj;
        this.f16039b = obj2;
        this.f16040c = obj3;
    }

    @Override
    public void a(c5.h hVar, String str) {
        BillingController.lambda$consumeGiftPurchase$12((TLRPC.InputStorePaymentPurpose) this.f16038a, (Purchase) this.f16039b, (Runnable) this.f16040c, hVar, str);
    }

    @Override
    public int run() {
        int lambda$scrollToFragmentRow$24;
        lambda$scrollToFragmentRow$24 = AndroidUtilities.lambda$scrollToFragmentRow$24((org.telegram.ui.ActionBar.m2) this.f16038a, (String) this.f16039b, (yl0) this.f16040c);
        return lambda$scrollToFragmentRow$24;
    }
}
