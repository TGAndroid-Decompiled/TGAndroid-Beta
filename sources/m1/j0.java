package m1;

import java.io.FileOutputStream;
public final class j0 extends kd.c {
    public FileOutputStream f20364a;
    public FileOutputStream f20365b;
    public Object f20366c;
    public final k0 d;
    public int f20367e;

    public j0(k0 k0Var, kd.c cVar) {
        super(cVar);
        this.d = k0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20366c = obj;
        this.f20367e |= Integer.MIN_VALUE;
        return this.d.b(null, this);
    }
}
