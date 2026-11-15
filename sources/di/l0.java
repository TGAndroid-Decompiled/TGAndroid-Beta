package di;

import org.telegram.messenger.pr;
public final class l0 implements pr {
    public final int f8948a;
    public final Object f8949b;

    public l0(Object obj, int i7) {
        this.f8948a = i7;
        this.f8949b = obj;
    }

    @Override
    public final void a(int i7) {
        cg.b bVar;
        cg.b bVar2;
        cg.b bVar3;
        switch (this.f8948a) {
            case 0:
                p0 p0Var = (p0) this.f8949b;
                p0Var.getClass();
                if (i7 == 0) {
                    bVar = cg.b.f4990a;
                } else {
                    bVar = cg.b.f4991b;
                }
                p0Var.f1(cg.a.i(0L, bVar), true, false, true);
                p0Var.f9188a2.setText("");
                return;
            case 1:
                s0 s0Var = (s0) this.f8949b;
                s0Var.getClass();
                if (i7 == 0) {
                    bVar2 = cg.b.f4990a;
                } else {
                    bVar2 = cg.b.f4991b;
                }
                s0Var.M0(cg.a.i(0L, bVar2), true, false, true);
                s0Var.f9354r1.setText("");
                return;
            default:
                e5 e5Var = (e5) this.f8949b;
                e5Var.getClass();
                if (i7 == 0) {
                    bVar3 = cg.b.f4990a;
                } else {
                    bVar3 = cg.b.f4991b;
                }
                e5Var.f8463q = bVar3;
                e5Var.a(true);
                return;
        }
    }
}
