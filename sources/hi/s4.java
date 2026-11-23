package hi;

import java.util.List;
public final class s4 implements Runnable {
    public final int f15377a;
    public final v5 f15378b;

    public s4(v5 v5Var, int i7) {
        this.f15377a = i7;
        this.f15378b = v5Var;
    }

    @Override
    public final void run() {
        int e10;
        switch (this.f15377a) {
            case 0:
                tg.r1 r1Var = this.f15378b.N0;
                if (r1Var != null) {
                    r1Var.invalidate();
                    return;
                }
                return;
            case 1:
                new ug.y0((org.telegram.ui.ActionBar.g2) new bi.e9(this.f15378b, 5), 14, true).show();
                return;
            case 2:
                tg.r1 r1Var2 = this.f15378b.N0;
                if (r1Var2 != null) {
                    r1Var2.invalidate();
                    return;
                }
                return;
            case 3:
                this.f15378b.y0(false);
                return;
            default:
                v5 v5Var = this.f15378b;
                boolean z10 = sg.j0.e(v5Var.f15583p1).f57384k;
                int i7 = 0;
                while (true) {
                    List list = sg.g.f57331c;
                    if (i7 < list.size()) {
                        sg.g gVar = (sg.g) list.get(i7);
                        if (z10) {
                            e10 = gVar.m();
                        } else {
                            e10 = gVar.e();
                        }
                        String n10 = gVar.n();
                        ai.e1 e1Var = new ai.e1(v5Var, gVar, e10, 15);
                        s5 s5Var = new s5(v5Var, v5Var.getContext());
                        s5Var.setIcon(e10);
                        s5Var.setText(n10);
                        s5Var.setSelected(false);
                        s5Var.setOnClickListener(new z4(e1Var, 0));
                        s5Var.setOnLongClickListener(new y4(v5Var, 0));
                        v5Var.f15589s1.a(s5Var, c8.na.o(-1, 48));
                        i7++;
                    } else {
                        return;
                    }
                }
        }
    }
}
