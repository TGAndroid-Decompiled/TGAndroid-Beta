package jb;
public final class b extends kd.c {
    public ie.a f17334a;
    public Object f17335b;
    public final d f17336c;
    public int d;

    public b(d dVar, kd.c cVar) {
        super(cVar);
        this.f17336c = dVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f17335b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f17336c.b(this);
    }
}
