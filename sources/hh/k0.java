package hh;

import org.telegram.messenger.MessagesStorage;

public final class k0 implements MessagesStorage.IntCallback {

    public final int f9568a;

    public final Object f9569b;

    public k0(Object obj, int i10) {
        this.f9568a = i10;
        this.f9569b = obj;
    }

    @Override
    public final void run(int i10) {
        switch (this.f9568a) {
            case 0:
                o0 o0Var = (o0) this.f9569b;
                o0Var.getClass();
                o0Var.U(hf.a.i(0L, i10 == 0 ? hf.b.f8921a : hf.b.f8922b), true, false, true);
                o0Var.Z.setText("");
                break;
            case 1:
                t0 t0Var = (t0) this.f9569b;
                t0Var.getClass();
                t0Var.r(hf.a.i(0L, i10 == 0 ? hf.b.f8921a : hf.b.f8922b), true, false, true);
                t0Var.h.setText("");
                break;
            default:
                m4 m4Var = (m4) this.f9569b;
                m4Var.getClass();
                m4Var.f9728q = i10 == 0 ? hf.b.f8921a : hf.b.f8922b;
                m4Var.a(true);
                break;
        }
    }
}
