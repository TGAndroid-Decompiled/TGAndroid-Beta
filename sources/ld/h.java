package ld;

public final class h extends tc.c {

    public i f15553a;

    public Object f15554b;

    public Object f15555c;
    public final i d;

    public int f15556e;

    public h(i iVar, tc.c cVar) {
        super(cVar);
        this.d = iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f15555c = obj;
        this.f15556e |= Integer.MIN_VALUE;
        return this.d.c(null, this);
    }
}
