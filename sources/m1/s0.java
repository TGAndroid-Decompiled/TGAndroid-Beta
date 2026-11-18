package m1;

import java.io.FileInputStream;
import java.nio.channels.FileLock;
public final class s0 extends kd.c {
    public ie.d f20425a;
    public FileInputStream f20426b;
    public FileLock f20427c;
    public boolean d;
    public Object f20428e;
    public final t0 f20429f;
    public int h;

    public s0(t0 t0Var, kd.c cVar) {
        super(cVar);
        this.f20429f = t0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20428e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.f20429f.a(null, this);
    }
}
