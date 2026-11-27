package defpackage;

import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.d;
public final class vm3 implements Runnable {
    public final byte a;
    public final bn3 b;

    public vm3(bn3 bn3Var, byte b) {
        this.a = b;
        this.b = bn3Var;
    }

    @Override
    public final void run() {
        en3 en3Var;
        en3 en3Var2;
        en3 en3Var3;
        byte b = this.a;
        bn3 bn3Var = this.b;
        switch (b) {
            case 0:
                byte b2 = bn3Var.r;
                if ((b2 == 3 || b2 == 4) && !wf3.B(bn3Var.f.a.F3)) {
                    bn3Var.w.setIsland(true);
                    return;
                }
                return;
            case 1:
                tx1 tx1Var = bn3Var.f.a.F0;
                if (tx1Var != null) {
                    tx1Var.requestFocus();
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView = bn3Var.f.a;
                chatActivityEnterView.F1 = 0L;
                chatActivityEnterView.G1 = null;
                return;
            case 3:
                d dVar = bn3Var.f;
                String B = bn3Var.B();
                zj3 zj3Var = new zj3(bn3Var, (byte) 3);
                ChatActivityEnterView chatActivityEnterView2 = dVar.a;
                int i = ChatActivityEnterView.X7;
                chatActivityEnterView2.n1(B, zj3Var);
                return;
            case 4:
                tx1 tx1Var2 = bn3Var.f.a.F0;
                if (tx1Var2 != null) {
                    tx1Var2.requestFocus();
                    return;
                }
                return;
            case 5:
                if (bn3Var.r == 3 && (en3Var = bn3Var.s) != null) {
                    en3Var.e();
                    return;
                }
                return;
            case 6:
                if (bn3Var.r == 1) {
                    bn3Var.Q(true);
                    return;
                }
                return;
            case 7:
                if (bn3Var.r == 1) {
                    bn3Var.Q(false);
                    return;
                }
                return;
            case 8:
                bn3Var.b(0.0f, 320L, k43.h);
                hl.d3(new vm3(bn3Var, (byte) 11), 360L);
                return;
            case 9:
                if (!bn3Var.s()) {
                    bn3Var.f.d(null);
                    bn3Var.b(0.0f, 240L, k43.g);
                    return;
                }
                return;
            case 10:
                if (!bn3Var.s() && (en3Var2 = bn3Var.s) != null) {
                    en3Var2.setShown(false);
                    return;
                }
                return;
            default:
                if (!bn3Var.s() && (en3Var3 = bn3Var.s) != null) {
                    en3Var3.e();
                    return;
                }
                return;
        }
    }
}
