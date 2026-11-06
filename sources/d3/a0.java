package d3;

import android.hardware.display.DisplayManager;
import android.view.Choreographer;
public abstract class a0 implements DisplayManager.DisplayListener {
    public final Choreographer f7961a;
    public final DisplayManager f7962b;
    public volatile long f7963c = -9223372036854775807L;
    public volatile long d = -9223372036854775807L;

    public a0(Choreographer choreographer, DisplayManager displayManager) {
        this.f7961a = choreographer;
        this.f7962b = displayManager;
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
