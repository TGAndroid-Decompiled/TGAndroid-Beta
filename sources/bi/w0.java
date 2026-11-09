package bi;

import org.telegram.messenger.sr;
public final class w0 implements sr {
    public final int f4930a;
    public final Object f4931b;

    public w0(Object obj, int i7) {
        this.f4930a = i7;
        this.f4931b = obj;
    }

    @Override
    public final void a(int i7) {
        cg.b bVar;
        cg.b bVar2;
        cg.b bVar3;
        switch (this.f4930a) {
            case 0:
                a1 a1Var = (a1) this.f4931b;
                a1Var.getClass();
                if (i7 == 0) {
                    bVar = cg.b.f6160a;
                } else {
                    bVar = cg.b.f6161b;
                }
                a1Var.f1(cg.a.i(0L, bVar), true, false, true);
                a1Var.W1.setText("");
                return;
            case 1:
                e1 e1Var = (e1) this.f4931b;
                e1Var.getClass();
                if (i7 == 0) {
                    bVar2 = cg.b.f6160a;
                } else {
                    bVar2 = cg.b.f6161b;
                }
                e1Var.M0(cg.a.i(0L, bVar2), true, false, true);
                e1Var.n1.setText("");
                return;
            default:
                k6 k6Var = (k6) this.f4931b;
                k6Var.getClass();
                if (i7 == 0) {
                    bVar3 = cg.b.f6160a;
                } else {
                    bVar3 = cg.b.f6161b;
                }
                k6Var.f4161q = bVar3;
                k6Var.a(true);
                return;
        }
    }
}
