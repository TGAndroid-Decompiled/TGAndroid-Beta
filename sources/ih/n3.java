package ih;

import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.gr;
public final class n3 implements Runnable {
    public final int f11841a;
    public final m9 f11842b;

    public n3(m9 m9Var, int i9) {
        this.f11841a = i9;
        this.f11842b = m9Var;
    }

    @Override
    public final void run() {
        switch (this.f11841a) {
            case 0:
                this.f11842b.P();
                return;
            case 1:
                m9 m9Var = this.f11842b;
                m9Var.Y = true;
                m9Var.n(true);
                return;
            case 2:
                m9 m9Var2 = this.f11842b;
                if (m9Var2.B != null) {
                    b9 b9Var = m9Var2.v;
                    if (b9Var != null) {
                        v.f12218c = true;
                        b9Var.setLayerType(2, null);
                    }
                    m9Var2.B.addListener(new v8(m9Var2, 0));
                    m9Var2.B.setDuration(320L);
                    m9Var2.B.setInterpolator(gr.h);
                    m9Var2.B.start();
                    return;
                }
                return;
            case 3:
                m9 m9Var3 = this.f11842b;
                m9Var3.f11822r0 = null;
                m9Var3.P();
                return;
            case 4:
                this.f11842b.L(true);
                return;
            case 5:
                m9 m9Var4 = this.f11842b;
                m9Var4.Q();
                j9 j9Var = m9Var4.f11815o0;
                ImageReceiver imageReceiver = j9Var.f11643b;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(false, true);
                }
                ImageReceiver imageReceiver2 = j9Var.f11644c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setVisible(false, true);
                    return;
                }
                return;
            default:
                this.f11842b.m();
                return;
        }
    }
}
