package defpackage;

import java.util.List;
public final class utc implements s84 {
    public u84 a;
    public yzb b;
    public byte c;
    public long d;
    public stc e;
    public int f;
    public long g;

    @Override
    public final int b(defpackage.t84 r26, defpackage.u21 r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.utc.b(t84, u21):int");
    }

    @Override
    public final boolean c(t84 t84Var) {
        return nfd.a((vb3) t84Var);
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
        stc stcVar = this.e;
        if (stcVar != null) {
            stcVar.b(j2);
        }
    }

    @Override
    public final List e() {
        ko5 ko5Var = mo5.b;
        return y79.e;
    }

    @Override
    public final void f(u84 u84Var) {
        this.a = u84Var;
        this.b = u84Var.c0(0, 1);
        u84Var.B();
    }

    @Override
    public final s84 a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
