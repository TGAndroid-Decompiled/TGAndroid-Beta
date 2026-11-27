package defpackage;

import org.telegram.ui.Components.RadialProgressView;
public final class oh6 implements Runnable {
    public final byte a;
    public final v34 b;
    public final eh6 c;

    public oh6(byte b, v34 v34Var, eh6 eh6Var) {
        this.a = b;
        this.b = v34Var;
        this.c = eh6Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        eh6 eh6Var = this.c;
        v34 v34Var = this.b;
        switch (b) {
            case 0:
                int i = eh6.G;
                eh6Var.a();
                hl.d3(new oh6((byte) 1, v34Var, eh6Var), 150L);
                return;
            default:
                ph6 ph6Var = (ph6) v34Var.b;
                ph6Var.h(null);
                RadialProgressView radialProgressView = ph6Var.h0.O.d;
                RadialProgressView radialProgressView2 = eh6Var.h.d;
                radialProgressView.getClass();
                radialProgressView.a = radialProgressView2.a;
                radialProgressView.b = radialProgressView2.b;
                radialProgressView.I = radialProgressView2.I;
                radialProgressView.J = radialProgressView2.J;
                radialProgressView.K = radialProgressView2.K;
                radialProgressView.c = radialProgressView2.c;
                radialProgressView.n = radialProgressView2.n;
                radialProgressView.e = radialProgressView2.e;
                radialProgressView.E = radialProgressView2.E;
                radialProgressView.G = radialProgressView2.G;
                radialProgressView.H = radialProgressView2.H;
                radialProgressView.d = radialProgressView2.d;
                radialProgressView.F = radialProgressView2.F;
                radialProgressView.b(85L);
                return;
        }
    }
}
