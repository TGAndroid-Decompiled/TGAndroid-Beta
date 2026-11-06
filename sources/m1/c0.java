package m1;

import java.io.FileInputStream;
public final class c0 extends kd.c {
    public Object f19347a;
    public FileInputStream f19348b;
    public Object f19349c;
    public final d0 d;
    public int f19350e;

    public c0(d0 d0Var, kd.c cVar) {
        super(cVar);
        this.d = d0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f19349c = obj;
        this.f19350e |= Integer.MIN_VALUE;
        return d0.a(this.d, this);
    }
}
