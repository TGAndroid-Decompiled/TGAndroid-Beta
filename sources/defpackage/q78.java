package defpackage;

import org.telegram.ui.PhotoViewer;
public final class q78 implements Runnable {
    public final PhotoViewer a;

    public q78(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override
    public final void run() {
        PhotoViewer photoViewer = this.a;
        k27 k27Var = photoViewer.S4;
        if (k27Var == null) {
            return;
        }
        ba4.G(k27Var.K1).b0(photoViewer.S4.F0(), true, false);
    }
}
