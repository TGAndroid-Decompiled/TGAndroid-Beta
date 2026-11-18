package ai;

import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.qf;
public final class b0 implements Runnable {
    public final int f1123a;
    public final n0 f1124b;

    public b0(n0 n0Var, int i7) {
        this.f1123a = i7;
        this.f1124b = n0Var;
    }

    @Override
    public final void run() {
        q0 q0Var;
        q0 q0Var2;
        q0 q0Var3;
        switch (this.f1123a) {
            case 0:
                n0 n0Var = this.f1124b;
                if (!n0Var.o() && (q0Var = n0Var.f1379s) != null) {
                    q0Var.setShown(false);
                    return;
                }
                return;
            case 1:
                n0 n0Var2 = this.f1124b;
                if (!n0Var2.o() && (q0Var2 = n0Var2.f1379s) != null) {
                    q0Var2.e();
                    return;
                }
                return;
            case 2:
                gf gfVar = this.f1124b.f1364f.f38784a.F0;
                if (gfVar != null) {
                    gfVar.requestFocus();
                    return;
                }
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView = this.f1124b.f1364f.f38784a;
                chatActivityEnterView.E1 = 0L;
                chatActivityEnterView.F1 = null;
                return;
            case 4:
                n0 n0Var3 = this.f1124b;
                qf qfVar = n0Var3.f1364f;
                String y10 = n0Var3.y();
                g0 g0Var = new g0(n0Var3, 0);
                qfVar.getClass();
                ChatActivityEnterView chatActivityEnterView2 = qfVar.f38784a;
                org.telegram.ui.Components.m0 m0Var = new org.telegram.ui.Components.m0(chatActivityEnterView2.getContext(), chatActivityEnterView2.K4);
                m0Var.x1(y10);
                m0Var.f37285f2 = g0Var;
                m0Var.show();
                return;
            case 5:
                gf gfVar2 = this.f1124b.f1364f.f38784a.F0;
                if (gfVar2 != null) {
                    gfVar2.requestFocus();
                    return;
                }
                return;
            case 6:
                n0 n0Var4 = this.f1124b;
                if (n0Var4.f1377r == 3 && (q0Var3 = n0Var4.f1379s) != null) {
                    q0Var3.e();
                    return;
                }
                return;
            case 7:
                n0 n0Var5 = this.f1124b;
                int i7 = n0Var5.f1377r;
                if (i7 == 3 || i7 == 4) {
                    n0Var5.f1384w.setIsland(true);
                    return;
                }
                return;
            case 8:
                n0 n0Var6 = this.f1124b;
                if (n0Var6.f1377r == 1) {
                    n0Var6.J(true);
                    return;
                }
                return;
            case 9:
                n0 n0Var7 = this.f1124b;
                if (n0Var7.f1377r == 1) {
                    n0Var7.J(false);
                    return;
                }
                return;
            case 10:
                lr lrVar = lr.h;
                n0 n0Var8 = this.f1124b;
                n0Var8.b(0.0f, 320L, lrVar);
                org.telegram.messenger.g0.h3(new b0(n0Var8, 1), 360L);
                return;
            default:
                n0 n0Var9 = this.f1124b;
                if (!n0Var9.o()) {
                    n0Var9.f1364f.f38784a.I1(null, true);
                    n0Var9.b(0.0f, 240L, lr.f37209g);
                    return;
                }
                return;
        }
    }
}
