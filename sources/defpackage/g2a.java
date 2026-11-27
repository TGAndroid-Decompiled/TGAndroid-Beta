package defpackage;
public final class g2a extends d6 {
    public final s7 a;
    public final long b;
    public final h2a c;

    public g2a(h2a h2aVar, s7 s7Var, long j) {
        this.c = h2aVar;
        this.a = s7Var;
        this.b = j;
    }

    @Override
    public final void b(int i) {
        boolean w;
        b8 b8Var;
        b8 b8Var2;
        h2a h2aVar = this.c;
        axa axaVar = h2aVar.T1;
        if (i == 1) {
            fu5 fu5Var = h2aVar.Y1;
            if (fu5Var != null) {
                fu5Var.u();
            }
            fu5 G = fu5.G(h2aVar.c, h2aVar.J0, this.a);
            h2aVar.Y1 = G;
            long e = yac.h(h2aVar.a).e();
            long j = this.b;
            if (j == e) {
                w = true;
            } else if (j >= 0) {
                w = false;
            } else {
                w = xc2.w(5, uc7.s1(h2aVar.a).M0(Long.valueOf(-j)));
            }
            b8 b8Var3 = new b8(0, G.d, G.e, false, false);
            G.c(b8Var3);
            G.j();
            b8 g = G.g();
            g.setText(ob6.M0(2131750154, null));
            b8 g2 = G.g();
            g2.setText(ob6.M0(2131750158, null));
            b8 g3 = G.g();
            g3.setText(ob6.M0(2131750153, null));
            b8 g4 = G.g();
            g4.setText(ob6.M0(2131750155, null));
            if (w) {
                G.j();
                b8 g5 = G.g();
                g5.setText(ob6.M0(2131750160, null));
                b8 g6 = G.g();
                g6.setText(ob6.M0(2131750159, null));
                b8Var2 = g6;
                b8Var = g5;
            } else {
                b8Var = null;
                b8Var2 = null;
            }
            f2a f2aVar = new f2a(this, b8Var3, g, g2, g3, g4, w, b8Var, b8Var2);
            f2aVar.run();
            b8Var3.setOnClickListener(new jy8(this, f2aVar, (byte) 8));
            eu8.j(g, axaVar, f2aVar, 1);
            eu8.j(g2, axaVar, f2aVar, 2);
            eu8.j(g3, axaVar, f2aVar, 4);
            eu8.j(g4, axaVar, f2aVar, 8);
            if (w) {
                eu8.j(b8Var, axaVar, f2aVar, 256);
                eu8.j(b8Var2, axaVar, f2aVar, 512);
            }
            G.e0 = true;
            G.J = false;
            G.s = (short) 0;
            G.a0();
        } else if (i == -1) {
            h2aVar.dismiss();
        }
    }
}
