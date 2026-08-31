package org.telegram.messenger;

import com.android.billingclient.api.Purchase;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.tl0;
public final class f implements gl0, p2.i {
    public final Object f18613a;
    public final Object f18614b;
    public final Object f18615c;

    public f(Object obj, Object obj2, Object obj3) {
        this.f18613a = obj;
        this.f18614b = obj2;
        this.f18615c = obj3;
    }

    @Override
    public void a(p2.h hVar, String str) {
        BillingController.lambda$consumeGiftPurchase$12((TLRPC.InputStorePaymentPurpose) this.f18613a, (Purchase) this.f18614b, (Runnable) this.f18615c, hVar, str);
    }

    @Override
    public int run() {
        int lambda$scrollToFragmentRow$24;
        lambda$scrollToFragmentRow$24 = AndroidUtilities.lambda$scrollToFragmentRow$24((org.telegram.ui.ActionBar.p2) this.f18613a, (String) this.f18614b, (tl0) this.f18615c);
        return lambda$scrollToFragmentRow$24;
    }
}
