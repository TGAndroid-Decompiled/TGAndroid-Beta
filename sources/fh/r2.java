package fh;

import android.view.View;
import gh.n7;
import org.telegram.ui.Cells.ya;
import org.telegram.ui.Cells.za;
public final class r2 implements View.OnLongClickListener {
    public final int f6734a = 0;
    public final int f6735b;
    public final Object f6736c;
    public final Object d;

    public r2(n7 n7Var, int i9, Runnable runnable) {
        this.f6736c = n7Var;
        this.f6735b = i9;
        this.d = runnable;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f6734a) {
            case 0:
                ((n7) this.f6736c).f(this.f6735b, true);
                ((Runnable) this.d).run();
                return true;
            default:
                return ((za) this.f6736c).b(((ya) this.d).h, this.f6735b);
        }
    }

    public r2(za zaVar, ya yaVar, int i9) {
        this.f6736c = zaVar;
        this.d = yaVar;
        this.f6735b = i9;
    }
}
