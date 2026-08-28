package c0;

import f7.k0;
public final class f extends k0 {
    @Override
    public final boolean a(h hVar, d dVar, d dVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f2070b == dVar) {
                    hVar.f2070b = dVar2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public final boolean b(h hVar, Object obj, Object obj2) {
        synchronized (hVar) {
            try {
                if (hVar.f2069a == obj) {
                    hVar.f2069a = obj2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public final boolean c(h hVar, g gVar, g gVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f2071c == gVar) {
                    hVar.f2071c = gVar2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public final void d(g gVar, g gVar2) {
        gVar.f2066b = gVar2;
    }

    @Override
    public final void e(g gVar, Thread thread) {
        gVar.f2065a = thread;
    }
}
