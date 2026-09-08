package k1;

import java.io.FileInputStream;
public final class w extends kd.c {
    public a0 f14519a;
    public FileInputStream f14520b;
    public Object f14521c;
    public final a0 d;
    public int f14522e;

    public w(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.d = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14521c = obj;
        this.f14522e |= Integer.MIN_VALUE;
        return this.d.f(this);
    }
}
