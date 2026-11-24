package defpackage;

import org.telegram.ui.PhotoViewer;
public final class r78 implements ub5 {
    public final PhotoViewer a;

    public r78(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    public final void a(int i) {
        PhotoViewer photoViewer = this.a;
        photoViewer.O4 = -1;
        jl5 jl5Var = photoViewer.i5;
        if (jl5Var != null) {
            jl5Var.a();
            photoViewer.i5 = null;
        }
        photoViewer.k5 = true;
        photoViewer.K1(i);
        photoViewer.k5 = false;
    }
}
