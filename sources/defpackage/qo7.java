package defpackage;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
public final class qo7 {
    public static final qo7 a = new Object();

    public final OnBackInvokedCallback a(op4 op4Var) {
        op4Var.getClass();
        return new uo(op4Var, (byte) 1);
    }

    public final void b(Object obj, int i, Object obj2) {
        obj.getClass();
        obj2.getClass();
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
    }

    public final void c(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
