package fi;

import c8.oa;
import j$.util.Objects;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ks;
import org.telegram.messenger.voip.NativeInstance;
public final class w0 implements Runnable {
    public final int f12675a;
    public final c1 f12676b;

    public w0(c1 c1Var, int i7) {
        this.f12675a = i7;
        this.f12676b = c1Var;
    }

    @Override
    public final void run() {
        switch (this.f12675a) {
            case 0:
                this.f12676b.p();
                return;
            case 1:
                this.f12676b.q();
                return;
            case 2:
                this.f12676b.t(true);
                return;
            case 3:
                c1 c1Var = this.f12676b;
                ks.f(c1Var.f11801e).k(176, Long.valueOf(c1Var.f11806w.f28502id));
                c1Var.u(true);
                return;
            case 4:
                this.f12676b.w();
                return;
            case 5:
                this.f12676b.t(true);
                return;
            case 6:
                c1 c1Var2 = this.f12676b;
                if (c1Var2.F != null) {
                    org.telegram.messenger.q5 q5Var = Utilities.f22877e;
                    NativeInstance nativeInstance = c1Var2.F;
                    Objects.requireNonNull(nativeInstance);
                    q5Var.c(new org.telegram.messenger.voip.q0(nativeInstance, 3));
                    c1Var2.N.clear();
                    c1Var2.F = null;
                }
                c1Var2.k();
                return;
            case 7:
                this.f12676b.t(true);
                return;
            case 8:
                this.f12676b.t(true);
                return;
            case 9:
                c1 c1Var3 = this.f12676b;
                if (c1Var3.F != null) {
                    org.telegram.messenger.q5 q5Var2 = Utilities.f22877e;
                    NativeInstance nativeInstance2 = c1Var3.F;
                    Objects.requireNonNull(nativeInstance2);
                    q5Var2.c(new org.telegram.messenger.voip.q0(nativeInstance2, 3));
                    c1Var3.N.clear();
                    c1Var3.F = null;
                }
                c1Var3.k();
                return;
            case 10:
                this.f12676b.p();
                return;
            case 11:
                this.f12676b.q();
                return;
            default:
                c1 c1Var4 = this.f12676b;
                if (!c1Var4.f11803n) {
                    oa.b(new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, new ai.d0(c1Var4, 15));
                    return;
                }
                return;
        }
    }
}
