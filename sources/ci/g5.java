package ci;

import java.util.List;
public final class g5 implements Runnable {
    public final int f4685a;
    public final r6 f4686b;

    public g5(r6 r6Var, int i10) {
        this.f4685a = i10;
        this.f4686b = r6Var;
    }

    @Override
    public final void run() {
        int e;
        switch (this.f4685a) {
            case 0:
                qg.z1 z1Var = this.f4686b.f5409d1;
                if (z1Var != null) {
                    z1Var.invalidate();
                    return;
                }
                return;
            case 1:
                new rg.x0((org.telegram.ui.ActionBar.n2) new ai.y3(this.f4686b, 3), 14, true).show();
                return;
            case 2:
                this.f4686b.z0(false);
                return;
            default:
                r6 r6Var = this.f4686b;
                boolean z10 = pg.s0.e(r6Var.F1).f40999k;
                int i10 = 0;
                while (true) {
                    List list = pg.l.f40907b;
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
                        r6Var.I1.a(o6Var, w7.x5.n(-1, 48));
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}
