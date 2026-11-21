package bi;

import android.view.View;
import org.telegram.ui.Cells.ua;
import org.telegram.ui.Cells.va;
public final class j5 implements View.OnLongClickListener {
    public final int f3748a = 0;
    public final int f3749b;
    public final Object f3750c;
    public final Object d;

    public j5(di.p8 p8Var, int i7, Runnable runnable) {
        this.f3750c = p8Var;
        this.f3749b = i7;
        this.d = runnable;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f3748a) {
            case 0:
                ((di.p8) this.f3750c).g(this.f3749b, true);
                ((Runnable) this.d).run();
                return true;
            default:
                return ((va) this.f3750c).b(((ua) this.d).h, this.f3749b);
        }
    }

    public j5(va vaVar, ua uaVar, int i7) {
        this.f3750c = vaVar;
        this.d = uaVar;
        this.f3749b = i7;
    }
}
