package kh;

import java.util.List;
public final class x4 implements Runnable {
    public final int f16376a;
    public final g6 f16377b;

    public x4(g6 g6Var, int i9) {
        this.f16376a = i9;
        this.f16377b = g6Var;
    }

    @Override
    public final void run() {
        int e10;
        switch (this.f16376a) {
            case 0:
                yf.w1 w1Var = this.f16377b.Z0;
                if (w1Var != null) {
                    w1Var.invalidate();
                    return;
                }
                return;
            case 1:
                new zf.x0((org.telegram.ui.ActionBar.o2) new bg.i1(this.f16377b, 6), 14, true).show();
                return;
            case 2:
                this.f16377b.z0(false);
                return;
            default:
                g6 g6Var = this.f16377b;
                boolean z10 = xf.s0.e(g6Var.B1).f49366k;
                int i9 = 0;
                while (true) {
                    List list = xf.l.f49266b;
                    if (i9 < list.size()) {
                        xf.l lVar = (xf.l) list.get(i9);
                        if (z10) {
                            e10 = lVar.m();
                        } else {
                            e10 = lVar.e();
                        }
                        String n10 = lVar.n();
                        d5.i iVar = new d5.i(g6Var, lVar, e10, 13);
                        d6 d6Var = new d6(g6Var, g6Var.getContext());
                        d6Var.setIcon(e10);
                        d6Var.setText(n10);
                        d6Var.setSelected(false);
                        d6Var.setOnClickListener(new androidx.mediarouter.app.c(iVar, 28));
                        d6Var.setOnLongClickListener(new d5(g6Var, 0));
                        g6Var.E1.a(d6Var, g7.e6.n(-1, 48));
                        i9++;
                    } else {
                        return;
                    }
                }
        }
    }
}
