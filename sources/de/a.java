package de;
public final class a extends ld.c {
    public ee.g f8311a;
    public Object f8312b;
    public final m f8313c;
    public int d;

    public a(m mVar, ld.c cVar) {
        super(cVar);
        this.f8313c = mVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f8312b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f8313c.z(null, this);
    }
}
