package k1;
public final class n extends md.i implements td.p {
    public final int f13782a;
    public int f13783b;
    public Object f13784c;
    public final z d;

    public n(z zVar, kd.c cVar, int i10) {
        super(2, cVar);
        this.f13782a = i10;
        this.d = zVar;
    }

    @Override
    public final kd.c create(Object obj, kd.c cVar) {
        switch (this.f13782a) {
            case 0:
                n nVar = new n(this.d, cVar, 0);
                nVar.f13784c = obj;
                return nVar;
            default:
                n nVar2 = new n(this.d, cVar, 1);
                nVar2.f13784c = obj;
                return nVar2;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f13782a) {
            case 0:
                return ((n) create((k) obj, (kd.c) obj2)).invokeSuspend(id.i.f11386a);
            default:
                return ((n) create((ee.c) obj, (kd.c) obj2)).invokeSuspend(id.i.f11386a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        throw new UnsupportedOperationException("Method not decompiled: k1.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
