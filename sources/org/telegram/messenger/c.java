package org.telegram.messenger;

import com.android.billingclient.api.Purchase;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.xl0;
public final class c implements xl0, c5.k {
    public final Object f18060a;
    public final Object f18061b;
    public final Object f18062c;

    public c(Object obj, Object obj2, Object obj3) {
        this.f18060a = obj;
        this.f18061b = obj2;
        this.f18062c = obj3;
    }

    @Override
    public void a(c5.i iVar, String str) {
        BillingController.lambda$consumeGiftPurchase$12((TLRPC.InputStorePaymentPurpose) this.f18060a, (Purchase) this.f18061b, (Runnable) this.f18062c, iVar, str);
    }

    @Override
    public int run() {
        int lambda$scrollToFragmentRow$24;
        lambda$scrollToFragmentRow$24 = AndroidUtilities.lambda$scrollToFragmentRow$24((org.telegram.ui.ActionBar.o2) this.f18060a, (String) this.f18061b, (mm0) this.f18062c);
        return lambda$scrollToFragmentRow$24;
    }
}
