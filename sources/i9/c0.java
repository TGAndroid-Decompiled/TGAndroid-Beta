package i9;
public final class c0 extends h {
    public final boolean o(w wVar) {
        b bVar;
        wVar.getClass();
        Object obj = this.f11917a;
        if (obj == null) {
            if (wVar.isDone()) {
                if (o.f11916f.b(this, null, o.j(wVar))) {
                    o.g(this, false);
                    return true;
                }
                return false;
            }
            e eVar = new e(this, wVar);
            if (o.f11916f.b(this, null, eVar)) {
                try {
                    wVar.a(eVar, q.f11920a);
                    return true;
                } catch (Throwable th2) {
                    try {
                        bVar = new b(th2);
                    } catch (Error | Exception unused) {
                        bVar = b.f11891b;
                    }
                    o.f11916f.b(this, eVar, bVar);
                    return true;
                }
            }
            obj = this.f11917a;
        }
        if (obj instanceof a) {
            wVar.cancel(((a) obj).f11888a);
        }
        return false;
    }
}
