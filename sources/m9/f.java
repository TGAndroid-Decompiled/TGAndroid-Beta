package m9;

import c8.s9;
public final class f extends s9 {
    @Override
    public final boolean a(o oVar, c cVar, c cVar2) {
        synchronized (oVar) {
            try {
                if (oVar.f20948b == cVar) {
                    oVar.f20948b = cVar2;
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final boolean b(o oVar, Object obj, Object obj2) {
        synchronized (oVar) {
            try {
                if (oVar.f20947a == obj) {
                    oVar.f20947a = obj2;
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final boolean c(o oVar, n nVar, n nVar2) {
        synchronized (oVar) {
            try {
                if (oVar.f20949c == nVar) {
                    oVar.f20949c = nVar2;
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final c d(o oVar) {
        c cVar;
        c cVar2 = c.d;
        synchronized (oVar) {
            try {
                cVar = oVar.f20948b;
                if (cVar != cVar2) {
                    oVar.f20948b = cVar2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    @Override
    public final n e(o oVar) {
        n nVar;
        n nVar2 = n.f20942c;
        synchronized (oVar) {
            try {
                nVar = oVar.f20949c;
                if (nVar != nVar2) {
                    oVar.f20949c = nVar2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nVar;
    }

    @Override
    public final void f(n nVar, n nVar2) {
        nVar.f20944b = nVar2;
    }

    @Override
    public final void g(n nVar, Thread thread) {
        nVar.f20943a = thread;
    }
}
