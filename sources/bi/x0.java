package bi;

import org.telegram.messenger.MessagesStorage;
public final class x0 implements MessagesStorage.IntCallback {
    public final int f5640a;
    public final Object f5641b;

    public x0(Object obj, int i10) {
        this.f5640a = i10;
        this.f5641b = obj;
    }

    @Override
    public final void run(int i10) {
        bg.b bVar;
        bg.b bVar2;
        bg.b bVar3;
        switch (this.f5640a) {
            case 0:
                b1 b1Var = (b1) this.f5641b;
                b1Var.getClass();
                if (i10 == 0) {
                    bVar = bg.b.f3980a;
                } else {
                    bVar = bg.b.f3981b;
                }
                b1Var.U(bg.a.i(0L, bVar), true, false, true);
                b1Var.f4310e0.setText("");
                return;
            case 1:
                g1 g1Var = (g1) this.f5641b;
                g1Var.getClass();
                if (i10 == 0) {
                    bVar2 = bg.b.f3980a;
                } else {
                    bVar2 = bg.b.f3981b;
                }
                g1Var.q(bg.a.i(0L, bVar2), true, false, true);
                g1Var.h.setText("");
                return;
            default:
                g6 g6Var = (g6) this.f5641b;
                g6Var.getClass();
                if (i10 == 0) {
                    bVar3 = bg.b.f3980a;
                } else {
                    bVar3 = bg.b.f3981b;
                }
                g6Var.f4674q = bVar3;
                g6Var.a(true);
                return;
        }
    }
}
