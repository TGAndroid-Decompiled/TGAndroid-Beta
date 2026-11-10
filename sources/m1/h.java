package m1;
public final class h extends kd.c {
    public ui.e f19389a;
    public Object f19390b;
    public final ui.e f19391c;
    public int d;

    public h(ui.e eVar, kd.c cVar) {
        super(cVar);
        this.f19391c = eVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f19390b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f19391c.h(this);
    }
}
