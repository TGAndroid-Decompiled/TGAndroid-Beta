package defpackage;
public final class r3c {
    public final a4c a;
    public final d4c b;

    public r3c(d4c d4cVar, a4c a4cVar) {
        this.b = d4cVar;
        this.a = a4cVar;
    }

    public final int a() {
        return this.b.s.w;
    }

    public final void b(boolean z) {
        d4c d4cVar = this.b;
        t3c t3cVar = d4cVar.n;
        if (z) {
            y59 adapter = t3cVar.getAdapter();
            e3b e3bVar = d4cVar.w;
            if (adapter != e3bVar) {
                t3cVar.setAdapter(e3bVar);
            } else {
                return;
            }
        } else {
            y59 adapter2 = t3cVar.getAdapter();
            c4c c4cVar = d4cVar.s;
            if (adapter2 != c4cVar) {
                t3cVar.setAdapter(c4cVar);
            } else {
                return;
            }
        }
        if (t3cVar.getAdapter().b() > 0) {
            d4cVar.r.h1(0, gm.L(58.0f) + (-t3cVar.getPaddingTop()) + d4cVar.F, false);
        }
    }
}
