package fi;

import c8.ka;
import j$.util.Objects;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ns;
import org.telegram.messenger.voip.NativeInstance;
public final class x0 implements Runnable {
    public final int f12487a;
    public final e1 f12488b;

    public x0(e1 e1Var, int i7) {
        this.f12487a = i7;
        this.f12488b = e1Var;
    }

    @Override
    public final void run() {
        switch (this.f12487a) {
            case 0:
                this.f12488b.p();
                return;
            case 1:
                this.f12488b.q();
                return;
            case 2:
                this.f12488b.t(true);
                return;
            case 3:
                e1 e1Var = this.f12488b;
                ns.f(e1Var.f11656e).k(176, Long.valueOf(e1Var.f11661w.f28061id));
                e1Var.u(true);
                return;
            case 4:
                this.f12488b.w();
                return;
            case 5:
                this.f12488b.t(true);
                return;
            case 6:
                e1 e1Var2 = this.f12488b;
                if (e1Var2.F != null) {
                    org.telegram.messenger.p5 p5Var = Utilities.f22416e;
                    NativeInstance nativeInstance = e1Var2.F;
                    Objects.requireNonNull(nativeInstance);
                    p5Var.c(new org.telegram.messenger.voip.q0(nativeInstance, 3));
                    e1Var2.N.clear();
                    e1Var2.F = null;
                }
                e1Var2.k();
                return;
            case 7:
                this.f12488b.t(true);
                return;
            case 8:
                this.f12488b.t(true);
                return;
            case 9:
                e1 e1Var3 = this.f12488b;
                if (e1Var3.F != null) {
                    org.telegram.messenger.p5 p5Var2 = Utilities.f22416e;
                    NativeInstance nativeInstance2 = e1Var3.F;
                    Objects.requireNonNull(nativeInstance2);
                    p5Var2.c(new org.telegram.messenger.voip.q0(nativeInstance2, 3));
                    e1Var3.N.clear();
                    e1Var3.F = null;
                }
                e1Var3.k();
                return;
            case 10:
                this.f12488b.p();
                return;
            case 11:
                this.f12488b.q();
                return;
            default:
                e1 e1Var4 = this.f12488b;
                if (!e1Var4.f11658n) {
                    ka.b(new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, new ai.f0(e1Var4, 14));
                    return;
                }
                return;
        }
    }
}
