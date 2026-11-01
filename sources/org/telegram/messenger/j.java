package org.telegram.messenger;

import com.android.billingclient.api.Purchase;
import java.lang.reflect.Field;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.uk0;
public final class j implements ek0, c5.h {
    public final Object f16388a;
    public final Object f16389b;
    public final Object f16390c;

    public j(Object obj, Object obj2, Object obj3) {
        this.f16388a = obj;
        this.f16389b = obj2;
        this.f16390c = obj3;
    }

    @Override
    public void a(c5.g gVar) {
        Object valueOf;
        Purchase purchase = (Purchase) this.f16389b;
        Runnable runnable = (Runnable) this.f16390c;
        StringBuilder sb2 = new StringBuilder("BillingController consumeGiftPurchase ");
        sb2.append((TLRPC.InputStorePaymentPurpose) this.f16388a);
        sb2.append(" ");
        sb2.append(purchase.a());
        sb2.append(" ");
        sb2.append(purchase.c());
        sb2.append(" done: ");
        int i10 = gVar.f3785a;
        if (i10 == 0) {
            valueOf = "OK";
        } else {
            valueOf = Integer.valueOf(i10);
        }
        sb2.append(valueOf);
        sb2.append(" ");
        a1.g.z(gVar.f3787c, sb2);
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public int run() {
        org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.f16388a;
        String str = (String) this.f16389b;
        uk0 uk0Var = (uk0) this.f16390c;
        int i10 = -1;
        try {
            Field declaredField = k2Var.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            i10 = declaredField.getInt(k2Var);
            ((s4.a0) uk0Var.getLayoutManager()).h1(i10, i0.L(60.0f));
            declaredField.setAccessible(false);
            return i10;
        } catch (Throwable unused) {
            return i10;
        }
    }
}
