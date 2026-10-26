package fi;

import java.util.List;
import org.telegram.ui.Components.gb1;
public final class v4 implements Runnable {
    public final int f11818a;
    public final e6 f11819b;

    public v4(e6 e6Var, int i10) {
        this.f11818a = i10;
        this.f11819b = e6Var;
    }

    @Override
    public final void run() {
        int e;
        switch (this.f11818a) {
            case 0:
                sg.y1 y1Var = this.f11819b.S0;
                if (y1Var != null) {
                    y1Var.invalidate();
                    return;
                }
                return;
            case 1:
                new tg.y0((org.telegram.ui.ActionBar.r2) new bi.v4(this.f11819b, 4), 14, true).show();
                return;
            case 2:
                this.f11819b.w0(false);
                return;
            default:
                e6 e6Var = this.f11819b;
                boolean z10 = rg.s0.e(e6Var.f10817u1).f47550k;
                int i10 = 0;
                while (true) {
                    List list = rg.l.f47460b;
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
                        e6Var.f10823x1.a(b6Var, gb1.r(-1, 48));
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}
