package ai;

import android.view.View;
import ci.v8;
import org.telegram.ui.Cells.sa;
import org.telegram.ui.Cells.ta;
public final class i3 implements View.OnLongClickListener {
    public final int f709a = 0;
    public final int f710b;
    public final Object f711c;
    public final Object d;

    public i3(v8 v8Var, int i3, Runnable runnable) {
        this.f711c = v8Var;
        this.f710b = i3;
        this.d = runnable;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f709a) {
            case 0:
                ((v8) this.f711c).g(this.f710b, true);
                ((Runnable) this.d).run();
                return true;
            default:
                return ((ta) this.f711c).b(((sa) this.d).h, this.f710b);
        }
    }

    public i3(ta taVar, sa saVar, int i3) {
        this.f711c = taVar;
        this.d = saVar;
        this.f710b = i3;
    }
}
