package defpackage;

import java.io.FileOutputStream;
public final class vi7 extends ax2 {
    public FileOutputStream a;
    public long b;
    public Object c;
    public final sae d;
    public int e;

    public vi7(sae saeVar, zw2 zw2Var) {
        super(zw2Var);
        this.d = saeVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.h(null, this);
    }
}
