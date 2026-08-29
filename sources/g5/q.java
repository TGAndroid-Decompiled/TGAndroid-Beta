package g5;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import f5.d0;
public final class q implements p, DisplayManager.DisplayListener {
    public final DisplayManager f7071a;
    public eg.n f7072b;

    public q(DisplayManager displayManager) {
        this.f7071a = displayManager;
    }

    @Override
    public final void c(eg.n nVar) {
        this.f7072b = nVar;
        Handler k9 = d0.k(null);
        DisplayManager displayManager = this.f7071a;
        displayManager.registerDisplayListener(this, k9);
        nVar.c(displayManager.getDisplay(0));
    }

    @Override
    public final void onDisplayChanged(int i10) {
        eg.n nVar = this.f7072b;
        if (nVar != null && i10 == 0) {
            nVar.c(this.f7071a.getDisplay(0));
        }
    }

    @Override
    public final void x() {
        this.f7071a.unregisterDisplayListener(this);
        this.f7072b = null;
    }

    @Override
    public final void onDisplayAdded(int i10) {
    }

    @Override
    public final void onDisplayRemoved(int i10) {
    }
}
