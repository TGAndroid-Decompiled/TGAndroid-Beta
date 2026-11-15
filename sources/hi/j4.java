package hi;

import java.util.List;
public final class j4 implements Runnable {
    public final int f14460a;
    public final m5 f14461b;

    public j4(m5 m5Var, int i7) {
        this.f14460a = i7;
        this.f14461b = m5Var;
    }

    @Override
    public final void run() {
        int e10;
        switch (this.f14460a) {
            case 0:
                tg.m1 m1Var = this.f14461b.N0;
                if (m1Var != null) {
                    m1Var.invalidate();
                    return;
                }
                return;
            case 1:
                new ug.x0((org.telegram.ui.ActionBar.e2) new bi.t6(this.f14461b, 5), 14, true).show();
                return;
            case 2:
                this.f14461b.w0(false);
                return;
            default:
                m5 m5Var = this.f14461b;
                boolean z10 = sg.k0.e(m5Var.f14683p1).f56695k;
                int i7 = 0;
                while (true) {
                    List list = sg.g.f56622c;
                    if (i7 < list.size()) {
                        sg.g gVar = (sg.g) list.get(i7);
                        if (z10) {
                            e10 = gVar.m();
                        } else {
                            e10 = gVar.e();
                        }
                        String n10 = gVar.n();
                        ai.z0 z0Var = new ai.z0(m5Var, gVar, e10, 15);
                        j5 j5Var = new j5(m5Var, m5Var.getContext());
                        j5Var.setIcon(e10);
                        j5Var.setText(n10);
                        j5Var.setSelected(false);
                        j5Var.setOnClickListener(new ah.d(z0Var, 29));
                        j5Var.setOnLongClickListener(new p4(m5Var, 0));
                        m5Var.f14689s1.a(j5Var, c8.ja.o(-1, 48));
                        i7++;
                    } else {
                        return;
                    }
                }
        }
    }
}
