package n2;

import p4.g1;
public final class c0 implements h2.o, h2.j {
    public final long f20145a;

    public c0(long j3) {
        this.f20145a = j3;
    }

    @Override
    public void accept(Object obj) {
        ((g1) obj).c(this.f20145a);
    }

    @Override
    public void invoke(Object obj) {
        v vVar;
        m0 m0Var = (m0) obj;
        q0 q0Var = m0Var.f20249b;
        if (m0Var.equals(q0Var.f20286j) && (vVar = q0Var.f20290n) != null) {
            vVar.e(this.f20145a);
        }
    }
}
