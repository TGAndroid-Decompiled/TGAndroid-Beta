package k1;

import java.io.FileInputStream;
public final class w extends kd.c {
    public a0 f14350a;
    public FileInputStream f14351b;
    public Object f14352c;
    public final a0 d;
    public int f14353e;

    public w(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.d = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14352c = obj;
        this.f14353e |= Integer.MIN_VALUE;
        return this.d.f(this);
    }
}
