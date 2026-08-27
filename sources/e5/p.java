package e5;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import d5.g0;

public final class p implements o, DisplayManager.DisplayListener {

    public final DisplayManager f5273a;

    public a1.c f5274b;

    public p(DisplayManager displayManager) {
        this.f5273a = displayManager;
    }

    @Override
    public final void m(a1.c cVar) {
        this.f5274b = cVar;
        Handler handlerK = g0.k(null);
        DisplayManager displayManager = this.f5273a;
        displayManager.registerDisplayListener(this, handlerK);
        cVar.a(displayManager.getDisplay(0));
    }

    @Override
    public final void onDisplayChanged(int i10) {
        a1.c cVar = this.f5274b;
        if (cVar == null || i10 != 0) {
            return;
        }
        cVar.a(this.f5273a.getDisplay(0));
    }

    @Override
    public final void r() {
        this.f5273a.unregisterDisplayListener(this);
        this.f5274b = null;
    }

    @Override
    public final void onDisplayAdded(int i10) {
    }

    @Override
    public final void onDisplayRemoved(int i10) {
    }
}
