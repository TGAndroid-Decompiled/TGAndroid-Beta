package defpackage;
public final class uld extends x2f {
    @Override
    public final old a(wqd wqdVar) {
        old oldVar;
        old oldVar2 = old.d;
        synchronized (wqdVar) {
            oldVar = wqdVar.b;
            if (oldVar != oldVar2) {
                wqdVar.b = oldVar2;
            }
        }
        return oldVar;
    }

    @Override
    public final wld b(wqd wqdVar) {
        wld wldVar;
        wld wldVar2 = wld.c;
        synchronized (wqdVar) {
            wldVar = wqdVar.c;
            if (wldVar != wldVar2) {
                wqdVar.c = wldVar2;
            }
        }
        return wldVar;
    }

    @Override
    public final void c(wld wldVar, wld wldVar2) {
        wldVar.b = wldVar2;
    }

    @Override
    public final void d(wld wldVar, Thread thread) {
        wldVar.a = thread;
    }

    @Override
    public final boolean e(wqd wqdVar, old oldVar, old oldVar2) {
        synchronized (wqdVar) {
            if (wqdVar.b == oldVar) {
                wqdVar.b = oldVar2;
                return true;
            }
            return false;
        }
    }

    @Override
    public final boolean f(cmd cmdVar, Object obj, Object obj2) {
        synchronized (cmdVar) {
            if (cmdVar.a == obj) {
                cmdVar.a = obj2;
                return true;
            }
            return false;
        }
    }

    @Override
    public final boolean g(cmd cmdVar, wld wldVar, wld wldVar2) {
        synchronized (cmdVar) {
            if (cmdVar.c == wldVar) {
                cmdVar.c = wldVar2;
                return true;
            }
            return false;
        }
    }
}
