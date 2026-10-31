package jg;

import java.util.List;
import org.telegram.ui.Components.h01;
import w7.b6;
public final class n implements Runnable {
    public final int f10100a;
    public final r0 f10101b;

    public n(r0 r0Var, int i10) {
        this.f10100a = i10;
        this.f10101b = r0Var;
    }

    @Override
    public final void run() {
        int e;
        switch (this.f10100a) {
            case 0:
                r0 r0Var = this.f10101b;
                h01 h01Var = r0Var.J0;
                if (h01Var != null) {
                    r0Var.J0 = null;
                    r0Var.removeView(h01Var);
                    return;
                }
                return;
            case 1:
                r0 r0Var2 = this.f10101b;
                if (r0Var2.f10178n0 != null) {
                    r0Var2.f10182p0.postRunnable(new n(r0Var2, 3), 200L);
                    return;
                }
                return;
            case 2:
                d2 d2Var = this.f10101b.U0;
                if (d2Var != null) {
                    d2Var.invalidate();
                    return;
                }
                return;
            case 3:
                r0.Y(this.f10101b);
                return;
            default:
                r0 r0Var3 = this.f10101b;
                boolean z10 = ig.s0.e(r0Var3.f10201y1).f8458k;
                int i10 = 0;
                while (true) {
                    List list = ig.g.f8308c;
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
