package k1;

import java.io.File;
import java.io.FileOutputStream;
public final class z extends kd.c {
    public a0 f14363a;
    public File f14364b;
    public FileOutputStream f14365c;
    public FileOutputStream d;
    public Object f14366e;
    public final a0 f14367f;
    public int h;

    public z(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.f14367f = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14366e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.f14367f.i(null, this);
    }
}
