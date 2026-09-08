package a3;

import android.hardware.display.DisplayManager;
public final class c0 implements DisplayManager.DisplayListener {
    public final DisplayManager f77a;
    public final e0 f78b;

    public c0(e0 e0Var, DisplayManager displayManager) {
        this.f78b = e0Var;
        this.f77a = displayManager;
    }

    @Override
    public final void onDisplayChanged(int i10) {
        if (i10 == 0) {
            e0.a(this.f78b, this.f77a.getDisplay(0));
        }
    }

    @Override
    public final void onDisplayAdded(int i10) {
    }

    @Override
    public final void onDisplayRemoved(int i10) {
    }
}
