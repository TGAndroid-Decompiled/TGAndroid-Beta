package defpackage;

import java.util.List;
public final class gwc implements e84 {
    public g84 a;
    public x1c b;
    public byte c;
    public long d;
    public ewc e;
    public int f;
    public long g;

    @Override
    public final int b(defpackage.f84 r26, defpackage.v11 r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gwc.b(f84, v11):int");
    }

    @Override
    public final boolean c(f84 f84Var) {
        return did.a((cb3) f84Var);
    }

    @Override
    public final void d(long j, long j2) {
        byte b;
        if (j == 0) {
            b = 0;
        } else {
            b = 4;
        }
        this.c = b;
        ewc ewcVar = this.e;
        if (ewcVar != null) {
            ewcVar.b(j2);
        }
    }

    @Override
    public final List e() {
        no5 no5Var = po5.b;
        return j99.e;
    }

    @Override
    public final void f(g84 g84Var) {
        this.a = g84Var;
        this.b = g84Var.e0(0, 1);
        g84Var.D();
    }

    @Override
    public final e84 a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
