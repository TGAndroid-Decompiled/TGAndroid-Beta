package defpackage;

import androidx.recyclerview.widget.RecyclerView;
public final class pt4 implements Runnable {
    public final byte a;
    public final qt4 b;
    public final st4 c;

    public pt4(qt4 qt4Var, st4 st4Var, byte b) {
        this.a = b;
        this.b = qt4Var;
        this.c = st4Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        st4 st4Var = this.c;
        qt4 qt4Var = this.b;
        switch (b) {
            case 0:
                gu guVar = qt4Var.c.d;
                guVar.getClass();
                int S = RecyclerView.S(st4Var);
                if (S != -1) {
                    r69 r69Var = guVar.U0;
                    if (r69Var != null) {
                        r69Var.e(S, st4Var);
                        return;
                    }
                    s69 s69Var = guVar.V0;
                    if (s69Var != null) {
                        s69Var.d(0.0f, 0.0f, S, st4Var);
                        return;
                    }
                    return;
                }
                return;
            default:
                gu guVar2 = qt4Var.c.d;
                guVar2.getClass();
                int S2 = RecyclerView.S(st4Var);
                if (S2 != -1) {
                    t69 t69Var = guVar2.W0;
                    if (t69Var != null) {
                        t69Var.e(S2, st4Var);
                        return;
                    }
                    u69 u69Var = guVar2.X0;
                    if (u69Var != null) {
                        u69Var.mo8d(0.0f, 0.0f, S2, st4Var);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
