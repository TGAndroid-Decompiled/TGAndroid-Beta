package org.telegram.messenger;

import com.android.billingclient.api.Purchase;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.wl0;
public final class e implements wl0, d5.k {
    public final Object f19941a;
    public final Object f19942b;
    public final Object f19943c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f19941a = obj;
        this.f19942b = obj2;
        this.f19943c = obj3;
    }

    @Override
    public void a(d5.i iVar, String str) {
        BillingController.lambda$consumeGiftPurchase$12((TLRPC.InputStorePaymentPurpose) this.f19941a, (Purchase) this.f19942b, (Runnable) this.f19943c, iVar, str);
    }

    @Override
    public int run() {
        int lambda$scrollToFragmentRow$24;
        lambda$scrollToFragmentRow$24 = AndroidUtilities.lambda$scrollToFragmentRow$24((org.telegram.ui.ActionBar.r2) this.f19941a, (String) this.f19942b, (mm0) this.f19943c);
        return lambda$scrollToFragmentRow$24;
    }
}
