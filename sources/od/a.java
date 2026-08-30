package od;
public final class a extends wc.c {
    public pd.g f16544a;
    public Object f16545b;
    public final o2.o f16546c;
    public int d;

    public a(o2.o oVar, wc.c cVar) {
        super(cVar);
        this.f16546c = oVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f16545b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f16546c.z(null, this);
    }
}
