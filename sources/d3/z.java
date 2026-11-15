package d3;

import android.hardware.display.DisplayManager;
import android.view.Choreographer;
public abstract class z implements DisplayManager.DisplayListener {
    public final Choreographer f7494a;
    public final DisplayManager f7495b;
    public volatile long f7496c = -9223372036854775807L;
    public volatile long d = -9223372036854775807L;

    public z(Choreographer choreographer, DisplayManager displayManager) {
        this.f7494a = choreographer;
        this.f7495b = displayManager;
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
