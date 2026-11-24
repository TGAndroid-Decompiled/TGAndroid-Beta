package defpackage;
public final class sjd extends v0f {
    @Override
    public final mjd a(tod todVar) {
        mjd mjdVar;
        mjd mjdVar2 = mjd.d;
        synchronized (todVar) {
            mjdVar = todVar.b;
            if (mjdVar != mjdVar2) {
                todVar.b = mjdVar2;
            }
        }
        return mjdVar;
    }

    @Override
    public final ujd b(tod todVar) {
        ujd ujdVar;
        ujd ujdVar2 = ujd.c;
        synchronized (todVar) {
            ujdVar = todVar.c;
            if (ujdVar != ujdVar2) {
                todVar.c = ujdVar2;
            }
        }
        return ujdVar;
    }

    @Override
    public final void c(ujd ujdVar, ujd ujdVar2) {
        ujdVar.b = ujdVar2;
    }

    @Override
    public final void d(ujd ujdVar, Thread thread) {
        ujdVar.a = thread;
    }

    @Override
    public final boolean e(tod todVar, mjd mjdVar, mjd mjdVar2) {
        synchronized (todVar) {
            if (todVar.b == mjdVar) {
                todVar.b = mjdVar2;
                return true;
            }
            return false;
        }
    }

    @Override
    public final boolean f(akd akdVar, Object obj, Object obj2) {
        synchronized (akdVar) {
            if (akdVar.a == obj) {
                akdVar.a = obj2;
                return true;
            }
            return false;
        }
    }

    @Override
    public final boolean g(akd akdVar, ujd ujdVar, ujd ujdVar2) {
        synchronized (akdVar) {
            if (akdVar.c == ujdVar) {
                akdVar.c = ujdVar2;
                return true;
            }
            return false;
        }
    }
}
