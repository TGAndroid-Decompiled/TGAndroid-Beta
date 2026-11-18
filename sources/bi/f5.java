package bi;

import android.view.View;
import org.telegram.ui.Cells.ua;
import org.telegram.ui.Cells.va;
public final class f5 implements View.OnLongClickListener {
    public final int f3577a = 0;
    public final int f3578b;
    public final Object f3579c;
    public final Object d;

    public f5(di.o8 o8Var, int i7, Runnable runnable) {
        this.f3579c = o8Var;
        this.f3578b = i7;
        this.d = runnable;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f3577a) {
            case 0:
                ((di.o8) this.f3579c).g(this.f3578b, true);
                ((Runnable) this.d).run();
                return true;
            default:
                return ((va) this.f3579c).b(((ua) this.d).h, this.f3578b);
        }
    }

    public f5(va vaVar, ua uaVar, int i7) {
        this.f3579c = vaVar;
        this.d = uaVar;
        this.f3578b = i7;
    }
}
