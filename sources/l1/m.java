package l1;
public final class m extends hd.j implements od.p {
    public final int f17583a;
    public int f17584b;
    public final b0 f17585c;

    public m(b0 b0Var, fd.c cVar, int i3) {
        super(2, cVar);
        this.f17583a = i3;
        this.f17585c = b0Var;
    }

    @Override
    public final fd.c create(Object obj, fd.c cVar) {
        switch (this.f17583a) {
            case 0:
                return new m(this.f17585c, cVar, 0);
            case 1:
                return new m(this.f17585c, cVar, 1);
            default:
                return new m(this.f17585c, cVar, 2);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17583a) {
            case 0:
                return ((m) create((zd.c) obj, (fd.c) obj2)).invokeSuspend(dd.k.f8801a);
            case 1:
                return ((m) create((wd.z) obj, (fd.c) obj2)).invokeSuspend(dd.k.f8801a);
            default:
                return ((m) create((wd.z) obj, (fd.c) obj2)).invokeSuspend(dd.k.f8801a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        throw new UnsupportedOperationException("Method not decompiled: l1.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
