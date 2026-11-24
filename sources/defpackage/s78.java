package defpackage;

import org.telegram.ui.PhotoViewer;
public final class s78 implements ub5 {
    public final PhotoViewer a;

    public s78(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    public final void a(int i) {
        PhotoViewer photoViewer = this.a;
        photoViewer.P4 = -1;
        jl5 jl5Var = photoViewer.j5;
        if (jl5Var != null) {
            jl5Var.a();
            photoViewer.j5 = null;
        }
        photoViewer.l5 = true;
        photoViewer.J1(i);
        photoViewer.l5 = false;
    }
}
