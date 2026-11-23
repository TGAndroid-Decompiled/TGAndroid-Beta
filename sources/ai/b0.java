package ai;

import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.sf;
public final class b0 implements Runnable {
    public final int f1127a;
    public final p0 f1128b;

    public b0(p0 p0Var, int i7) {
        this.f1127a = i7;
        this.f1128b = p0Var;
    }

    @Override
    public final void run() {
        s0 s0Var;
        s0 s0Var2;
        s0 s0Var3;
        switch (this.f1127a) {
            case 0:
                p0 p0Var = this.f1128b;
                if (!p0Var.p() && (s0Var = p0Var.f1407s) != null) {
                    s0Var.setShown(false);
                    return;
                }
                return;
            case 1:
                p0 p0Var2 = this.f1128b;
                if (!p0Var2.p() && (s0Var2 = p0Var2.f1407s) != null) {
                    s0Var2.e();
                    return;
                }
                return;
            case 2:
                gf gfVar = this.f1128b.f1392f.f39573a.F0;
                if (gfVar != null) {
                    gfVar.requestFocus();
                    return;
                }
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView = this.f1128b.f1392f.f39573a;
                chatActivityEnterView.G1 = 0L;
                chatActivityEnterView.H1 = null;
                return;
            case 4:
                p0 p0Var3 = this.f1128b;
                sf sfVar = p0Var3.f1392f;
                String z10 = p0Var3.z();
                h0 h0Var = new h0(p0Var3, 0);
                sfVar.getClass();
                ChatActivityEnterView chatActivityEnterView2 = sfVar.f39573a;
                org.telegram.ui.Components.n0 n0Var = new org.telegram.ui.Components.n0(chatActivityEnterView2.getContext(), chatActivityEnterView2.M4);
                n0Var.x1(z10);
                n0Var.f37686f2 = h0Var;
                n0Var.show();
                return;
            case 5:
                gf gfVar2 = this.f1128b.f1392f.f39573a.F0;
                if (gfVar2 != null) {
                    gfVar2.requestFocus();
                    return;
                }
                return;
            case 6:
                p0 p0Var4 = this.f1128b;
                if (p0Var4.f1405r == 3 && (s0Var3 = p0Var4.f1407s) != null) {
                    s0Var3.e();
                    return;
                }
                return;
            case 7:
                p0 p0Var5 = this.f1128b;
                int i7 = p0Var5.f1405r;
                if (i7 == 3 || i7 == 4) {
                    p0Var5.f1412w.setIsland(true);
                    return;
                }
                return;
            case 8:
                p0 p0Var6 = this.f1128b;
                if (p0Var6.f1405r == 1) {
                    p0Var6.M(true);
                    return;
                }
                return;
            case 9:
                p0 p0Var7 = this.f1128b;
                if (p0Var7.f1405r == 1) {
                    p0Var7.M(false);
                    return;
                }
                return;
            case 10:
                nr nrVar = nr.h;
                p0 p0Var8 = this.f1128b;
                p0Var8.b(0.0f, 320L, nrVar);
                org.telegram.messenger.g0.h3(new b0(p0Var8, 1), 360L);
                return;
            default:
                p0 p0Var9 = this.f1128b;
                if (!p0Var9.p()) {
                    p0Var9.f1392f.f39573a.M1(null, true);
                    p0Var9.b(0.0f, 240L, nr.f37962g);
                    return;
                }
                return;
        }
    }
}
