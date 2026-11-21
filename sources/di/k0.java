package di;

import org.telegram.messenger.nr;
public final class k0 implements nr {
    public final int f9157a;
    public final Object f9158b;

    public k0(Object obj, int i7) {
        this.f9157a = i7;
        this.f9158b = obj;
    }

    @Override
    public final void a(int i7) {
        cg.b bVar;
        cg.b bVar2;
        cg.b bVar3;
        switch (this.f9157a) {
            case 0:
                o0 o0Var = (o0) this.f9158b;
                o0Var.getClass();
                if (i7 == 0) {
                    bVar = cg.b.f5302a;
                } else {
                    bVar = cg.b.f5303b;
                }
                o0Var.K0(cg.a.j(0L, bVar), true, false, true);
                o0Var.f9433s1.setText("");
                return;
            case 1:
                r0 r0Var = (r0) this.f9158b;
                r0Var.getClass();
                if (i7 == 0) {
                    bVar2 = cg.b.f5302a;
                } else {
                    bVar2 = cg.b.f5303b;
                }
                r0Var.N0(cg.a.j(0L, bVar2), true, false, true);
                r0Var.f9641r1.setText("");
                return;
            default:
                h5 h5Var = (h5) this.f9158b;
                h5Var.getClass();
                if (i7 == 0) {
                    bVar3 = cg.b.f5302a;
                } else {
                    bVar3 = cg.b.f5303b;
                }
                h5Var.f8968s = bVar3;
                h5Var.a(true);
                return;
        }
    }
}
