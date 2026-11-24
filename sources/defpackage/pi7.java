package defpackage;

import java.io.FileOutputStream;
public final class pi7 extends qx2 {
    public FileOutputStream a;
    public long b;
    public Object c;
    public final f8e d;
    public int e;

    public pi7(f8e f8eVar, px2 px2Var) {
        super(px2Var);
        this.d = f8eVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.h(null, this);
    }
}
