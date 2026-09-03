package k1;

import java.io.FileInputStream;
public final class z extends wc.c {
    public d0 f9607a;
    public FileInputStream f9608b;
    public Object f9609c;
    public final d0 d;
    public int e;

    public z(d0 d0Var, wc.c cVar) {
        super(cVar);
        this.d = d0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f9609c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.f(this);
    }
}
