package defpackage;

import org.telegram.ui.PhotoViewer;
public final class u98 implements sd5 {
    public final PhotoViewer a;

    public u98(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    public final void a(int i) {
        PhotoViewer photoViewer = this.a;
        photoViewer.O4 = -1;
        jn5 jn5Var = photoViewer.i5;
        if (jn5Var != null) {
            jn5Var.a();
            photoViewer.i5 = null;
        }
        photoViewer.k5 = true;
        photoViewer.K1(i);
        photoViewer.k5 = false;
    }
}
