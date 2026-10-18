package org.telegram.messenger;

import com.android.billingclient.api.Purchase;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.tl0;
public final class c implements tl0, c5.k {
    public final Object f18005a;
    public final Object f18006b;
    public final Object f18007c;

    public c(Object obj, Object obj2, Object obj3) {
        this.f18005a = obj;
        this.f18006b = obj2;
        this.f18007c = obj3;
    }

    @Override
    public void a(c5.i iVar, String str) {
        BillingController.lambda$consumeGiftPurchase$12((TLRPC.InputStorePaymentPurpose) this.f18005a, (Purchase) this.f18006b, (Runnable) this.f18007c, iVar, str);
    }

    @Override
    public int run() {
        int lambda$scrollToFragmentRow$24;
        lambda$scrollToFragmentRow$24 = AndroidUtilities.lambda$scrollToFragmentRow$24((org.telegram.ui.ActionBar.n2) this.f18005a, (String) this.f18006b, (im0) this.f18007c);
        return lambda$scrollToFragmentRow$24;
    }
}
