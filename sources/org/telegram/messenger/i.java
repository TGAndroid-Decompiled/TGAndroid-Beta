package org.telegram.messenger;

import com.android.billingclient.api.Purchase;
import java.lang.reflect.Field;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dj0;
import org.telegram.ui.Components.uj0;
public final class i implements dj0, f5.h {
    public final Object f24254a;
    public final Object f24255b;
    public final Object f24256c;

    public i(Object obj, Object obj2, Object obj3) {
        this.f24254a = obj;
        this.f24255b = obj2;
        this.f24256c = obj3;
    }

    @Override
    public void a(f5.f fVar) {
        Object valueOf;
        Purchase purchase = (Purchase) this.f24255b;
        Runnable runnable = (Runnable) this.f24256c;
        StringBuilder sb2 = new StringBuilder("BillingController consumeGiftPurchase ");
        sb2.append((TLRPC.InputStorePaymentPurpose) this.f24254a);
        sb2.append(" ");
        sb2.append(purchase.a());
        sb2.append(" ");
        sb2.append(purchase.c());
        sb2.append(" done: ");
        int i7 = fVar.f10978a;
        if (i7 == 0) {
            valueOf = "OK";
        } else {
            valueOf = Integer.valueOf(i7);
        }
        sb2.append(valueOf);
        sb2.append(" ");
        org.telegram.ui.Cells.y0.t(fVar.f10980c, sb2);
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public int run() {
        org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.f24254a;
        String str = (String) this.f24255b;
        uj0 uj0Var = (uj0) this.f24256c;
        int i7 = -1;
        try {
            Field declaredField = e2Var.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            i7 = declaredField.getInt(e2Var);
            ((v4.b0) uj0Var.getLayoutManager()).h1(i7, g0.L(60.0f));
            declaredField.setAccessible(false);
            return i7;
        } catch (Throwable unused) {
            return i7;
        }
    }
}
