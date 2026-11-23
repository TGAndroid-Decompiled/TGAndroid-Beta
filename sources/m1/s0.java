package m1;

import java.io.FileInputStream;
import java.nio.channels.FileLock;
public final class s0 extends kd.c {
    public ie.d f20453a;
    public FileInputStream f20454b;
    public FileLock f20455c;
    public boolean d;
    public Object f20456e;
    public final t0 f20457f;
    public int h;

    public s0(t0 t0Var, kd.c cVar) {
        super(cVar);
        this.f20457f = t0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20456e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.f20457f.a(null, this);
    }
}
