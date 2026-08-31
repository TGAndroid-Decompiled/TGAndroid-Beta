package gh;

import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.z;
public abstract class c extends Drawable {
    public final z f7140a;
    public int f7141b;
    public int f7142c = 255;

    public c(g6 g6Var) {
        int v02 = k6.v0(k6.f21750i6, g6Var);
        this.f7141b = v02;
        this.f7140a = k6.Y(v02, 0, 0);
    }

    public abstract void a(int i10);

    @Override
    public final int getAlpha() {
        return this.f7142c;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f7140a.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i10) {
        if (this.f7142c != i10) {
            this.f7142c = i10;
            a(i10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
