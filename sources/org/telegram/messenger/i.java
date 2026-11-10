package org.telegram.messenger;

import com.android.billingclient.api.Purchase;
import java.lang.reflect.Field;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.yi0;
public final class i implements yi0, f5.g {
    public final Object f23002a;
    public final Object f23003b;
    public final Object f23004c;

    public i(Object obj, Object obj2, Object obj3) {
        this.f23002a = obj;
        this.f23003b = obj2;
        this.f23004c = obj3;
    }

    @Override
    public void a(f5.f fVar) {
        Object valueOf;
        Purchase purchase = (Purchase) this.f23003b;
        Runnable runnable = (Runnable) this.f23004c;
        StringBuilder sb2 = new StringBuilder("BillingController consumeGiftPurchase ");
        sb2.append((TLRPC.InputStorePaymentPurpose) this.f23002a);
        sb2.append(" ");
        sb2.append(purchase.a());
        sb2.append(" ");
        sb2.append(purchase.c());
        sb2.append(" done: ");
        int i7 = fVar.f11156a;
        if (i7 == 0) {
            valueOf = "OK";
        } else {
            valueOf = Integer.valueOf(i7);
        }
        sb2.append(valueOf);
        sb2.append(" ");
        org.telegram.ui.Cells.f1.u(fVar.f11158c, sb2);
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public int run() {
        org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.f23002a;
        String str = (String) this.f23003b;
        pj0 pj0Var = (pj0) this.f23004c;
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
