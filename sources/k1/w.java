package k1;

import java.io.FileInputStream;
public final class w extends kd.c {
    public a0 f13206a;
    public FileInputStream f13207b;
    public Object f13208c;
    public final a0 d;
    public int e;

    public w(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.d = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13208c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.f(this);
    }
}
