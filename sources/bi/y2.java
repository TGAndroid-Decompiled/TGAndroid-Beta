package bi;

import android.view.View;
import di.l8;
import org.telegram.ui.Cells.sa;
import org.telegram.ui.Cells.ta;
public final class y2 implements View.OnLongClickListener {
    public final int f4012a = 0;
    public final int f4013b;
    public final Object f4014c;
    public final Object d;

    public y2(l8 l8Var, int i7, Runnable runnable) {
        this.f4014c = l8Var;
        this.f4013b = i7;
        this.d = runnable;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f4012a) {
            case 0:
                ((l8) this.f4014c).g(this.f4013b, true);
                ((Runnable) this.d).run();
                return true;
            default:
                return ((ta) this.f4014c).b(((sa) this.d).h, this.f4013b);
        }
    }

    public y2(ta taVar, sa saVar, int i7) {
        this.f4014c = taVar;
        this.d = saVar;
        this.f4013b = i7;
    }
}
