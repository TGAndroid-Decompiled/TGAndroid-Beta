package ci;

import java.util.List;
public final class f5 implements Runnable {
    public final int f4697a;
    public final q6 f4698b;

    public f5(q6 q6Var, int i10) {
        this.f4697a = i10;
        this.f4698b = q6Var;
    }

    @Override
    public final void run() {
        int e;
        switch (this.f4697a) {
            case 0:
                qg.w1 w1Var = this.f4698b.f5340d1;
                if (w1Var != null) {
                    w1Var.invalidate();
                    return;
                }
                return;
            case 1:
                new rg.x0((org.telegram.ui.ActionBar.o2) new ai.y3(this.f4698b, 3), 14, true).show();
                return;
            case 2:
                this.f4698b.z0(false);
                return;
            default:
                q6 q6Var = this.f4698b;
                boolean z10 = pg.u0.e(q6Var.F1).f41279k;
                int i10 = 0;
                while (true) {
                    List list = pg.l.f41160b;
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
                        q6Var.I1.a(n6Var, w7.y5.n(-1, 48));
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}
