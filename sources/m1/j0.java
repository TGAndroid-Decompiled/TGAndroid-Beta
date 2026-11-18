package m1;

import java.io.FileOutputStream;
public final class j0 extends kd.c {
    public FileOutputStream f20367a;
    public FileOutputStream f20368b;
    public Object f20369c;
    public final k0 d;
    public int f20370e;

    public j0(k0 k0Var, kd.c cVar) {
        super(cVar);
        this.d = k0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20369c = obj;
        this.f20370e |= Integer.MIN_VALUE;
        return this.d.b(null, this);
    }
}
