package c0;

import g7.h0;

public final class f extends h0 {
    @Override
    public final boolean a(h hVar, d dVar, d dVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f2209b != dVar) {
                    return false;
                }
                hVar.f2209b = dVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public final boolean b(h hVar, Object obj, Object obj2) {
        synchronized (hVar) {
            try {
                if (hVar.f2208a != obj) {
                    return false;
                }
                hVar.f2208a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public final boolean c(h hVar, g gVar, g gVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f2210c != gVar) {
                    return false;
                }
                hVar.f2210c = gVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public final void d(g gVar, g gVar2) {
        gVar.f2205b = gVar2;
    }

    @Override
    public final void e(g gVar, Thread thread) {
        gVar.f2204a = thread;
    }
}
