package ci;

import java.util.List;
public final class g5 implements Runnable {
    public final int f4691a;
    public final r6 f4692b;

    public g5(r6 r6Var, int i10) {
        this.f4691a = i10;
        this.f4692b = r6Var;
    }

    @Override
    public final void run() {
        int e;
        switch (this.f4691a) {
            case 0:
                qg.x1 x1Var = this.f4692b.f5415d1;
                if (x1Var != null) {
                    x1Var.invalidate();
                    return;
                }
                return;
            case 1:
                new rg.x0((org.telegram.ui.ActionBar.n2) new ai.y3(this.f4692b, 3), 14, true).show();
                return;
            case 2:
                this.f4692b.z0(false);
                return;
            default:
                r6 r6Var = this.f4692b;
                boolean z10 = pg.u0.e(r6Var.F1).f41310k;
                int i10 = 0;
                while (true) {
                    List list = pg.l.f41192b;
                    if (i10 < list.size()) {
                        pg.l lVar = (pg.l) list.get(i10);
                        if (z10) {
                            e = lVar.m();
                        } else {
                            e = lVar.e();
                        }
                        String n10 = lVar.n();
                        ai.s1 s1Var = new ai.s1(r6Var, lVar, e, 5);
                        o6 o6Var = new o6(r6Var, r6Var.getContext());
                        o6Var.setIcon(e);
                        o6Var.setText(n10);
                        o6Var.setSelected(false);
                        o6Var.setOnClickListener(new ai.v0(s1Var, 10));
                        o6Var.setOnLongClickListener(new n5(r6Var, 0));
                        r6Var.I1.a(o6Var, w7.y5.n(-1, 48));
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}
