package la;
public final class g extends uc.c {
    public h f15125a;
    public Object f15126b;
    public final h f15127c;
    public int d;

    public g(h hVar, uc.c cVar) {
        super(cVar);
        this.f15127c = hVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f15126b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f15127c.b(this);
    }
}
