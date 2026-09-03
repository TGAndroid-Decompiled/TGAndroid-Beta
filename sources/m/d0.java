package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import j7.i8;
public final class d0 extends y {
    public final c0 e;
    public Drawable f13461f;
    public ColorStateList f13462g;
    public PorterDuff.Mode h;
    public boolean f13463i;
    public boolean f13464j;

    public d0(c0 c0Var) {
        super(c0Var);
        this.f13462g = null;
        this.h = null;
        this.f13463i = false;
        this.f13464j = false;
        this.e = c0Var;
    }

    @Override
    public final void b(AttributeSet attributeSet, int i10) {
        super.b(attributeSet, i10);
        c0 c0Var = this.e;
        Context context = c0Var.getContext();
        int[] iArr = f.a.f5612g;
        l7.w0 y10 = l7.w0.y(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) y10.f11787c;
        r0.j0.j(c0Var, c0Var.getContext(), iArr, attributeSet, (TypedArray) y10.f11787c, i10);
        Drawable u10 = y10.u(0);
        if (u10 != null) {
            c0Var.setThumb(u10);
        }
        Drawable t6 = y10.t(1);
        Drawable drawable = this.f13461f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f13461f = t6;
        if (t6 != null) {
            t6.setCallback(c0Var);
            i8.b(c0Var.getLayoutDirection(), t6);
            if (t6.isStateful()) {
                t6.setState(c0Var.getDrawableState());
            }
            f();
        }
        c0Var.invalidate();
        if (typedArray.hasValue(3)) {
            this.h = m1.b(typedArray.getInt(3, -1), this.h);
            this.f13464j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f13462g = y10.s(2);
            this.f13463i = true;
        }
        y10.A();
        f();
    }

    public final void f() {
        Drawable drawable = this.f13461f;
        if (drawable != null) {
            if (this.f13463i || this.f13464j) {
                Drawable d = i8.d(drawable.mutate());
                this.f13461f = d;
                if (this.f13463i) {
                    d.setTintList(this.f13462g);
                }
                if (this.f13464j) {
                    this.f13461f.setTintMode(this.h);
                }
                if (this.f13461f.isStateful()) {
                    this.f13461f.setState(this.e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        int i10;
        if (this.f13461f != null) {
            c0 c0Var = this.e;
            int max = c0Var.getMax();
            int i11 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f13461f.getIntrinsicWidth();
                int intrinsicHeight = this.f13461f.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i10 = intrinsicWidth / 2;
                } else {
                    i10 = 1;
                }
                if (intrinsicHeight >= 0) {
                    i11 = intrinsicHeight / 2;
                }
                this.f13461f.setBounds(-i10, -i11, i10, i11);
                float width = ((c0Var.getWidth() - c0Var.getPaddingLeft()) - c0Var.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(c0Var.getPaddingLeft(), c0Var.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f13461f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
