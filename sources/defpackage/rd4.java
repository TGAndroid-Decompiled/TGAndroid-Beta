package defpackage;

import java.io.FileOutputStream;
public final class rd4 extends qx2 {
    public FileOutputStream a;
    public FileOutputStream b;
    public Object c;
    public final sd4 d;
    public int e;

    public rd4(sd4 sd4Var, qx2 qx2Var) {
        super(qx2Var);
        this.d = sd4Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(null, this);
    }
}
