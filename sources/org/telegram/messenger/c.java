package org.telegram.messenger;

import com.android.billingclient.api.Purchase;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.ul0;
public final class c implements ul0, c5.k {
    public final Object f17997a;
    public final Object f17998b;
    public final Object f17999c;

    public c(Object obj, Object obj2, Object obj3) {
        this.f17997a = obj;
        this.f17998b = obj2;
        this.f17999c = obj3;
    }

    @Override
    public void a(c5.i iVar, String str) {
        BillingController.lambda$consumeGiftPurchase$12((TLRPC.InputStorePaymentPurpose) this.f17997a, (Purchase) this.f17998b, (Runnable) this.f17999c, iVar, str);
    }

    @Override
    public int run() {
        int lambda$scrollToFragmentRow$24;
        lambda$scrollToFragmentRow$24 = AndroidUtilities.lambda$scrollToFragmentRow$24((org.telegram.ui.ActionBar.n2) this.f17997a, (String) this.f17998b, (jm0) this.f17999c);
        return lambda$scrollToFragmentRow$24;
    }
}
