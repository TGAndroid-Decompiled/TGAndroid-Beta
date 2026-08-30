package dg;

import java.util.List;
import k7.b6;
import org.telegram.ui.Components.a11;
public final class q implements Runnable {
    public final int f4723a;
    public final e1 f4724b;

    public q(e1 e1Var, int i10) {
        this.f4723a = i10;
        this.f4724b = e1Var;
    }

    @Override
    public final void run() {
        int e;
        switch (this.f4723a) {
            case 0:
                e1 e1Var = this.f4724b;
                a11 a11Var = e1Var.X0;
                if (a11Var != null) {
                    e1Var.X0 = null;
                    e1Var.removeView(a11Var);
                    return;
                }
                return;
            case 1:
                e1 e1Var2 = this.f4724b;
                if (e1Var2.B0 != null) {
                    e1Var2.D0.postRunnable(new q(e1Var2, 3), 200L);
                    return;
                }
                return;
            case 2:
                t2 t2Var = this.f4724b.f4473i1;
                if (t2Var != null) {
                    t2Var.invalidate();
                    return;
                }
                return;
            case 3:
                e1.a0(this.f4724b);
                return;
            default:
                e1 e1Var3 = this.f4724b;
                boolean z4 = cg.f1.e(e1Var3.M1).f2399k;
                int i10 = 0;
                while (true) {
                    List list = cg.l.f2442b;
                    if (i10 < list.size()) {
                        cg.l lVar = (cg.l) list.get(i10);
                        if (z4) {
                            e = lVar.m();
                        } else {
                            e = lVar.e();
                        }
                        String n10 = lVar.n();
                        ah.a aVar = new ah.a(e1Var3, lVar, e, 2);
                        c1 c1Var = new c1(e1Var3, e1Var3.getContext());
                        c1Var.setIcon(e);
                        c1Var.setText(n10);
                        c1Var.setSelected(false);
                        c1Var.setOnClickListener(new androidx.mediarouter.app.c(aVar, 2));
                        c1Var.setOnLongClickListener(new f0(e1Var3, 0));
                        e1Var3.P1.a(c1Var, b6.n(-1, 48));
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}
