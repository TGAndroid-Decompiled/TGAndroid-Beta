package de;
public final class a extends ld.c {
    public ee.g f8310a;
    public Object f8311b;
    public final m f8312c;
    public int d;

    public a(m mVar, ld.c cVar) {
        super(cVar);
        this.f8312c = mVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f8311b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f8312c.G(null, this);
    }
}
