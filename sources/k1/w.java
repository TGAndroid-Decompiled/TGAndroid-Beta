package k1;

import java.io.FileInputStream;
public final class w extends ld.c {
    public a0 f14385a;
    public FileInputStream f14386b;
    public Object f14387c;
    public final a0 d;
    public int f14388e;

    public w(a0 a0Var, ld.c cVar) {
        super(cVar);
        this.d = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14387c = obj;
        this.f14388e |= Integer.MIN_VALUE;
        return this.d.g(this);
    }
}
