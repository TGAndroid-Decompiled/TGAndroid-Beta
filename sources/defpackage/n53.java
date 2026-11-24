package defpackage;

import java.io.IOException;
public final class n53 implements h86 {
    public final q53 a;

    public n53(q53 q53Var) {
        this.a = q53Var;
    }

    @Override
    public final void U(k86 k86Var, long j, long j2) {
        cv7 cv7Var = (cv7) k86Var;
        q53 q53Var = this.a;
        e86 e86Var = new e86(cv7Var.a, cv7Var.b, j);
        zxa zxaVar = cv7Var.d;
        e86Var.d = zxaVar.c;
        e86Var.e = zxaVar.d;
        e86Var.f = j2;
        e86Var.g = zxaVar.b;
        f86 f86Var = new f86(e86Var);
        q53Var.n.getClass();
        q53Var.r.p(f86Var, cv7Var.c);
        q53Var.N = ((Long) cv7Var.f).longValue() - j;
        q53Var.z(true);
    }

    public final void a() {
        long j;
        q53 q53Var = this.a;
        synchronized (ycd.b) {
            if (ycd.c) {
                j = ycd.d;
            } else {
                j = -9223372036854775807L;
            }
        }
        q53Var.N = j;
        q53Var.z(true);
    }

    @Override
    public final void v(k86 k86Var, long j, long j2, boolean z) {
        this.a.x((cv7) k86Var, j, j2);
    }

    @Override
    public final i86 w1(k86 k86Var, long j, long j2, IOException iOException, int i) {
        cv7 cv7Var = (cv7) k86Var;
        q53 q53Var = this.a;
        kp kpVar = q53Var.r;
        e86 e86Var = new e86(cv7Var.a, cv7Var.b, j);
        zxa zxaVar = cv7Var.d;
        e86Var.d = zxaVar.c;
        e86Var.e = zxaVar.d;
        e86Var.f = j2;
        e86Var.g = zxaVar.b;
        kpVar.s(new f86(e86Var), cv7Var.c, iOException, true);
        q53Var.n.getClass();
        q53Var.y(iOException);
        return mv6.y;
    }

    @Override
    public final void C0(k86 k86Var, long j, long j2, int i) {
    }
}
