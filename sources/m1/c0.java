package m1;

import java.io.FileInputStream;
public final class c0 extends kd.c {
    public Object f20305a;
    public FileInputStream f20306b;
    public Object f20307c;
    public final d0 d;
    public int f20308e;

    public c0(d0 d0Var, kd.c cVar) {
        super(cVar);
        this.d = d0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20307c = obj;
        this.f20308e |= Integer.MIN_VALUE;
        return d0.a(this.d, this);
    }
}
