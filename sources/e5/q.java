package e5;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import d5.f0;
public final class q implements p, DisplayManager.DisplayListener {
    public final DisplayManager f4916a;
    public a1.c f4917b;

    public q(DisplayManager displayManager) {
        this.f4916a = displayManager;
    }

    @Override
    public final void m(a1.c cVar) {
        this.f4917b = cVar;
        Handler k10 = f0.k(null);
        DisplayManager displayManager = this.f4916a;
        displayManager.registerDisplayListener(this, k10);
        cVar.a(displayManager.getDisplay(0));
    }

    @Override
    public final void onDisplayChanged(int i9) {
        a1.c cVar = this.f4917b;
        if (cVar != null && i9 == 0) {
            cVar.a(this.f4916a.getDisplay(0));
        }
    }

    @Override
    public final void s() {
        this.f4916a.unregisterDisplayListener(this);
        this.f4917b = null;
    }

    @Override
    public final void onDisplayAdded(int i9) {
    }

    @Override
    public final void onDisplayRemoved(int i9) {
    }
}
