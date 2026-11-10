package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
public final class e0 extends z {
    public final d0 f19088e;
    public Drawable f19089f;
    public ColorStateList f19090g;
    public PorterDuff.Mode h;
    public boolean f19091i;
    public boolean f19092j;

    public e0(d0 d0Var) {
        super(d0Var);
        this.f19090g = null;
        this.h = null;
        this.f19091i = false;
        this.f19092j = false;
        this.f19088e = d0Var;
    }

    @Override
    public final void b(AttributeSet attributeSet, int i7) {
        super.b(attributeSet, i7);
        d0 d0Var = this.f19088e;
        Context context = d0Var.getContext();
        int[] iArr = f.a.f10865g;
        h6.m x10 = h6.m.x(context, attributeSet, iArr, i7);
        TypedArray typedArray = (TypedArray) x10.f14267c;
        r0.i0.i(d0Var, d0Var.getContext(), iArr, attributeSet, (TypedArray) x10.f14267c, i7);
        Drawable q10 = x10.q(0);
        if (q10 != null) {
            d0Var.setThumb(q10);
        }
        Drawable p10 = x10.p(1);
        Drawable drawable = this.f19089f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f19089f = p10;
        if (p10 != null) {
            p10.setCallback(d0Var);
            p10.setLayoutDirection(d0Var.getLayoutDirection());
            if (p10.isStateful()) {
                p10.setState(d0Var.getDrawableState());
            }
            f();
        }
        d0Var.invalidate();
        if (typedArray.hasValue(3)) {
            this.h = m1.b(typedArray.getInt(3, -1), this.h);
            this.f19092j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f19090g = x10.o(2);
            this.f19091i = true;
        }
        x10.C();
        f();
    }

    public final void f() {
        Drawable drawable = this.f19089f;
        if (drawable != null) {
            if (this.f19091i || this.f19092j) {
                Drawable mutate = drawable.mutate();
                this.f19089f = mutate;
                if (this.f19091i) {
                    mutate.setTintList(this.f19090g);
                }
                if (this.f19092j) {
                    this.f19089f.setTintMode(this.h);
                }
                if (this.f19089f.isStateful()) {
                    this.f19089f.setState(this.f19088e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        d0 d0Var;
        int i7;
        if (this.f19089f != null) {
            int max = this.f19088e.getMax();
            int i10 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f19089f.getIntrinsicWidth();
                int intrinsicHeight = this.f19089f.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i7 = intrinsicWidth / 2;
                } else {
                    i7 = 1;
                }
                if (intrinsicHeight >= 0) {
                    i10 = intrinsicHeight / 2;
                }
                this.f19089f.setBounds(-i7, -i10, i7, i10);
                float width = ((d0Var.getWidth() - d0Var.getPaddingLeft()) - d0Var.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(d0Var.getPaddingLeft(), d0Var.getHeight() / 2);
                for (int i11 = 0; i11 <= max; i11++) {
                    this.f19089f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
