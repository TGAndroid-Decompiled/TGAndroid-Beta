package c0;

import v7.e5;
public final class f extends e5 {
    @Override
    public final boolean a(h hVar, d dVar, d dVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f3631b == dVar) {
                    hVar.f3631b = dVar2;
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
                if (hVar.f3630a == obj) {
                    hVar.f3630a = obj2;
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
                if (hVar.f3632c == gVar) {
                    hVar.f3632c = gVar2;
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
        gVar.f3628b = gVar2;
    }

    @Override
    public final void e(g gVar, Thread thread) {
        gVar.f3627a = thread;
    }
}
