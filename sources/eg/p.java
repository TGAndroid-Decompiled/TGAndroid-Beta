package eg;

import java.util.List;
import k7.c6;
import org.telegram.ui.Components.b11;
public final class p implements Runnable {
    public final int f5424a;
    public final c1 f5425b;

    public p(c1 c1Var, int i10) {
        this.f5424a = i10;
        this.f5425b = c1Var;
    }

    @Override
    public final void run() {
        int e6;
        switch (this.f5424a) {
            case 0:
                c1 c1Var = this.f5425b;
                b11 b11Var = c1Var.X0;
                if (b11Var != null) {
                    c1Var.X0 = null;
                    c1Var.removeView(b11Var);
                    return;
                }
                return;
            case 1:
                c1 c1Var2 = this.f5425b;
                if (c1Var2.B0 != null) {
                    c1Var2.D0.postRunnable(new p(c1Var2, 3), 200L);
                    return;
                }
                return;
            case 2:
                r2 r2Var = this.f5425b.f5116i1;
                if (r2Var != null) {
                    r2Var.invalidate();
                    return;
                }
                return;
            case 3:
                c1.a0(this.f5425b);
                return;
            default:
                c1 c1Var3 = this.f5425b;
                boolean z4 = dg.e1.e(c1Var3.M1).f4522k;
                int i10 = 0;
                while (true) {
                    List list = dg.l.f4576b;
                    if (i10 < list.size()) {
                        dg.l lVar = (dg.l) list.get(i10);
                        if (z4) {
                            e6 = lVar.m();
                        } else {
                            e6 = lVar.e();
                        }
                        String n10 = lVar.n();
                        bh.a aVar = new bh.a(c1Var3, lVar, e6, 3);
                        a1 a1Var = new a1(c1Var3, c1Var3.getContext());
                        a1Var.setIcon(e6);
                        a1Var.setText(n10);
                        a1Var.setSelected(false);
                        a1Var.setOnClickListener(new androidx.mediarouter.app.c(aVar, 2));
                        a1Var.setOnLongClickListener(new d0(c1Var3, 0));
                        c1Var3.P1.a(a1Var, c6.n(-1, 48));
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}
