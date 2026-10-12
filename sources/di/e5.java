package di;

import java.util.List;
public final class e5 implements Runnable {
    public final int f6891a;
    public final o6 f6892b;

    public e5(o6 o6Var, int i10) {
        this.f6891a = i10;
        this.f6892b = o6Var;
    }

    @Override
    public final void run() {
        int e;
        switch (this.f6891a) {
            case 0:
                rg.y1 y1Var = this.f6892b.f7517d1;
                if (y1Var != null) {
                    y1Var.invalidate();
                    return;
                }
                return;
            case 1:
                new sg.y0((org.telegram.ui.ActionBar.m2) new bi.o3(this.f6892b, 3), 14, true).show();
                return;
            case 2:
                this.f6892b.y0(false);
                return;
            default:
                o6 o6Var = this.f6892b;
                boolean z10 = qg.s0.e(o6Var.F1).f43572k;
                int i10 = 0;
                while (true) {
                    List list = qg.l.f43480b;
                    if (i10 < list.size()) {
                        qg.l lVar = (qg.l) list.get(i10);
                        if (z10) {
                            e = lVar.m();
                        } else {
                            e = lVar.e();
                        }
                        String n10 = lVar.n();
                        ah.o oVar = new ah.o(o6Var, lVar, e, 6);
                        l6 l6Var = new l6(o6Var, o6Var.getContext());
                        l6Var.setIcon(e);
                        l6Var.setText(n10);
                        l6Var.setSelected(false);
                        l6Var.setOnClickListener(new ah.g0(oVar, 11));
                        l6Var.setOnLongClickListener(new l5(o6Var, 0));
                        o6Var.I1.a(l6Var, w7.a6.n(-1, 48));
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}
