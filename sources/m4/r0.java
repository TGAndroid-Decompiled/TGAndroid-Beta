package m4;

import java.util.List;
public final class r0 implements e1, f1 {
    public final int f16700a;
    public final i1 f16701b;
    public final int f16702c;

    public r0(i1 i1Var, int i10, int i11) {
        this.f16700a = i11;
        this.f16701b = i1Var;
        this.f16702c = i10;
    }

    @Override
    public void a(m1 m1Var, v vVar, List list) {
        switch (this.f16700a) {
            case 1:
                m1Var.b0(this.f16701b.K0(vVar, m1Var, this.f16702c), list);
                return;
            case 2:
                i1 i1Var = this.f16701b;
                i1Var.getClass();
                int size = list.size();
                int i10 = this.f16702c;
                if (size == 1) {
                    m1Var.u0((b2.o0) list.get(0), i1Var.K0(vVar, m1Var, i10));
                    return;
                }
                m1Var.O(i1Var.K0(vVar, m1Var, i10), i1Var.K0(vVar, m1Var, i10 + 1), list);
                return;
            default:
                m1Var.b0(this.f16701b.K0(vVar, m1Var, this.f16702c), list);
                return;
        }
    }

    @Override
    public void d(m1 m1Var, v vVar) {
        switch (this.f16700a) {
            case 0:
                m1Var.Y(this.f16701b.K0(vVar, m1Var, this.f16702c));
                return;
            default:
                m1Var.Q(this.f16701b.K0(vVar, m1Var, this.f16702c));
                return;
        }
    }
}
