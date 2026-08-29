package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import h7.l8;
public final class e0 extends z {
    public final d0 f16524e;
    public Drawable f16525f;
    public ColorStateList f16526g;
    public PorterDuff.Mode h;
    public boolean f16527i;
    public boolean f16528j;

    public e0(d0 d0Var) {
        super(d0Var);
        this.f16526g = null;
        this.h = null;
        this.f16527i = false;
        this.f16528j = false;
        this.f16524e = d0Var;
    }

    @Override
    public final void b(AttributeSet attributeSet, int i10) {
        super.b(attributeSet, i10);
        d0 d0Var = this.f16524e;
        Context context = d0Var.getContext();
        int[] iArr = f.a.f6236g;
        l3.g0 z10 = l3.g0.z(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) z10.f14097c;
        r0.j0.j(d0Var, d0Var.getContext(), iArr, attributeSet, (TypedArray) z10.f14097c, i10);
        Drawable r6 = z10.r(0);
        if (r6 != null) {
            d0Var.setThumb(r6);
        }
        Drawable q6 = z10.q(1);
        Drawable drawable = this.f16525f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f16525f = q6;
        if (q6 != null) {
            q6.setCallback(d0Var);
            l8.b(d0Var.getLayoutDirection(), q6);
            if (q6.isStateful()) {
                q6.setState(d0Var.getDrawableState());
            }
            f();
        }
        d0Var.invalidate();
        if (typedArray.hasValue(3)) {
            this.h = m1.b(typedArray.getInt(3, -1), this.h);
            this.f16528j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f16526g = z10.p(2);
            this.f16527i = true;
        }
        z10.B();
        f();
    }

    public final void f() {
        Drawable drawable = this.f16525f;
        if (drawable != null) {
            if (this.f16527i || this.f16528j) {
                Drawable d = l8.d(drawable.mutate());
                this.f16525f = d;
                if (this.f16527i) {
                    d.setTintList(this.f16526g);
                }
                if (this.f16528j) {
                    this.f16525f.setTintMode(this.h);
                }
                if (this.f16525f.isStateful()) {
                    this.f16525f.setState(this.f16524e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        int i10;
        if (this.f16525f != null) {
            d0 d0Var = this.f16524e;
            int max = d0Var.getMax();
            int i11 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f16525f.getIntrinsicWidth();
                int intrinsicHeight = this.f16525f.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i10 = intrinsicWidth / 2;
                } else {
                    i10 = 1;
                }
                if (intrinsicHeight >= 0) {
                    i11 = intrinsicHeight / 2;
                }
                this.f16525f.setBounds(-i10, -i11, i10, i11);
                float width = ((d0Var.getWidth() - d0Var.getPaddingLeft()) - d0Var.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(d0Var.getPaddingLeft(), d0Var.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f16525f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
