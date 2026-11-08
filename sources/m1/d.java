package m1;

import c8.l9;
import java.io.Serializable;
import java.util.Iterator;
public final class d extends kd.c {
    public Serializable f19354a;
    public Iterator f19355b;
    public Object f19356c;
    public int d;

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f19356c = obj;
        this.d |= Integer.MIN_VALUE;
        return l9.a(null, null, this);
    }
}
