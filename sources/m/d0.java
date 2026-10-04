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
    public final c0 f15712e;
    public Drawable f15713f;
    public ColorStateList f15714g;
    public PorterDuff.Mode h;
    public boolean f15715i;
    public boolean f15716j;

    public d0(c0 c0Var) {
        super(c0Var);
        this.f15714g = null;
        this.h = null;
        this.f15715i = false;
        this.f15716j = false;
        this.f15712e = c0Var;
    }

    @Override
    public final void b(AttributeSet attributeSet, int i10) {
        super.b(attributeSet, i10);
        c0 c0Var = this.f15712e;
        Context context = c0Var.getContext();
        int[] iArr = f.a.f9520g;
        la.h Q = la.h.Q(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) Q.f15400c;
        r0.i0.j(c0Var, c0Var.getContext(), iArr, attributeSet, (TypedArray) Q.f15400c, i10);
        Drawable G = Q.G(0);
        if (G != null) {
            c0Var.setThumb(G);
        }
        Drawable F = Q.F(1);
        Drawable drawable = this.f15713f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f15713f = F;
        if (F != null) {
            F.setCallback(c0Var);
            r8.b(c0Var.getLayoutDirection(), F);
            if (F.isStateful()) {
                F.setState(c0Var.getDrawableState());
            }
            f();
        }
        c0Var.invalidate();
        if (typedArray.hasValue(3)) {
            this.h = l1.b(typedArray.getInt(3, -1), this.h);
            this.f15716j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f15714g = Q.D(2);
            this.f15715i = true;
        }
        Q.R();
        f();
    }

    public final void f() {
        Drawable drawable = this.f15713f;
        if (drawable != null) {
            if (this.f15715i || this.f15716j) {
                Drawable d = r8.d(drawable.mutate());
                this.f15713f = d;
                if (this.f15715i) {
                    d.setTintList(this.f15714g);
                }
                if (this.f15716j) {
                    this.f15713f.setTintMode(this.h);
                }
                if (this.f15713f.isStateful()) {
                    this.f15713f.setState(this.f15712e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        int i10;
        if (this.f15713f != null) {
            c0 c0Var = this.f15712e;
            int max = c0Var.getMax();
            int i11 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f15713f.getIntrinsicWidth();
                int intrinsicHeight = this.f15713f.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i10 = intrinsicWidth / 2;
                } else {
                    i10 = 1;
                }
                if (intrinsicHeight >= 0) {
                    i11 = intrinsicHeight / 2;
                }
                this.f15713f.setBounds(-i10, -i11, i10, i11);
                float width = ((c0Var.getWidth() - c0Var.getPaddingLeft()) - c0Var.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(c0Var.getPaddingLeft(), c0Var.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f15713f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
