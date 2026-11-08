package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
public final class e0 extends z {
    public final d0 f19083e;
    public Drawable f19084f;
    public ColorStateList f19085g;
    public PorterDuff.Mode h;
    public boolean f19086i;
    public boolean f19087j;

    public e0(d0 d0Var) {
        super(d0Var);
        this.f19085g = null;
        this.h = null;
        this.f19086i = false;
        this.f19087j = false;
        this.f19083e = d0Var;
    }

    @Override
    public final void b(AttributeSet attributeSet, int i7) {
        super.b(attributeSet, i7);
        d0 d0Var = this.f19083e;
        Context context = d0Var.getContext();
        int[] iArr = f.a.f10860g;
        h6.m x10 = h6.m.x(context, attributeSet, iArr, i7);
        TypedArray typedArray = (TypedArray) x10.f14265c;
        r0.i0.i(d0Var, d0Var.getContext(), iArr, attributeSet, (TypedArray) x10.f14265c, i7);
        Drawable q10 = x10.q(0);
        if (q10 != null) {
            d0Var.setThumb(q10);
        }
        Drawable p10 = x10.p(1);
        Drawable drawable = this.f19084f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f19084f = p10;
        if (p10 != null) {
            p10.setCallback(d0Var);
            p10.setLayoutDirection(d0Var.getLayoutDirection());
            if (p10.isStateful()) {
                p10.setState(d0Var.getDrawableState());
            }
            f();
        }
        d0Var.invalidate();
        if (typedArray.hasValue(3)) {
            this.h = m1.b(typedArray.getInt(3, -1), this.h);
            this.f19087j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f19085g = x10.o(2);
            this.f19086i = true;
        }
        x10.C();
        f();
    }

    public final void f() {
        Drawable drawable = this.f19084f;
        if (drawable != null) {
            if (this.f19086i || this.f19087j) {
                Drawable mutate = drawable.mutate();
                this.f19084f = mutate;
                if (this.f19086i) {
                    mutate.setTintList(this.f19085g);
                }
                if (this.f19087j) {
                    this.f19084f.setTintMode(this.h);
                }
                if (this.f19084f.isStateful()) {
                    this.f19084f.setState(this.f19083e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        d0 d0Var;
        int i7;
        if (this.f19084f != null) {
            int max = this.f19083e.getMax();
            int i10 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f19084f.getIntrinsicWidth();
                int intrinsicHeight = this.f19084f.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i7 = intrinsicWidth / 2;
                } else {
                    i7 = 1;
                }
                if (intrinsicHeight >= 0) {
                    i10 = intrinsicHeight / 2;
                }
                this.f19084f.setBounds(-i7, -i10, i7, i10);
                float width = ((d0Var.getWidth() - d0Var.getPaddingLeft()) - d0Var.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(d0Var.getPaddingLeft(), d0Var.getHeight() / 2);
                for (int i11 = 0; i11 <= max; i11++) {
                    this.f19084f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
