package fi;

import c8.oa;
import j$.util.Objects;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ls;
import org.telegram.messenger.voip.NativeInstance;
public final class w0 implements Runnable {
    public final int f12663a;
    public final c1 f12664b;

    public w0(c1 c1Var, int i7) {
        this.f12663a = i7;
        this.f12664b = c1Var;
    }

    @Override
    public final void run() {
        switch (this.f12663a) {
            case 0:
                this.f12664b.p();
                return;
            case 1:
                this.f12664b.q();
                return;
            case 2:
                this.f12664b.t(true);
                return;
            case 3:
                c1 c1Var = this.f12664b;
                ls.f(c1Var.f11788e).k(176, Long.valueOf(c1Var.f11793w.f28408id));
                c1Var.u(true);
                return;
            case 4:
                this.f12664b.w();
                return;
            case 5:
                this.f12664b.t(true);
                return;
            case 6:
                c1 c1Var2 = this.f12664b;
                if (c1Var2.F != null) {
                    org.telegram.messenger.q5 q5Var = Utilities.f22774e;
                    NativeInstance nativeInstance = c1Var2.F;
                    Objects.requireNonNull(nativeInstance);
                    q5Var.c(new org.telegram.messenger.voip.q0(nativeInstance, 3));
                    c1Var2.N.clear();
                    c1Var2.F = null;
                }
                c1Var2.k();
                return;
            case 7:
                this.f12664b.t(true);
                return;
            case 8:
                this.f12664b.t(true);
                return;
            case 9:
                c1 c1Var3 = this.f12664b;
                if (c1Var3.F != null) {
                    org.telegram.messenger.q5 q5Var2 = Utilities.f22774e;
                    NativeInstance nativeInstance2 = c1Var3.F;
                    Objects.requireNonNull(nativeInstance2);
                    q5Var2.c(new org.telegram.messenger.voip.q0(nativeInstance2, 3));
                    c1Var3.N.clear();
                    c1Var3.F = null;
                }
                c1Var3.k();
                return;
            case 10:
                this.f12664b.p();
                return;
            case 11:
                this.f12664b.q();
                return;
            default:
                c1 c1Var4 = this.f12664b;
                if (!c1Var4.f11790n) {
                    oa.b(new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, new ai.c0(c1Var4, 15));
                    return;
                }
                return;
        }
    }
}
