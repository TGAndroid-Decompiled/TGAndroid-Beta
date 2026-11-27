package defpackage;

import java.io.FileInputStream;
import java.nio.channels.FileLock;
public final class zi7 extends ax2 {
    public wj7 a;
    public FileInputStream b;
    public FileLock c;
    public boolean d;
    public Object e;
    public final aj7 f;
    public int h;

    public zi7(aj7 aj7Var, zw2 zw2Var) {
        super(zw2Var);
        this.f = aj7Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.f.e(null, this);
    }
}
