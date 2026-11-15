package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
public final class d0 extends y {
    public final c0 f19665e;
    public Drawable f19666f;
    public ColorStateList f19667g;
    public PorterDuff.Mode h;
    public boolean f19668i;
    public boolean f19669j;

    public d0(c0 c0Var) {
        super(c0Var);
        this.f19667g = null;
        this.h = null;
        this.f19668i = false;
        this.f19669j = false;
        this.f19665e = c0Var;
    }

    @Override
    public final void b(AttributeSet attributeSet, int i7) {
        super.b(attributeSet, i7);
        c0 c0Var = this.f19665e;
        Context context = c0Var.getContext();
        int[] iArr = f.a.f10676g;
        h6.m z10 = h6.m.z(context, attributeSet, iArr, i7);
        TypedArray typedArray = (TypedArray) z10.f13625c;
        r0.i0.i(c0Var, c0Var.getContext(), iArr, attributeSet, (TypedArray) z10.f13625c, i7);
        Drawable s5 = z10.s(0);
        if (s5 != null) {
            c0Var.setThumb(s5);
        }
        Drawable p10 = z10.p(1);
        Drawable drawable = this.f19666f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f19666f = p10;
        if (p10 != null) {
            p10.setCallback(c0Var);
            p10.setLayoutDirection(c0Var.getLayoutDirection());
            if (p10.isStateful()) {
                p10.setState(c0Var.getDrawableState());
            }
            f();
        }
        c0Var.invalidate();
        if (typedArray.hasValue(3)) {
            this.h = l1.b(typedArray.getInt(3, -1), this.h);
            this.f19669j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f19667g = z10.o(2);
            this.f19668i = true;
        }
        z10.D();
        f();
    }

    public final void f() {
        Drawable drawable = this.f19666f;
        if (drawable != null) {
            if (this.f19668i || this.f19669j) {
                Drawable mutate = drawable.mutate();
                this.f19666f = mutate;
                if (this.f19668i) {
                    mutate.setTintList(this.f19667g);
                }
                if (this.f19669j) {
                    this.f19666f.setTintMode(this.h);
                }
                if (this.f19666f.isStateful()) {
                    this.f19666f.setState(this.f19665e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        c0 c0Var;
        int i7;
        if (this.f19666f != null) {
            int max = this.f19665e.getMax();
            int i10 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f19666f.getIntrinsicWidth();
                int intrinsicHeight = this.f19666f.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i7 = intrinsicWidth / 2;
                } else {
                    i7 = 1;
                }
                if (intrinsicHeight >= 0) {
                    i10 = intrinsicHeight / 2;
                }
                this.f19666f.setBounds(-i7, -i10, i7, i10);
                float width = ((c0Var.getWidth() - c0Var.getPaddingLeft()) - c0Var.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(c0Var.getPaddingLeft(), c0Var.getHeight() / 2);
                for (int i11 = 0; i11 <= max; i11++) {
                    this.f19666f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
