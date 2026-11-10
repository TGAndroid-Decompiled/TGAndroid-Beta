package m1;

import java.io.FileInputStream;
import java.nio.channels.FileLock;
public final class s0 extends kd.c {
    public ie.d f19469a;
    public FileInputStream f19470b;
    public FileLock f19471c;
    public boolean d;
    public Object f19472e;
    public final t0 f19473f;
    public int h;

    public s0(t0 t0Var, kd.c cVar) {
        super(cVar);
        this.f19473f = t0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f19472e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.f19473f.a(null, this);
    }
}
