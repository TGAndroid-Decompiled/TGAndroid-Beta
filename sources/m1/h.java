package m1;
public final class h extends kd.c {
    public ui.e f19381a;
    public Object f19382b;
    public final ui.e f19383c;
    public int d;

    public h(ui.e eVar, kd.c cVar) {
        super(cVar);
        this.f19383c = eVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f19382b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f19383c.h(this);
    }
}
