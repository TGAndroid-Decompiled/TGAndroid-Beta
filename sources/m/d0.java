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
    public final c0 f13165e;
    public Drawable f13166f;
    public ColorStateList f13167g;
    public PorterDuff.Mode h;
    public boolean f13168i;
    public boolean f13169j;

    public d0(c0 c0Var) {
        super(c0Var);
        this.f13167g = null;
        this.h = null;
        this.f13168i = false;
        this.f13169j = false;
        this.f13165e = c0Var;
    }

    @Override
    public final void b(AttributeSet attributeSet, int i10) {
        super.b(attributeSet, i10);
        c0 c0Var = this.f13165e;
        Context context = c0Var.getContext();
        int[] iArr = f.a.f5693g;
        l7.w0 y10 = l7.w0.y(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) y10.f12081c;
        r0.j0.j(c0Var, c0Var.getContext(), iArr, attributeSet, (TypedArray) y10.f12081c, i10);
        Drawable u10 = y10.u(0);
        if (u10 != null) {
            c0Var.setThumb(u10);
        }
        Drawable s6 = y10.s(1);
        Drawable drawable = this.f13166f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f13166f = s6;
        if (s6 != null) {
            s6.setCallback(c0Var);
            i8.b(c0Var.getLayoutDirection(), s6);
            if (s6.isStateful()) {
                s6.setState(c0Var.getDrawableState());
            }
            f();
        }
        c0Var.invalidate();
        if (typedArray.hasValue(3)) {
            this.h = l1.b(typedArray.getInt(3, -1), this.h);
            this.f13169j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f13167g = y10.r(2);
            this.f13168i = true;
        }
        y10.A();
        f();
    }

    public final void f() {
        Drawable drawable = this.f13166f;
        if (drawable != null) {
            if (this.f13168i || this.f13169j) {
                Drawable d = i8.d(drawable.mutate());
                this.f13166f = d;
                if (this.f13168i) {
                    d.setTintList(this.f13167g);
                }
                if (this.f13169j) {
                    this.f13166f.setTintMode(this.h);
                }
                if (this.f13166f.isStateful()) {
                    this.f13166f.setState(this.f13165e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        int i10;
        if (this.f13166f != null) {
            c0 c0Var = this.f13165e;
            int max = c0Var.getMax();
            int i11 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f13166f.getIntrinsicWidth();
                int intrinsicHeight = this.f13166f.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i10 = intrinsicWidth / 2;
                } else {
                    i10 = 1;
                }
                if (intrinsicHeight >= 0) {
                    i11 = intrinsicHeight / 2;
                }
                this.f13166f.setBounds(-i10, -i11, i10, i11);
                float width = ((c0Var.getWidth() - c0Var.getPaddingLeft()) - c0Var.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(c0Var.getPaddingLeft(), c0Var.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f13166f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
