package defpackage;

import java.io.FileInputStream;
import java.nio.channels.FileLock;
public final class aj7 extends ax2 {
    public xj7 a;
    public FileInputStream b;
    public FileLock c;
    public boolean d;
    public Object e;
    public final bj7 f;
    public int h;

    public aj7(bj7 bj7Var, zw2 zw2Var) {
        super(zw2Var);
        this.f = bj7Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.f.e(null, this);
    }
}
