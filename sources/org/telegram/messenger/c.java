package org.telegram.messenger;

import com.android.billingclient.api.Purchase;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.yl0;
public final class c implements jl0, c5.j {
    public final Object f16031a;
    public final Object f16032b;
    public final Object f16033c;

    public c(Object obj, Object obj2, Object obj3) {
        this.f16031a = obj;
        this.f16032b = obj2;
        this.f16033c = obj3;
    }

    @Override
    public void a(c5.h hVar, String str) {
        BillingController.lambda$consumeGiftPurchase$12((TLRPC.InputStorePaymentPurpose) this.f16031a, (Purchase) this.f16032b, (Runnable) this.f16033c, hVar, str);
    }

    @Override
    public int run() {
        int lambda$scrollToFragmentRow$24;
        lambda$scrollToFragmentRow$24 = AndroidUtilities.lambda$scrollToFragmentRow$24((org.telegram.ui.ActionBar.o2) this.f16031a, (String) this.f16032b, (yl0) this.f16033c);
        return lambda$scrollToFragmentRow$24;
    }
}
