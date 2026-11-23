package d3;

import android.hardware.display.DisplayManager;
import android.view.Choreographer;
public abstract class z implements DisplayManager.DisplayListener {
    public final Choreographer f7772a;
    public final DisplayManager f7773b;
    public volatile long f7774c = -9223372036854775807L;
    public volatile long d = -9223372036854775807L;

    public z(Choreographer choreographer, DisplayManager displayManager) {
        this.f7772a = choreographer;
        this.f7773b = displayManager;
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
