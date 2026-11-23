package bi;

import android.view.View;
import org.telegram.ui.Cells.ua;
import org.telegram.ui.Cells.va;
public final class l5 implements View.OnLongClickListener {
    public final int f3804a = 0;
    public final int f3805b;
    public final Object f3806c;
    public final Object d;

    public l5(di.p8 p8Var, int i7, Runnable runnable) {
        this.f3806c = p8Var;
        this.f3805b = i7;
        this.d = runnable;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f3804a) {
            case 0:
                ((di.p8) this.f3806c).g(this.f3805b, true);
                ((Runnable) this.d).run();
                return true;
            default:
                return ((va) this.f3806c).b(((ua) this.d).h, this.f3805b);
        }
    }

    public l5(va vaVar, ua uaVar, int i7) {
        this.f3806c = vaVar;
        this.d = uaVar;
        this.f3805b = i7;
    }
}
