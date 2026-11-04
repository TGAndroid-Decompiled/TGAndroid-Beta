package gi;

import b8.mf;
import java.util.List;
public final class j4 implements Runnable {
    public final int f13006a;
    public final m5 f13007b;

    public j4(m5 m5Var, int i3) {
        this.f13006a = i3;
        this.f13007b = m5Var;
    }

    @Override
    public final void run() {
        int e10;
        switch (this.f13006a) {
            case 0:
                ug.l1 l1Var = this.f13007b.N0;
                if (l1Var != null) {
                    l1Var.invalidate();
                    return;
                }
                return;
            case 1:
                new vg.v0((org.telegram.ui.ActionBar.d2) new ai.c7(this.f13007b, 5), 14, true).show();
                return;
            case 2:
                this.f13007b.w0(false);
                return;
            default:
                m5 m5Var = this.f13007b;
                boolean z10 = tg.k0.e(m5Var.f13222p1).f55237k;
                int i3 = 0;
                while (true) {
                    List list = tg.g.f55164c;
                    if (i3 < list.size()) {
                        tg.g gVar = (tg.g) list.get(i3);
                        if (z10) {
                            e10 = gVar.m();
                        } else {
                            e10 = gVar.e();
                        }
                        String n4 = gVar.n();
                        ai.e3 e3Var = new ai.e3(m5Var, gVar, e10, 13);
                        j5 j5Var = new j5(m5Var, m5Var.getContext());
                        j5Var.setIcon(e10);
                        j5Var.setText(n4);
                        j5Var.setSelected(false);
                        j5Var.setOnClickListener(new ai.b(e3Var, 26));
                        j5Var.setOnLongClickListener(new p4(m5Var, 0));
                        m5Var.f13228s1.a(j5Var, mf.o(-1, 48));
                        i3++;
                    } else {
                        return;
                    }
                }
        }
    }
}
