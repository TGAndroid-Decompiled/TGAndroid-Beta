package defpackage;

import java.io.FileOutputStream;
public final class rb4 extends gw2 {
    public FileOutputStream a;
    public FileOutputStream b;
    public Object c;
    public final sb4 d;
    public int e;

    public rb4(sb4 sb4Var, gw2 gw2Var) {
        super(gw2Var);
        this.d = sb4Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(null, this);
    }
}
