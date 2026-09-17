package k1;

import java.io.File;
import java.io.FileOutputStream;
public final class z extends kd.c {
    public a0 f13219a;
    public File f13220b;
    public FileOutputStream f13221c;
    public FileOutputStream d;
    public Object e;
    public final a0 f13222f;
    public int h;

    public z(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.f13222f = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.f13222f.i(null, this);
    }
}
