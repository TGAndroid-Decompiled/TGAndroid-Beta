package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
public final class d0 extends y {
    public final c0 f18553e;
    public Drawable f18554f;
    public ColorStateList f18555g;
    public PorterDuff.Mode h;
    public boolean f18556i;
    public boolean f18557j;

    public d0(c0 c0Var) {
        super(c0Var);
        this.f18555g = null;
        this.h = null;
        this.f18556i = false;
        this.f18557j = false;
        this.f18553e = c0Var;
    }

    @Override
    public final void b(AttributeSet attributeSet, int i3) {
        super.b(attributeSet, i3);
        c0 c0Var = this.f18553e;
        Context context = c0Var.getContext();
        int[] iArr = f.a.f11312g;
        k4.j F = k4.j.F(context, attributeSet, iArr, i3);
        TypedArray typedArray = (TypedArray) F.f16870b;
        r0.i0.i(c0Var, c0Var.getContext(), iArr, attributeSet, (TypedArray) F.f16870b, i3);
        Drawable B = F.B(0);
        if (B != null) {
            c0Var.setThumb(B);
        }
        Drawable A = F.A(1);
        Drawable drawable = this.f18554f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f18554f = A;
        if (A != null) {
            A.setCallback(c0Var);
            A.setLayoutDirection(c0Var.getLayoutDirection());
            if (A.isStateful()) {
                A.setState(c0Var.getDrawableState());
            }
            f();
        }
        c0Var.invalidate();
        if (typedArray.hasValue(3)) {
            this.h = l1.b(typedArray.getInt(3, -1), this.h);
            this.f18557j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f18555g = F.y(2);
            this.f18556i = true;
        }
        F.H();
        f();
    }

    public final void f() {
        Drawable drawable = this.f18554f;
        if (drawable != null) {
            if (this.f18556i || this.f18557j) {
                Drawable mutate = drawable.mutate();
                this.f18554f = mutate;
                if (this.f18556i) {
                    mutate.setTintList(this.f18555g);
                }
                if (this.f18557j) {
                    this.f18554f.setTintMode(this.h);
                }
                if (this.f18554f.isStateful()) {
                    this.f18554f.setState(this.f18553e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        c0 c0Var;
        int i3;
        if (this.f18554f != null) {
            int max = this.f18553e.getMax();
            int i10 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f18554f.getIntrinsicWidth();
                int intrinsicHeight = this.f18554f.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i3 = intrinsicWidth / 2;
                } else {
                    i3 = 1;
                }
                if (intrinsicHeight >= 0) {
                    i10 = intrinsicHeight / 2;
                }
                this.f18554f.setBounds(-i3, -i10, i3, i10);
                float width = ((c0Var.getWidth() - c0Var.getPaddingLeft()) - c0Var.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(c0Var.getPaddingLeft(), c0Var.getHeight() / 2);
                for (int i11 = 0; i11 <= max; i11++) {
                    this.f18554f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
