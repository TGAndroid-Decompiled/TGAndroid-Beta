package m1;
public final class h0 extends kd.c {
    public i0 f20345a;
    public Object f20346b;
    public Object f20347c;
    public k0 d;
    public Object f20348e;
    public final i0 f20349f;
    public int h;

    public h0(i0 i0Var, kd.c cVar) {
        super(cVar);
        this.f20349f = i0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20348e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.f20349f.b(null, this);
    }
}
