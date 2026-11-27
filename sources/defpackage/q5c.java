package defpackage;
public final class q5c {
    public final z5c a;
    public final d6c b;

    public q5c(d6c d6cVar, z5c z5cVar) {
        this.b = d6cVar;
        this.a = z5cVar;
    }

    public final int a() {
        return this.b.s.w;
    }

    public final void b(boolean z) {
        d6c d6cVar = this.b;
        s5c s5cVar = d6cVar.n;
        if (z) {
            j79 adapter = s5cVar.getAdapter();
            z4b z4bVar = d6cVar.w;
            if (adapter != z4bVar) {
                s5cVar.setAdapter(z4bVar);
            } else {
                return;
            }
        } else {
            j79 adapter2 = s5cVar.getAdapter();
            c6c c6cVar = d6cVar.s;
            if (adapter2 != c6cVar) {
                s5cVar.setAdapter(c6cVar);
            } else {
                return;
            }
        }
        if (s5cVar.getAdapter().b() > 0) {
            d6cVar.r.h1(0, hl.L(58.0f) + (-s5cVar.getPaddingTop()) + d6cVar.F, false);
        }
    }
}
