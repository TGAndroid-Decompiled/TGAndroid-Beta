package n2;

import p4.g1;
public final class c0 implements h2.o, h2.j {
    public final long f20140a;

    public c0(long j3) {
        this.f20140a = j3;
    }

    @Override
    public void accept(Object obj) {
        ((g1) obj).c(this.f20140a);
    }

    @Override
    public void invoke(Object obj) {
        v vVar;
        m0 m0Var = (m0) obj;
        q0 q0Var = m0Var.f20244b;
        if (m0Var.equals(q0Var.f20281j) && (vVar = q0Var.f20285n) != null) {
            vVar.e(this.f20140a);
        }
    }
}
