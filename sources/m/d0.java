package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import v7.o8;
public final class d0 extends y {
    public final c0 f15492e;
    public Drawable f15493f;
    public ColorStateList f15494g;
    public PorterDuff.Mode h;
    public boolean f15495i;
    public boolean f15496j;

    public d0(c0 c0Var) {
        super(c0Var);
        this.f15494g = null;
        this.h = null;
        this.f15495i = false;
        this.f15496j = false;
        this.f15492e = c0Var;
    }

    @Override
    public final void b(AttributeSet attributeSet, int i10) {
        super.b(attributeSet, i10);
        c0 c0Var = this.f15492e;
        Context context = c0Var.getContext();
        int[] iArr = f.a.f9142g;
        aa.a y3 = aa.a.y(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) y3.f372c;
        r0.i0.j(c0Var, c0Var.getContext(), iArr, attributeSet, (TypedArray) y3.f372c, i10);
        Drawable s10 = y3.s(0);
        if (s10 != null) {
            c0Var.setThumb(s10);
        }
        Drawable r10 = y3.r(1);
        Drawable drawable = this.f15493f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f15493f = r10;
        if (r10 != null) {
            r10.setCallback(c0Var);
            o8.b(c0Var.getLayoutDirection(), r10);
            if (r10.isStateful()) {
                r10.setState(c0Var.getDrawableState());
            }
            f();
        }
        c0Var.invalidate();
        if (typedArray.hasValue(3)) {
            this.h = l1.b(typedArray.getInt(3, -1), this.h);
            this.f15496j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f15494g = y3.q(2);
            this.f15495i = true;
        }
        y3.A();
        f();
    }

    public final void f() {
        Drawable drawable = this.f15493f;
        if (drawable != null) {
            if (this.f15495i || this.f15496j) {
                Drawable d = o8.d(drawable.mutate());
                this.f15493f = d;
                if (this.f15495i) {
                    d.setTintList(this.f15494g);
                }
                if (this.f15496j) {
                    this.f15493f.setTintMode(this.h);
                }
                if (this.f15493f.isStateful()) {
                    this.f15493f.setState(this.f15492e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        int i10;
        if (this.f15493f != null) {
            c0 c0Var = this.f15492e;
            int max = c0Var.getMax();
            int i11 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f15493f.getIntrinsicWidth();
                int intrinsicHeight = this.f15493f.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i10 = intrinsicWidth / 2;
                } else {
                    i10 = 1;
                }
                if (intrinsicHeight >= 0) {
                    i11 = intrinsicHeight / 2;
                }
                this.f15493f.setBounds(-i10, -i11, i10, i11);
                float width = ((c0Var.getWidth() - c0Var.getPaddingLeft()) - c0Var.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(c0Var.getPaddingLeft(), c0Var.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f15493f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
