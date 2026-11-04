package db;
public final class r0 extends hd.j implements od.p {
    public w f8716a;
    public t0 f8717b;
    public p0 f8718c;
    public n9.h d;
    public n0 f8719e;
    public gb.l f8720f;
    public int h;
    public final t0 f8721n;
    public final n0 f8722r;

    public r0(t0 t0Var, n0 n0Var, fd.c cVar) {
        super(2, cVar);
        this.f8721n = t0Var;
        this.f8722r = n0Var;
    }

    @Override
    public final fd.c create(Object obj, fd.c cVar) {
        return new r0(this.f8721n, this.f8722r, cVar);
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((r0) create((wd.z) obj, (fd.c) obj2)).invokeSuspend(dd.k.f8801a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        throw new UnsupportedOperationException("Method not decompiled: db.r0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
