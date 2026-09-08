package di;

import java.util.List;
public final class g5 implements Runnable {
    public final int f7290a;
    public final q6 f7291b;

    public g5(q6 q6Var, int i10) {
        this.f7290a = i10;
        this.f7291b = q6Var;
    }

    @Override
    public final void run() {
        int e7;
        switch (this.f7290a) {
            case 0:
                rg.y1 y1Var = this.f7291b.f7986d1;
                if (y1Var != null) {
                    y1Var.invalidate();
                    return;
                }
                return;
            case 1:
                new sg.a1((org.telegram.ui.ActionBar.n2) new bi.l3(this.f7291b, 3), 14, true).show();
                return;
            case 2:
                this.f7291b.z0(false);
                return;
            default:
                q6 q6Var = this.f7291b;
                boolean z10 = qg.s0.e(q6Var.F1).f44602k;
                int i10 = 0;
                while (true) {
                    List list = qg.l.f44503b;
                    if (i10 < list.size()) {
                        qg.l lVar = (qg.l) list.get(i10);
                        if (z10) {
                            e7 = lVar.m();
                        } else {
                            e7 = lVar.e();
                        }
                        String n10 = lVar.n();
                        ah.p pVar = new ah.p(q6Var, lVar, e7, 6);
                        n6 n6Var = new n6(q6Var, q6Var.getContext());
                        n6Var.setIcon(e7);
                        n6Var.setText(n10);
                        n6Var.setSelected(false);
                        n6Var.setOnClickListener(new ah.h0(pVar, 11));
                        n6Var.setOnLongClickListener(new n5(q6Var, 0));
                        q6Var.I1.a(n6Var, w7.x5.n(-1, 48));
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}
