package defpackage;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import j$.util.Objects;
public abstract class wo {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, cp cpVar) {
        Objects.requireNonNull(cpVar);
        vo voVar = new vo(cpVar, (byte) 0);
        bg.a(obj).registerOnBackInvokedCallback(1000000, voVar);
        return voVar;
    }

    public static void c(Object obj, Object obj2) {
        bg.a(obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
