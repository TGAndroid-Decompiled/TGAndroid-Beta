package ai;

import org.telegram.messenger.MessagesStorage;
public final class w0 implements MessagesStorage.IntCallback {
    public final int f2338a;
    public final Object f2339b;

    public w0(Object obj, int i10) {
        this.f2338a = i10;
        this.f2339b = obj;
    }

    @Override
    public final void run(int i10) {
        ag.b bVar;
        ag.b bVar2;
        ag.b bVar3;
        switch (this.f2338a) {
            case 0:
                b1 b1Var = (b1) this.f2339b;
                b1Var.getClass();
                if (i10 == 0) {
                    bVar = ag.b.f633a;
                } else {
                    bVar = ag.b.f634b;
                }
                b1Var.V(ag.a.i(0L, bVar), true, false, true);
                b1Var.f1006d0.setText("");
                return;
            case 1:
                h1 h1Var = (h1) this.f2339b;
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
                l6 l6Var = (l6) this.f2339b;
                l6Var.getClass();
                if (i10 == 0) {
                    bVar3 = ag.b.f633a;
                } else {
                    bVar3 = ag.b.f634b;
                }
                l6Var.f1716q = bVar3;
                l6Var.a(true);
                return;
        }
    }
}
