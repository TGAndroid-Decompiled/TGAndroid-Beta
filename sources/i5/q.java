package i5;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import h5.d0;
public final class q implements p, DisplayManager.DisplayListener {
    public final DisplayManager f7311a;
    public gg.f f7312b;

    public q(DisplayManager displayManager) {
        this.f7311a = displayManager;
    }

    @Override
    public final void j(gg.f fVar) {
        this.f7312b = fVar;
        Handler l10 = d0.l(null);
        DisplayManager displayManager = this.f7311a;
        displayManager.registerDisplayListener(this, l10);
        fVar.a(displayManager.getDisplay(0));
    }

    @Override
    public final void onDisplayChanged(int i10) {
        gg.f fVar = this.f7312b;
        if (fVar != null && i10 == 0) {
            fVar.a(this.f7311a.getDisplay(0));
        }
    }

    @Override
    public final void z() {
        this.f7311a.unregisterDisplayListener(this);
        this.f7312b = null;
    }

    @Override
    public final void onDisplayAdded(int i10) {
    }

    @Override
    public final void onDisplayRemoved(int i10) {
    }
}
