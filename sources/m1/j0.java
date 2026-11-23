package m1;

import java.io.FileOutputStream;
public final class j0 extends kd.c {
    public FileOutputStream f20460a;
    public FileOutputStream f20461b;
    public Object f20462c;
    public final k0 d;
    public int f20463e;

    public j0(k0 k0Var, kd.c cVar) {
        super(cVar);
        this.d = k0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20462c = obj;
        this.f20463e |= Integer.MIN_VALUE;
        return this.d.b(null, this);
    }
}
