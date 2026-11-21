package d3;

import android.hardware.display.DisplayManager;
import android.view.Choreographer;
public abstract class z implements DisplayManager.DisplayListener {
    public final Choreographer f7806a;
    public final DisplayManager f7807b;
    public volatile long f7808c = -9223372036854775807L;
    public volatile long d = -9223372036854775807L;

    public z(Choreographer choreographer, DisplayManager displayManager) {
        this.f7806a = choreographer;
        this.f7807b = displayManager;
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
