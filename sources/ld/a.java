package ld;

public final class a extends tc.c {

    public md.g f15538a;

    public Object f15539b;

    public final k5.i f15540c;
    public int d;

    public a(k5.i iVar, tc.c cVar) {
        super(cVar);
        this.f15540c = iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f15539b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f15540c.q(null, this);
    }
}
