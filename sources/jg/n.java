package jg;

import java.util.List;
import org.telegram.ui.Components.i01;
import w7.b6;
public final class n implements Runnable {
    public final int f10101a;
    public final r0 f10102b;

    public n(r0 r0Var, int i10) {
        this.f10101a = i10;
        this.f10102b = r0Var;
    }

    @Override
    public final void run() {
        int e;
        switch (this.f10101a) {
            case 0:
                r0 r0Var = this.f10102b;
                i01 i01Var = r0Var.J0;
                if (i01Var != null) {
                    r0Var.J0 = null;
                    r0Var.removeView(i01Var);
                    return;
                }
                return;
            case 1:
                r0 r0Var2 = this.f10102b;
                if (r0Var2.f10179n0 != null) {
                    r0Var2.f10183p0.postRunnable(new n(r0Var2, 3), 200L);
                    return;
                }
                return;
            case 2:
                d2 d2Var = this.f10102b.U0;
                if (d2Var != null) {
                    d2Var.invalidate();
                    return;
                }
                return;
            case 3:
                r0.Y(this.f10102b);
                return;
            default:
                r0 r0Var3 = this.f10102b;
                boolean z10 = ig.s0.e(r0Var3.f10202y1).f8459k;
                int i10 = 0;
                while (true) {
                    List list = ig.g.f8309c;
                    if (i10 < list.size()) {
                        ig.g gVar = (ig.g) list.get(i10);
                        if (z10) {
                            e = gVar.m();
                        } else {
                            e = gVar.e();
                        }
                        String n10 = gVar.n();
                        ag.o0 o0Var = new ag.o0(r0Var3, gVar, e, 7);
                        p0 p0Var = new p0(r0Var3, r0Var3.getContext());
                        p0Var.setIcon(e);
                        p0Var.setText(n10);
                        p0Var.setSelected(false);
                        p0Var.setOnClickListener(new ag.g(o0Var, 9));
                        p0Var.setOnLongClickListener(new bi.h1(r0Var3, 4));
                        r0Var3.B1.a(p0Var, b6.o(-1, 48));
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}
