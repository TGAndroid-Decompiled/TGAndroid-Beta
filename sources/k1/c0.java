package k1;

import java.io.File;
import java.io.FileOutputStream;
public final class c0 extends wc.c {
    public d0 f10262a;
    public File f10263b;
    public FileOutputStream f10264c;
    public FileOutputStream d;
    public Object f10265e;
    public final d0 f10266f;
    public int h;

    public c0(d0 d0Var, wc.c cVar) {
        super(cVar);
        this.f10266f = d0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f10265e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.f10266f.j(null, this);
    }
}
