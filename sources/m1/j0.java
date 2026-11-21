package m1;

import java.io.FileOutputStream;
public final class j0 extends kd.c {
    public FileOutputStream f20395a;
    public FileOutputStream f20396b;
    public Object f20397c;
    public final k0 d;
    public int f20398e;

    public j0(k0 k0Var, kd.c cVar) {
        super(cVar);
        this.d = k0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20397c = obj;
        this.f20398e |= Integer.MIN_VALUE;
        return this.d.b(null, this);
    }
}
