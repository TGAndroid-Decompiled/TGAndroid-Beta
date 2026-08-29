package e2;

import android.view.Choreographer;
public abstract class f {
    public static void a(Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new af.b(runnable, 1));
    }
}
