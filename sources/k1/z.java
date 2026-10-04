package k1;

import java.io.File;
import java.io.FileOutputStream;
public final class z extends kd.c {
    public a0 f14362a;
    public File f14363b;
    public FileOutputStream f14364c;
    public FileOutputStream d;
    public Object f14365e;
    public final a0 f14366f;
    public int h;

    public z(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.f14366f = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14365e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.f14366f.i(null, this);
    }
}
