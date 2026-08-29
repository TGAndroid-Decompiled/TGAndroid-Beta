package k1;

import java.io.File;
import java.io.FileOutputStream;
public final class z extends uc.c {
    public a0 f13323a;
    public File f13324b;
    public FileOutputStream f13325c;
    public FileOutputStream d;
    public Object f13326e;
    public final a0 f13327f;
    public int h;

    public z(a0 a0Var, uc.c cVar) {
        super(cVar);
        this.f13327f = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13326e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.f13327f.j(null, this);
    }
}
