package bi;

import java.util.List;
public final class c6 implements Runnable {
    public final int f2412a;
    public final r7 f2413b;

    public c6(r7 r7Var, int i10) {
        this.f2412a = i10;
        this.f2413b = r7Var;
    }

    @Override
    public final void run() {
        int e;
        switch (this.f2412a) {
            case 0:
                pg.w1 w1Var = this.f2413b.f3505d1;
                if (w1Var != null) {
                    w1Var.invalidate();
                    return;
                }
                return;
            case 1:
                new qg.a1((org.telegram.ui.ActionBar.p2) new o1(this.f2413b, 1), 14, true).show();
                return;
            case 2:
                this.f2413b.z0(false);
                return;
            default:
                r7 r7Var = this.f2413b;
                boolean z10 = og.x0.e(r7Var.F1).f14559k;
                int i10 = 0;
                while (true) {
                    List list = og.l.f14414b;
                    if (i10 < list.size()) {
                        og.l lVar = (og.l) list.get(i10);
                        if (z10) {
                            e = lVar.m();
                        } else {
                            e = lVar.e();
                        }
                        String n10 = lVar.n();
                        g3 g3Var = new g3(r7Var, lVar, e, 2);
                        o7 o7Var = new o7(r7Var, r7Var.getContext());
                        o7Var.setIcon(e);
                        o7Var.setText(n10);
                        o7Var.setSelected(false);
                        o7Var.setOnClickListener(new ai.u(g3Var, 5));
                        o7Var.setOnLongClickListener(new l6(r7Var, 0));
                        r7Var.I1.a(o7Var, w7.a6.n(-1, 48));
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}
