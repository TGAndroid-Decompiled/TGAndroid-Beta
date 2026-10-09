package org.telegram.messenger;

import com.android.billingclient.api.Purchase;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.qm0;
public final class c implements bm0, c5.j {
    public final Object f17462a;
    public final Object f17463b;
    public final Object f17464c;

    public c(Object obj, Object obj2, Object obj3) {
        this.f17462a = obj;
        this.f17463b = obj2;
        this.f17464c = obj3;
    }

    @Override
    public void a(c5.h hVar, String str) {
        BillingController.lambda$consumeGiftPurchase$12((TLRPC.InputStorePaymentPurpose) this.f17462a, (Purchase) this.f17463b, (Runnable) this.f17464c, hVar, str);
    }

    @Override
    public int run() {
        int lambda$scrollToFragmentRow$24;
        lambda$scrollToFragmentRow$24 = AndroidUtilities.lambda$scrollToFragmentRow$24((org.telegram.ui.ActionBar.n2) this.f17462a, (String) this.f17463b, (qm0) this.f17464c);
        return lambda$scrollToFragmentRow$24;
    }
}
