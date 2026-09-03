package k1;

import java.io.File;
import java.io.FileOutputStream;
public final class c0 extends wc.c {
    public d0 f9541a;
    public File f9542b;
    public FileOutputStream f9543c;
    public FileOutputStream d;
    public Object e;
    public final d0 f9544f;
    public int h;

    public c0(d0 d0Var, wc.c cVar) {
        super(cVar);
        this.f9544f = d0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.f9544f.i(null, this);
    }
}
