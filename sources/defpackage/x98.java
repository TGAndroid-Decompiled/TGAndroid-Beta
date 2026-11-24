package defpackage;

import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.PhotoViewer;
public final class x98 implements Runnable {
    public final byte a;
    public final z98 b;

    public x98(z98 z98Var, byte b) {
        this.a = b;
        this.b = z98Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        z98 z98Var = this.b;
        switch (b) {
            case 0:
                x88 x88Var = z98Var.a;
                RadialProgressView radialProgressView = x88Var.n;
                a8 a8Var = x88Var.r;
                radialProgressView.setVisibility(4);
                if (x88Var.G) {
                    x88Var.G = false;
                    x88Var.setPlaybackSpeed(x88Var.F);
                }
                a8Var.setEnabled(true);
                a8Var.setAlpha(1.0f);
                PhotoViewer photoViewer = x88Var.b;
                if (photoViewer != null) {
                    photoViewer.u();
                    return;
                }
                return;
            default:
                z98Var.a.h.setVisibility(4);
                return;
        }
    }
}
