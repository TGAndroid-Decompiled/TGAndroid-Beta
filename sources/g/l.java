package g;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import fh.y5;
import j$.util.Objects;
public abstract class l {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, q qVar) {
        Objects.requireNonNull(qVar);
        androidx.activity.r rVar = new androidx.activity.r(qVar, 1);
        y5.e(obj).registerOnBackInvokedCallback(1000000, rVar);
        return rVar;
    }

    public static void c(Object obj, Object obj2) {
        y5.e(obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
