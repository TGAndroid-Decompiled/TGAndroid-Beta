package k1;
public final class w extends nd.c {
    public Object f16096a;
    public Object f16097b;
    public Object f16098c;
    public final z d;
    public int e;

    public w(z zVar, nd.c cVar) {
        super(cVar);
        this.d = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f16098c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.g(this);
    }
}
