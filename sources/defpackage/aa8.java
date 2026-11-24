package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.z;
public final class aa8 extends tc1 {
    public final Path t1;
    public final PhotoViewer u1;

    public aa8(PhotoViewer photoViewer, Context context, z zVar, ela elaVar, FrameLayout frameLayout, ylb ylbVar, sm0 sm0Var, n88 n88Var) {
        super(context, zVar, elaVar, frameLayout, ylbVar, sm0Var, n88Var);
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
        ba8 ba8Var = this.u1.W1;
        if (ba8Var != null) {
            ba8Var.z();
        }
    }

    @Override
    public final boolean G() {
        pb8 pb8Var = this.u1.d;
        if (pb8Var != null && pb8Var.l()) {
            return true;
        }
        return false;
    }

    public final void I() {
        boolean z;
        PhotoViewer photoViewer = this.u1;
        pb8 pb8Var = photoViewer.d;
        if (pb8Var != null && pb8Var.l() && (photoViewer.V1.M.c() || (!photoViewer.s1 && !TextUtils.isEmpty(photoViewer.d0().getText())))) {
            z = true;
        } else {
            z = false;
        }
        D(z, true);
    }

    @Override
    public final boolean e() {
        PhotoViewer photoViewer = this.u1;
        u31 u31Var = photoViewer.s7;
        if (u31Var != null && u31.x == u31Var) {
            return false;
        }
        return photoViewer.c2(photoViewer.f0);
    }

    @Override
    public final void h(wm0 wm0Var, Canvas canvas, RectF rectF, float f, boolean z, float f2, float f3, boolean z2) {
        int i;
        int i2;
        canvas.save();
        Path path = this.t1;
        path.rewind();
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        canvas.clipPath(path);
        PhotoViewer photoViewer = this.u1;
        if (z2) {
            canvas.translate(((-getX()) - photoViewer.Y1.getX()) + f2, ((-getY()) - photoViewer.Y1.getY()) + f3);
        } else {
            canvas.translate(f2, f3);
        }
        if (z) {
            i = -8882056;
        } else {
            i = -14277082;
        }
        int p1 = cmb.p1(1.0f, i);
        if (z2) {
            if (z) {
                i2 = 0;
            } else {
                i2 = 855638016;
            }
        } else {
            i2 = 1140850688;
        }
        int p12 = cmb.p1(1.0f, i2);
        boolean z3 = false;
        boolean z4 = !z;
        if (!z && z2) {
            z3 = true;
        }
        photoViewer.P(canvas, wm0Var, p1, p12, false, z4, z3);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        byte b;
        if (gda.Z && ((b = this.u1.m4) == 1 || b == 2 || b == 3)) {
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
    public final void setText(CharSequence charSequence) {
        super.setText(charSequence);
        I();
    }

    @Override
    public final void u(float f) {
        int i;
        int i2;
        super.u(f);
        PhotoViewer photoViewer = this.u1;
        c7 c7Var = photoViewer.f1;
        float f2 = 1.0f - f;
        int i3 = 0;
        if (c7Var.getTag() != null) {
            i = 1;
        } else {
            i = 0;
        }
        c7Var.setAlpha(i * f2);
        o96 o96Var = photoViewer.g1;
        if (o96Var.getTag() != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        o96Var.setAlpha(i2 * f2);
        FrameLayout frameLayout = photoViewer.W7;
        if (frameLayout.getTag() != null) {
            i3 = 1;
        }
        frameLayout.setAlpha(f2 * i3);
    }

    @Override
    public final void w() {
        this.N.getAdapter().c = false;
        this.N.getAdapter().d = false;
        this.N.getAdapter().e = false;
        PhotoViewer photoViewer = this.u1;
        yv1 yv1Var = photoViewer.k4;
        lc1 lc1Var = this.N;
        boolean z = true;
        if (yv1Var != null) {
            lc1Var.getAdapter().n0 = false;
            this.N.getAdapter().V(photoViewer.k4.r8);
            k17 adapter = this.N.getAdapter();
            if (photoViewer.k4.e == null) {
                z = false;
            }
            adapter.f0 = z;
        } else {
            lc1Var.getAdapter().n0 = true;
            this.N.getAdapter().V(null);
            this.N.getAdapter().f0 = false;
        }
        this.N.getAdapter().g0 = false;
    }

    @Override
    public final void x(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aa8.x(int):void");
    }

    @Override
    public final void y() {
        lc1 lc1Var = this.N;
        if (lc1Var != null) {
            lc1Var.setTranslationY(((-getEditTextHeight()) - gm.L(14.0f)) - this.M.l);
        }
    }
}
