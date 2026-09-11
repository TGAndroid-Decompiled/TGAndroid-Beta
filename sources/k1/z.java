package k1;

import java.io.File;
import java.io.FileOutputStream;
public final class z extends kd.c {
    public a0 f14506a;
    public File f14507b;
    public FileOutputStream f14508c;
    public FileOutputStream d;
    public Object f14509e;
    public final a0 f14510f;
    public int h;

    public z(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.f14510f = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14509e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.f14510f.j(null, this);
    }
}
