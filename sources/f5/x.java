package f5;

import com.google.android.gms.internal.play_billing.f3;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.h3;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.j3;
import com.google.android.gms.internal.play_billing.k3;
import com.google.android.gms.internal.play_billing.m3;
public abstract class x {
    public static final int f11193a = 0;

    static {
        int i7 = y.f11194t;
    }

    public static String a(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String simpleName = exc.getClass().getSimpleName();
            String message = exc.getMessage();
            if (message == null) {
                message = "";
            }
            String str = simpleName + ":" + message;
            int i7 = com.google.android.gms.internal.play_billing.u.f7466a;
            if (str.length() > 40) {
                return str.substring(0, 40);
            }
            return str;
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to get truncated exception info", th2);
            return null;
        }
    }

    public static g3 b(int i7, int i10, f fVar, String str, m3 m3Var) {
        try {
            j3 s5 = k3.s();
            int i11 = fVar.f11151a;
            s5.c();
            k3.r((k3) s5.f7469b, i11);
            String str2 = fVar.f11153c;
            s5.c();
            k3.o((k3) s5.f7469b, str2);
            int i12 = fVar.f11152b;
            if (i12 != 0) {
                s5.c();
                k3.p((k3) s5.f7469b, i12);
            }
            if (i7 != 0) {
                s5.c();
                k3.q((k3) s5.f7469b, i7);
            }
            if (str != null) {
                s5.c();
                k3.n((k3) s5.f7469b, str);
            }
            f3 u10 = g3.u();
            u10.d(s5);
            u10.c();
            g3.t((g3) u10.f7469b, i10);
            if (!m3Var.equals(m3.BROADCAST_ACTION_UNSPECIFIED)) {
                u10.c();
                g3.p((g3) u10.f7469b, m3Var);
            }
            return (g3) u10.a();
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to create logging payload", th2);
            return null;
        }
    }

    public static i3 c(int i7, m3 m3Var) {
        try {
            h3 s5 = i3.s();
            s5.c();
            i3.r((i3) s5.f7469b, i7);
            if (!m3Var.equals(m3.BROADCAST_ACTION_UNSPECIFIED)) {
                s5.c();
                i3.o((i3) s5.f7469b, m3Var);
            }
            return (i3) s5.a();
        } catch (Exception e10) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to create logging payload", e10);
            return null;
        }
    }
}
