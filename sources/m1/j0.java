package m1;

import java.io.FileOutputStream;
public final class j0 extends kd.c {
    public FileOutputStream f20370a;
    public FileOutputStream f20371b;
    public Object f20372c;
    public final k0 d;
    public int f20373e;

    public j0(k0 k0Var, kd.c cVar) {
        super(cVar);
        this.d = k0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20372c = obj;
        this.f20373e |= Integer.MIN_VALUE;
        return this.d.b(null, this);
    }
}
