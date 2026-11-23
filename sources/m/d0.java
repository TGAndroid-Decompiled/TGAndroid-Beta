package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
public final class d0 extends y {
    public final c0 f20123e;
    public Drawable f20124f;
    public ColorStateList f20125g;
    public PorterDuff.Mode h;
    public boolean f20126i;
    public boolean f20127j;

    public d0(c0 c0Var) {
        super(c0Var);
        this.f20125g = null;
        this.h = null;
        this.f20126i = false;
        this.f20127j = false;
        this.f20123e = c0Var;
    }

    @Override
    public final void b(AttributeSet attributeSet, int i7) {
        super.b(attributeSet, i7);
        c0 c0Var = this.f20123e;
        Context context = c0Var.getContext();
        int[] iArr = f.a.f10986g;
        h6.m E = h6.m.E(context, attributeSet, iArr, i7);
        TypedArray typedArray = (TypedArray) E.f13932c;
        r0.i0.i(c0Var, c0Var.getContext(), iArr, attributeSet, (TypedArray) E.f13932c, i7);
        Drawable A = E.A(0);
        if (A != null) {
            c0Var.setThumb(A);
        }
        Drawable z10 = E.z(1);
        Drawable drawable = this.f20124f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f20124f = z10;
        if (z10 != null) {
            z10.setCallback(c0Var);
            z10.setLayoutDirection(c0Var.getLayoutDirection());
            if (z10.isStateful()) {
                z10.setState(c0Var.getDrawableState());
            }
            f();
        }
        c0Var.invalidate();
        if (typedArray.hasValue(3)) {
            this.h = l1.b(typedArray.getInt(3, -1), this.h);
            this.f20127j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f20125g = E.y(2);
            this.f20126i = true;
        }
        E.G();
        f();
    }

    public final void f() {
        Drawable drawable = this.f20124f;
        if (drawable != null) {
            if (this.f20126i || this.f20127j) {
                Drawable mutate = drawable.mutate();
                this.f20124f = mutate;
                if (this.f20126i) {
                    mutate.setTintList(this.f20125g);
                }
                if (this.f20127j) {
                    this.f20124f.setTintMode(this.h);
                }
                if (this.f20124f.isStateful()) {
                    this.f20124f.setState(this.f20123e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        c0 c0Var;
        int i7;
        if (this.f20124f != null) {
            int max = this.f20123e.getMax();
            int i10 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f20124f.getIntrinsicWidth();
                int intrinsicHeight = this.f20124f.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i7 = intrinsicWidth / 2;
                } else {
                    i7 = 1;
                }
                if (intrinsicHeight >= 0) {
                    i10 = intrinsicHeight / 2;
                }
                this.f20124f.setBounds(-i7, -i10, i7, i10);
                float width = ((c0Var.getWidth() - c0Var.getPaddingLeft()) - c0Var.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(c0Var.getPaddingLeft(), c0Var.getHeight() / 2);
                for (int i11 = 0; i11 <= max; i11++) {
                    this.f20124f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
