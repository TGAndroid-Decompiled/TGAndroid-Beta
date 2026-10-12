package de;
public final class a extends ld.c {
    public ee.g f8308a;
    public Object f8309b;
    public final m f8310c;
    public int d;

    public a(m mVar, ld.c cVar) {
        super(cVar);
        this.f8310c = mVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f8309b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f8310c.F(null, this);
    }
}
