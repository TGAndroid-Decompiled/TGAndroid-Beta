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
    public final c0 f15707e;
    public Drawable f15708f;
    public ColorStateList f15709g;
    public PorterDuff.Mode h;
    public boolean f15710i;
    public boolean f15711j;

    public d0(c0 c0Var) {
        super(c0Var);
        this.f15709g = null;
        this.h = null;
        this.f15710i = false;
        this.f15711j = false;
        this.f15707e = c0Var;
    }

    @Override
    public final void b(AttributeSet attributeSet, int i10) {
        super.b(attributeSet, i10);
        c0 c0Var = this.f15707e;
        Context context = c0Var.getContext();
        int[] iArr = f.a.f9519g;
        la.h Q = la.h.Q(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) Q.f15398c;
        r0.i0.j(c0Var, c0Var.getContext(), iArr, attributeSet, (TypedArray) Q.f15398c, i10);
        Drawable G = Q.G(0);
        if (G != null) {
            c0Var.setThumb(G);
        }
        Drawable F = Q.F(1);
        Drawable drawable = this.f15708f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f15708f = F;
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
            this.f15711j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f15709g = Q.D(2);
            this.f15710i = true;
        }
        Q.R();
        f();
    }

    public final void f() {
        Drawable drawable = this.f15708f;
        if (drawable != null) {
            if (this.f15710i || this.f15711j) {
                Drawable d = r8.d(drawable.mutate());
                this.f15708f = d;
                if (this.f15710i) {
                    d.setTintList(this.f15709g);
                }
                if (this.f15711j) {
                    this.f15708f.setTintMode(this.h);
                }
                if (this.f15708f.isStateful()) {
                    this.f15708f.setState(this.f15707e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        int i10;
        if (this.f15708f != null) {
            c0 c0Var = this.f15707e;
            int max = c0Var.getMax();
            int i11 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f15708f.getIntrinsicWidth();
                int intrinsicHeight = this.f15708f.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i10 = intrinsicWidth / 2;
                } else {
                    i10 = 1;
                }
                if (intrinsicHeight >= 0) {
                    i11 = intrinsicHeight / 2;
                }
                this.f15708f.setBounds(-i10, -i11, i10, i11);
                float width = ((c0Var.getWidth() - c0Var.getPaddingLeft()) - c0Var.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(c0Var.getPaddingLeft(), c0Var.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f15708f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
