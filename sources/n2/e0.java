package n2;

import p4.h1;
public final class e0 implements h2.o, h2.j {
    public final long f21185a;

    public e0(long j3) {
        this.f21185a = j3;
    }

    @Override
    public void accept(Object obj) {
        ((h1) obj).c(this.f21185a);
    }

    @Override
    public void invoke(Object obj) {
        v vVar;
        o0 o0Var = (o0) obj;
        s0 s0Var = o0Var.f21286b;
        if (o0Var.equals(s0Var.f21317j) && (vVar = s0Var.f21321n) != null) {
            vVar.b(this.f21185a);
        }
    }
}
