package ai;

import org.telegram.messenger.MessagesStorage;
public final class w0 implements MessagesStorage.IntCallback {
    public final int f2347a;
    public final Object f2348b;

    public w0(Object obj, int i10) {
        this.f2347a = i10;
        this.f2348b = obj;
    }

    @Override
    public final void run(int i10) {
        ag.b bVar;
        ag.b bVar2;
        ag.b bVar3;
        switch (this.f2347a) {
            case 0:
                b1 b1Var = (b1) this.f2348b;
                b1Var.getClass();
                if (i10 == 0) {
                    bVar = ag.b.f633a;
                } else {
                    bVar = ag.b.f634b;
                }
                b1Var.V(ag.a.i(0L, bVar), true, false, true);
                b1Var.f997d0.setText("");
                return;
            case 1:
                h1 h1Var = (h1) this.f2348b;
                h1Var.getClass();
                if (i10 == 0) {
                    bVar2 = ag.b.f633a;
                } else {
                    bVar2 = ag.b.f634b;
                }
                h1Var.s(ag.a.i(0L, bVar2), true, false, true);
                h1Var.h.setText("");
                return;
            default:
                k6 k6Var = (k6) this.f2348b;
                k6Var.getClass();
                if (i10 == 0) {
                    bVar3 = ag.b.f633a;
                } else {
                    bVar3 = ag.b.f634b;
                }
                k6Var.f1645q = bVar3;
                k6Var.a(true);
                return;
        }
    }
}
