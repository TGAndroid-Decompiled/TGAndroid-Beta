package ci;

import java.util.List;
public final class f5 implements Runnable {
    public final int f4674a;
    public final q6 f4675b;

    public f5(q6 q6Var, int i10) {
        this.f4674a = i10;
        this.f4675b = q6Var;
    }

    @Override
    public final void run() {
        int e;
        switch (this.f4674a) {
            case 0:
                qg.z1 z1Var = this.f4675b.f5336d1;
                if (z1Var != null) {
                    z1Var.invalidate();
                    return;
                }
                return;
            case 1:
                new rg.x0((org.telegram.ui.ActionBar.n2) new ai.y3(this.f4675b, 3), 14, true).show();
                return;
            case 2:
                this.f4675b.z0(false);
                return;
            default:
                q6 q6Var = this.f4675b;
                boolean z10 = pg.t0.e(q6Var.F1).f40959k;
                int i10 = 0;
                while (true) {
                    List list = pg.l.f40847b;
                    if (i10 < list.size()) {
                        pg.l lVar = (pg.l) list.get(i10);
                        if (z10) {
                            e = lVar.m();
                        } else {
                            e = lVar.e();
                        }
                        String n10 = lVar.n();
                        ai.s1 s1Var = new ai.s1(q6Var, lVar, e, 5);
                        n6 n6Var = new n6(q6Var, q6Var.getContext());
                        n6Var.setIcon(e);
                        n6Var.setText(n10);
                        n6Var.setSelected(false);
                        n6Var.setOnClickListener(new ai.v0(s1Var, 10));
                        n6Var.setOnLongClickListener(new m5(q6Var, 0));
                        q6Var.I1.a(n6Var, w7.x5.n(-1, 48));
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}
