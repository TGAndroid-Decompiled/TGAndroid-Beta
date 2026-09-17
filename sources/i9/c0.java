package i9;
public final class c0 extends h {
    public final boolean o(w wVar) {
        b bVar;
        wVar.getClass();
        Object obj = this.f11943a;
        if (obj == null) {
            if (wVar.isDone()) {
                if (o.f11942f.b(this, null, o.j(wVar))) {
                    o.g(this, false);
                    return true;
                }
                return false;
            }
            e eVar = new e(this, wVar);
            if (o.f11942f.b(this, null, eVar)) {
                try {
                    wVar.a(eVar, q.f11946a);
                    return true;
                } catch (Throwable th2) {
                    try {
                        bVar = new b(th2);
                    } catch (Error | Exception unused) {
                        bVar = b.f11917b;
                    }
                    o.f11942f.b(this, eVar, bVar);
                    return true;
                }
            }
            obj = this.f11943a;
        }
        if (obj instanceof a) {
            wVar.cancel(((a) obj).f11914a);
        }
        return false;
    }
}
