package defpackage;

import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.d;
public final class cm3 implements Runnable {
    public final byte a;
    public final jm3 b;

    public cm3(jm3 jm3Var, byte b) {
        this.a = b;
        this.b = jm3Var;
    }

    @Override
    public final void run() {
        mm3 mm3Var;
        mm3 mm3Var2;
        mm3 mm3Var3;
        byte b = this.a;
        jm3 jm3Var = this.b;
        switch (b) {
            case 0:
                if (!jm3Var.q() && (mm3Var = jm3Var.s) != null) {
                    mm3Var.setShown(false);
                    return;
                }
                return;
            case 1:
                if (!jm3Var.q() && (mm3Var2 = jm3Var.s) != null) {
                    mm3Var2.e();
                    return;
                }
                return;
            case 2:
                ex1 ex1Var = jm3Var.f.a.F0;
                if (ex1Var != null) {
                    ex1Var.requestFocus();
                    return;
                }
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView = jm3Var.f.a;
                chatActivityEnterView.G1 = 0L;
                chatActivityEnterView.H1 = null;
                return;
            case 4:
                d dVar = jm3Var.f;
                String z = jm3Var.z();
                hj3 hj3Var = new hj3(jm3Var, (byte) 3);
                dVar.getClass();
                ChatActivityEnterView chatActivityEnterView2 = dVar.a;
                a1 a1Var = new a1(chatActivityEnterView2.getContext(), chatActivityEnterView2.L4);
                a1Var.o1(z);
                a1Var.e2 = hj3Var;
                a1Var.show();
                return;
            case 5:
                ex1 ex1Var2 = jm3Var.f.a.F0;
                if (ex1Var2 != null) {
                    ex1Var2.requestFocus();
                    return;
                }
                return;
            case 6:
                if (jm3Var.r == 3 && (mm3Var3 = jm3Var.s) != null) {
                    mm3Var3.e();
                    return;
                }
                return;
            case 7:
                byte b2 = jm3Var.r;
                if (b2 == 3 || b2 == 4) {
                    jm3Var.w.setIsland(true);
                    return;
                }
                return;
            case 8:
                if (jm3Var.r == 1) {
                    jm3Var.M(true);
                    return;
                }
                return;
            case 9:
                if (jm3Var.r == 1) {
                    jm3Var.M(false);
                    return;
                }
                return;
            case 10:
                jm3Var.b(0.0f, 320L, s33.h);
                gl.e3(new cm3(jm3Var, (byte) 1), 360L);
                return;
            default:
                if (!jm3Var.q()) {
                    jm3Var.f.a.L1(null, true);
                    jm3Var.b(0.0f, 240L, s33.g);
                    return;
                }
                return;
        }
    }
}
