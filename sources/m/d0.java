package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
public final class d0 extends y {
    public final c0 f15397e;
    public Drawable f15398f;
    public ColorStateList f15399g;
    public PorterDuff.Mode h;
    public boolean f15400i;
    public boolean f15401j;

    public d0(c0 c0Var) {
        super(c0Var);
        this.f15399g = null;
        this.h = null;
        this.f15400i = false;
        this.f15401j = false;
        this.f15397e = c0Var;
    }

    @Override
    public final void b(AttributeSet attributeSet, int i10) {
        super.b(attributeSet, i10);
        c0 c0Var = this.f15397e;
        Context context = c0Var.getContext();
        int[] iArr = f.a.f9528g;
        f3 Q = f3.Q(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) Q.f15424c;
        r0.i0.i(c0Var, c0Var.getContext(), iArr, attributeSet, (TypedArray) Q.f15424c, i10);
        Drawable G = Q.G(0);
        if (G != null) {
            c0Var.setThumb(G);
        }
        Drawable F = Q.F(1);
        Drawable drawable = this.f15398f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f15398f = F;
        if (F != null) {
            F.setCallback(c0Var);
            F.setLayoutDirection(c0Var.getLayoutDirection());
            if (F.isStateful()) {
                F.setState(c0Var.getDrawableState());
            }
            f();
        }
        c0Var.invalidate();
        if (typedArray.hasValue(3)) {
            this.h = m1.b(typedArray.getInt(3, -1), this.h);
            this.f15401j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f15399g = Q.D(2);
            this.f15400i = true;
        }
        Q.R();
        f();
    }

    public final void f() {
        Drawable drawable = this.f15398f;
        if (drawable != null) {
            if (this.f15400i || this.f15401j) {
                Drawable mutate = drawable.mutate();
                this.f15398f = mutate;
                if (this.f15400i) {
                    mutate.setTintList(this.f15399g);
                }
                if (this.f15401j) {
                    this.f15398f.setTintMode(this.h);
                }
                if (this.f15398f.isStateful()) {
                    this.f15398f.setState(this.f15397e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        c0 c0Var;
        int i10;
        if (this.f15398f != null) {
            int max = this.f15397e.getMax();
            int i11 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f15398f.getIntrinsicWidth();
                int intrinsicHeight = this.f15398f.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i10 = intrinsicWidth / 2;
                } else {
                    i10 = 1;
                }
                if (intrinsicHeight >= 0) {
                    i11 = intrinsicHeight / 2;
                }
                this.f15398f.setBounds(-i10, -i11, i10, i11);
                float width = ((c0Var.getWidth() - c0Var.getPaddingLeft()) - c0Var.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(c0Var.getPaddingLeft(), c0Var.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f15398f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
