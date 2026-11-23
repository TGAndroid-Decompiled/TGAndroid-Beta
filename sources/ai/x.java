package ai;

import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.hf;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.rf;
public final class x implements Runnable {
    public final int f1587a;
    public final l0 f1588b;

    public x(l0 l0Var, int i7) {
        this.f1587a = i7;
        this.f1588b = l0Var;
    }

    @Override
    public final void run() {
        o0 o0Var;
        o0 o0Var2;
        o0 o0Var3;
        switch (this.f1587a) {
            case 0:
                l0 l0Var = this.f1588b;
                if (!l0Var.n() && (o0Var = l0Var.f1352s) != null) {
                    o0Var.setShown(false);
                    return;
                }
                return;
            case 1:
                l0 l0Var2 = this.f1588b;
                if (!l0Var2.n() && (o0Var2 = l0Var2.f1352s) != null) {
                    o0Var2.e();
                    return;
                }
                return;
            case 2:
                hf hfVar = this.f1588b.f1337f.f39289a.F0;
                if (hfVar != null) {
                    hfVar.requestFocus();
                    return;
                }
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView = this.f1588b.f1337f.f39289a;
                chatActivityEnterView.G1 = 0L;
                chatActivityEnterView.H1 = null;
                return;
            case 4:
                l0 l0Var3 = this.f1588b;
                rf rfVar = l0Var3.f1337f;
                String x10 = l0Var3.x();
                d0 d0Var = new d0(l0Var3, 0);
                rfVar.getClass();
                ChatActivityEnterView chatActivityEnterView2 = rfVar.f39289a;
                org.telegram.ui.Components.m0 m0Var = new org.telegram.ui.Components.m0(chatActivityEnterView2.getContext(), chatActivityEnterView2.M4);
                m0Var.x1(x10);
                m0Var.f37285f2 = d0Var;
                m0Var.show();
                return;
            case 5:
                hf hfVar2 = this.f1588b.f1337f.f39289a.F0;
                if (hfVar2 != null) {
                    hfVar2.requestFocus();
                    return;
                }
                return;
            case 6:
                l0 l0Var4 = this.f1588b;
                if (l0Var4.f1350r == 3 && (o0Var3 = l0Var4.f1352s) != null) {
                    o0Var3.e();
                    return;
                }
                return;
            case 7:
                l0 l0Var5 = this.f1588b;
                int i7 = l0Var5.f1350r;
                if (i7 == 3 || i7 == 4) {
                    l0Var5.f1357w.setIsland(true);
                    return;
                }
                return;
            case 8:
                l0 l0Var6 = this.f1588b;
                if (l0Var6.f1350r == 1) {
                    l0Var6.K(true);
                    return;
                }
                return;
            case 9:
                l0 l0Var7 = this.f1588b;
                if (l0Var7.f1350r == 1) {
                    l0Var7.K(false);
                    return;
                }
                return;
            case 10:
                kr krVar = kr.h;
                l0 l0Var8 = this.f1588b;
                l0Var8.b(0.0f, 320L, krVar);
                org.telegram.messenger.g0.h3(new x(l0Var8, 1), 360L);
                return;
            default:
                l0 l0Var9 = this.f1588b;
                if (!l0Var9.n()) {
                    l0Var9.f1337f.f39289a.N1(null, true);
                    l0Var9.b(0.0f, 240L, kr.f36859g);
                    return;
                }
                return;
        }
    }
}
