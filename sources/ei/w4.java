package ei;

import java.util.List;
public final class w4 implements Runnable {
    public final int f10056a;
    public final f6 f10057b;

    public w4(f6 f6Var, int i10) {
        this.f10056a = i10;
        this.f10057b = f6Var;
    }

    @Override
    public final void run() {
        int e;
        switch (this.f10056a) {
            case 0:
                rg.x1 x1Var = this.f10057b.f9015d1;
                if (x1Var != null) {
                    x1Var.invalidate();
                    return;
                }
                return;
            case 1:
                new sg.y0((org.telegram.ui.ActionBar.o2) new ai.a5(this.f10057b, 4), 14, true).show();
                return;
            case 2:
                this.f10057b.x0(false);
                return;
            default:
                f6 f6Var = this.f10057b;
                boolean z10 = qg.u0.e(f6Var.F1).f45097k;
                int i10 = 0;
                while (true) {
                    List list = qg.l.f44973b;
                    if (i10 < list.size()) {
                        qg.l lVar = (qg.l) list.get(i10);
                        if (z10) {
                            e = lVar.m();
                        } else {
                            e = lVar.e();
                        }
                        String n10 = lVar.n();
                        ah.o oVar = new ah.o(f6Var, lVar, e, 11);
                        c6 c6Var = new c6(f6Var, f6Var.getContext());
                        c6Var.setIcon(e);
                        c6Var.setText(n10);
                        c6Var.setSelected(false);
                        c6Var.setOnClickListener(new ah.g0(oVar, 21));
                        c6Var.setOnLongClickListener(new c5(f6Var, 0));
                        f6Var.I1.a(c6Var, w7.z5.n(-1, 48));
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}
