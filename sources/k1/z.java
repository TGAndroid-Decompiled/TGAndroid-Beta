package k1;

import java.io.File;
import java.io.FileOutputStream;
public final class z extends kd.c {
    public a0 f12063a;
    public File f12064b;
    public FileOutputStream f12065c;
    public FileOutputStream d;
    public Object e;
    public final a0 f12066f;
    public int h;

    public z(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.f12066f = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.f12066f.j(null, this);
    }
}
