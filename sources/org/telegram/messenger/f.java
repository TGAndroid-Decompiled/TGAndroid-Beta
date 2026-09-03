package org.telegram.messenger;

import com.android.billingclient.api.Purchase;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.rl0;
public final class f implements el0, p2.i {
    public final Object f17151a;
    public final Object f17152b;
    public final Object f17153c;

    public f(Object obj, Object obj2, Object obj3) {
        this.f17151a = obj;
        this.f17152b = obj2;
        this.f17153c = obj3;
    }

    @Override
    public void a(p2.h hVar, String str) {
        BillingController.lambda$consumeGiftPurchase$12((TLRPC.InputStorePaymentPurpose) this.f17151a, (Purchase) this.f17152b, (Runnable) this.f17153c, hVar, str);
    }

    @Override
    public int run() {
        int lambda$scrollToFragmentRow$24;
        lambda$scrollToFragmentRow$24 = AndroidUtilities.lambda$scrollToFragmentRow$24((org.telegram.ui.ActionBar.p2) this.f17151a, (String) this.f17152b, (rl0) this.f17153c);
        return lambda$scrollToFragmentRow$24;
    }
}
