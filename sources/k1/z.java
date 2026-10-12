package k1;

import java.io.File;
import java.io.FileOutputStream;
public final class z extends ld.c {
    public a0 f14395a;
    public File f14396b;
    public FileOutputStream f14397c;
    public FileOutputStream d;
    public Object f14398e;
    public final a0 f14399f;
    public int h;

    public z(a0 a0Var, ld.c cVar) {
        super(cVar);
        this.f14399f = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14398e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.f14399f.j(null, this);
    }
}
