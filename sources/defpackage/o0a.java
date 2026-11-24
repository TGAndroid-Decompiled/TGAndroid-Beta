package defpackage;
public final class o0a extends c6 {
    public final r7 a;
    public final long b;
    public final p0a c;

    public o0a(p0a p0aVar, r7 r7Var, long j) {
        this.c = p0aVar;
        this.a = r7Var;
        this.b = j;
    }

    @Override
    public final void b(int i) {
        boolean w;
        a8 a8Var;
        a8 a8Var2;
        p0a p0aVar = this.c;
        ava avaVar = p0aVar.T1;
        if (i == 1) {
            bu5 bu5Var = p0aVar.Y1;
            if (bu5Var != null) {
                bu5Var.u();
            }
            bu5 G = bu5.G(p0aVar.c, p0aVar.J0, this.a);
            p0aVar.Y1 = G;
            long e = z8c.h(p0aVar.a).e();
            long j = this.b;
            if (j == e) {
                w = true;
            } else if (j >= 0) {
                w = false;
            } else {
                w = sd2.w(5, oc7.r1(p0aVar.a).L0(Long.valueOf(-j)));
            }
            a8 a8Var3 = new a8(0, G.d, G.e, false, false);
            G.c(a8Var3);
            G.j();
            a8 g = G.g();
            g.setText(jb6.M0(2131750128, null));
            a8 g2 = G.g();
            g2.setText(jb6.M0(2131750132, null));
            a8 g3 = G.g();
            g3.setText(jb6.M0(2131750127, null));
            a8 g4 = G.g();
            g4.setText(jb6.M0(2131750129, null));
            if (w) {
                G.j();
                a8 g5 = G.g();
                g5.setText(jb6.M0(2131750134, null));
                a8 g6 = G.g();
                g6.setText(jb6.M0(2131750133, null));
                a8Var2 = g6;
                a8Var = g5;
            } else {
                a8Var = null;
                a8Var2 = null;
            }
            n0a n0aVar = new n0a(this, a8Var3, g, g2, g3, g4, w, a8Var, a8Var2);
            n0aVar.run();
            a8Var3.setOnClickListener(new r39(this, n0aVar, (byte) 6));
            vs8.j(g, avaVar, n0aVar, 1);
            vs8.j(g2, avaVar, n0aVar, 2);
            vs8.j(g3, avaVar, n0aVar, 4);
            vs8.j(g4, avaVar, n0aVar, 8);
            if (w) {
                vs8.j(a8Var, avaVar, n0aVar, 256);
                vs8.j(a8Var2, avaVar, n0aVar, 512);
            }
            G.b0 = true;
            G.J = false;
            G.s = (short) 0;
            G.a0();
        } else if (i == -1) {
            p0aVar.dismiss();
        }
    }
}
