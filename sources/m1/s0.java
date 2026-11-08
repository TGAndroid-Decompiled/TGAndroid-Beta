package m1;

import java.io.FileInputStream;
import java.nio.channels.FileLock;
public final class s0 extends kd.c {
    public ie.d f19464a;
    public FileInputStream f19465b;
    public FileLock f19466c;
    public boolean d;
    public Object f19467e;
    public final t0 f19468f;
    public int h;

    public s0(t0 t0Var, kd.c cVar) {
        super(cVar);
        this.f19468f = t0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f19467e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.f19468f.a(null, this);
    }
}
