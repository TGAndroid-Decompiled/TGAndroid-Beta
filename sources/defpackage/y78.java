package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.widget.FrameLayout;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.z;
public final class y78 extends mb1 {
    public final Path t1;
    public final PhotoViewer u1;

    public y78(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, z zVar, cja cjaVar, FrameLayout frameLayout, wjb wjbVar, sl0 sl0Var, l68 l68Var) {
        super(contextThemeWrapper, zVar, cjaVar, frameLayout, wjbVar, sl0Var, l68Var);
        this.u1 = photoViewer;
        this.t1 = new Path();
    }

    @Override
    public final void A() {
        Drawable[] drawableArr = PhotoViewer.d9;
        this.u1.v2();
    }

    @Override
    public final void B() {
        z();
        x78 x78Var = this.u1.V1;
        if (x78Var != null) {
            x78Var.z();
        }
    }

    @Override
    public final boolean G() {
        o98 o98Var = this.u1.d;
        if (o98Var != null && o98Var.l()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        PhotoViewer photoViewer = this.u1;
        m21 m21Var = photoViewer.s7;
        if (m21Var != null && m21.w == m21Var) {
            return false;
        }
        return photoViewer.c2(photoViewer.f0);
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final void h(wl0 wl0Var, Canvas canvas, RectF rectF, float f, boolean z, float f2, float f3, boolean z2) {
        int i;
        int i2;
        canvas.save();
        Path path = this.t1;
        path.rewind();
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        canvas.clipPath(path);
        PhotoViewer photoViewer = this.u1;
        if (z2) {
            canvas.translate(((-getX()) - photoViewer.Z1.getX()) + f2, ((-getY()) - photoViewer.Z1.getY()) + f3);
        } else {
            canvas.translate(f2, f3);
        }
        if (z) {
            i = -8882056;
        } else {
            i = -14277082;
        }
        int p1 = bkb.p1(1.0f, i);
        if (z2) {
            if (z) {
                i2 = 0;
            } else {
                i2 = 855638016;
            }
        } else {
            i2 = 1140850688;
        }
        int p12 = bkb.p1(1.0f, i2);
        boolean z3 = false;
        boolean z4 = !z;
        if (!z && z2) {
            z3 = true;
        }
        photoViewer.Q(canvas, wl0Var, p1, p12, false, z4, z3);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        byte b;
        if (gba.Z && ((b = this.u1.m4) == 1 || b == 2 || b == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final boolean l(float f, float f2) {
        if (!this.p0 && this.u1.t4 != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void w() {
        boolean z = true;
        this.N.setReversed(true);
        this.N.getAdapter().c = false;
        this.N.getAdapter().d = false;
        this.N.getAdapter().e = false;
        PhotoViewer photoViewer = this.u1;
        mu1 mu1Var = photoViewer.k4;
        eb1 eb1Var = this.N;
        if (mu1Var != null) {
            eb1Var.getAdapter().n0 = false;
            this.N.getAdapter().V(photoViewer.k4.r8);
            kz6 adapter = this.N.getAdapter();
            if (photoViewer.k4.e == null) {
                z = false;
            }
            adapter.f0 = z;
        } else {
            eb1Var.getAdapter().n0 = true;
            this.N.getAdapter().V(null);
            this.N.getAdapter().f0 = false;
        }
        this.N.getAdapter().g0 = false;
        this.N.setLayoutParams(nme.e(-1, -1, 51));
    }

    @Override
    public final void x(int r3) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y78.x(int):void");
    }

    @Override
    public final void y() {
        eb1 eb1Var = this.N;
        if (eb1Var != null) {
            eb1Var.setTranslationY(getEditTextHeight());
        }
    }
}
