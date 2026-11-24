package defpackage;

import java.io.FileInputStream;
public final class na4 extends gw2 {
    public Object a;
    public FileInputStream b;
    public Object c;
    public final oa4 d;
    public int e;

    public na4(oa4 oa4Var, gw2 gw2Var) {
        super(gw2Var);
        this.d = oa4Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return oa4.a(this.d, this);
    }
}
