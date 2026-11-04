package l1;
public final class s extends hd.c {
    public b0 f17620a;
    public int f17621b;
    public Object f17622c;
    public final b0 d;
    public int f17623e;

    public s(b0 b0Var, hd.c cVar) {
        super(cVar);
        this.d = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f17622c = obj;
        this.f17623e |= Integer.MIN_VALUE;
        return this.d.h(this);
    }
}
