package k1;

public final class t extends tc.c {

    public z f14305a;

    public Object f14306b;

    public final z f14307c;
    public int d;

    public t(z zVar, tc.c cVar) {
        super(cVar);
        this.f14307c = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14306b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f14307c.e(this);
    }
}
