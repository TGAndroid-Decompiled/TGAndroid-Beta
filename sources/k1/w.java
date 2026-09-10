package k1;

import java.io.FileInputStream;
public final class w extends kd.c {
    public a0 f12053a;
    public FileInputStream f12054b;
    public Object f12055c;
    public final a0 d;
    public int e;

    public w(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.d = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f12055c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.f(this);
    }
}
