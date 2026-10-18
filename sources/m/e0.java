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
    public Drawable f16181f;
    public ColorStateList f16182g;
    public PorterDuff.Mode h;
    public boolean f16183i;
    public boolean f16184j;

    public e0(d0 d0Var) {
        super(d0Var);
        this.f16182g = null;
        this.h = null;
        this.f16183i = false;
        this.f16184j = false;
        this.e = d0Var;
    }

    @Override
    public final void b(AttributeSet attributeSet, int i10) {
        super.b(attributeSet, i10);
        d0 d0Var = this.e;
        Context context = d0Var.getContext();
        int[] iArr = f.a.f10256g;
        g3 K = g3.K(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) K.f16204c;
        r0.i0.i(d0Var, d0Var.getContext(), iArr, attributeSet, (TypedArray) K.f16204c, i10);
        Drawable B = K.B(0);
        if (B != null) {
            d0Var.setThumb(B);
        }
        Drawable A = K.A(1);
        Drawable drawable = this.f16181f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f16181f = A;
        if (A != null) {
            A.setCallback(d0Var);
            A.setLayoutDirection(d0Var.getLayoutDirection());
            if (A.isStateful()) {
                A.setState(d0Var.getDrawableState());
            }
            f();
        }
        d0Var.invalidate();
        if (typedArray.hasValue(3)) {
            this.h = m1.b(typedArray.getInt(3, -1), this.h);
            this.f16184j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f16182g = K.z(2);
            this.f16183i = true;
        }
        K.L();
        f();
    }

    public final void f() {
        Drawable drawable = this.f16181f;
        if (drawable != null) {
            if (this.f16183i || this.f16184j) {
                Drawable mutate = drawable.mutate();
                this.f16181f = mutate;
                if (this.f16183i) {
                    mutate.setTintList(this.f16182g);
                }
                if (this.f16184j) {
                    this.f16181f.setTintMode(this.h);
                }
                if (this.f16181f.isStateful()) {
                    this.f16181f.setState(this.e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        d0 d0Var;
        int i10;
        if (this.f16181f != null) {
            int max = this.e.getMax();
            int i11 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f16181f.getIntrinsicWidth();
                int intrinsicHeight = this.f16181f.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i10 = intrinsicWidth / 2;
                } else {
                    i10 = 1;
                }
                if (intrinsicHeight >= 0) {
                    i11 = intrinsicHeight / 2;
                }
                this.f16181f.setBounds(-i10, -i11, i10, i11);
                float width = ((d0Var.getWidth() - d0Var.getPaddingLeft()) - d0Var.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(d0Var.getPaddingLeft(), d0Var.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f16181f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
