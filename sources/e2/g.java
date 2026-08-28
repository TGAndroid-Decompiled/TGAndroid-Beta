package e2;

import android.view.Choreographer;
import dh.m;
public abstract class g {
    public static void a(Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new m(runnable, 1));
    }
}
