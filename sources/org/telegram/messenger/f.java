package org.telegram.messenger;

import com.android.billingclient.api.Purchase;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.jk0;
import org.telegram.ui.Components.wk0;
public final class f implements jk0, n2.h {
    public final Object f20228a;
    public final Object f20229b;
    public final Object f20230c;

    public f(Object obj, Object obj2, Object obj3) {
        this.f20228a = obj;
        this.f20229b = obj2;
        this.f20230c = obj3;
    }

    @Override
    public void a(n2.g gVar, String str) {
        BillingController.lambda$consumeGiftPurchase$12((TLRPC.InputStorePaymentPurpose) this.f20228a, (Purchase) this.f20229b, (Runnable) this.f20230c, gVar, str);
    }

    @Override
    public int run() {
        int lambda$scrollToFragmentRow$24;
        lambda$scrollToFragmentRow$24 = AndroidUtilities.lambda$scrollToFragmentRow$24((org.telegram.ui.ActionBar.o2) this.f20228a, (String) this.f20229b, (wk0) this.f20230c);
        return lambda$scrollToFragmentRow$24;
    }
}
