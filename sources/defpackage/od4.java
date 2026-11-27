package defpackage;

import java.io.FileOutputStream;
public final class od4 extends ax2 {
    public FileOutputStream a;
    public FileOutputStream b;
    public Object c;
    public final pd4 d;
    public int e;

    public od4(pd4 pd4Var, ax2 ax2Var) {
        super(ax2Var);
        this.d = pd4Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(null, this);
    }
}
