package bi;

import android.view.View;
import org.telegram.ui.Cells.ua;
import org.telegram.ui.Cells.va;
public final class i5 implements View.OnLongClickListener {
    public final int f3728a = 0;
    public final int f3729b;
    public final Object f3730c;
    public final Object d;

    public i5(di.p8 p8Var, int i7, Runnable runnable) {
        this.f3730c = p8Var;
        this.f3729b = i7;
        this.d = runnable;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f3728a) {
            case 0:
                ((di.p8) this.f3730c).g(this.f3729b, true);
                ((Runnable) this.d).run();
                return true;
            default:
                return ((va) this.f3730c).b(((ua) this.d).h, this.f3729b);
        }
    }

    public i5(va vaVar, ua uaVar, int i7) {
        this.f3730c = vaVar;
        this.d = uaVar;
        this.f3729b = i7;
    }
}
