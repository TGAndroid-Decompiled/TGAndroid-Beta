package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
public final class d0 extends y {
    public final c0 e;
    public Drawable f17691f;
    public ColorStateList f17692g;
    public PorterDuff.Mode h;
    public boolean f17693i;
    public boolean f17694j;

    public d0(c0 c0Var) {
        super(c0Var);
        this.f17692g = null;
        this.h = null;
        this.f17693i = false;
        this.f17694j = false;
        this.e = c0Var;
    }

    @Override
    public final void b(AttributeSet attributeSet, int i10) {
        super.b(attributeSet, i10);
        c0 c0Var = this.e;
        Context context = c0Var.getContext();
        int[] iArr = f.a.f10029g;
        k6.c D = k6.c.D(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) D.f16407c;
        r0.i0.j(c0Var, c0Var.getContext(), iArr, attributeSet, (TypedArray) D.f16407c, i10);
        Drawable x9 = D.x(0);
        if (x9 != null) {
            c0Var.setThumb(x9);
        }
        Drawable w10 = D.w(1);
        Drawable drawable = this.f17691f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f17691f = w10;
        if (w10 != null) {
            w10.setCallback(c0Var);
            w10.setLayoutDirection(c0Var.getLayoutDirection());
            if (w10.isStateful()) {
                w10.setState(c0Var.getDrawableState());
            }
            f();
        }
        c0Var.invalidate();
        if (typedArray.hasValue(3)) {
            this.h = l1.b(typedArray.getInt(3, -1), this.h);
            this.f17694j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f17692g = D.v(2);
            this.f17693i = true;
        }
        D.E();
        f();
    }

    public final void f() {
        Drawable drawable = this.f17691f;
        if (drawable != null) {
            if (this.f17693i || this.f17694j) {
                Drawable mutate = drawable.mutate();
                this.f17691f = mutate;
                if (this.f17693i) {
                    mutate.setTintList(this.f17692g);
                }
                if (this.f17694j) {
                    this.f17691f.setTintMode(this.h);
                }
                if (this.f17691f.isStateful()) {
                    this.f17691f.setState(this.e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        c0 c0Var;
        int i10;
        if (this.f17691f != null) {
            int max = this.e.getMax();
            int i11 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f17691f.getIntrinsicWidth();
                int intrinsicHeight = this.f17691f.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i10 = intrinsicWidth / 2;
                } else {
                    i10 = 1;
                }
                if (intrinsicHeight >= 0) {
                    i11 = intrinsicHeight / 2;
                }
                this.f17691f.setBounds(-i10, -i11, i10, i11);
                float width = ((c0Var.getWidth() - c0Var.getPaddingLeft()) - c0Var.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(c0Var.getPaddingLeft(), c0Var.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f17691f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
