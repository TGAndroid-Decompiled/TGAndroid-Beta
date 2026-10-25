package g;

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
        androidx.activity.q qVar = new androidx.activity.q(rVar, 3);
        c2.i.d(obj).registerOnBackInvokedCallback(1000000, qVar);
        return qVar;
    }

    public static void c(Object obj, Object obj2) {
        c2.i.d(obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
