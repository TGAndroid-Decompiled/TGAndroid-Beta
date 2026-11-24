package defpackage;

import org.telegram.ui.PhotoViewer;
public final class f88 extends si4 {
    public final pj4 e;
    public final PhotoViewer f;

    public f88(PhotoViewer photoViewer, pj4 pj4Var) {
        super(false);
        this.f = photoViewer;
        this.e = pj4Var;
    }

    @Override
    public final CharSequence d() {
        PhotoViewer photoViewer = this.f;
        int[] iArr = photoViewer.m3;
        String str = k96.G(iArr[0], "Minutes", new Object[0]) + ' ' + k96.G(iArr[1], "Seconds", new Object[0]);
        int[] iArr2 = photoViewer.n3;
        return k96.a0("AccDescrPlayerDuration", null, 2131754805, str, k96.G(iArr2[0], "Minutes", new Object[0]) + ' ' + k96.G(iArr2[1], "Seconds", new Object[0]));
    }

    @Override
    public final float k() {
        return this.f.q3.c();
    }

    @Override
    public final void l(float f) {
        this.e.f(f);
        PhotoViewer photoViewer = this.f;
        photoViewer.q3.h(false, f);
        photoViewer.r3.invalidate();
    }
}
