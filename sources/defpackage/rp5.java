package defpackage;
public final class rp5 extends rh2 {
    public final o31 s;
    public lh2 w;
    public long x;
    public volatile boolean y;

    public rp5(h73 h73Var, n73 n73Var, ko4 ko4Var, int i, Object obj, o31 o31Var) {
        super(h73Var, n73Var, 2, ko4Var, i, obj, -9223372036854775807L, -9223372036854775807L, null);
        this.s = o31Var;
    }

    @Override
    public final void a() {
        boolean z;
        if (this.x == 0) {
            this.s.b(this.w, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            n73 b = this.b.b(this.x);
            b2b b2bVar = this.r;
            cb3 cb3Var = new cb3(b2bVar, b.e, b2bVar.open(b));
            while (!this.y) {
                int b2 = this.s.a.b(cb3Var, o31.s);
                boolean z2 = false;
                if (b2 != 1) {
                    z = true;
                } else {
                    z = false;
                }
                yve.p(z);
                if (b2 == 0) {
                    z2 = true;
                    continue;
                }
                if (!z2) {
                    break;
                }
            }
            this.x = cb3Var.d - this.b.e;
            this.s.a();
        } finally {
            lge.a(this.r);
        }
    }

    @Override
    public final void c() {
        this.y = true;
    }
}
