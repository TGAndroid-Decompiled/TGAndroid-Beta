package k1;

import java.io.FileInputStream;
public final class z extends wc.c {
    public d0 f10334a;
    public FileInputStream f10335b;
    public Object f10336c;
    public final d0 d;
    public int f10337e;

    public z(d0 d0Var, wc.c cVar) {
        super(cVar);
        this.d = d0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f10336c = obj;
        this.f10337e |= Integer.MIN_VALUE;
        return this.d.g(this);
    }
}
