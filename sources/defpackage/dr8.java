package defpackage;

import android.view.Choreographer;
public abstract class dr8 {
    public static void a(Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new fp4(runnable, (byte) 2));
    }
}
