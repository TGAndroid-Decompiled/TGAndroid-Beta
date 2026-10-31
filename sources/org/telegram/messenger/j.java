package org.telegram.messenger;

import com.android.billingclient.api.Purchase;
import java.lang.reflect.Field;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.tk0;
public final class j implements dk0, c5.h {
    public final Object f16199a;
    public final Object f16200b;
    public final Object f16201c;

    public j(Object obj, Object obj2, Object obj3) {
        this.f16199a = obj;
        this.f16200b = obj2;
        this.f16201c = obj3;
    }

    @Override
    public void a(c5.g gVar) {
        Object valueOf;
        Purchase purchase = (Purchase) this.f16200b;
        Runnable runnable = (Runnable) this.f16201c;
        StringBuilder sb2 = new StringBuilder("BillingController consumeGiftPurchase ");
        sb2.append((TLRPC.InputStorePaymentPurpose) this.f16199a);
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
        org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.f16199a;
        String str = (String) this.f16200b;
        tk0 tk0Var = (tk0) this.f16201c;
        int i10 = -1;
        try {
            Field declaredField = k2Var.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            i10 = declaredField.getInt(k2Var);
            ((s4.a0) tk0Var.getLayoutManager()).h1(i10, i0.L(60.0f));
            declaredField.setAccessible(false);
            return i10;
        } catch (Throwable unused) {
            return i10;
        }
    }
}
