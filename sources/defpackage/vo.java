package defpackage;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import j$.util.Objects;
public abstract class vo {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, bp bpVar) {
        Objects.requireNonNull(bpVar);
        uo uoVar = new uo(bpVar, (byte) 0);
        ag.a(obj).registerOnBackInvokedCallback(1000000, uoVar);
        return uoVar;
    }

    public static void c(Object obj, Object obj2) {
        ag.a(obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
