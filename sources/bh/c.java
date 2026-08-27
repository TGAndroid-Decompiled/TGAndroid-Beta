package bh;

import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.z;

public abstract class c extends Drawable {

    public final z f2182a;

    public int f2183b;

    public int f2184c = 255;

    public c(c6 c6Var) {
        int iV0 = g6.v0(g6.f23144i6, c6Var);
        this.f2183b = iV0;
        this.f2182a = g6.Y(iV0, 0, 0);
    }

    public abstract void a(int i10);

    @Override
    public final int getAlpha() {
        return this.f2184c;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f2182a.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i10) {
        if (this.f2184c != i10) {
            this.f2184c = i10;
            a(i10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
