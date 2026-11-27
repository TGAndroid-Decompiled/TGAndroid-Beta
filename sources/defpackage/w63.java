package defpackage;

import java.io.Serializable;
import java.util.Iterator;
public final class w63 extends ax2 {
    public Serializable a;
    public Iterator b;
    public Object c;
    public final sjf d;
    public int e;

    public w63(sjf sjfVar, ax2 ax2Var) {
        super(ax2Var);
        this.d = sjfVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.O(null, null, this);
    }
}
