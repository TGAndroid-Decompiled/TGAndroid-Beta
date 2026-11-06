package m1;

import java.io.FileOutputStream;
public final class j0 extends kd.c {
    public FileOutputStream f19406a;
    public FileOutputStream f19407b;
    public Object f19408c;
    public final k0 d;
    public int f19409e;

    public j0(k0 k0Var, kd.c cVar) {
        super(cVar);
        this.d = k0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f19408c = obj;
        this.f19409e |= Integer.MIN_VALUE;
        return this.d.b(null, this);
    }
}
