package l1;

import java.io.FileInputStream;
import java.nio.channels.FileLock;
public final class s0 extends hd.c {
    public fe.d f17624a;
    public FileInputStream f17625b;
    public FileLock f17626c;
    public boolean d;
    public Object f17627e;
    public final t0 f17628f;
    public int h;

    public s0(t0 t0Var, hd.c cVar) {
        super(cVar);
        this.f17628f = t0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f17627e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.f17628f.c(null, this);
    }
}
