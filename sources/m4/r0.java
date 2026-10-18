package m4;

import java.util.List;
public final class r0 implements e1, f1 {
    public final int f16699a;
    public final i1 f16700b;
    public final int f16701c;

    public r0(i1 i1Var, int i10, int i11) {
        this.f16699a = i11;
        this.f16700b = i1Var;
        this.f16701c = i10;
    }

    @Override
    public void a(m1 m1Var, v vVar, List list) {
        switch (this.f16699a) {
            case 1:
                m1Var.b0(this.f16700b.K0(vVar, m1Var, this.f16701c), list);
                return;
            case 2:
                i1 i1Var = this.f16700b;
                i1Var.getClass();
                int size = list.size();
                int i10 = this.f16701c;
                if (size == 1) {
                    m1Var.u0((b2.o0) list.get(0), i1Var.K0(vVar, m1Var, i10));
                    return;
                }
                m1Var.O(i1Var.K0(vVar, m1Var, i10), i1Var.K0(vVar, m1Var, i10 + 1), list);
                return;
            default:
                m1Var.b0(this.f16700b.K0(vVar, m1Var, this.f16701c), list);
                return;
        }
    }

    @Override
    public void d(m1 m1Var, v vVar) {
        switch (this.f16699a) {
            case 0:
                m1Var.Y(this.f16700b.K0(vVar, m1Var, this.f16701c));
                return;
            default:
                m1Var.Q(this.f16700b.K0(vVar, m1Var, this.f16701c));
                return;
        }
    }
}
