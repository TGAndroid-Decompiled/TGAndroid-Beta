package org.telegram.messenger;

import com.android.billingclient.api.Purchase;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.tl0;
public final class c implements tl0, c5.k {
    public final Object f17993a;
    public final Object f17994b;
    public final Object f17995c;

    public c(Object obj, Object obj2, Object obj3) {
        this.f17993a = obj;
        this.f17994b = obj2;
        this.f17995c = obj3;
    }

    @Override
    public void a(c5.i iVar, String str) {
        BillingController.lambda$consumeGiftPurchase$12((TLRPC.InputStorePaymentPurpose) this.f17993a, (Purchase) this.f17994b, (Runnable) this.f17995c, iVar, str);
    }

    @Override
    public int run() {
        int lambda$scrollToFragmentRow$24;
        lambda$scrollToFragmentRow$24 = AndroidUtilities.lambda$scrollToFragmentRow$24((org.telegram.ui.ActionBar.n2) this.f17993a, (String) this.f17994b, (im0) this.f17995c);
        return lambda$scrollToFragmentRow$24;
    }
}
