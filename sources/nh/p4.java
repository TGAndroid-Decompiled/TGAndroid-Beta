package nh;

import java.util.List;
public final class p4 implements Runnable {
    public final int f18350a;
    public final t5 f18351b;

    public p4(t5 t5Var, int i10) {
        this.f18350a = i10;
        this.f18351b = t5Var;
    }

    @Override
    public final void run() {
        int e10;
        switch (this.f18350a) {
            case 0:
                bg.w2 w2Var = this.f18351b.Z0;
                if (w2Var != null) {
                    w2Var.invalidate();
                    return;
                }
                return;
            case 1:
                new cg.p1((org.telegram.ui.ActionBar.o2) new cg.z1(this.f18351b, 7), 14, true).show();
                return;
            case 2:
                this.f18351b.z0(false);
                return;
            default:
                t5 t5Var = this.f18351b;
                boolean z10 = ag.h1.e(t5Var.B1).f523k;
                int i10 = 0;
                while (true) {
                    List list = ag.l.f574b;
                    if (i10 < list.size()) {
                        ag.l lVar = (ag.l) list.get(i10);
                        if (z10) {
                            e10 = lVar.m();
                        } else {
                            e10 = lVar.e();
                        }
                        String n10 = lVar.n();
                        ag.v0 v0Var = new ag.v0(t5Var, lVar, e10, 15);
                        r5 r5Var = new r5(t5Var, t5Var.getContext());
                        r5Var.setIcon(e10);
                        r5Var.setText(n10);
                        r5Var.setSelected(false);
                        r5Var.setOnClickListener(new mh.n(v0Var, 4));
                        r5Var.setOnLongClickListener(new bg.g0(t5Var, 1));
                        t5Var.E1.a(r5Var, i7.f6.n(-1, 48));
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}
