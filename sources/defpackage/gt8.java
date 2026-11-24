package defpackage;

import android.view.Choreographer;
public abstract class gt8 {
    public static void a(Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new gr4(runnable, (byte) 2));
    }
}
