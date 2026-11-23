package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
public final class d0 extends y {
    public final c0 f20026e;
    public Drawable f20027f;
    public ColorStateList f20028g;
    public PorterDuff.Mode h;
    public boolean f20029i;
    public boolean f20030j;

    public d0(c0 c0Var) {
        super(c0Var);
        this.f20028g = null;
        this.h = null;
        this.f20029i = false;
        this.f20030j = false;
        this.f20026e = c0Var;
    }

    @Override
    public final void b(AttributeSet attributeSet, int i7) {
        super.b(attributeSet, i7);
        c0 c0Var = this.f20026e;
        Context context = c0Var.getContext();
        int[] iArr = f.a.f10988g;
        h6.m D = h6.m.D(context, attributeSet, iArr, i7);
        TypedArray typedArray = (TypedArray) D.f13932c;
        r0.i0.i(c0Var, c0Var.getContext(), iArr, attributeSet, (TypedArray) D.f13932c, i7);
        Drawable v = D.v(0);
        if (v != null) {
            c0Var.setThumb(v);
        }
        Drawable t6 = D.t(1);
        Drawable drawable = this.f20027f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f20027f = t6;
        if (t6 != null) {
            t6.setCallback(c0Var);
            t6.setLayoutDirection(c0Var.getLayoutDirection());
            if (t6.isStateful()) {
                t6.setState(c0Var.getDrawableState());
            }
            f();
        }
        c0Var.invalidate();
        if (typedArray.hasValue(3)) {
            this.h = l1.b(typedArray.getInt(3, -1), this.h);
            this.f20030j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f20028g = D.s(2);
            this.f20029i = true;
        }
        D.G();
        f();
    }

    public final void f() {
        Drawable drawable = this.f20027f;
        if (drawable != null) {
            if (this.f20029i || this.f20030j) {
                Drawable mutate = drawable.mutate();
                this.f20027f = mutate;
                if (this.f20029i) {
                    mutate.setTintList(this.f20028g);
                }
                if (this.f20030j) {
                    this.f20027f.setTintMode(this.h);
                }
                if (this.f20027f.isStateful()) {
                    this.f20027f.setState(this.f20026e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        c0 c0Var;
        int i7;
        if (this.f20027f != null) {
            int max = this.f20026e.getMax();
            int i10 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f20027f.getIntrinsicWidth();
                int intrinsicHeight = this.f20027f.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i7 = intrinsicWidth / 2;
                } else {
                    i7 = 1;
                }
                if (intrinsicHeight >= 0) {
                    i10 = intrinsicHeight / 2;
                }
                this.f20027f.setBounds(-i7, -i10, i7, i10);
                float width = ((c0Var.getWidth() - c0Var.getPaddingLeft()) - c0Var.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(c0Var.getPaddingLeft(), c0Var.getHeight() / 2);
                for (int i11 = 0; i11 <= max; i11++) {
                    this.f20027f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
