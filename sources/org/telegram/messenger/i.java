package org.telegram.messenger;

import com.android.billingclient.api.Purchase;
import java.lang.reflect.Field;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.yi0;
public final class i implements yi0, f5.g {
    public final Object f22998a;
    public final Object f22999b;
    public final Object f23000c;

    public i(Object obj, Object obj2, Object obj3) {
        this.f22998a = obj;
        this.f22999b = obj2;
        this.f23000c = obj3;
    }

    @Override
    public void a(f5.f fVar) {
        Object valueOf;
        Purchase purchase = (Purchase) this.f22999b;
        Runnable runnable = (Runnable) this.f23000c;
        StringBuilder sb2 = new StringBuilder("BillingController consumeGiftPurchase ");
        sb2.append((TLRPC.InputStorePaymentPurpose) this.f22998a);
        sb2.append(" ");
        sb2.append(purchase.a());
        sb2.append(" ");
        sb2.append(purchase.c());
        sb2.append(" done: ");
        int i7 = fVar.f11151a;
        if (i7 == 0) {
            valueOf = "OK";
        } else {
            valueOf = Integer.valueOf(i7);
        }
        sb2.append(valueOf);
        sb2.append(" ");
        org.telegram.ui.Cells.f1.u(fVar.f11153c, sb2);
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public int run() {
        org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.f22998a;
        String str = (String) this.f22999b;
        pj0 pj0Var = (pj0) this.f23000c;
        int i7 = -1;
        try {
            Field declaredField = f2Var.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            i7 = declaredField.getInt(f2Var);
            ((v4.b0) pj0Var.getLayoutManager()).h1(i7, g0.L(60.0f));
            declaredField.setAccessible(false);
            return i7;
        } catch (Throwable unused) {
            return i7;
        }
    }
}
