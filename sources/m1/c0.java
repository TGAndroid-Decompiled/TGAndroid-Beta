package m1;

import java.io.FileInputStream;
public final class c0 extends kd.c {
    public Object f20336a;
    public FileInputStream f20337b;
    public Object f20338c;
    public final d0 d;
    public int f20339e;

    public c0(d0 d0Var, kd.c cVar) {
        super(cVar);
        this.d = d0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20338c = obj;
        this.f20339e |= Integer.MIN_VALUE;
        return d0.a(this.d, this);
    }
}
