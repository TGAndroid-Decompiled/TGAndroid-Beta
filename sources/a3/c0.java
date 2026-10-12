package a3;

import android.hardware.display.DisplayManager;
import android.view.Choreographer;
public abstract class c0 implements DisplayManager.DisplayListener {
    public final Choreographer f72a;
    public final DisplayManager f73b;
    public volatile long f74c = -9223372036854775807L;
    public volatile long d = -9223372036854775807L;

    public c0(Choreographer choreographer, DisplayManager displayManager) {
        this.f72a = choreographer;
        this.f73b = displayManager;
    }

    public abstract void a();

    public abstract void b();

    @Override
    public final void onDisplayAdded(int i10) {
    }

    @Override
    public final void onDisplayRemoved(int i10) {
    }
}
