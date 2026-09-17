package k1;

import java.io.File;
import java.io.FileOutputStream;
public final class z extends kd.c {
    public a0 f14532a;
    public File f14533b;
    public FileOutputStream f14534c;
    public FileOutputStream d;
    public Object f14535e;
    public final a0 f14536f;
    public int h;

    public z(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.f14536f = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14535e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.f14536f.j(null, this);
    }
}
