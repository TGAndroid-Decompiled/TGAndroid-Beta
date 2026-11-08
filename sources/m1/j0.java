package m1;

import java.io.FileOutputStream;
public final class j0 extends kd.c {
    public FileOutputStream f19409a;
    public FileOutputStream f19410b;
    public Object f19411c;
    public final k0 d;
    public int f19412e;

    public j0(k0 k0Var, kd.c cVar) {
        super(cVar);
        this.d = k0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f19411c = obj;
        this.f19412e |= Integer.MIN_VALUE;
        return this.d.b(null, this);
    }
}
