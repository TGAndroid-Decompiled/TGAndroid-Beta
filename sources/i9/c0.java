package i9;
public final class c0 extends h {
    public final boolean o(w wVar) {
        b bVar;
        wVar.getClass();
        Object obj = this.f12072a;
        if (obj == null) {
            if (wVar.isDone()) {
                if (o.f12071f.b(this, null, o.j(wVar))) {
                    o.g(this, false);
                    return true;
                }
                return false;
            }
            e eVar = new e(this, wVar);
            if (o.f12071f.b(this, null, eVar)) {
                try {
                    wVar.a(eVar, q.f12075a);
                    return true;
                } catch (Throwable th2) {
                    try {
                        bVar = new b(th2);
                    } catch (Error | Exception unused) {
                        bVar = b.f12046b;
                    }
                    o.f12071f.b(this, eVar, bVar);
                    return true;
                }
            }
            obj = this.f12072a;
        }
        if (obj instanceof a) {
            wVar.cancel(((a) obj).f12043a);
        }
        return false;
    }
}
