package k9;

import a8.pd;
public final class f extends pd {
    @Override
    public final boolean a(o oVar, c cVar, c cVar2) {
        synchronized (oVar) {
            try {
                if (oVar.f16487b == cVar) {
                    oVar.f16487b = cVar2;
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
                if (oVar.f16486a == obj) {
                    oVar.f16486a = obj2;
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
                if (oVar.f16488c == nVar) {
                    oVar.f16488c = nVar2;
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
                cVar = oVar.f16487b;
                if (cVar != cVar2) {
                    oVar.f16487b = cVar2;
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
        n nVar2 = n.f16482c;
        synchronized (oVar) {
            try {
                nVar = oVar.f16488c;
                if (nVar != nVar2) {
                    oVar.f16488c = nVar2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nVar;
    }

    @Override
    public final void f(n nVar, n nVar2) {
        nVar.f16484b = nVar2;
    }

    @Override
    public final void g(n nVar, Thread thread) {
        nVar.f16483a = thread;
    }
}
