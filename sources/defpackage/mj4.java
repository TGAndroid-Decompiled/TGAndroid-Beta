package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
public final class mj4 extends ax2 {
    public LinkedHashMap a;
    public Iterator b;
    public iaa c;
    public LinkedHashMap d;
    public Object e;
    public Object f;
    public final nj4 h;
    public int n;

    public mj4(nj4 nj4Var, zw2 zw2Var) {
        super(zw2Var);
        this.h = nj4Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.n |= Integer.MIN_VALUE;
        return this.h.b(this);
    }
}
