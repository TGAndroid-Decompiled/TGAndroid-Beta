package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import g7.k8;

public final class e0 extends z {

    public final d0 f17300e;

    public Drawable f17301f;

    public ColorStateList f17302g;
    public PorterDuff.Mode h;

    public boolean f17303i;

    public boolean f17304j;

    public e0(d0 d0Var) {
        super(d0Var);
        this.f17302g = null;
        this.h = null;
        this.f17303i = false;
        this.f17304j = false;
        this.f17300e = d0Var;
    }

    @Override
    public final void b(AttributeSet attributeSet, int i10) {
        super.b(attributeSet, 2130968924);
        d0 d0Var = this.f17300e;
        Context context = d0Var.getContext();
        int[] iArr = f.a.f5579g;
        j9.a aVarG = j9.a.G(context, attributeSet, iArr, 2130968924);
        TypedArray typedArray = (TypedArray) aVarG.f12864c;
        r0.j0.j(d0Var, d0Var.getContext(), iArr, attributeSet, (TypedArray) aVarG.f12864c, 2130968924);
        Drawable drawableZ = aVarG.z(0);
        if (drawableZ != null) {
            d0Var.setThumb(drawableZ);
        }
        Drawable drawableY = aVarG.y(1);
        Drawable drawable = this.f17301f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f17301f = drawableY;
        if (drawableY != null) {
            drawableY.setCallback(d0Var);
            k8.b(d0Var.getLayoutDirection(), drawableY);
            if (drawableY.isStateful()) {
                drawableY.setState(d0Var.getDrawableState());
            }
            f();
        }
        d0Var.invalidate();
        if (typedArray.hasValue(3)) {
            this.h = m1.b(typedArray.getInt(3, -1), this.h);
            this.f17304j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f17302g = aVarG.x(2);
            this.f17303i = true;
        }
        aVarG.I();
        f();
    }

    public final void f() {
        Drawable drawable = this.f17301f;
        if (drawable != null) {
            if (this.f17303i || this.f17304j) {
                Drawable drawableD = k8.d(drawable.mutate());
                this.f17301f = drawableD;
                if (this.f17303i) {
                    drawableD.setTintList(this.f17302g);
                }
                if (this.f17304j) {
                    this.f17301f.setTintMode(this.h);
                }
                if (this.f17301f.isStateful()) {
                    this.f17301f.setState(this.f17300e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        if (this.f17301f != null) {
            d0 d0Var = this.f17300e;
            int max = d0Var.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f17301f.getIntrinsicWidth();
                int intrinsicHeight = this.f17301f.getIntrinsicHeight();
                int i10 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i11 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f17301f.setBounds(-i10, -i11, i10, i11);
                float width = ((d0Var.getWidth() - d0Var.getPaddingLeft()) - d0Var.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(d0Var.getPaddingLeft(), d0Var.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f17301f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
