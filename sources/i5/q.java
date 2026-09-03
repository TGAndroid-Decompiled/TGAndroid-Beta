package i5;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import h5.d0;
public final class q implements p, DisplayManager.DisplayListener {
    public final DisplayManager f7293a;
    public gg.f f7294b;

    public q(DisplayManager displayManager) {
        this.f7293a = displayManager;
    }

    @Override
    public final void l(gg.f fVar) {
        this.f7294b = fVar;
        Handler l10 = d0.l(null);
        DisplayManager displayManager = this.f7293a;
        displayManager.registerDisplayListener(this, l10);
        fVar.a(displayManager.getDisplay(0));
    }

    @Override
    public final void onDisplayChanged(int i10) {
        gg.f fVar = this.f7294b;
        if (fVar != null && i10 == 0) {
            fVar.a(this.f7293a.getDisplay(0));
        }
    }

    @Override
    public final void z() {
        this.f7293a.unregisterDisplayListener(this);
        this.f7294b = null;
    }

    @Override
    public final void onDisplayAdded(int i10) {
    }

    @Override
    public final void onDisplayRemoved(int i10) {
    }
}
