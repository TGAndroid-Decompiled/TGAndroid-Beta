package db;
public final class d1 extends hd.c {
    public String f8634a;
    public b1 f8635b;
    public Object f8636c;
    public final e1 d;
    public int f8637e;

    public d1(e1 e1Var, fd.c cVar) {
        super(cVar);
        this.d = e1Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f8636c = obj;
        this.f8637e |= Integer.MIN_VALUE;
        return e1.a(this.d, null, null, this);
    }
}
