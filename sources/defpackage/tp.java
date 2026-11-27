package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
public final class tp extends lh2 {
    public boolean E;
    public final sp r;
    public Drawable s;
    public ColorStateList w;
    public PorterDuff.Mode x;
    public boolean y;

    public tp(sp spVar) {
        super(spVar, (byte) 1);
        this.w = null;
        this.x = null;
        this.y = false;
        this.E = false;
        this.r = spVar;
    }

    public final void Z() {
        Drawable drawable = this.s;
        if (drawable != null) {
            if (this.y || this.E) {
                Drawable mutate = drawable.mutate();
                this.s = mutate;
                if (this.y) {
                    mutate.setTintList(this.w);
                }
                if (this.E) {
                    this.s.setTintMode(this.x);
                }
                if (this.s.isStateful()) {
                    this.s.setState(this.r.getDrawableState());
                }
            }
        }
    }

    public final void a0(Canvas canvas) {
        sp spVar;
        int i;
        if (this.s != null) {
            int max = this.r.getMax();
            int i2 = 1;
            if (max > 1) {
                int intrinsicWidth = this.s.getIntrinsicWidth();
                int intrinsicHeight = this.s.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i = intrinsicWidth / 2;
                } else {
                    i = 1;
                }
                if (intrinsicHeight >= 0) {
                    i2 = intrinsicHeight / 2;
                }
                this.s.setBounds(-i, -i2, i, i2);
                float width = ((spVar.getWidth() - spVar.getPaddingLeft()) - spVar.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(spVar.getPaddingLeft(), spVar.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.s.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    @Override
    public final void z(AttributeSet attributeSet, int i) {
        super.z(attributeSet, 2130968924);
        sp spVar = this.r;
        Context context = spVar.getContext();
        int[] iArr = w19.g;
        ko9 v = ko9.v(context, attributeSet, iArr, 2130968924);
        TypedArray typedArray = (TypedArray) v.c;
        ihc.k(spVar, spVar.getContext(), iArr, attributeSet, (TypedArray) v.c, 2130968924);
        Drawable p = v.p(0);
        if (p != null) {
            spVar.setThumb(p);
        }
        Drawable n = v.n(1);
        Drawable drawable = this.s;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.s = n;
        if (n != null) {
            n.setCallback(spVar);
            n.setLayoutDirection(spVar.getLayoutDirection());
            if (n.isStateful()) {
                n.setState(spVar.getDrawableState());
            }
            Z();
        }
        spVar.invalidate();
        if (typedArray.hasValue(3)) {
            this.x = cr3.b(typedArray.getInt(3, -1), this.x);
            this.E = true;
        }
        if (typedArray.hasValue(2)) {
            this.w = v.m(2);
            this.y = true;
        }
        v.y();
        Z();
    }
}
