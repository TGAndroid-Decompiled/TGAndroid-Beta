package c3;

import android.hardware.display.DisplayManager;
import android.view.Choreographer;
public abstract class a0 implements DisplayManager.DisplayListener {
    public final Choreographer f3983a;
    public final DisplayManager f3984b;
    public volatile long f3985c = -9223372036854775807L;
    public volatile long d = -9223372036854775807L;

    public a0(Choreographer choreographer, DisplayManager displayManager) {
        this.f3983a = choreographer;
        this.f3984b = displayManager;
    }

    public abstract void a();

    public abstract void b();

    @Override
    public final void onDisplayAdded(int i3) {
    }

    @Override
    public final void onDisplayRemoved(int i3) {
    }
}
