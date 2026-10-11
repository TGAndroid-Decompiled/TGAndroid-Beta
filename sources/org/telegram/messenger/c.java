package org.telegram.messenger;

import com.android.billingclient.api.Purchase;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dm0;
import org.telegram.ui.Components.sm0;
public final class c implements dm0, c5.j {
    public final Object f17465a;
    public final Object f17466b;
    public final Object f17467c;

    public c(Object obj, Object obj2, Object obj3) {
        this.f17465a = obj;
        this.f17466b = obj2;
        this.f17467c = obj3;
    }

    @Override
    public void a(c5.h hVar, String str) {
        BillingController.lambda$consumeGiftPurchase$12((TLRPC.InputStorePaymentPurpose) this.f17465a, (Purchase) this.f17466b, (Runnable) this.f17467c, hVar, str);
    }

    @Override
    public int run() {
        int lambda$scrollToFragmentRow$24;
        lambda$scrollToFragmentRow$24 = AndroidUtilities.lambda$scrollToFragmentRow$24((org.telegram.ui.ActionBar.m2) this.f17465a, (String) this.f17466b, (sm0) this.f17467c);
        return lambda$scrollToFragmentRow$24;
    }
}
