package m1;

import c8.m9;
import java.io.Serializable;
import java.util.Iterator;
public final class d extends kd.c {
    public Serializable f20340a;
    public Iterator f20341b;
    public Object f20342c;
    public int d;

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20342c = obj;
        this.d |= Integer.MIN_VALUE;
        return m9.a(null, null, this);
    }
}
