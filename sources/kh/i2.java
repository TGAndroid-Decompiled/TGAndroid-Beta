package kh;

import android.view.View;
import lh.l7;
import org.telegram.ui.Cells.xa;
import org.telegram.ui.Cells.ya;
public final class i2 implements View.OnLongClickListener {
    public final int f10775a = 0;
    public final int f10776b;
    public final Object f10777c;
    public final Object d;

    public i2(l7 l7Var, int i10, Runnable runnable) {
        this.f10777c = l7Var;
        this.f10776b = i10;
        this.d = runnable;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f10775a) {
            case 0:
                ((l7) this.f10777c).f(this.f10776b, true);
                ((Runnable) this.d).run();
                return true;
            default:
                return ((ya) this.f10777c).b(((xa) this.d).h, this.f10776b);
        }
    }

    public i2(ya yaVar, xa xaVar, int i10) {
        this.f10777c = yaVar;
        this.d = xaVar;
        this.f10776b = i10;
    }
}
