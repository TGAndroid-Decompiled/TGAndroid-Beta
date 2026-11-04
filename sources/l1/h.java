package l1;
public final class h extends hd.c {
    public za.p f17543a;
    public Object f17544b;
    public final za.p f17545c;
    public int d;

    public h(za.p pVar, hd.c cVar) {
        super(cVar);
        this.f17545c = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f17544b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f17545c.k(this);
    }
}
