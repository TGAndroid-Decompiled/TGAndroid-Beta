package defpackage;

import android.view.Choreographer;
public abstract class nu8 {
    public static void a(Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new jr4(runnable, (byte) 2));
    }
}
