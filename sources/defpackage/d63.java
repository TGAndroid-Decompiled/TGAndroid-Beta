package defpackage;

import java.io.Serializable;
import java.util.Iterator;
public final class d63 extends gw2 {
    public Serializable a;
    public Iterator b;
    public Object c;
    public final cff d;
    public int e;

    public d63(cff cffVar, gw2 gw2Var) {
        super(gw2Var);
        this.d = cffVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.O(null, null, this);
    }
}
