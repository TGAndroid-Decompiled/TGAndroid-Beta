package ai;

import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ae;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.xe;
public final class a0 implements Runnable {
    public final int f1114a;
    public final m0 f1115b;

    public a0(m0 m0Var, int i7) {
        this.f1114a = i7;
        this.f1115b = m0Var;
    }

    @Override
    public final void run() {
        p0 p0Var;
        p0 p0Var2;
        p0 p0Var3;
        switch (this.f1114a) {
            case 0:
                m0 m0Var = this.f1115b;
                if (!m0Var.k() && (p0Var = m0Var.f1380s) != null) {
                    p0Var.setShown(false);
                    return;
                }
                return;
            case 1:
                m0 m0Var2 = this.f1115b;
                if (!m0Var2.k() && (p0Var2 = m0Var2.f1380s) != null) {
                    p0Var2.e();
                    return;
                }
                return;
            case 2:
                xe xeVar = this.f1115b.f1365f.f32967b.F0;
                if (xeVar != null) {
                    xeVar.requestFocus();
                    return;
                }
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView = this.f1115b.f1365f.f32967b;
                chatActivityEnterView.f32325y1 = 0L;
                chatActivityEnterView.f32332z1 = null;
                return;
            case 4:
                m0 m0Var3 = this.f1115b;
                ae aeVar = m0Var3.f1365f;
                String t6 = m0Var3.t();
                f0 f0Var = new f0(m0Var3, 0);
                aeVar.getClass();
                ChatActivityEnterView chatActivityEnterView2 = aeVar.f32967b;
                org.telegram.ui.Components.d0 d0Var = new org.telegram.ui.Components.d0(chatActivityEnterView2.getContext(), chatActivityEnterView2.E4);
                d0Var.s1(t6);
                d0Var.f33751f2 = f0Var;
                d0Var.show();
                return;
            case 5:
                xe xeVar2 = this.f1115b.f1365f.f32967b.F0;
                if (xeVar2 != null) {
                    xeVar2.requestFocus();
                    return;
                }
                return;
            case 6:
                m0 m0Var4 = this.f1115b;
                if (m0Var4.f1378r == 3 && (p0Var3 = m0Var4.f1380s) != null) {
                    p0Var3.e();
                    return;
                }
                return;
            case 7:
                m0 m0Var5 = this.f1115b;
                int i7 = m0Var5.f1378r;
                if (i7 == 3 || i7 == 4) {
                    m0Var5.f1385w.setIsland(true);
                    return;
                }
                return;
            case 8:
                m0 m0Var6 = this.f1115b;
                if (m0Var6.f1378r == 1) {
                    m0Var6.B(true);
                    return;
                }
                return;
            case 9:
                m0 m0Var7 = this.f1115b;
                if (m0Var7.f1378r == 1) {
                    m0Var7.B(false);
                    return;
                }
                return;
            case 10:
                er erVar = er.h;
                m0 m0Var8 = this.f1115b;
                m0Var8.b(0.0f, 320L, erVar);
                org.telegram.messenger.g0.i3(new a0(m0Var8, 1), 360L);
                return;
            default:
                m0 m0Var9 = this.f1115b;
                if (!m0Var9.k()) {
                    m0Var9.f1365f.f32967b.A1(null, true);
                    m0Var9.b(0.0f, 240L, er.f34421g);
                    return;
                }
                return;
        }
    }
}
