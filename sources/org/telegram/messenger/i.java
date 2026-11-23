package org.telegram.messenger;

import com.android.billingclient.api.Purchase;
import java.lang.reflect.Field;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.nj0;
public final class i implements nj0, f5.h {
    public final Object f24562a;
    public final Object f24563b;
    public final Object f24564c;

    public i(Object obj, Object obj2, Object obj3) {
        this.f24562a = obj;
        this.f24563b = obj2;
        this.f24564c = obj3;
    }

    @Override
    public void a(f5.f fVar) {
        Object valueOf;
        Purchase purchase = (Purchase) this.f24563b;
        Runnable runnable = (Runnable) this.f24564c;
        StringBuilder sb2 = new StringBuilder("BillingController consumeGiftPurchase ");
        sb2.append((TLRPC.InputStorePaymentPurpose) this.f24562a);
        sb2.append(" ");
        sb2.append(purchase.a());
        sb2.append(" ");
        sb2.append(purchase.c());
        sb2.append(" done: ");
        int i7 = fVar.f11315a;
        if (i7 == 0) {
            valueOf = "OK";
        } else {
            valueOf = Integer.valueOf(i7);
        }
        sb2.append(valueOf);
        sb2.append(" ");
        p5.c.s(fVar.f11317c, sb2);
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public int run() {
        org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.f24562a;
        String str = (String) this.f24563b;
        ek0 ek0Var = (ek0) this.f24564c;
        int i7 = -1;
        try {
            Field declaredField = g2Var.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            i7 = declaredField.getInt(g2Var);
            ((v4.c0) ek0Var.getLayoutManager()).h1(i7, g0.L(60.0f));
            declaredField.setAccessible(false);
            return i7;
        } catch (Throwable unused) {
            return i7;
        }
    }
}
