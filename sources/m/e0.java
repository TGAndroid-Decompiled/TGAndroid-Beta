package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
public final class e0 extends z {
    public final d0 f19080e;
    public Drawable f19081f;
    public ColorStateList f19082g;
    public PorterDuff.Mode h;
    public boolean f19083i;
    public boolean f19084j;

    public e0(d0 d0Var) {
        super(d0Var);
        this.f19082g = null;
        this.h = null;
        this.f19083i = false;
        this.f19084j = false;
        this.f19080e = d0Var;
    }

    @Override
    public final void b(AttributeSet attributeSet, int i7) {
        super.b(attributeSet, i7);
        d0 d0Var = this.f19080e;
        Context context = d0Var.getContext();
        int[] iArr = f.a.f10860g;
        h6.m x10 = h6.m.x(context, attributeSet, iArr, i7);
        TypedArray typedArray = (TypedArray) x10.f14265c;
        r0.i0.i(d0Var, d0Var.getContext(), iArr, attributeSet, (TypedArray) x10.f14265c, i7);
        Drawable q10 = x10.q(0);
        if (q10 != null) {
            d0Var.setThumb(q10);
        }
        Drawable p10 = x10.p(1);
        Drawable drawable = this.f19081f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f19081f = p10;
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
            this.f19084j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f19082g = x10.o(2);
            this.f19083i = true;
        }
        x10.C();
        f();
    }

    public final void f() {
        Drawable drawable = this.f19081f;
        if (drawable != null) {
            if (this.f19083i || this.f19084j) {
                Drawable mutate = drawable.mutate();
                this.f19081f = mutate;
                if (this.f19083i) {
                    mutate.setTintList(this.f19082g);
                }
                if (this.f19084j) {
                    this.f19081f.setTintMode(this.h);
                }
                if (this.f19081f.isStateful()) {
                    this.f19081f.setState(this.f19080e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        d0 d0Var;
        int i7;
        if (this.f19081f != null) {
            int max = this.f19080e.getMax();
            int i10 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f19081f.getIntrinsicWidth();
                int intrinsicHeight = this.f19081f.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i7 = intrinsicWidth / 2;
                } else {
                    i7 = 1;
                }
                if (intrinsicHeight >= 0) {
                    i10 = intrinsicHeight / 2;
                }
                this.f19081f.setBounds(-i7, -i10, i7, i10);
                float width = ((d0Var.getWidth() - d0Var.getPaddingLeft()) - d0Var.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(d0Var.getPaddingLeft(), d0Var.getHeight() / 2);
                for (int i11 = 0; i11 <= max; i11++) {
                    this.f19081f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
