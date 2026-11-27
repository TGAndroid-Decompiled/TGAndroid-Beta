package defpackage;

import org.telegram.ui.PhotoViewer;
public final class xb8 extends wk4 {
    public final kj4 e;
    public final PhotoViewer f;

    public xb8(PhotoViewer photoViewer, kj4 kj4Var) {
        super(false);
        this.f = photoViewer;
        this.e = kj4Var;
    }

    @Override
    public final CharSequence d() {
        PhotoViewer photoViewer = this.f;
        int[] iArr = photoViewer.m3;
        String str = ob6.G(iArr[0], "Minutes", new Object[0]) + ' ' + ob6.G(iArr[1], "Seconds", new Object[0]);
        int[] iArr2 = photoViewer.n3;
        return ob6.a0("AccDescrPlayerDuration", null, 2131754801, str, ob6.G(iArr2[0], "Minutes", new Object[0]) + ' ' + ob6.G(iArr2[1], "Seconds", new Object[0]));
    }

    @Override
    public final float k() {
        return this.f.q3.c();
    }

    @Override
    public final void l(float f) {
        this.e.g(f);
        PhotoViewer photoViewer = this.f;
        photoViewer.q3.h(false, f);
        photoViewer.r3.invalidate();
    }
}
