package defpackage;

import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.PhotoViewer;
public final class yb8 implements Runnable {
    public final byte a;
    public final ac8 b;

    public yb8(ac8 ac8Var, byte b) {
        this.a = b;
        this.b = ac8Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ac8 ac8Var = this.b;
        switch (b) {
            case 0:
                ya8 ya8Var = ac8Var.a;
                RadialProgressView radialProgressView = ya8Var.n;
                a8 a8Var = ya8Var.r;
                radialProgressView.setVisibility(4);
                if (ya8Var.G) {
                    ya8Var.G = false;
                    ya8Var.setPlaybackSpeed(ya8Var.F);
                }
                a8Var.setEnabled(true);
                a8Var.setAlpha(1.0f);
                PhotoViewer photoViewer = ya8Var.b;
                if (photoViewer != null) {
                    photoViewer.s();
                    return;
                }
                return;
            default:
                ac8Var.a.h.setVisibility(4);
                return;
        }
    }
}
