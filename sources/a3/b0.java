package a3;

import android.hardware.display.DisplayManager;
public final class b0 implements DisplayManager.DisplayListener {
    public final DisplayManager f53a;
    public final d0 f54b;

    public b0(d0 d0Var, DisplayManager displayManager) {
        this.f54b = d0Var;
        this.f53a = displayManager;
    }

    @Override
    public final void onDisplayChanged(int i10) {
        if (i10 == 0) {
            d0.a(this.f54b, this.f53a.getDisplay(0));
        }
    }

    @Override
    public final void onDisplayAdded(int i10) {
    }

    @Override
    public final void onDisplayRemoved(int i10) {
    }
}
