package k1;

import java.io.File;
import java.io.FileOutputStream;
public final class c0 extends wc.c {
    public d0 f9560a;
    public File f9561b;
    public FileOutputStream f9562c;
    public FileOutputStream d;
    public Object e;
    public final d0 f9563f;
    public int h;

    public c0(d0 d0Var, wc.c cVar) {
        super(cVar);
        this.f9563f = d0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.f9563f.i(null, this);
    }
}
