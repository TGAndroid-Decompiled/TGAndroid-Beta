package org.telegram.messenger;

import com.android.billingclient.api.Purchase;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.rm0;
public final class c implements cm0, c5.j {
    public final Object f17466a;
    public final Object f17467b;
    public final Object f17468c;

    public c(Object obj, Object obj2, Object obj3) {
        this.f17466a = obj;
        this.f17467b = obj2;
        this.f17468c = obj3;
    }

    @Override
    public void a(c5.h hVar, String str) {
        BillingController.lambda$consumeGiftPurchase$12((TLRPC.InputStorePaymentPurpose) this.f17466a, (Purchase) this.f17467b, (Runnable) this.f17468c, hVar, str);
    }

    @Override
    public int run() {
        int lambda$scrollToFragmentRow$24;
        lambda$scrollToFragmentRow$24 = AndroidUtilities.lambda$scrollToFragmentRow$24((org.telegram.ui.ActionBar.n2) this.f17466a, (String) this.f17467b, (rm0) this.f17468c);
        return lambda$scrollToFragmentRow$24;
    }
}
