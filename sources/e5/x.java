package e5;

import com.google.android.gms.internal.play_billing.f3;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.h3;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.j3;
import com.google.android.gms.internal.play_billing.k3;
import com.google.android.gms.internal.play_billing.m3;
public abstract class x {
    public static final int f9636a = 0;

    static {
        int i3 = y.f9637l;
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
            int i3 = com.google.android.gms.internal.play_billing.u.f7521a;
            if (str.length() > 40) {
                return str.substring(0, 40);
            }
            return str;
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to get truncated exception info", th2);
            return null;
        }
    }

    public static g3 b(int i3, int i10, f fVar, String str, m3 m3Var) {
        try {
            j3 s6 = k3.s();
            int i11 = fVar.f9593a;
            s6.c();
            k3.r((k3) s6.f7524b, i11);
            String str2 = fVar.f9595c;
            s6.c();
            k3.o((k3) s6.f7524b, str2);
            int i12 = fVar.f9594b;
            if (i12 != 0) {
                s6.c();
                k3.p((k3) s6.f7524b, i12);
            }
            if (i3 != 0) {
                s6.c();
                k3.q((k3) s6.f7524b, i3);
            }
            if (str != null) {
                s6.c();
                k3.n((k3) s6.f7524b, str);
            }
            f3 u10 = g3.u();
            u10.d(s6);
            u10.c();
            g3.t((g3) u10.f7524b, i10);
            if (!m3Var.equals(m3.BROADCAST_ACTION_UNSPECIFIED)) {
                u10.c();
                g3.p((g3) u10.f7524b, m3Var);
            }
            return (g3) u10.a();
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to create logging payload", th2);
            return null;
        }
    }

    public static i3 c(int i3, m3 m3Var) {
        try {
            h3 s6 = i3.s();
            s6.c();
            i3.r((i3) s6.f7524b, i3);
            if (!m3Var.equals(m3.BROADCAST_ACTION_UNSPECIFIED)) {
                s6.c();
                i3.o((i3) s6.f7524b, m3Var);
            }
            return (i3) s6.a();
        } catch (Exception e10) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to create logging payload", e10);
            return null;
        }
    }
}
