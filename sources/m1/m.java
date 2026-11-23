package m1;
public final class m extends kd.j implements rd.p {
    public final int f20412a;
    public int f20413b;
    public final b0 f20414c;

    public m(b0 b0Var, id.c cVar, int i7) {
        super(2, cVar);
        this.f20412a = i7;
        this.f20414c = b0Var;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        switch (this.f20412a) {
            case 0:
                return new m(this.f20414c, cVar, 0);
            case 1:
                return new m(this.f20414c, cVar, 1);
            default:
                return new m(this.f20414c, cVar, 2);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f20412a) {
            case 0:
                return ((m) create((ce.d) obj, (id.c) obj2)).invokeSuspend(gd.k.f13517a);
            case 1:
                return ((m) create((zd.z) obj, (id.c) obj2)).invokeSuspend(gd.k.f13517a);
            default:
                return ((m) create((zd.z) obj, (id.c) obj2)).invokeSuspend(gd.k.f13517a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        throw new UnsupportedOperationException("Method not decompiled: m1.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
