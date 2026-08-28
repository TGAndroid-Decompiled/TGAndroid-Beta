package ah;

import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.z;
public abstract class c extends Drawable {
    public final z f258a;
    public int f259b;
    public int f260c = 255;

    public c(b6 b6Var) {
        int v02 = f6.v0(f6.f23092i6, b6Var);
        this.f259b = v02;
        this.f258a = f6.Y(v02, 0, 0);
    }

    public abstract void a(int i9);

    @Override
    public final int getAlpha() {
        return this.f260c;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f258a.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i9) {
        if (this.f260c != i9) {
            this.f260c = i9;
            a(i9);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
