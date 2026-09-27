package i9;

import v7.l8;
public final class f extends l8 {
    @Override
    public final boolean a(o oVar, c cVar, c cVar2) {
        synchronized (oVar) {
            try {
                if (oVar.f11040b == cVar) {
                    oVar.f11040b = cVar2;
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
                if (oVar.f11039a == obj) {
                    oVar.f11039a = obj2;
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
                if (oVar.f11041c == nVar) {
                    oVar.f11041c = nVar2;
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
                cVar = oVar.f11040b;
                if (cVar != cVar2) {
                    oVar.f11040b = cVar2;
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
        n nVar2 = n.f11035c;
        synchronized (oVar) {
            try {
                nVar = oVar.f11041c;
                if (nVar != nVar2) {
                    oVar.f11041c = nVar2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nVar;
    }

    @Override
    public final void f(n nVar, n nVar2) {
        nVar.f11037b = nVar2;
    }

    @Override
    public final void g(n nVar, Thread thread) {
        nVar.f11036a = thread;
    }
}
