package k1;

import java.io.File;
import java.io.FileOutputStream;
public final class z extends kd.c {
    public a0 f13208a;
    public File f13209b;
    public FileOutputStream f13210c;
    public FileOutputStream d;
    public Object e;
    public final a0 f13211f;
    public int h;

    public z(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.f13211f = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.f13211f.j(null, this);
    }
}
