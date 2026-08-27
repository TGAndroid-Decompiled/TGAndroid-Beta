package ka;

public final class g extends tc.c {

    public h f15121a;

    public Object f15122b;

    public final h f15123c;
    public int d;

    public g(h hVar, tc.c cVar) {
        super(cVar);
        this.f15123c = hVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f15122b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f15123c.b(this);
    }
}
