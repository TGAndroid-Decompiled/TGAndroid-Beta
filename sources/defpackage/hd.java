package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import java.util.HashSet;
public final class hd extends Drawable implements snb {
    public final e29 a;
    public final GradientDrawable b;
    public final int c;
    public final int d;
    public final vnb e;

    public hd(e29 e29Var, int i, int i2, int i3, vnb vnbVar) {
        this.a = e29Var;
        this.c = i2;
        this.d = i3;
        this.e = vnbVar;
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.b = gradientDrawable;
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(hl.L(128.0f));
    }

    @Override
    public final void draw(Canvas canvas) {
        e29 e29Var = this.a;
        int width = e29Var.getWidth();
        int i = this.c;
        GradientDrawable gradientDrawable = this.b;
        gradientDrawable.setBounds((int) ((width - i) / 2.0f), (int) ((e29Var.getHeight() - i) / 2.0f), (int) ((e29Var.getWidth() + i) / 2.0f), (int) ((e29Var.getHeight() + i) / 2.0f));
        gradientDrawable.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return this.b.getOpacity();
    }

    @Override
    public final void setAlpha(int i) {
        this.b.setAlpha(i);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }

    @Override
    public final void updateColors() {
        int i = this.d;
        if (i >= 0) {
            this.b.setColor(aob.v0(i, this.e));
            invalidateSelf();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
