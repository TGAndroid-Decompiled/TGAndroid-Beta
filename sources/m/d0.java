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
    public final c0 f15717e;
    public Drawable f15718f;
    public ColorStateList f15719g;
    public PorterDuff.Mode h;
    public boolean f15720i;
    public boolean f15721j;

    public d0(c0 c0Var) {
        super(c0Var);
        this.f15719g = null;
        this.h = null;
        this.f15720i = false;
        this.f15721j = false;
        this.f15717e = c0Var;
    }

    @Override
    public final void b(AttributeSet attributeSet, int i10) {
        super.b(attributeSet, i10);
        c0 c0Var = this.f15717e;
        Context context = c0Var.getContext();
        int[] iArr = f.a.f9520g;
        la.h Q = la.h.Q(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) Q.f15400c;
        r0.i0.j(c0Var, c0Var.getContext(), iArr, attributeSet, (TypedArray) Q.f15400c, i10);
        Drawable C = Q.C(0);
        if (C != null) {
            c0Var.setThumb(C);
        }
        Drawable A = Q.A(1);
        Drawable drawable = this.f15718f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f15718f = A;
        if (A != null) {
            A.setCallback(c0Var);
            r8.b(c0Var.getLayoutDirection(), A);
            if (A.isStateful()) {
                A.setState(c0Var.getDrawableState());
            }
            f();
        }
        c0Var.invalidate();
        if (typedArray.hasValue(3)) {
            this.h = l1.b(typedArray.getInt(3, -1), this.h);
            this.f15721j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f15719g = Q.y(2);
            this.f15720i = true;
        }
        Q.R();
        f();
    }

    public final void f() {
        Drawable drawable = this.f15718f;
        if (drawable != null) {
            if (this.f15720i || this.f15721j) {
                Drawable d = r8.d(drawable.mutate());
                this.f15718f = d;
                if (this.f15720i) {
                    d.setTintList(this.f15719g);
                }
                if (this.f15721j) {
                    this.f15718f.setTintMode(this.h);
                }
                if (this.f15718f.isStateful()) {
                    this.f15718f.setState(this.f15717e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        int i10;
        if (this.f15718f != null) {
            c0 c0Var = this.f15717e;
            int max = c0Var.getMax();
            int i11 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f15718f.getIntrinsicWidth();
                int intrinsicHeight = this.f15718f.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i10 = intrinsicWidth / 2;
                } else {
                    i10 = 1;
                }
                if (intrinsicHeight >= 0) {
                    i11 = intrinsicHeight / 2;
                }
                this.f15718f.setBounds(-i10, -i11, i10, i11);
                float width = ((c0Var.getWidth() - c0Var.getPaddingLeft()) - c0Var.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(c0Var.getPaddingLeft(), c0Var.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f15718f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
