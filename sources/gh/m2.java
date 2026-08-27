package gh;

import android.view.View;
import hh.m7;
import org.telegram.ui.Cells.va;
import org.telegram.ui.Cells.wa;

public final class m2 implements View.OnLongClickListener {

    public final int f7428a = 0;

    public final int f7429b;

    public final Object f7430c;
    public final Object d;

    public m2(m7 m7Var, int i10, Runnable runnable) {
        this.f7430c = m7Var;
        this.f7429b = i10;
        this.d = runnable;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f7428a) {
            case 0:
                m7 m7Var = (m7) this.f7430c;
                Runnable runnable = (Runnable) this.d;
                m7Var.f(this.f7429b, true);
                runnable.run();
                return true;
            default:
                wa waVar = (wa) this.f7430c;
                va vaVar = (va) this.d;
                return waVar.b(vaVar.h, this.f7429b);
        }
    }

    public m2(wa waVar, va vaVar, int i10) {
        this.f7430c = waVar;
        this.d = vaVar;
        this.f7429b = i10;
    }
}
