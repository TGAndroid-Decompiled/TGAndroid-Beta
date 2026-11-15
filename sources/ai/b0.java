package ai;

import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ae;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.xe;
public final class b0 implements Runnable {
    public final int f1124a;
    public final n0 f1125b;

    public b0(n0 n0Var, int i7) {
        this.f1124a = i7;
        this.f1125b = n0Var;
    }

    @Override
    public final void run() {
        q0 q0Var;
        q0 q0Var2;
        q0 q0Var3;
        switch (this.f1124a) {
            case 0:
                n0 n0Var = this.f1125b;
                if (!n0Var.k() && (q0Var = n0Var.f1388s) != null) {
                    q0Var.setShown(false);
                    return;
                }
                return;
            case 1:
                n0 n0Var2 = this.f1125b;
                if (!n0Var2.k() && (q0Var2 = n0Var2.f1388s) != null) {
                    q0Var2.e();
                    return;
                }
                return;
            case 2:
                xe xeVar = this.f1125b.f1373f.f32970b.F0;
                if (xeVar != null) {
                    xeVar.requestFocus();
                    return;
                }
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView = this.f1125b.f1373f.f32970b;
                chatActivityEnterView.f32325y1 = 0L;
                chatActivityEnterView.f32332z1 = null;
                return;
            case 4:
                n0 n0Var3 = this.f1125b;
                ae aeVar = n0Var3.f1373f;
                String t6 = n0Var3.t();
                g0 g0Var = new g0(n0Var3, 0);
                aeVar.getClass();
                ChatActivityEnterView chatActivityEnterView2 = aeVar.f32970b;
                org.telegram.ui.Components.d0 d0Var = new org.telegram.ui.Components.d0(chatActivityEnterView2.getContext(), chatActivityEnterView2.E4);
                d0Var.s1(t6);
                d0Var.f33753f2 = g0Var;
                d0Var.show();
                return;
            case 5:
                xe xeVar2 = this.f1125b.f1373f.f32970b.F0;
                if (xeVar2 != null) {
                    xeVar2.requestFocus();
                    return;
                }
                return;
            case 6:
                n0 n0Var4 = this.f1125b;
                if (n0Var4.f1386r == 3 && (q0Var3 = n0Var4.f1388s) != null) {
                    q0Var3.e();
                    return;
                }
                return;
            case 7:
                n0 n0Var5 = this.f1125b;
                int i7 = n0Var5.f1386r;
                if (i7 == 3 || i7 == 4) {
                    n0Var5.f1393w.setIsland(true);
                    return;
                }
                return;
            case 8:
                n0 n0Var6 = this.f1125b;
                if (n0Var6.f1386r == 1) {
                    n0Var6.B(true);
                    return;
                }
                return;
            case 9:
                n0 n0Var7 = this.f1125b;
                if (n0Var7.f1386r == 1) {
                    n0Var7.B(false);
                    return;
                }
                return;
            case 10:
                er erVar = er.h;
                n0 n0Var8 = this.f1125b;
                n0Var8.b(0.0f, 320L, erVar);
                org.telegram.messenger.g0.i3(new b0(n0Var8, 1), 360L);
                return;
            default:
                n0 n0Var9 = this.f1125b;
                if (!n0Var9.k()) {
                    n0Var9.f1373f.f32970b.A1(null, true);
                    n0Var9.b(0.0f, 240L, er.f34420g);
                    return;
                }
                return;
        }
    }
}
