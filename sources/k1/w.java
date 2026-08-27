package k1;

public final class w extends tc.c {

    public Object f14315a;

    public Object f14316b;

    public Object f14317c;
    public final z d;

    public int f14318e;

    public w(z zVar, tc.c cVar) {
        super(cVar);
        this.d = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14317c = obj;
        this.f14318e |= Integer.MIN_VALUE;
        return this.d.h(this);
    }
}
