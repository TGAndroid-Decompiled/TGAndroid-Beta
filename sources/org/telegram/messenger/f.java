package org.telegram.messenger;

import com.android.billingclient.api.Purchase;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.sl0;
public final class f implements fl0, p2.j {
    public final Object f17171a;
    public final Object f17172b;
    public final Object f17173c;

    public f(Object obj, Object obj2, Object obj3) {
        this.f17171a = obj;
        this.f17172b = obj2;
        this.f17173c = obj3;
    }

    @Override
    public void a(p2.h hVar, String str) {
        BillingController.lambda$consumeGiftPurchase$12((TLRPC.InputStorePaymentPurpose) this.f17171a, (Purchase) this.f17172b, (Runnable) this.f17173c, hVar, str);
    }

    @Override
    public int run() {
        int lambda$scrollToFragmentRow$24;
        lambda$scrollToFragmentRow$24 = AndroidUtilities.lambda$scrollToFragmentRow$24((org.telegram.ui.ActionBar.p2) this.f17171a, (String) this.f17172b, (sl0) this.f17173c);
        return lambda$scrollToFragmentRow$24;
    }
}
