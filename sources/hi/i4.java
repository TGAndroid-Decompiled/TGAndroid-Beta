package hi;

import java.util.List;
public final class i4 implements Runnable {
    public final int f14718a;
    public final l5 f14719b;

    public i4(l5 l5Var, int i7) {
        this.f14718a = i7;
        this.f14719b = l5Var;
    }

    @Override
    public final void run() {
        int e10;
        switch (this.f14718a) {
            case 0:
                tg.n1 n1Var = this.f14719b.N0;
                if (n1Var != null) {
                    n1Var.invalidate();
                    return;
                }
                return;
            case 1:
                new ug.y0((org.telegram.ui.ActionBar.g2) new bi.e9(this.f14719b, 5), 14, true).show();
                return;
            case 2:
                this.f14719b.w0(false);
                return;
            default:
                l5 l5Var = this.f14719b;
                boolean z10 = sg.k0.e(l5Var.f14909p1).f57279k;
                int i7 = 0;
                while (true) {
                    List list = sg.g.f57206c;
                    if (i7 < list.size()) {
                        sg.g gVar = (sg.g) list.get(i7);
                        if (z10) {
                            e10 = gVar.m();
                        } else {
                            e10 = gVar.e();
                        }
                        String n10 = gVar.n();
                        ai.d1 d1Var = new ai.d1(l5Var, gVar, e10, 15);
                        i5 i5Var = new i5(l5Var, l5Var.getContext());
                        i5Var.setIcon(e10);
                        i5Var.setText(n10);
                        i5Var.setSelected(false);
                        i5Var.setOnClickListener(new p4(d1Var, 0));
                        i5Var.setOnLongClickListener(new o4(l5Var, 0));
                        l5Var.f14915s1.a(i5Var, c8.na.o(-1, 48));
                        i7++;
                    } else {
                        return;
                    }
                }
        }
    }
}
