package hi;

import java.util.List;
public final class h4 implements Runnable {
    public final int f14745a;
    public final k5 f14746b;

    public h4(k5 k5Var, int i7) {
        this.f14745a = i7;
        this.f14746b = k5Var;
    }

    @Override
    public final void run() {
        int e10;
        switch (this.f14745a) {
            case 0:
                tg.n1 n1Var = this.f14746b.N0;
                if (n1Var != null) {
                    n1Var.invalidate();
                    return;
                }
                return;
            case 1:
                new ug.y0((org.telegram.ui.ActionBar.g2) new bi.c9(this.f14746b, 5), 14, true).show();
                return;
            case 2:
                this.f14746b.w0(false);
                return;
            default:
                k5 k5Var = this.f14746b;
                boolean z10 = sg.k0.e(k5Var.f14894p1).f57310k;
                int i7 = 0;
                while (true) {
                    List list = sg.g.f57237c;
                    if (i7 < list.size()) {
                        sg.g gVar = (sg.g) list.get(i7);
                        if (z10) {
                            e10 = gVar.m();
                        } else {
                            e10 = gVar.e();
                        }
                        String n10 = gVar.n();
                        ai.c1 c1Var = new ai.c1(k5Var, gVar, e10, 16);
                        h5 h5Var = new h5(k5Var, k5Var.getContext());
                        h5Var.setIcon(e10);
                        h5Var.setText(n10);
                        h5Var.setSelected(false);
                        h5Var.setOnClickListener(new o4(c1Var, 0));
                        h5Var.setOnLongClickListener(new n4(k5Var, 0));
                        k5Var.f14900s1.a(h5Var, c8.ma.o(-1, 48));
                        i7++;
                    } else {
                        return;
                    }
                }
        }
    }
}
