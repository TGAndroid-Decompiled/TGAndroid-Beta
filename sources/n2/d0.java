package n2;

import p4.i1;
public final class d0 implements h2.o, h2.j {
    public final long f21082a;

    public d0(long j3) {
        this.f21082a = j3;
    }

    @Override
    public void accept(Object obj) {
        ((i1) obj).c(this.f21082a);
    }

    @Override
    public void invoke(Object obj) {
        v vVar;
        n0 n0Var = (n0) obj;
        r0 r0Var = n0Var.f21192b;
        if (n0Var.equals(r0Var.f21223j) && (vVar = r0Var.f21227n) != null) {
            vVar.j(this.f21082a);
        }
    }
}
