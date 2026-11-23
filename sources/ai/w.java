package ai;

import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.rf;
public final class w implements Runnable {
    public final int f1575a;
    public final k0 f1576b;

    public w(k0 k0Var, int i7) {
        this.f1575a = i7;
        this.f1576b = k0Var;
    }

    @Override
    public final void run() {
        n0 n0Var;
        n0 n0Var2;
        n0 n0Var3;
        switch (this.f1575a) {
            case 0:
                k0 k0Var = this.f1576b;
                if (!k0Var.p() && (n0Var = k0Var.f1337s) != null) {
                    n0Var.setShown(false);
                    return;
                }
                return;
            case 1:
                k0 k0Var2 = this.f1576b;
                if (!k0Var2.p() && (n0Var2 = k0Var2.f1337s) != null) {
                    n0Var2.e();
                    return;
                }
                return;
            case 2:
                gf gfVar = this.f1576b.f1322f.f39132a.F0;
                if (gfVar != null) {
                    gfVar.requestFocus();
                    return;
                }
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView = this.f1576b.f1322f.f39132a;
                chatActivityEnterView.G1 = 0L;
                chatActivityEnterView.H1 = null;
                return;
            case 4:
                k0 k0Var3 = this.f1576b;
                rf rfVar = k0Var3.f1322f;
                String z10 = k0Var3.z();
                c0 c0Var = new c0(k0Var3, 0);
                rfVar.getClass();
                ChatActivityEnterView chatActivityEnterView2 = rfVar.f39132a;
                org.telegram.ui.Components.n0 n0Var4 = new org.telegram.ui.Components.n0(chatActivityEnterView2.getContext(), chatActivityEnterView2.M4);
                n0Var4.x1(z10);
                n0Var4.f37641f2 = c0Var;
                n0Var4.show();
                return;
            case 5:
                gf gfVar2 = this.f1576b.f1322f.f39132a.F0;
                if (gfVar2 != null) {
                    gfVar2.requestFocus();
                    return;
                }
                return;
            case 6:
                k0 k0Var4 = this.f1576b;
                if (k0Var4.f1335r == 3 && (n0Var3 = k0Var4.f1337s) != null) {
                    n0Var3.e();
                    return;
                }
                return;
            case 7:
                k0 k0Var5 = this.f1576b;
                int i7 = k0Var5.f1335r;
                if (i7 == 3 || i7 == 4) {
                    k0Var5.f1342w.setIsland(true);
                    return;
                }
                return;
            case 8:
                k0 k0Var6 = this.f1576b;
                if (k0Var6.f1335r == 1) {
                    k0Var6.M(true);
                    return;
                }
                return;
            case 9:
                k0 k0Var7 = this.f1576b;
                if (k0Var7.f1335r == 1) {
                    k0Var7.M(false);
                    return;
                }
                return;
            case 10:
                nr nrVar = nr.h;
                k0 k0Var8 = this.f1576b;
                k0Var8.b(0.0f, 320L, nrVar);
                org.telegram.messenger.g0.h3(new w(k0Var8, 1), 360L);
                return;
            default:
                k0 k0Var9 = this.f1576b;
                if (!k0Var9.p()) {
                    k0Var9.f1322f.f39132a.M1(null, true);
                    k0Var9.b(0.0f, 240L, nr.f37918g);
                    return;
                }
                return;
        }
    }
}
