package defpackage;

import android.graphics.drawable.Drawable;
import android.view.ViewPropertyAnimator;
import org.telegram.ui.PhotoViewer;
public final class c78 implements u48 {
    public final PhotoViewer a;

    public c78(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    public final void a() {
        boolean z;
        int i;
        u3b u3bVar;
        Drawable[] drawableArr = PhotoViewer.d9;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.o7 == null) {
            return;
        }
        mbc mbcVar = photoViewer.k7;
        boolean z2 = false;
        if (mbcVar != null && (u3bVar = mbcVar.b) != null && u3bVar.f != null) {
            z = true;
        } else {
            z = false;
        }
        if (z && mbcVar.d) {
            z2 = true;
        }
        photoViewer.p0.Q(126, z);
        photoViewer.p7.a(z2, true);
        a8 a8Var = photoViewer.o7;
        if (z2) {
            i = 2131743347;
        } else {
            i = 2131743348;
        }
        a8Var.setSubtext(k96.M0(i, null));
    }

    public final void b(boolean z) {
        float f;
        boolean z2 = !z;
        Drawable[] drawableArr = PhotoViewer.d9;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.W0.isClickable() != z2) {
            photoViewer.W0.setClickable(z2);
            photoViewer.W0.setVisibility(0);
            photoViewer.W0.clearAnimation();
            ViewPropertyAnimator animate = photoViewer.W0.animate();
            if (!z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            animate.alpha(f).setInterpolator(s33.f).setDuration(150L).withEndAction(new k08((byte) 1, photoViewer, z2));
        }
    }

    public final void c() {
        PhotoViewer photoViewer = this.a;
        lbc lbcVar = photoViewer.G2;
        if (lbcVar == null) {
            return;
        }
        lbcVar.o0(((float) lbcVar.U()) * photoViewer.B8);
        photoViewer.G2.f0();
        photoViewer.X7.setProgress(photoViewer.B8);
        photoViewer.n();
        oq7 oq7Var = new oq7(this, (byte) 29);
        photoViewer.I2 = oq7Var;
        gl.d3(oq7Var, 860L);
    }
}
