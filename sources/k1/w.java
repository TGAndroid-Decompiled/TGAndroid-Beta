package k1;

import java.io.FileInputStream;
public final class w extends ld.c {
    public a0 f14382a;
    public FileInputStream f14383b;
    public Object f14384c;
    public final a0 d;
    public int f14385e;

    public w(a0 a0Var, ld.c cVar) {
        super(cVar);
        this.d = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14384c = obj;
        this.f14385e |= Integer.MIN_VALUE;
        return this.d.g(this);
    }
}
