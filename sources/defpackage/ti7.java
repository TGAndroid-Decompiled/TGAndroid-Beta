package defpackage;

import java.io.FileInputStream;
import java.nio.channels.FileLock;
public final class ti7 extends qx2 {
    public qj7 a;
    public FileInputStream b;
    public FileLock c;
    public boolean d;
    public Object e;
    public final ui7 f;
    public int h;

    public ti7(ui7 ui7Var, px2 px2Var) {
        super(px2Var);
        this.f = ui7Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.f.e(null, this);
    }
}
