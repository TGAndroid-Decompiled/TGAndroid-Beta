package m1;

import java.io.FileOutputStream;
public final class j0 extends kd.c {
    public FileOutputStream f19414a;
    public FileOutputStream f19415b;
    public Object f19416c;
    public final k0 d;
    public int f19417e;

    public j0(k0 k0Var, kd.c cVar) {
        super(cVar);
        this.d = k0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f19416c = obj;
        this.f19417e |= Integer.MIN_VALUE;
        return this.d.b(null, this);
    }
}
