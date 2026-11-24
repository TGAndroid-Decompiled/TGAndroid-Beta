package defpackage;
public final class r1c {
    public final a2c a;
    public final d2c b;

    public r1c(d2c d2cVar, a2c a2cVar) {
        this.b = d2cVar;
        this.a = a2cVar;
    }

    public final int a() {
        return this.b.s.w;
    }

    public final void b(boolean z) {
        d2c d2cVar = this.b;
        t1c t1cVar = d2cVar.n;
        if (z) {
            w39 adapter = t1cVar.getAdapter();
            c1b c1bVar = d2cVar.w;
            if (adapter != c1bVar) {
                t1cVar.setAdapter(c1bVar);
            } else {
                return;
            }
        } else {
            w39 adapter2 = t1cVar.getAdapter();
            c2c c2cVar = d2cVar.s;
            if (adapter2 != c2cVar) {
                t1cVar.setAdapter(c2cVar);
            } else {
                return;
            }
        }
        if (t1cVar.getAdapter().b() > 0) {
            d2cVar.r.h1(0, gl.L(58.0f) + (-t1cVar.getPaddingTop()) + d2cVar.F, false);
        }
    }
}
