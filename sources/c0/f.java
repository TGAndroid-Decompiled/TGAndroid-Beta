package c0;

import v7.g0;
public final class f extends g0 {
    @Override
    public final boolean a(h hVar, d dVar, d dVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f4100b == dVar) {
                    hVar.f4100b = dVar2;
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
                if (hVar.f4099a == obj) {
                    hVar.f4099a = obj2;
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
                if (hVar.f4101c == gVar) {
                    hVar.f4101c = gVar2;
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
        gVar.f4097b = gVar2;
    }

    @Override
    public final void e(g gVar, Thread thread) {
        gVar.f4096a = thread;
    }
}
