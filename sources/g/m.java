package g;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import di.w9;
import j$.util.Objects;
public abstract class m {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, s sVar) {
        Objects.requireNonNull(sVar);
        androidx.activity.r rVar = new androidx.activity.r(sVar, 3);
        w9.c(obj).registerOnBackInvokedCallback(1000000, rVar);
        return rVar;
    }

    public static void c(Object obj, Object obj2) {
        w9.c(obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
