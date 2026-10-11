package k1;

import java.io.File;
import java.io.FileOutputStream;
public final class z extends ld.c {
    public a0 f14398a;
    public File f14399b;
    public FileOutputStream f14400c;
    public FileOutputStream d;
    public Object f14401e;
    public final a0 f14402f;
    public int h;

    public z(a0 a0Var, ld.c cVar) {
        super(cVar);
        this.f14402f = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14401e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.f14402f.j(null, this);
    }
}
