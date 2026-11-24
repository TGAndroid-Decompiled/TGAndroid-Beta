package defpackage;

import android.view.Window;
public abstract class wwc {
    public static void a(Window.Callback callback, boolean z) {
        callback.onPointerCaptureChanged(z);
    }
}
