package d3;

import android.hardware.display.DisplayManager;
import android.view.Choreographer;
public abstract class z implements DisplayManager.DisplayListener {
    public final Choreographer f7497a;
    public final DisplayManager f7498b;
    public volatile long f7499c = -9223372036854775807L;
    public volatile long d = -9223372036854775807L;

    public z(Choreographer choreographer, DisplayManager displayManager) {
        this.f7497a = choreographer;
        this.f7498b = displayManager;
    }

    public abstract void a();

    public abstract void b();

    @Override
    public final void onDisplayAdded(int i7) {
    }

    @Override
    public final void onDisplayRemoved(int i7) {
    }
}
