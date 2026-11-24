package defpackage;

import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public abstract class xd8 extends Drawable {
    public final ff0 a;
    public int b;
    public int c = 255;

    public xd8(wjb wjbVar) {
        int v0 = bkb.v0(bkb.h6, wjbVar);
        this.b = v0;
        this.a = bkb.Y(v0, 0, 0);
    }

    public abstract void a(int i);

    @Override
    public final int getAlpha() {
        return this.c;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.a.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i) {
        if (this.c != i) {
            this.c = i;
            a(i);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
