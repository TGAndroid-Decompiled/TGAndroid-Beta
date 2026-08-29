package bg;

import i7.f6;
import java.util.List;
import org.telegram.ui.Components.p01;
public final class r implements Runnable {
    public final int f2465a;
    public final g1 f2466b;

    public r(g1 g1Var, int i10) {
        this.f2465a = i10;
        this.f2466b = g1Var;
    }

    @Override
    public final void run() {
        int e10;
        switch (this.f2465a) {
            case 0:
                g1 g1Var = this.f2466b;
                p01 p01Var = g1Var.W0;
                if (p01Var != null) {
                    g1Var.W0 = null;
                    g1Var.removeView(p01Var);
                    return;
                }
                return;
            case 1:
                g1 g1Var2 = this.f2466b;
                if (g1Var2.A0 != null) {
                    g1Var2.C0.postRunnable(new r(g1Var2, 3), 200L);
                    return;
                }
                return;
            case 2:
                w2 w2Var = this.f2466b.f2237h1;
                if (w2Var != null) {
                    w2Var.invalidate();
                    return;
                }
                return;
            case 3:
                g1.a0(this.f2466b);
                return;
            default:
                g1 g1Var3 = this.f2466b;
                boolean z10 = ag.h1.e(g1Var3.L1).f523k;
                int i10 = 0;
                while (true) {
                    List list = ag.l.f574b;
                    if (i10 < list.size()) {
                        ag.l lVar = (ag.l) list.get(i10);
                        if (z10) {
                            e10 = lVar.m();
                        } else {
                            e10 = lVar.e();
                        }
                        String n10 = lVar.n();
                        ag.v0 v0Var = new ag.v0(g1Var3, lVar, e10, 1);
                        e1 e1Var = new e1(g1Var3, g1Var3.getContext());
                        e1Var.setIcon(e10);
                        e1Var.setText(n10);
                        e1Var.setSelected(false);
                        e1Var.setOnClickListener(new ag.o(v0Var, 2));
                        e1Var.setOnLongClickListener(new g0(g1Var3, 0));
                        g1Var3.O1.a(e1Var, f6.n(-1, 48));
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}
