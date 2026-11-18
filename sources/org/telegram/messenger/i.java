package org.telegram.messenger;

import com.android.billingclient.api.Purchase;
import java.lang.reflect.Field;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.lj0;
public final class i implements lj0, f5.h {
    public final Object f24529a;
    public final Object f24530b;
    public final Object f24531c;

    public i(Object obj, Object obj2, Object obj3) {
        this.f24529a = obj;
        this.f24530b = obj2;
        this.f24531c = obj3;
    }

    @Override
    public void a(f5.f fVar) {
        Object valueOf;
        Purchase purchase = (Purchase) this.f24530b;
        Runnable runnable = (Runnable) this.f24531c;
        StringBuilder sb2 = new StringBuilder("BillingController consumeGiftPurchase ");
        sb2.append((TLRPC.InputStorePaymentPurpose) this.f24529a);
        sb2.append(" ");
        sb2.append(purchase.a());
        sb2.append(" ");
        sb2.append(purchase.c());
        sb2.append(" done: ");
        int i7 = fVar.f11283a;
        if (i7 == 0) {
            valueOf = "OK";
        } else {
            valueOf = Integer.valueOf(i7);
        }
        sb2.append(valueOf);
        sb2.append(" ");
        p5.c.s(fVar.f11285c, sb2);
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public int run() {
        org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) this.f24529a;
        String str = (String) this.f24530b;
        ck0 ck0Var = (ck0) this.f24531c;
        int i7 = -1;
        try {
            Field declaredField = h2Var.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            i7 = declaredField.getInt(h2Var);
            ((v4.c0) ck0Var.getLayoutManager()).h1(i7, g0.L(60.0f));
            declaredField.setAccessible(false);
            return i7;
        } catch (Throwable unused) {
            return i7;
        }
    }
}
