package kh;

import android.view.View;
import lh.l7;
import org.telegram.ui.Cells.ya;
import org.telegram.ui.Cells.za;
public final class j2 implements View.OnLongClickListener {
    public final int f10679a = 0;
    public final int f10680b;
    public final Object f10681c;
    public final Object d;

    public j2(l7 l7Var, int i10, Runnable runnable) {
        this.f10681c = l7Var;
        this.f10680b = i10;
        this.d = runnable;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f10679a) {
            case 0:
                ((l7) this.f10681c).f(this.f10680b, true);
                ((Runnable) this.d).run();
                return true;
            default:
                return ((za) this.f10681c).b(((ya) this.d).h, this.f10680b);
        }
    }

    public j2(za zaVar, ya yaVar, int i10) {
        this.f10681c = zaVar;
        this.d = yaVar;
        this.f10680b = i10;
    }
}
