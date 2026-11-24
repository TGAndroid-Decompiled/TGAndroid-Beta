package defpackage;

import java.io.Serializable;
import java.util.Iterator;
public final class p73 extends qx2 {
    public Serializable a;
    public Iterator b;
    public Object c;
    public final dhf d;
    public int e;

    public p73(dhf dhfVar, qx2 qx2Var) {
        super(qx2Var);
        this.d = dhfVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.P(null, null, this);
    }
}
