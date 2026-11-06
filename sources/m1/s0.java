package m1;

import java.io.FileInputStream;
import java.nio.channels.FileLock;
public final class s0 extends kd.c {
    public ie.d f19461a;
    public FileInputStream f19462b;
    public FileLock f19463c;
    public boolean d;
    public Object f19464e;
    public final t0 f19465f;
    public int h;

    public s0(t0 t0Var, kd.c cVar) {
        super(cVar);
        this.f19465f = t0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f19464e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.f19465f.a(null, this);
    }
}
