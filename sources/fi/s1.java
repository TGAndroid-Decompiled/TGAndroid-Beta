package fi;

import android.view.View;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.m60;
public final class s1 implements View.OnLongClickListener {
    public final int f12303a;
    public final b4 f12304b;

    public s1(b4 b4Var, int i7) {
        this.f12303a = i7;
        this.f12304b = b4Var;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i7 = this.f12303a;
        boolean z10 = false;
        b4 b4Var = this.f12304b;
        switch (i7) {
            case 0:
                if (b4Var.B0(true)) {
                    return false;
                }
                m60 F = m60.F(b4Var.f11522t0.f11879w, b4Var.f11493l0, view);
                F.c(2131232117, hd.M0(2131748810, null), new t1(b4Var, 6), false);
                if (b4Var.f11533v3 > 0) {
                    z10 = true;
                }
                F.l(2131231786, hd.M0(2131748809, null), new t1(b4Var, 7), z10);
                F.V(5);
                F.U = true;
                F.Z();
                return true;
            default:
                b4Var.f11530v0.k(b4Var.B0(false));
                return true;
        }
    }
}
