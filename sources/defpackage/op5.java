package defpackage;
public final class op5 extends ni2 {
    public final n41 s;
    public lx6 w;
    public long x;
    public volatile boolean y;

    public op5(a83 a83Var, g83 g83Var, go4 go4Var, int i, Object obj, n41 n41Var) {
        super(a83Var, g83Var, 2, go4Var, i, obj, -9223372036854775807L, -9223372036854775807L, null);
        this.s = n41Var;
    }

    @Override
    public final void a() {
        boolean z;
        if (this.x == 0) {
            this.s.b(this.w, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            g83 b = this.b.b(this.x);
            c0b c0bVar = this.r;
            vb3 vb3Var = new vb3(c0bVar, b.e, c0bVar.open(b));
            while (!this.y) {
                int b2 = this.s.a.b(vb3Var, n41.s);
                boolean z2 = false;
                if (b2 != 1) {
                    z = true;
                } else {
                    z = false;
                }
                jte.p(z);
                if (b2 == 0) {
                    z2 = true;
                    continue;
                }
                if (!z2) {
                    break;
                }
            }
            this.x = vb3Var.d - this.b.e;
            this.s.a();
        } finally {
            wde.a(this.r);
        }
    }

    @Override
    public final void e() {
        this.y = true;
    }
}
