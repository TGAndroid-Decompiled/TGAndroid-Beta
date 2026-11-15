package m1;

import java.io.FileInputStream;
import java.nio.channels.FileLock;
public final class s0 extends kd.c {
    public ie.d f20058a;
    public FileInputStream f20059b;
    public FileLock f20060c;
    public boolean d;
    public Object f20061e;
    public final t0 f20062f;
    public int h;

    public s0(t0 t0Var, kd.c cVar) {
        super(cVar);
        this.f20062f = t0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20061e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.f20062f.a(null, this);
    }
}
