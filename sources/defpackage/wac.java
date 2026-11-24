package defpackage;

import android.hardware.display.DisplayManager;
import android.view.Choreographer;
public abstract class wac implements DisplayManager.DisplayListener {
    public final Choreographer a;
    public final DisplayManager b;
    public volatile long c = -9223372036854775807L;
    public volatile long d = -9223372036854775807L;

    public wac(Choreographer choreographer, DisplayManager displayManager) {
        this.a = choreographer;
        this.b = displayManager;
    }

    public abstract void a();

    public abstract void b();

    @Override
    public final void onDisplayAdded(int i) {
    }

    @Override
    public final void onDisplayRemoved(int i) {
    }
}
