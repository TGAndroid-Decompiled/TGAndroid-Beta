package m1;

import java.io.FileInputStream;
public final class c0 extends kd.c {
    public Object f19355a;
    public FileInputStream f19356b;
    public Object f19357c;
    public final d0 d;
    public int f19358e;

    public c0(d0 d0Var, kd.c cVar) {
        super(cVar);
        this.d = d0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f19357c = obj;
        this.f19358e |= Integer.MIN_VALUE;
        return d0.a(this.d, this);
    }
}
