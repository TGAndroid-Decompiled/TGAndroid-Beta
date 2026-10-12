package k1;

import java.io.File;
import java.io.FileOutputStream;
public final class z extends ld.c {
    public a0 f14396a;
    public File f14397b;
    public FileOutputStream f14398c;
    public FileOutputStream d;
    public Object f14399e;
    public final a0 f14400f;
    public int h;

    public z(a0 a0Var, ld.c cVar) {
        super(cVar);
        this.f14400f = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14399e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.f14400f.j(null, this);
    }
}
