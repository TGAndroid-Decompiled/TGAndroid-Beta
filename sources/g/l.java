package g;

import ai.sb;
import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import j$.util.Objects;
public abstract class l {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, r rVar) {
        Objects.requireNonNull(rVar);
        sb sbVar = new sb(rVar, 3);
        d2.c.c(obj).registerOnBackInvokedCallback(1000000, sbVar);
        return sbVar;
    }

    public static void c(Object obj, Object obj2) {
        d2.c.c(obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
