package i9;

import v7.k8;
public final class f extends k8 {
    @Override
    public final boolean a(o oVar, c cVar, c cVar2) {
        synchronized (oVar) {
            try {
                if (oVar.f12023b == cVar) {
                    oVar.f12023b = cVar2;
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
                if (oVar.f12022a == obj) {
                    oVar.f12022a = obj2;
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
                if (oVar.f12024c == nVar) {
                    oVar.f12024c = nVar2;
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
                cVar = oVar.f12023b;
                if (cVar != cVar2) {
                    oVar.f12023b = cVar2;
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
        n nVar2 = n.f12017c;
        synchronized (oVar) {
            try {
                nVar = oVar.f12024c;
                if (nVar != nVar2) {
                    oVar.f12024c = nVar2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nVar;
    }

    @Override
    public final void f(n nVar, n nVar2) {
        nVar.f12019b = nVar2;
    }

    @Override
    public final void g(n nVar, Thread thread) {
        nVar.f12018a = thread;
    }
}
