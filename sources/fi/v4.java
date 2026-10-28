package fi;

import java.util.List;
import org.telegram.ui.Components.kb1;
public final class v4 implements Runnable {
    public final int f11817a;
    public final e6 f11818b;

    public v4(e6 e6Var, int i10) {
        this.f11817a = i10;
        this.f11818b = e6Var;
    }

    @Override
    public final void run() {
        int e;
        switch (this.f11817a) {
            case 0:
                sg.x1 x1Var = this.f11818b.S0;
                if (x1Var != null) {
                    x1Var.invalidate();
                    return;
                }
                return;
            case 1:
                new tg.y0((org.telegram.ui.ActionBar.r2) new bi.v4(this.f11818b, 4), 14, true).show();
                return;
            case 2:
                this.f11818b.w0(false);
                return;
            default:
                e6 e6Var = this.f11818b;
                boolean z10 = rg.s0.e(e6Var.f10816u1).f47585k;
                int i10 = 0;
                while (true) {
                    List list = rg.l.f47495b;
                    if (i10 < list.size()) {
                        rg.l lVar = (rg.l) list.get(i10);
                        if (z10) {
                            e = lVar.m();
                        } else {
                            e = lVar.e();
                        }
                        String n10 = lVar.n();
                        ai.h0 h0Var = new ai.h0(e6Var, lVar, e, 12);
                        b6 b6Var = new b6(e6Var, e6Var.getContext());
                        b6Var.setIcon(e);
                        b6Var.setText(n10);
                        b6Var.setSelected(false);
                        b6Var.setOnClickListener(new ai.s(h0Var, 22));
                        b6Var.setOnLongClickListener(new b5(e6Var, 0));
                        e6Var.f10822x1.a(b6Var, kb1.r(-1, 48));
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}
