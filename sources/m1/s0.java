package m1;

import java.io.FileInputStream;
import java.nio.channels.FileLock;
public final class s0 extends kd.c {
    public ie.d f20419a;
    public FileInputStream f20420b;
    public FileLock f20421c;
    public boolean d;
    public Object f20422e;
    public final t0 f20423f;
    public int h;

    public s0(t0 t0Var, kd.c cVar) {
        super(cVar);
        this.f20423f = t0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20422e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.f20423f.a(null, this);
    }
}
