package i5;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import h5.d0;
public final class q implements p, DisplayManager.DisplayListener {
    public final DisplayManager f7864a;
    public hg.f f7865b;

    public q(DisplayManager displayManager) {
        this.f7864a = displayManager;
    }

    @Override
    public final void onDisplayChanged(int i10) {
        hg.f fVar = this.f7865b;
        if (fVar != null && i10 == 0) {
            fVar.a(this.f7864a.getDisplay(0));
        }
    }

    @Override
    public final void r(hg.f fVar) {
        this.f7865b = fVar;
        Handler l10 = d0.l(null);
        DisplayManager displayManager = this.f7864a;
        displayManager.registerDisplayListener(this, l10);
        fVar.a(displayManager.getDisplay(0));
    }

    @Override
    public final void s() {
        this.f7864a.unregisterDisplayListener(this);
        this.f7865b = null;
    }

    @Override
    public final void onDisplayAdded(int i10) {
    }

    @Override
    public final void onDisplayRemoved(int i10) {
    }
}
