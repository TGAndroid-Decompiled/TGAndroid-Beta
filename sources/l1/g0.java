package l1;
public final class g0 extends hd.c {
    public i0 f17537a;
    public d0 f17538b;
    public boolean f17539c;
    public Object d;
    public final i0 f17540e;
    public int f17541f;

    public g0(i0 i0Var, hd.c cVar) {
        super(cVar);
        this.f17540e = i0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f17541f |= Integer.MIN_VALUE;
        return this.f17540e.a(null, this);
    }
}
