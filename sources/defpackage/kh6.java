package defpackage;

import org.telegram.ui.Components.RadialProgressView;
public final class kh6 implements Runnable {
    public final byte a;
    public final k44 b;
    public final bh6 c;

    public kh6(byte b, k44 k44Var, bh6 bh6Var) {
        this.a = b;
        this.b = k44Var;
        this.c = bh6Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        bh6 bh6Var = this.c;
        k44 k44Var = this.b;
        switch (b) {
            case 0:
                int i = bh6.G;
                bh6Var.a();
                gm.d3(new kh6((byte) 1, k44Var, bh6Var), 150L);
                return;
            default:
                lh6 lh6Var = (lh6) k44Var.b;
                lh6Var.h(null);
                RadialProgressView radialProgressView = lh6Var.h0.O.d;
                RadialProgressView radialProgressView2 = bh6Var.h.d;
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
