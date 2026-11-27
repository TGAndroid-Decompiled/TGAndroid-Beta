package defpackage;
public abstract class o5f {
    public dod a(jtd jtdVar) {
        return (dod) iod.d.getAndSet(jtdVar, dod.d);
    }

    public lod b(jtd jtdVar) {
        return (lod) iod.c.getAndSet(jtdVar, lod.c);
    }

    public void c(lod lodVar, lod lodVar2) {
        iod.b.lazySet(lodVar, lodVar2);
    }

    public void d(lod lodVar, Thread thread) {
        iod.a.lazySet(lodVar, thread);
    }

    public boolean e(jtd jtdVar, dod dodVar, dod dodVar2) {
        return p5f.a(iod.d, jtdVar, dodVar, dodVar2);
    }

    public boolean f(rod rodVar, Object obj, Object obj2) {
        return p5f.a(iod.e, rodVar, obj, obj2);
    }

    public boolean g(rod rodVar, lod lodVar, lod lodVar2) {
        return p5f.a(iod.c, rodVar, lodVar, lodVar2);
    }
}
