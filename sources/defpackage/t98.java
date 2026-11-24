package defpackage;

import org.telegram.ui.PhotoViewer;
public final class t98 implements Runnable {
    public final PhotoViewer a;

    public t98(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override
    public final void run() {
        PhotoViewer photoViewer = this.a;
        k47 k47Var = photoViewer.S4;
        if (k47Var == null) {
            return;
        }
        bc4.G(k47Var.K1).b0(photoViewer.S4.F0(), true, false);
    }
}
