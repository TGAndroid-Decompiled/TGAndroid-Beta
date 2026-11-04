package org.telegram.messenger;

import com.android.billingclient.api.Purchase;
import java.lang.reflect.Field;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.tj0;
public final class i implements cj0, e5.g {
    public final Object f23410a;
    public final Object f23411b;
    public final Object f23412c;

    public i(Object obj, Object obj2, Object obj3) {
        this.f23410a = obj;
        this.f23411b = obj2;
        this.f23412c = obj3;
    }

    @Override
    public void a(e5.f fVar) {
        Object valueOf;
        Purchase purchase = (Purchase) this.f23411b;
        Runnable runnable = (Runnable) this.f23412c;
        StringBuilder sb2 = new StringBuilder("BillingController consumeGiftPurchase ");
        sb2.append((TLRPC.InputStorePaymentPurpose) this.f23410a);
        sb2.append(" ");
        sb2.append(purchase.a());
        sb2.append(" ");
        sb2.append(purchase.c());
        sb2.append(" done: ");
        int i3 = fVar.f9593a;
        if (i3 == 0) {
            valueOf = "OK";
        } else {
            valueOf = Integer.valueOf(i3);
        }
        sb2.append(valueOf);
        sb2.append(" ");
        k2.p1.w(fVar.f9595c, sb2);
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public int run() {
        org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.f23410a;
        String str = (String) this.f23411b;
        tj0 tj0Var = (tj0) this.f23412c;
        int i3 = -1;
        try {
            Field declaredField = d2Var.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            i3 = declaredField.getInt(d2Var);
            ((u4.b0) tj0Var.getLayoutManager()).h1(i3, g0.L(60.0f));
            declaredField.setAccessible(false);
            return i3;
        } catch (Throwable unused) {
            return i3;
        }
    }
}
