package bi;

import org.telegram.messenger.sr;
public final class w0 implements sr {
    public final int f4931a;
    public final Object f4932b;

    public w0(Object obj, int i7) {
        this.f4931a = i7;
        this.f4932b = obj;
    }

    @Override
    public final void a(int i7) {
        cg.b bVar;
        cg.b bVar2;
        cg.b bVar3;
        switch (this.f4931a) {
            case 0:
                a1 a1Var = (a1) this.f4932b;
                a1Var.getClass();
                if (i7 == 0) {
                    bVar = cg.b.f6165a;
                } else {
                    bVar = cg.b.f6166b;
                }
                a1Var.f1(cg.a.i(0L, bVar), true, false, true);
                a1Var.Z1.setText("");
                return;
            case 1:
                e1 e1Var = (e1) this.f4932b;
                e1Var.getClass();
                if (i7 == 0) {
                    bVar2 = cg.b.f6165a;
                } else {
                    bVar2 = cg.b.f6166b;
                }
                e1Var.M0(cg.a.i(0L, bVar2), true, false, true);
                e1Var.f3737q1.setText("");
                return;
            default:
                k6 k6Var = (k6) this.f4932b;
                k6Var.getClass();
                if (i7 == 0) {
                    bVar3 = cg.b.f6165a;
                } else {
                    bVar3 = cg.b.f6166b;
                }
                k6Var.f4158q = bVar3;
                k6Var.a(true);
                return;
        }
    }
}
