package defpackage;

import java.io.FileInputStream;
public final class nc4 extends qx2 {
    public Object a;
    public FileInputStream b;
    public Object c;
    public final oc4 d;
    public int e;

    public nc4(oc4 oc4Var, qx2 qx2Var) {
        super(qx2Var);
        this.d = oc4Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return oc4.a(this.d, this);
    }
}
