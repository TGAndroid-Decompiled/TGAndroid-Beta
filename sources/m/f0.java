package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
public final class f0 extends a0 {
    public final e0 e;
    public Drawable f14829f;
    public ColorStateList f14830g;
    public PorterDuff.Mode h;
    public boolean f14831i;
    public boolean f14832j;

    public f0(e0 e0Var) {
        super(e0Var);
        this.f14830g = null;
        this.h = null;
        this.f14831i = false;
        this.f14832j = false;
        this.e = e0Var;
    }

    @Override
    public final void b(AttributeSet attributeSet, int i10) {
        super.b(attributeSet, i10);
        e0 e0Var = this.e;
        Context context = e0Var.getContext();
        int[] iArr = f.a.f8809g;
        h3 P = h3.P(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) P.f14851c;
        r0.i0.i(e0Var, e0Var.getContext(), iArr, attributeSet, (TypedArray) P.f14851c, i10);
        Drawable G = P.G(0);
        if (G != null) {
            e0Var.setThumb(G);
        }
        Drawable F = P.F(1);
        Drawable drawable = this.f14829f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f14829f = F;
        if (F != null) {
            F.setCallback(e0Var);
            F.setLayoutDirection(e0Var.getLayoutDirection());
            if (F.isStateful()) {
                F.setState(e0Var.getDrawableState());
            }
            f();
        }
        e0Var.invalidate();
        if (typedArray.hasValue(3)) {
            this.h = n1.b(typedArray.getInt(3, -1), this.h);
            this.f14832j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f14830g = P.E(2);
            this.f14831i = true;
        }
        P.Q();
        f();
    }

    public final void f() {
        Drawable drawable = this.f14829f;
        if (drawable != null) {
            if (this.f14831i || this.f14832j) {
                Drawable mutate = drawable.mutate();
                this.f14829f = mutate;
                if (this.f14831i) {
                    mutate.setTintList(this.f14830g);
                }
                if (this.f14832j) {
                    this.f14829f.setTintMode(this.h);
                }
                if (this.f14829f.isStateful()) {
                    this.f14829f.setState(this.e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        e0 e0Var;
        int i10;
        if (this.f14829f != null) {
            int max = this.e.getMax();
            int i11 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f14829f.getIntrinsicWidth();
                int intrinsicHeight = this.f14829f.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i10 = intrinsicWidth / 2;
                } else {
                    i10 = 1;
                }
                if (intrinsicHeight >= 0) {
                    i11 = intrinsicHeight / 2;
                }
                this.f14829f.setBounds(-i10, -i11, i10, i11);
                float width = ((e0Var.getWidth() - e0Var.getPaddingLeft()) - e0Var.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(e0Var.getPaddingLeft(), e0Var.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f14829f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
