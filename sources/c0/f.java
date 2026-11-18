package c0;

import a8.q7;
public final class f extends q7 {
    @Override
    public final boolean a(h hVar, d dVar, d dVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f4338b == dVar) {
                    hVar.f4338b = dVar2;
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final boolean b(h hVar, Object obj, Object obj2) {
        synchronized (hVar) {
            try {
                if (hVar.f4337a == obj) {
                    hVar.f4337a = obj2;
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final boolean c(h hVar, g gVar, g gVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f4339c == gVar) {
                    hVar.f4339c = gVar2;
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void d(g gVar, g gVar2) {
        gVar.f4334b = gVar2;
    }

    @Override
    public final void e(g gVar, Thread thread) {
        gVar.f4333a = thread;
    }
}
