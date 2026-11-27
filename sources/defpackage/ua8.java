package defpackage;

import android.graphics.drawable.Drawable;
import android.view.ViewPropertyAnimator;
import org.telegram.ui.PhotoViewer;
public final class ua8 implements j88 {
    public final PhotoViewer a;

    public ua8(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    public final void a() {
        boolean z;
        int i;
        r7b r7bVar;
        Drawable[] drawableArr = PhotoViewer.d9;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.o7 == null) {
            return;
        }
        lfc lfcVar = photoViewer.k7;
        boolean z2 = false;
        if (lfcVar != null && (r7bVar = lfcVar.b) != null && r7bVar.f != null) {
            z = true;
        } else {
            z = false;
        }
        if (z && lfcVar.d) {
            z2 = true;
        }
        photoViewer.p0.Q(126, z);
        photoViewer.p7.a(z2, true);
        b8 b8Var = photoViewer.o7;
        if (z2) {
            i = 2131743241;
        } else {
            i = 2131743242;
        }
        b8Var.setSubtext(ob6.M0(i, null));
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
            animate.alpha(f).setInterpolator(k43.f).setDuration(150L).withEndAction(new q38((byte) 1, photoViewer, z2));
        }
    }

    public final void c() {
        PhotoViewer photoViewer = this.a;
        kfc kfcVar = photoViewer.G2;
        if (kfcVar == null) {
            return;
        }
        kfcVar.o0(((float) kfcVar.U()) * photoViewer.B8);
        photoViewer.G2.f0();
        photoViewer.X7.setProgress(photoViewer.B8);
        photoViewer.m();
        x38 x38Var = new x38(this, (byte) 14);
        photoViewer.I2 = x38Var;
        hl.d3(x38Var, 860L);
    }
}
