package defpackage;

import java.io.FileOutputStream;
public final class mg7 extends gw2 {
    public FileOutputStream a;
    public long b;
    public Object c;
    public final c6e d;
    public int e;

    public mg7(c6e c6eVar, fw2 fw2Var) {
        super(fw2Var);
        this.d = c6eVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.h(null, this);
    }
}
