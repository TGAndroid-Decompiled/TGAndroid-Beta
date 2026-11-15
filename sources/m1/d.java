package m1;

import c8.j9;
import java.io.Serializable;
import java.util.Iterator;
public final class d extends kd.c {
    public Serializable f19948a;
    public Iterator f19949b;
    public Object f19950c;
    public int d;

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f19950c = obj;
        this.d |= Integer.MIN_VALUE;
        return j9.a(null, null, this);
    }
}
