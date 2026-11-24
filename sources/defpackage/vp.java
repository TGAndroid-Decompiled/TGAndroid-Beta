package defpackage;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import j$.util.Objects;
public abstract class vp {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, bq bqVar) {
        Objects.requireNonNull(bqVar);
        up upVar = new up(bqVar, (byte) 0);
        zg.a(obj).registerOnBackInvokedCallback(1000000, upVar);
        return upVar;
    }

    public static void c(Object obj, Object obj2) {
        zg.a(obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
