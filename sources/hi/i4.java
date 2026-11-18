package hi;

import java.util.List;
public final class i4 implements Runnable {
    public final int f14758a;
    public final l5 f14759b;

    public i4(l5 l5Var, int i7) {
        this.f14758a = i7;
        this.f14759b = l5Var;
    }

    @Override
    public final void run() {
        int e10;
        switch (this.f14758a) {
            case 0:
                tg.m1 m1Var = this.f14759b.N0;
                if (m1Var != null) {
                    m1Var.invalidate();
                    return;
                }
                return;
            case 1:
                new ug.z0((org.telegram.ui.ActionBar.h2) new bi.y8(this.f14759b, 5), 14, true).show();
                return;
            case 2:
                this.f14759b.w0(false);
                return;
            default:
                l5 l5Var = this.f14759b;
                boolean z10 = sg.k0.e(l5Var.f14919p1).f57269k;
                int i7 = 0;
                while (true) {
                    List list = sg.g.f57196c;
                    if (i7 < list.size()) {
                        sg.g gVar = (sg.g) list.get(i7);
                        if (z10) {
                            e10 = gVar.m();
                        } else {
                            e10 = gVar.e();
                        }
                        String n10 = gVar.n();
                        ai.a1 a1Var = new ai.a1(l5Var, gVar, e10, 16);
                        i5 i5Var = new i5(l5Var, l5Var.getContext());
                        i5Var.setIcon(e10);
                        i5Var.setText(n10);
                        i5Var.setSelected(false);
                        i5Var.setOnClickListener(new o0(a1Var, 1));
                        i5Var.setOnLongClickListener(new o4(l5Var, 0));
                        l5Var.f14925s1.a(i5Var, c8.ma.o(-1, 48));
                        i7++;
                    } else {
                        return;
                    }
                }
        }
    }
}
