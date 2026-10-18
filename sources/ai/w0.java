package ai;

import org.telegram.messenger.MessagesStorage;
public final class w0 implements MessagesStorage.IntCallback {
    public final int f2350a;
    public final Object f2351b;

    public w0(Object obj, int i10) {
        this.f2350a = i10;
        this.f2351b = obj;
    }

    @Override
    public final void run(int i10) {
        ag.c cVar;
        ag.c cVar2;
        ag.c cVar3;
        switch (this.f2350a) {
            case 0:
                b1 b1Var = (b1) this.f2351b;
                b1Var.getClass();
                if (i10 == 0) {
                    cVar = ag.c.f635a;
                } else {
                    cVar = ag.c.f636b;
                }
                b1Var.V(ag.a.i(0L, cVar), true, false, true);
                b1Var.f998d0.setText("");
                return;
            case 1:
                h1 h1Var = (h1) this.f2351b;
                h1Var.getClass();
                if (i10 == 0) {
                    cVar2 = ag.c.f635a;
                } else {
                    cVar2 = ag.c.f636b;
                }
                h1Var.r(ag.a.i(0L, cVar2), true, false, true);
                h1Var.h.setText("");
                return;
            default:
                k6 k6Var = (k6) this.f2351b;
                k6Var.getClass();
                if (i10 == 0) {
                    cVar3 = ag.c.f635a;
                } else {
                    cVar3 = ag.c.f636b;
                }
                k6Var.f1649q = cVar3;
                k6Var.a(true);
                return;
        }
    }
}
