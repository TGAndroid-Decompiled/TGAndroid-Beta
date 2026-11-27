package defpackage;

import org.telegram.ui.PhotoViewer;
public final class jb8 implements vd5 {
    public final PhotoViewer a;

    public jb8(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    public final void a(int i) {
        PhotoViewer photoViewer = this.a;
        photoViewer.O4 = -1;
        mn5 mn5Var = photoViewer.i5;
        if (mn5Var != null) {
            mn5Var.a();
            photoViewer.i5 = null;
        }
        photoViewer.k5 = true;
        photoViewer.K1(i);
        photoViewer.k5 = false;
    }
}
