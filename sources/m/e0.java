package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
public final class e0 extends z {
    public final d0 e;
    public Drawable f16174f;
    public ColorStateList f16175g;
    public PorterDuff.Mode h;
    public boolean f16176i;
    public boolean f16177j;

    public e0(d0 d0Var) {
        super(d0Var);
        this.f16175g = null;
        this.h = null;
        this.f16176i = false;
        this.f16177j = false;
        this.e = d0Var;
    }

    @Override
    public final void b(AttributeSet attributeSet, int i10) {
        super.b(attributeSet, i10);
        d0 d0Var = this.e;
        Context context = d0Var.getContext();
        int[] iArr = f.a.f10254g;
        g3 P = g3.P(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) P.f16197c;
        r0.i0.i(d0Var, d0Var.getContext(), iArr, attributeSet, (TypedArray) P.f16197c, i10);
        Drawable G = P.G(0);
        if (G != null) {
            d0Var.setThumb(G);
        }
        Drawable F = P.F(1);
        Drawable drawable = this.f16174f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f16174f = F;
        if (F != null) {
            F.setCallback(d0Var);
            F.setLayoutDirection(d0Var.getLayoutDirection());
            if (F.isStateful()) {
                F.setState(d0Var.getDrawableState());
            }
            f();
        }
        d0Var.invalidate();
        if (typedArray.hasValue(3)) {
            this.h = m1.b(typedArray.getInt(3, -1), this.h);
            this.f16177j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f16175g = P.E(2);
            this.f16176i = true;
        }
        P.Q();
        f();
    }

    public final void f() {
        Drawable drawable = this.f16174f;
        if (drawable != null) {
            if (this.f16176i || this.f16177j) {
                Drawable mutate = drawable.mutate();
                this.f16174f = mutate;
                if (this.f16176i) {
                    mutate.setTintList(this.f16175g);
                }
                if (this.f16177j) {
                    this.f16174f.setTintMode(this.h);
                }
                if (this.f16174f.isStateful()) {
                    this.f16174f.setState(this.e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        d0 d0Var;
        int i10;
        if (this.f16174f != null) {
            int max = this.e.getMax();
            int i11 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f16174f.getIntrinsicWidth();
                int intrinsicHeight = this.f16174f.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i10 = intrinsicWidth / 2;
                } else {
                    i10 = 1;
                }
                if (intrinsicHeight >= 0) {
                    i11 = intrinsicHeight / 2;
                }
                this.f16174f.setBounds(-i10, -i11, i10, i11);
                float width = ((d0Var.getWidth() - d0Var.getPaddingLeft()) - d0Var.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(d0Var.getPaddingLeft(), d0Var.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f16174f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
