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
    public final c0 e;
    public Drawable f14149f;
    public ColorStateList f14150g;
    public PorterDuff.Mode h;
    public boolean f14151i;
    public boolean f14152j;

    public d0(c0 c0Var) {
        super(c0Var);
        this.f14150g = null;
        this.h = null;
        this.f14151i = false;
        this.f14152j = false;
        this.e = c0Var;
    }

    @Override
    public final void b(AttributeSet attributeSet, int i10) {
        super.b(attributeSet, i10);
        c0 c0Var = this.e;
        Context context = c0Var.getContext();
        int[] iArr = f.a.f8767g;
        lf.i Q = lf.i.Q(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) Q.f14022c;
        r0.i0.j(c0Var, c0Var.getContext(), iArr, attributeSet, (TypedArray) Q.f14022c, i10);
        Drawable G = Q.G(0);
        if (G != null) {
            c0Var.setThumb(G);
        }
        Drawable F = Q.F(1);
        Drawable drawable = this.f14149f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f14149f = F;
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
            this.f14152j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f14150g = Q.D(2);
            this.f14151i = true;
        }
        Q.R();
        f();
    }

    public final void f() {
        Drawable drawable = this.f14149f;
        if (drawable != null) {
            if (this.f14151i || this.f14152j) {
                Drawable d = r8.d(drawable.mutate());
                this.f14149f = d;
                if (this.f14151i) {
                    d.setTintList(this.f14150g);
                }
                if (this.f14152j) {
                    this.f14149f.setTintMode(this.h);
                }
                if (this.f14149f.isStateful()) {
                    this.f14149f.setState(this.e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        int i10;
        if (this.f14149f != null) {
            c0 c0Var = this.e;
            int max = c0Var.getMax();
            int i11 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f14149f.getIntrinsicWidth();
                int intrinsicHeight = this.f14149f.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i10 = intrinsicWidth / 2;
                } else {
                    i10 = 1;
                }
                if (intrinsicHeight >= 0) {
                    i11 = intrinsicHeight / 2;
                }
                this.f14149f.setBounds(-i10, -i11, i10, i11);
                float width = ((c0Var.getWidth() - c0Var.getPaddingLeft()) - c0Var.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(c0Var.getPaddingLeft(), c0Var.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f14149f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
