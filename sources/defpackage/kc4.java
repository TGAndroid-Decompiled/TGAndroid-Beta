package defpackage;

import java.io.FileInputStream;
public final class kc4 extends ax2 {
    public Object a;
    public FileInputStream b;
    public Object c;
    public final lc4 d;
    public int e;

    public kc4(lc4 lc4Var, ax2 ax2Var) {
        super(ax2Var);
        this.d = lc4Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return lc4.a(this.d, this);
    }
}
