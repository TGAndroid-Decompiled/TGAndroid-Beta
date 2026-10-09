package k1;

import java.io.File;
import java.io.FileOutputStream;
public final class z extends ld.c {
    public a0 f14399a;
    public File f14400b;
    public FileOutputStream f14401c;
    public FileOutputStream d;
    public Object f14402e;
    public final a0 f14403f;
    public int h;

    public z(a0 a0Var, ld.c cVar) {
        super(cVar);
        this.f14403f = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14402e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.f14403f.j(null, this);
    }
}
