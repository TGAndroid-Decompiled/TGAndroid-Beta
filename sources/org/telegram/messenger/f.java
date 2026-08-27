package org.telegram.messenger;

import com.android.billingclient.api.Purchase;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mk0;
import org.telegram.ui.Components.zk0;

public final class f implements mk0, n2.h {

    public final Object f20200a;

    public final Object f20201b;

    public final Object f20202c;

    public f(Object obj, Object obj2, Object obj3) {
        this.f20200a = obj;
        this.f20201b = obj2;
        this.f20202c = obj3;
    }

    @Override
    public void a(n2.g gVar, String str) {
        BillingController.lambda$consumeGiftPurchase$12((TLRPC.InputStorePaymentPurpose) this.f20200a, (Purchase) this.f20201b, (Runnable) this.f20202c, gVar, str);
    }

    @Override
    public int run() {
        return AndroidUtilities.lambda$scrollToFragmentRow$24((org.telegram.ui.ActionBar.n2) this.f20200a, (String) this.f20201b, (zk0) this.f20202c);
    }
}
