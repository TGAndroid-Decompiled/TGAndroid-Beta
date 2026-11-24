package defpackage;

import android.graphics.drawable.Drawable;
import android.view.ViewPropertyAnimator;
import org.telegram.ui.PhotoViewer;
public final class e98 implements w68 {
    public final PhotoViewer a;

    public e98(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    public final void a() {
        boolean z;
        int i;
        v5b v5bVar;
        Drawable[] drawableArr = PhotoViewer.d9;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.o7 == null) {
            return;
        }
        odc odcVar = photoViewer.k7;
        boolean z2 = false;
        if (odcVar != null && (v5bVar = odcVar.b) != null && v5bVar.f != null) {
            z = true;
        } else {
            z = false;
        }
        if (z && odcVar.d) {
            z2 = true;
        }
        photoViewer.p0.Q(126, z);
        photoViewer.p7.a(z2, true);
        a8 a8Var = photoViewer.o7;
        if (z2) {
            i = 2131743273;
        } else {
            i = 2131743274;
        }
        a8Var.setSubtext(jb6.M0(i, null));
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
            animate.alpha(f).setInterpolator(d53.f).setDuration(150L).withEndAction(new n28((byte) 1, photoViewer, z2));
        }
    }

    public final void c() {
        PhotoViewer photoViewer = this.a;
        ndc ndcVar = photoViewer.G2;
        if (ndcVar == null) {
            return;
        }
        ndcVar.o0(((float) ndcVar.U()) * photoViewer.B8);
        photoViewer.G2.f0();
        photoViewer.X7.setProgress(photoViewer.B8);
        photoViewer.m();
        q78 q78Var = new q78(this, (byte) 6);
        photoViewer.I2 = q78Var;
        gm.d3(q78Var, 860L);
    }
}
