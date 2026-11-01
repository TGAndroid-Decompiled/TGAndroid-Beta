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
    public Drawable f12387f;
    public ColorStateList f12388g;
    public PorterDuff.Mode h;
    public boolean f12389i;
    public boolean f12390j;

    public d0(c0 c0Var) {
        super(c0Var);
        this.f12388g = null;
        this.h = null;
        this.f12389i = false;
        this.f12390j = false;
        this.e = c0Var;
    }

    @Override
    public final void b(AttributeSet attributeSet, int i10) {
        super.b(attributeSet, i10);
        c0 c0Var = this.e;
        Context context = c0Var.getContext();
        int[] iArr = f.a.f6699g;
        li.k G = li.k.G(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) G.f12102c;
        r0.h0.i(c0Var, c0Var.getContext(), iArr, attributeSet, (TypedArray) G.f12102c, i10);
        Drawable z10 = G.z(0);
        if (z10 != null) {
            c0Var.setThumb(z10);
        }
        Drawable v = G.v(1);
        Drawable drawable = this.f12387f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f12387f = v;
        if (v != null) {
            v.setCallback(c0Var);
            v.setLayoutDirection(c0Var.getLayoutDirection());
            if (v.isStateful()) {
                v.setState(c0Var.getDrawableState());
            }
            f();
        }
        c0Var.invalidate();
        if (typedArray.hasValue(3)) {
            this.h = l1.b(typedArray.getInt(3, -1), this.h);
            this.f12390j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f12388g = G.u(2);
            this.f12389i = true;
        }
        G.I();
        f();
    }

    public final void f() {
        Drawable drawable = this.f12387f;
        if (drawable != null) {
            if (this.f12389i || this.f12390j) {
                Drawable mutate = drawable.mutate();
                this.f12387f = mutate;
                if (this.f12389i) {
                    mutate.setTintList(this.f12388g);
                }
                if (this.f12390j) {
                    this.f12387f.setTintMode(this.h);
                }
                if (this.f12387f.isStateful()) {
                    this.f12387f.setState(this.e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        c0 c0Var;
        int i10;
        if (this.f12387f != null) {
            int max = this.e.getMax();
            int i11 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f12387f.getIntrinsicWidth();
                int intrinsicHeight = this.f12387f.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i10 = intrinsicWidth / 2;
                } else {
                    i10 = 1;
                }
                if (intrinsicHeight >= 0) {
                    i11 = intrinsicHeight / 2;
                }
                this.f12387f.setBounds(-i10, -i11, i10, i11);
                float width = ((c0Var.getWidth() - c0Var.getPaddingLeft()) - c0Var.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(c0Var.getPaddingLeft(), c0Var.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f12387f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
