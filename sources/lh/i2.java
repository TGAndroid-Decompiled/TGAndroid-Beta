package lh;

import android.view.View;
import mh.l7;
import org.telegram.ui.Cells.ya;
import org.telegram.ui.Cells.za;
public final class i2 implements View.OnLongClickListener {
    public final int f12807a = 0;
    public final int f12808b;
    public final Object f12809c;
    public final Object d;

    public i2(l7 l7Var, int i10, Runnable runnable) {
        this.f12809c = l7Var;
        this.f12808b = i10;
        this.d = runnable;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f12807a) {
            case 0:
                ((l7) this.f12809c).f(this.f12808b, true);
                ((Runnable) this.d).run();
                return true;
            default:
                return ((za) this.f12809c).b(((ya) this.d).h, this.f12808b);
        }
    }

    public i2(za zaVar, ya yaVar, int i10) {
        this.f12809c = zaVar;
        this.d = yaVar;
        this.f12808b = i10;
    }
}
