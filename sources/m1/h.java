package m1;
public final class h extends kd.c {
    public ui.e f19384a;
    public Object f19385b;
    public final ui.e f19386c;
    public int d;

    public h(ui.e eVar, kd.c cVar) {
        super(cVar);
        this.f19386c = eVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f19385b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f19386c.h(this);
    }
}
