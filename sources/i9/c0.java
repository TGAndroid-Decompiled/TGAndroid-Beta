package i9;
public final class c0 extends h {
    public final boolean o(w wVar) {
        b bVar;
        wVar.getClass();
        Object obj = this.f11048a;
        if (obj == null) {
            if (wVar.isDone()) {
                if (o.f11047f.b(this, null, o.j(wVar))) {
                    o.g(this, false);
                    return true;
                }
                return false;
            }
            e eVar = new e(this, wVar);
            if (o.f11047f.b(this, null, eVar)) {
                try {
                    wVar.a(eVar, q.f11051a);
                    return true;
                } catch (Throwable th2) {
                    try {
                        bVar = new b(th2);
                    } catch (Error | Exception unused) {
                        bVar = b.f11025b;
                    }
                    o.f11047f.b(this, eVar, bVar);
                    return true;
                }
            }
            obj = this.f11048a;
        }
        if (obj instanceof a) {
            wVar.cancel(((a) obj).f11022a);
        }
        return false;
    }
}
