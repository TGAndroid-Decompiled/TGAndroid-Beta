package m1;

import java.io.FileInputStream;
import java.nio.channels.FileLock;
public final class s0 extends kd.c {
    public ie.d f20422a;
    public FileInputStream f20423b;
    public FileLock f20424c;
    public boolean d;
    public Object f20425e;
    public final t0 f20426f;
    public int h;

    public s0(t0 t0Var, kd.c cVar) {
        super(cVar);
        this.f20426f = t0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20425e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.f20426f.a(null, this);
    }
}
