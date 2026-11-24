package defpackage;

import java.io.FileInputStream;
import java.nio.channels.FileLock;
public final class qg7 extends gw2 {
    public nh7 a;
    public FileInputStream b;
    public FileLock c;
    public boolean d;
    public Object e;
    public final rg7 f;
    public int h;

    public qg7(rg7 rg7Var, fw2 fw2Var) {
        super(fw2Var);
        this.f = rg7Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.f.e(null, this);
    }
}
