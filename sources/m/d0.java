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
    public final c0 f15519e;
    public Drawable f15520f;
    public ColorStateList f15521g;
    public PorterDuff.Mode h;
    public boolean f15522i;
    public boolean f15523j;

    public d0(c0 c0Var) {
        super(c0Var);
        this.f15521g = null;
        this.h = null;
        this.f15522i = false;
        this.f15523j = false;
        this.f15519e = c0Var;
    }

    @Override
    public final void b(AttributeSet attributeSet, int i10) {
        super.b(attributeSet, i10);
        c0 c0Var = this.f15519e;
        Context context = c0Var.getContext();
        int[] iArr = f.a.f9170g;
        aa.a y3 = aa.a.y(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) y3.f384c;
        r0.i0.j(c0Var, c0Var.getContext(), iArr, attributeSet, (TypedArray) y3.f384c, i10);
        Drawable s10 = y3.s(0);
        if (s10 != null) {
            c0Var.setThumb(s10);
        }
        Drawable r10 = y3.r(1);
        Drawable drawable = this.f15520f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f15520f = r10;
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
            this.f15523j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f15521g = y3.q(2);
            this.f15522i = true;
        }
        y3.A();
        f();
    }

    public final void f() {
        Drawable drawable = this.f15520f;
        if (drawable != null) {
            if (this.f15522i || this.f15523j) {
                Drawable d = o8.d(drawable.mutate());
                this.f15520f = d;
                if (this.f15522i) {
                    d.setTintList(this.f15521g);
                }
                if (this.f15523j) {
                    this.f15520f.setTintMode(this.h);
                }
                if (this.f15520f.isStateful()) {
                    this.f15520f.setState(this.f15519e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        int i10;
        if (this.f15520f != null) {
            c0 c0Var = this.f15519e;
            int max = c0Var.getMax();
            int i11 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f15520f.getIntrinsicWidth();
                int intrinsicHeight = this.f15520f.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i10 = intrinsicWidth / 2;
                } else {
                    i10 = 1;
                }
                if (intrinsicHeight >= 0) {
                    i11 = intrinsicHeight / 2;
                }
                this.f15520f.setBounds(-i10, -i11, i10, i11);
                float width = ((c0Var.getWidth() - c0Var.getPaddingLeft()) - c0Var.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(c0Var.getPaddingLeft(), c0Var.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f15520f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
