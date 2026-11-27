package defpackage;

import org.telegram.ui.PhotoViewer;
public final class ib8 implements Runnable {
    public final PhotoViewer a;

    public ib8(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override
    public final void run() {
        PhotoViewer photoViewer = this.a;
        r47 r47Var = photoViewer.S4;
        if (r47Var == null) {
            return;
        }
        xb4.G(r47Var.K1).b0(photoViewer.S4.F0(), true, false);
    }
}
