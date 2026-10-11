package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
public final class d0 extends y {
    public final c0 f15670e;
    public Drawable f15671f;
    public ColorStateList f15672g;
    public PorterDuff.Mode h;
    public boolean f15673i;
    public boolean f15674j;

    public d0(c0 c0Var) {
        super(c0Var);
        this.f15672g = null;
        this.h = null;
        this.f15673i = false;
        this.f15674j = false;
        this.f15670e = c0Var;
    }

    @Override
    public final void b(AttributeSet attributeSet, int i10) {
        super.b(attributeSet, i10);
        c0 c0Var = this.f15670e;
        Context context = c0Var.getContext();
        int[] iArr = f.a.f9530g;
        la.h R = la.h.R(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) R.f15466c;
        r0.i0.i(c0Var, c0Var.getContext(), iArr, attributeSet, (TypedArray) R.f15466c, i10);
        Drawable H = R.H(0);
        if (H != null) {
            c0Var.setThumb(H);
        }
        Drawable G = R.G(1);
        Drawable drawable = this.f15671f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f15671f = G;
        if (G != null) {
            G.setCallback(c0Var);
            G.setLayoutDirection(c0Var.getLayoutDirection());
            if (G.isStateful()) {
                G.setState(c0Var.getDrawableState());
            }
            f();
        }
        c0Var.invalidate();
        if (typedArray.hasValue(3)) {
            this.h = l1.b(typedArray.getInt(3, -1), this.h);
            this.f15674j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f15672g = R.E(2);
            this.f15673i = true;
        }
        R.S();
        f();
    }

    public final void f() {
        Drawable drawable = this.f15671f;
        if (drawable != null) {
            if (this.f15673i || this.f15674j) {
                Drawable mutate = drawable.mutate();
                this.f15671f = mutate;
                if (this.f15673i) {
                    mutate.setTintList(this.f15672g);
                }
                if (this.f15674j) {
                    this.f15671f.setTintMode(this.h);
                }
                if (this.f15671f.isStateful()) {
                    this.f15671f.setState(this.f15670e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        c0 c0Var;
        int i10;
        if (this.f15671f != null) {
            int max = this.f15670e.getMax();
            int i11 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f15671f.getIntrinsicWidth();
                int intrinsicHeight = this.f15671f.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i10 = intrinsicWidth / 2;
                } else {
                    i10 = 1;
                }
                if (intrinsicHeight >= 0) {
                    i11 = intrinsicHeight / 2;
                }
                this.f15671f.setBounds(-i10, -i11, i10, i11);
                float width = ((c0Var.getWidth() - c0Var.getPaddingLeft()) - c0Var.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(c0Var.getPaddingLeft(), c0Var.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f15671f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
