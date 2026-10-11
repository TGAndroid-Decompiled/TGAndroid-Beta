package ci;

import java.util.List;
public final class e5 implements Runnable {
    public final int f5026a;
    public final q6 f5027b;

    public e5(q6 q6Var, int i10) {
        this.f5026a = i10;
        this.f5027b = q6Var;
    }

    @Override
    public final void run() {
        int e7;
        switch (this.f5026a) {
            case 0:
                qg.w1 w1Var = this.f5027b.f5794d1;
                if (w1Var != null) {
                    w1Var.invalidate();
                    return;
                }
                return;
            case 1:
                new rg.y0((org.telegram.ui.ActionBar.m2) new ai.z3(this.f5027b, 3), 14, true).show();
                return;
            case 2:
                this.f5027b.y0(false);
                return;
            default:
                q6 q6Var = this.f5027b;
                boolean z10 = pg.u0.e(q6Var.F1).f45876k;
                int i10 = 0;
                while (true) {
                    List list = pg.l.f45748b;
                    if (i10 < list.size()) {
                        pg.l lVar = (pg.l) list.get(i10);
                        if (z10) {
                            e7 = lVar.m();
                        } else {
                            e7 = lVar.e();
                        }
                        String n10 = lVar.n();
                        ai.s1 s1Var = new ai.s1(q6Var, lVar, e7, 5);
                        n6 n6Var = new n6(q6Var, q6Var.getContext());
                        n6Var.setIcon(e7);
                        n6Var.setText(n10);
                        n6Var.setSelected(false);
                        n6Var.setOnClickListener(new ai.v0(s1Var, 10));
                        n6Var.setOnLongClickListener(new l5(q6Var, 0));
                        q6Var.I1.a(n6Var, w7.x5.n(-1, 48));
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}
