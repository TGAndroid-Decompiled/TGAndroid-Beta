package gh;

import org.telegram.messenger.MessagesStorage;
public final class k0 implements MessagesStorage.IntCallback {
    public final int f8380a;
    public final Object f8381b;

    public k0(Object obj, int i9) {
        this.f8380a = i9;
        this.f8381b = obj;
    }

    @Override
    public final void run(int i9) {
        gf.b bVar;
        gf.b bVar2;
        gf.b bVar3;
        switch (this.f8380a) {
            case 0:
                o0 o0Var = (o0) this.f8381b;
                o0Var.getClass();
                if (i9 == 0) {
                    bVar = gf.b.f7749a;
                } else {
                    bVar = gf.b.f7750b;
                }
                o0Var.T(gf.a.i(0L, bVar), true, false, true);
                o0Var.Z.setText("");
                return;
            case 1:
                t0 t0Var = (t0) this.f8381b;
                t0Var.getClass();
                if (i9 == 0) {
                    bVar2 = gf.b.f7749a;
                } else {
                    bVar2 = gf.b.f7750b;
                }
                t0Var.q(gf.a.i(0L, bVar2), true, false, true);
                t0Var.h.setText("");
                return;
            default:
                o4 o4Var = (o4) this.f8381b;
                o4Var.getClass();
                if (i9 == 0) {
                    bVar3 = gf.b.f7749a;
                } else {
                    bVar3 = gf.b.f7750b;
                }
                o4Var.f8682q = bVar3;
                o4Var.a(true);
                return;
        }
    }
}
