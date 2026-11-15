package n2;

import p4.g1;
public final class d0 implements h2.o, h2.j {
    public final long f20718a;

    public d0(long j3) {
        this.f20718a = j3;
    }

    @Override
    public void accept(Object obj) {
        ((g1) obj).c(this.f20718a);
    }

    @Override
    public void invoke(Object obj) {
        v vVar;
        n0 n0Var = (n0) obj;
        r0 r0Var = n0Var.f20828b;
        if (n0Var.equals(r0Var.f20859j) && (vVar = r0Var.f20863n) != null) {
            vVar.b(this.f20718a);
        }
    }
}
