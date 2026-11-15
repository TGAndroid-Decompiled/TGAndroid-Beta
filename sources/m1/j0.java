package m1;

import java.io.FileOutputStream;
public final class j0 extends kd.c {
    public FileOutputStream f20003a;
    public FileOutputStream f20004b;
    public Object f20005c;
    public final k0 d;
    public int f20006e;

    public j0(k0 k0Var, kd.c cVar) {
        super(cVar);
        this.d = k0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20005c = obj;
        this.f20006e |= Integer.MIN_VALUE;
        return this.d.b(null, this);
    }
}
