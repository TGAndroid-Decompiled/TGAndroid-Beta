package dh;

import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.z;
public abstract class c extends Drawable {
    public final z f5643a;
    public int f5644b;
    public int f5645c = 255;

    public c(c6 c6Var) {
        int v02 = g6.v0(g6.f23152i6, c6Var);
        this.f5644b = v02;
        this.f5643a = g6.Y(v02, 0, 0);
    }

    public abstract void a(int i10);

    @Override
    public final int getAlpha() {
        return this.f5645c;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f5643a.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i10) {
        if (this.f5645c != i10) {
            this.f5645c = i10;
            a(i10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
