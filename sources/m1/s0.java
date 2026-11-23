package m1;

import java.io.FileInputStream;
import java.nio.channels.FileLock;
public final class s0 extends kd.c {
    public ie.d f20515a;
    public FileInputStream f20516b;
    public FileLock f20517c;
    public boolean d;
    public Object f20518e;
    public final t0 f20519f;
    public int h;

    public s0(t0 t0Var, kd.c cVar) {
        super(cVar);
        this.f20519f = t0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20518e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.f20519f.a(null, this);
    }
}
