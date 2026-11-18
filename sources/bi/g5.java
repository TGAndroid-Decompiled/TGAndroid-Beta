package bi;

import android.view.View;
import org.telegram.ui.Cells.ta;
import org.telegram.ui.Cells.ua;
public final class g5 implements View.OnLongClickListener {
    public final int f3650a = 0;
    public final int f3651b;
    public final Object f3652c;
    public final Object d;

    public g5(di.o8 o8Var, int i7, Runnable runnable) {
        this.f3652c = o8Var;
        this.f3651b = i7;
        this.d = runnable;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f3650a) {
            case 0:
                ((di.o8) this.f3652c).g(this.f3651b, true);
                ((Runnable) this.d).run();
                return true;
            default:
                return ((ua) this.f3652c).b(((ta) this.d).h, this.f3651b);
        }
    }

    public g5(ua uaVar, ta taVar, int i7) {
        this.f3652c = uaVar;
        this.d = taVar;
        this.f3651b = i7;
    }
}
