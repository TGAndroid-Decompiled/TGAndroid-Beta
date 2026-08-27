package ld;

public final class d extends tc.c {

    public Object f15541a;

    public int f15542b;

    public final g5.b f15543c;
    public g5.b d;

    public c f15544e;

    public d(g5.b bVar, tc.c cVar) {
        super(cVar);
        this.f15543c = bVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f15541a = obj;
        this.f15542b |= Integer.MIN_VALUE;
        return this.f15543c.q(null, this);
    }
}
