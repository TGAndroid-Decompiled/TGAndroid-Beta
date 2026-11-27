package defpackage;
public final class jod extends o5f {
    @Override
    public final dod a(jtd jtdVar) {
        dod dodVar;
        dod dodVar2 = dod.d;
        synchronized (jtdVar) {
            dodVar = jtdVar.b;
            if (dodVar != dodVar2) {
                jtdVar.b = dodVar2;
            }
        }
        return dodVar;
    }

    @Override
    public final lod b(jtd jtdVar) {
        lod lodVar;
        lod lodVar2 = lod.c;
        synchronized (jtdVar) {
            lodVar = jtdVar.c;
            if (lodVar != lodVar2) {
                jtdVar.c = lodVar2;
            }
        }
        return lodVar;
    }

    @Override
    public final void c(lod lodVar, lod lodVar2) {
        lodVar.b = lodVar2;
    }

    @Override
    public final void d(lod lodVar, Thread thread) {
        lodVar.a = thread;
    }

    @Override
    public final boolean e(jtd jtdVar, dod dodVar, dod dodVar2) {
        synchronized (jtdVar) {
            if (jtdVar.b == dodVar) {
                jtdVar.b = dodVar2;
                return true;
            }
            return false;
        }
    }

    @Override
    public final boolean f(rod rodVar, Object obj, Object obj2) {
        synchronized (rodVar) {
            if (rodVar.a == obj) {
                rodVar.a = obj2;
                return true;
            }
            return false;
        }
    }

    @Override
    public final boolean g(rod rodVar, lod lodVar, lod lodVar2) {
        synchronized (rodVar) {
            if (rodVar.c == lodVar) {
                rodVar.c = lodVar2;
                return true;
            }
            return false;
        }
    }
}
