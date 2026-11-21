package m1;

import java.io.FileInputStream;
import java.nio.channels.FileLock;
public final class s0 extends kd.c {
    public ie.d f20450a;
    public FileInputStream f20451b;
    public FileLock f20452c;
    public boolean d;
    public Object f20453e;
    public final t0 f20454f;
    public int h;

    public s0(t0 t0Var, kd.c cVar) {
        super(cVar);
        this.f20454f = t0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20453e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.f20454f.a(null, this);
    }
}
