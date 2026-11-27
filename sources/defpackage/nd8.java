package defpackage;

import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.PhotoViewer;
public final class nd8 implements Runnable {
    public final byte a;
    public final pd8 b;

    public nd8(pd8 pd8Var, byte b) {
        this.a = b;
        this.b = pd8Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        pd8 pd8Var = this.b;
        switch (b) {
            case 0:
                nc8 nc8Var = pd8Var.a;
                RadialProgressView radialProgressView = nc8Var.n;
                b8 b8Var = nc8Var.r;
                radialProgressView.setVisibility(4);
                if (nc8Var.G) {
                    nc8Var.G = false;
                    nc8Var.setPlaybackSpeed(nc8Var.F);
                }
                b8Var.setEnabled(true);
                b8Var.setAlpha(1.0f);
                PhotoViewer photoViewer = nc8Var.b;
                if (photoViewer != null) {
                    photoViewer.s();
                    return;
                }
                return;
            default:
                pd8Var.a.h.setVisibility(4);
                return;
        }
    }
}
