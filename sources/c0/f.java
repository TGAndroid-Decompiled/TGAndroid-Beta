package c0;

import a8.v9;
public final class f extends v9 {
    @Override
    public final boolean a(h hVar, d dVar, d dVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f5907b == dVar) {
                    hVar.f5907b = dVar2;
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
                if (hVar.f5906a == obj) {
                    hVar.f5906a = obj2;
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
                if (hVar.f5908c == gVar) {
                    hVar.f5908c = gVar2;
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
        gVar.f5904b = gVar2;
    }

    @Override
    public final void e(g gVar, Thread thread) {
        gVar.f5903a = thread;
    }
}
