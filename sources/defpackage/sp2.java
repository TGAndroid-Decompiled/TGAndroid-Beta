package defpackage;

import android.app.Activity;
import android.window.OnBackInvokedDispatcher;
public abstract class sp2 {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }
}
