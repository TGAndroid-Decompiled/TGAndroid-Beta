package l1;

import b8.rd;
import java.io.Serializable;
import java.util.Iterator;
public final class d extends hd.c {
    public Serializable f17514a;
    public Iterator f17515b;
    public Object f17516c;
    public int d;

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f17516c = obj;
        this.d |= Integer.MIN_VALUE;
        return rd.a(null, null, this);
    }
}
