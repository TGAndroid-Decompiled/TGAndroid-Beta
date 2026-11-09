package di;

import c8.ia;
import j$.util.Objects;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.qs;
import org.telegram.messenger.voip.NativeInstance;
public final class x0 implements Runnable {
    public final int f9920a;
    public final g1 f9921b;

    public x0(g1 g1Var, int i7) {
        this.f9920a = i7;
        this.f9921b = g1Var;
    }

    @Override
    public final void run() {
        switch (this.f9920a) {
            case 0:
                this.f9921b.p();
                return;
            case 1:
                this.f9921b.q();
                return;
            case 2:
                this.f9921b.t(true);
                return;
            case 3:
                g1 g1Var = this.f9921b;
                qs.f(g1Var.f9000e).k(176, Long.valueOf(g1Var.f9005w.f26966id));
                g1Var.u(true);
                return;
            case 4:
                this.f9921b.w();
                return;
            case 5:
                this.f9921b.t(true);
                return;
            case 6:
                g1 g1Var2 = this.f9921b;
                if (g1Var2.E != null) {
                    org.telegram.messenger.p5 p5Var = Utilities.f21336e;
                    NativeInstance nativeInstance = g1Var2.E;
                    Objects.requireNonNull(nativeInstance);
                    p5Var.c(new org.telegram.messenger.voip.p0(nativeInstance, 3));
                    g1Var2.M.clear();
                    g1Var2.E = null;
                }
                g1Var2.k();
                return;
            case 7:
                this.f9921b.t(true);
                return;
            case 8:
                this.f9921b.t(true);
                return;
            case 9:
                g1 g1Var3 = this.f9921b;
                if (g1Var3.E != null) {
                    org.telegram.messenger.p5 p5Var2 = Utilities.f21336e;
                    NativeInstance nativeInstance2 = g1Var3.E;
                    Objects.requireNonNull(nativeInstance2);
                    p5Var2.c(new org.telegram.messenger.voip.p0(nativeInstance2, 3));
                    g1Var3.M.clear();
                    g1Var3.E = null;
                }
                g1Var3.k();
                return;
            case 10:
                this.f9921b.p();
                return;
            case 11:
                this.f9921b.q();
                return;
            default:
                g1 g1Var4 = this.f9921b;
                if (!g1Var4.f9002n) {
                    ia.b(new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, new ai.i(g1Var4, 10));
                    return;
                }
                return;
        }
    }
}
