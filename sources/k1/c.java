package k1;

import a8.kd;
import java.io.Serializable;
import java.util.Iterator;
public final class c extends nd.c {
    public Serializable f16046a;
    public Iterator f16047b;
    public Object f16048c;
    public int d;

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f16048c = obj;
        this.d |= Integer.MIN_VALUE;
        return kd.a(null, null, this);
    }
}
