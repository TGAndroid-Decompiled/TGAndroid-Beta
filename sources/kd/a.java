package kd;
public final class a extends sc.c {
    public ld.g f14760a;
    public Object f14761b;
    public final k5.i f14762c;
    public int d;

    public a(k5.i iVar, sc.c cVar) {
        super(cVar);
        this.f14762c = iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14761b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f14762c.q(null, this);
    }
}
