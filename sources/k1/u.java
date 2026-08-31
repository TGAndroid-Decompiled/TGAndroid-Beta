package k1;

import java.io.Serializable;
import java.util.Iterator;
public final class u extends wc.c {
    public d0 f10312a;
    public Object f10313b;
    public Serializable f10314c;
    public Object d;
    public w f10315e;
    public Iterator f10316f;
    public Object h;
    public final d0 f10317n;
    public int f10318r;

    public u(d0 d0Var, wc.c cVar) {
        super(cVar);
        this.f10317n = d0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f10318r |= Integer.MIN_VALUE;
        return this.f10317n.c(this);
    }
}
