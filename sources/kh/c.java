package kh;

import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.y;
public abstract class c extends Drawable {
    public final y f11383a;
    public int f11384b;
    public int f11385c = 255;

    public c(p6 p6Var) {
        int w02 = t6.w0(t6.f21020i6, p6Var);
        this.f11384b = w02;
        this.f11383a = t6.a0(w02, 0, 0);
    }

    public abstract void a(int i10);

    @Override
    public final int getAlpha() {
        return this.f11385c;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f11383a.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i10) {
        if (this.f11385c != i10) {
            this.f11385c = i10;
            a(i10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
