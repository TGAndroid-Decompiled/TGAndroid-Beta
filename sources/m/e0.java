package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import f7.q8;
public final class e0 extends z {
    public final d0 f16925e;
    public Drawable f16926f;
    public ColorStateList f16927g;
    public PorterDuff.Mode h;
    public boolean f16928i;
    public boolean f16929j;

    public e0(d0 d0Var) {
        super(d0Var);
        this.f16927g = null;
        this.h = null;
        this.f16928i = false;
        this.f16929j = false;
        this.f16925e = d0Var;
    }

    @Override
    public final void b(AttributeSet attributeSet, int i9) {
        super.b(attributeSet, i9);
        d0 d0Var = this.f16925e;
        Context context = d0Var.getContext();
        int[] iArr = f.a.f5274g;
        j4.c E = j4.c.E(context, attributeSet, iArr, i9);
        TypedArray typedArray = (TypedArray) E.f13432c;
        r0.j0.j(d0Var, d0Var.getContext(), iArr, attributeSet, (TypedArray) E.f13432c, i9);
        Drawable x10 = E.x(0);
        if (x10 != null) {
            d0Var.setThumb(x10);
        }
        Drawable w8 = E.w(1);
        Drawable drawable = this.f16926f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f16926f = w8;
        if (w8 != null) {
            w8.setCallback(d0Var);
            q8.b(d0Var.getLayoutDirection(), w8);
            if (w8.isStateful()) {
                w8.setState(d0Var.getDrawableState());
            }
            f();
        }
        d0Var.invalidate();
        if (typedArray.hasValue(3)) {
            this.h = m1.b(typedArray.getInt(3, -1), this.h);
            this.f16929j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f16927g = E.v(2);
            this.f16928i = true;
        }
        E.G();
        f();
    }

    public final void f() {
        Drawable drawable = this.f16926f;
        if (drawable != null) {
            if (this.f16928i || this.f16929j) {
                Drawable d = q8.d(drawable.mutate());
                this.f16926f = d;
                if (this.f16928i) {
                    d.setTintList(this.f16927g);
                }
                if (this.f16929j) {
                    this.f16926f.setTintMode(this.h);
                }
                if (this.f16926f.isStateful()) {
                    this.f16926f.setState(this.f16925e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        int i9;
        if (this.f16926f != null) {
            d0 d0Var = this.f16925e;
            int max = d0Var.getMax();
            int i10 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f16926f.getIntrinsicWidth();
                int intrinsicHeight = this.f16926f.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i9 = intrinsicWidth / 2;
                } else {
                    i9 = 1;
                }
                if (intrinsicHeight >= 0) {
                    i10 = intrinsicHeight / 2;
                }
                this.f16926f.setBounds(-i9, -i10, i9, i10);
                float width = ((d0Var.getWidth() - d0Var.getPaddingLeft()) - d0Var.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(d0Var.getPaddingLeft(), d0Var.getHeight() / 2);
                for (int i11 = 0; i11 <= max; i11++) {
                    this.f16926f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
