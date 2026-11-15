package bi;

import android.view.View;
import di.m8;
import org.telegram.ui.Cells.sa;
import org.telegram.ui.Cells.ta;
public final class y2 implements View.OnLongClickListener {
    public final int f4009a = 0;
    public final int f4010b;
    public final Object f4011c;
    public final Object d;

    public y2(m8 m8Var, int i7, Runnable runnable) {
        this.f4011c = m8Var;
        this.f4010b = i7;
        this.d = runnable;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f4009a) {
            case 0:
                ((m8) this.f4011c).g(this.f4010b, true);
                ((Runnable) this.d).run();
                return true;
            default:
                return ((ta) this.f4011c).b(((sa) this.d).h, this.f4010b);
        }
    }

    public y2(ta taVar, sa saVar, int i7) {
        this.f4011c = taVar;
        this.d = saVar;
        this.f4010b = i7;
    }
}
