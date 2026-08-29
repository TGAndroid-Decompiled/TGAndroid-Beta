package ih;

import android.view.View;
import jh.k7;
import org.telegram.ui.Cells.va;
import org.telegram.ui.Cells.wa;
public final class j2 implements View.OnLongClickListener {
    public final int f9249a = 0;
    public final int f9250b;
    public final Object f9251c;
    public final Object d;

    public j2(k7 k7Var, int i10, Runnable runnable) {
        this.f9251c = k7Var;
        this.f9250b = i10;
        this.d = runnable;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f9249a) {
            case 0:
                ((k7) this.f9251c).f(this.f9250b, true);
                ((Runnable) this.d).run();
                return true;
            default:
                return ((wa) this.f9251c).b(((va) this.d).h, this.f9250b);
        }
    }

    public j2(wa waVar, va vaVar, int i10) {
        this.f9251c = waVar;
        this.d = vaVar;
        this.f9250b = i10;
    }
}
