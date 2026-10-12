package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
public final class d0 extends y {
    public final c0 e;
    public Drawable f15079f;
    public ColorStateList f15080g;
    public PorterDuff.Mode h;
    public boolean f15081i;
    public boolean f15082j;

    public d0(c0 c0Var) {
        super(c0Var);
        this.f15080g = null;
        this.h = null;
        this.f15081i = false;
        this.f15082j = false;
        this.e = c0Var;
    }

    @Override
    public final void b(AttributeSet attributeSet, int i10) {
        super.b(attributeSet, i10);
        c0 c0Var = this.e;
        Context context = c0Var.getContext();
        int[] iArr = f.a.f8806g;
        li.k P = li.k.P(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) P.f14821c;
        r0.j0.i(c0Var, c0Var.getContext(), iArr, attributeSet, (TypedArray) P.f14821c, i10);
        Drawable G = P.G(0);
        if (G != null) {
            c0Var.setThumb(G);
        }
        Drawable F = P.F(1);
        Drawable drawable = this.f15079f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f15079f = F;
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
            this.h = l1.b(typedArray.getInt(3, -1), this.h);
            this.f15082j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f15080g = P.E(2);
            this.f15081i = true;
        }
        P.Q();
        f();
    }

    public final void f() {
        Drawable drawable = this.f15079f;
        if (drawable != null) {
            if (this.f15081i || this.f15082j) {
                Drawable mutate = drawable.mutate();
                this.f15079f = mutate;
                if (this.f15081i) {
                    mutate.setTintList(this.f15080g);
                }
                if (this.f15082j) {
                    this.f15079f.setTintMode(this.h);
                }
                if (this.f15079f.isStateful()) {
                    this.f15079f.setState(this.e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        c0 c0Var;
        int i10;
        if (this.f15079f != null) {
            int max = this.e.getMax();
            int i11 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f15079f.getIntrinsicWidth();
                int intrinsicHeight = this.f15079f.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i10 = intrinsicWidth / 2;
                } else {
                    i10 = 1;
                }
                if (intrinsicHeight >= 0) {
                    i11 = intrinsicHeight / 2;
                }
                this.f15079f.setBounds(-i10, -i11, i10, i11);
                float width = ((c0Var.getWidth() - c0Var.getPaddingLeft()) - c0Var.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(c0Var.getPaddingLeft(), c0Var.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f15079f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
