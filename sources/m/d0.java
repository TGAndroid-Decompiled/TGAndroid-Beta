package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import v7.r8;
public final class d0 extends y {
    public final c0 e;
    public Drawable f12984f;
    public ColorStateList f12985g;
    public PorterDuff.Mode h;
    public boolean f12986i;
    public boolean f12987j;

    public d0(c0 c0Var) {
        super(c0Var);
        this.f12985g = null;
        this.h = null;
        this.f12986i = false;
        this.f12987j = false;
        this.e = c0Var;
    }

    @Override
    public final void b(AttributeSet attributeSet, int i10) {
        super.b(attributeSet, i10);
        c0 c0Var = this.e;
        Context context = c0Var.getContext();
        int[] iArr = f.a.f7649g;
        e3 P = e3.P(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) P.f13002c;
        r0.i0.j(c0Var, c0Var.getContext(), iArr, attributeSet, (TypedArray) P.f13002c, i10);
        Drawable F = P.F(0);
        if (F != null) {
            c0Var.setThumb(F);
        }
        Drawable E = P.E(1);
        Drawable drawable = this.f12984f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f12984f = E;
        if (E != null) {
            E.setCallback(c0Var);
            r8.b(c0Var.getLayoutDirection(), E);
            if (E.isStateful()) {
                E.setState(c0Var.getDrawableState());
            }
            f();
        }
        c0Var.invalidate();
        if (typedArray.hasValue(3)) {
            this.h = l1.b(typedArray.getInt(3, -1), this.h);
            this.f12987j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f12985g = P.C(2);
            this.f12986i = true;
        }
        P.Q();
        f();
    }

    public final void f() {
        Drawable drawable = this.f12984f;
        if (drawable != null) {
            if (this.f12986i || this.f12987j) {
                Drawable d = r8.d(drawable.mutate());
                this.f12984f = d;
                if (this.f12986i) {
                    d.setTintList(this.f12985g);
                }
                if (this.f12987j) {
                    this.f12984f.setTintMode(this.h);
                }
                if (this.f12984f.isStateful()) {
                    this.f12984f.setState(this.e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        int i10;
        if (this.f12984f != null) {
            c0 c0Var = this.e;
            int max = c0Var.getMax();
            int i11 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f12984f.getIntrinsicWidth();
                int intrinsicHeight = this.f12984f.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i10 = intrinsicWidth / 2;
                } else {
                    i10 = 1;
                }
                if (intrinsicHeight >= 0) {
                    i11 = intrinsicHeight / 2;
                }
                this.f12984f.setBounds(-i10, -i11, i10, i11);
                float width = ((c0Var.getWidth() - c0Var.getPaddingLeft()) - c0Var.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(c0Var.getPaddingLeft(), c0Var.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f12984f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
