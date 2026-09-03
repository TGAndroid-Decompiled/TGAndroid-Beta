package lh;

import android.view.View;
import mh.l7;
import org.telegram.ui.Cells.ya;
import org.telegram.ui.Cells.za;
public final class i2 implements View.OnLongClickListener {
    public final int f12809a = 0;
    public final int f12810b;
    public final Object f12811c;
    public final Object d;

    public i2(l7 l7Var, int i10, Runnable runnable) {
        this.f12811c = l7Var;
        this.f12810b = i10;
        this.d = runnable;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f12809a) {
            case 0:
                ((l7) this.f12811c).f(this.f12810b, true);
                ((Runnable) this.d).run();
                return true;
            default:
                return ((za) this.f12811c).b(((ya) this.d).h, this.f12810b);
        }
    }

    public i2(za zaVar, ya yaVar, int i10) {
        this.f12811c = zaVar;
        this.d = yaVar;
        this.f12810b = i10;
    }
}
