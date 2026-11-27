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
public final class pb8 extends ub1 {
    public final Path t1;
    public final PhotoViewer u1;

    public pb8(PhotoViewer photoViewer, Context context, z zVar, wma wmaVar, FrameLayout frameLayout, vnb vnbVar, tl0 tl0Var, y98 y98Var) {
        super(context, zVar, wmaVar, frameLayout, vnbVar, tl0Var, y98Var);
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
        qb8 qb8Var = this.u1.W1;
        if (qb8Var != null) {
            qb8Var.z();
        }
    }

    @Override
    public final boolean G() {
        ed8 ed8Var = this.u1.d;
        if (ed8Var != null && ed8Var.l()) {
            return true;
        }
        return false;
    }

    public final void I() {
        boolean z;
        PhotoViewer photoViewer = this.u1;
        ed8 ed8Var = photoViewer.d;
        if (ed8Var != null && ed8Var.l() && (photoViewer.V1.M.c() || (!photoViewer.s1 && !TextUtils.isEmpty(photoViewer.c0().getText())))) {
            z = true;
        } else {
            z = false;
        }
        D(z, true);
    }

    @Override
    public final boolean e() {
        PhotoViewer photoViewer = this.u1;
        v21 v21Var = photoViewer.s7;
        if (v21Var != null && v21.x == v21Var) {
            return false;
        }
        return photoViewer.c2(photoViewer.f0);
    }

    @Override
    public final void h(xl0 xl0Var, Canvas canvas, RectF rectF, float f, boolean z, float f2, float f3, boolean z2) {
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
        int p1 = aob.p1(1.0f, i);
        if (z2) {
            if (z) {
                i2 = 0;
            } else {
                i2 = 855638016;
            }
        } else {
            i2 = 1140850688;
        }
        int p12 = aob.p1(1.0f, i2);
        boolean z3 = false;
        boolean z4 = !z;
        if (!z && z2) {
            z3 = true;
        }
        photoViewer.P(canvas, xl0Var, p1, p12, false, z4, z3);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        byte b;
        if (xea.Z && ((b = this.u1.m4) == 1 || b == 2 || b == 3)) {
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
        d7 d7Var = photoViewer.f1;
        float f2 = 1.0f - f;
        int i3 = 0;
        if (d7Var.getTag() != null) {
            i = 1;
        } else {
            i = 0;
        }
        d7Var.setAlpha(i * f2);
        s96 s96Var = photoViewer.g1;
        if (s96Var.getTag() != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        s96Var.setAlpha(i2 * f2);
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
        zu1 zu1Var = photoViewer.k4;
        mb1 mb1Var = this.N;
        boolean z = true;
        if (zu1Var != null) {
            mb1Var.getAdapter().n0 = false;
            this.N.getAdapter().V(photoViewer.k4.r8);
            r17 adapter = this.N.getAdapter();
            if (photoViewer.k4.e == null) {
                z = false;
            }
            adapter.f0 = z;
        } else {
            mb1Var.getAdapter().n0 = true;
            this.N.getAdapter().V(null);
            this.N.getAdapter().f0 = false;
        }
        this.N.getAdapter().g0 = false;
    }

    @Override
    public final void x(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pb8.x(int):void");
    }

    @Override
    public final void y() {
        mb1 mb1Var = this.N;
        if (mb1Var != null) {
            mb1Var.setTranslationY(((-getEditTextHeight()) - hl.L(14.0f)) - this.M.l);
        }
    }
}
