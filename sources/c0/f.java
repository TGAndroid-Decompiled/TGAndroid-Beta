package c0;

import v7.d5;
public final class f extends d5 {
    @Override
    public final boolean a(h hVar, d dVar, d dVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f3924b == dVar) {
                    hVar.f3924b = dVar2;
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
                if (hVar.f3923a == obj) {
                    hVar.f3923a = obj2;
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
                if (hVar.f3925c == gVar) {
                    hVar.f3925c = gVar2;
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
        gVar.f3920b = gVar2;
    }

    @Override
    public final void e(g gVar, Thread thread) {
        gVar.f3919a = thread;
    }
}
