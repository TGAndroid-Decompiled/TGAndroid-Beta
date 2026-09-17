package k1;

import java.io.FileInputStream;
public final class w extends kd.c {
    public a0 f14493a;
    public FileInputStream f14494b;
    public Object f14495c;
    public final a0 d;
    public int f14496e;

    public w(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.d = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14495c = obj;
        this.f14496e |= Integer.MIN_VALUE;
        return this.d.f(this);
    }
}
