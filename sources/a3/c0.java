package a3;

import android.hardware.display.DisplayManager;
public final class c0 implements DisplayManager.DisplayListener {
    public final DisplayManager f74a;
    public final e0 f75b;

    public c0(e0 e0Var, DisplayManager displayManager) {
        this.f75b = e0Var;
        this.f74a = displayManager;
    }

    @Override
    public final void onDisplayChanged(int i10) {
        if (i10 == 0) {
            e0.a(this.f75b, this.f74a.getDisplay(0));
        }
    }

    @Override
    public final void onDisplayAdded(int i10) {
    }

    @Override
    public final void onDisplayRemoved(int i10) {
    }
}
