package c5;

import com.google.android.gms.internal.play_billing.f3;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.h3;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.j3;
import com.google.android.gms.internal.play_billing.k3;
import com.google.android.gms.internal.play_billing.m3;
public abstract class e0 {
    public static final int f4287a = 0;

    static {
        int i10 = f0.f4290q;
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
            int i10 = com.google.android.gms.internal.play_billing.u.f5668a;
            if (str.length() > 40) {
                return str.substring(0, 40);
            }
            return str;
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to get truncated exception info", th2);
            return null;
        }
    }

    public static g3 b(int i10, int i11, h hVar, String str, m3 m3Var) {
        try {
            j3 s10 = k3.s();
            int i12 = hVar.f4308a;
            s10.c();
            k3.r((k3) s10.f5671b, i12);
            String str2 = hVar.f4310c;
            s10.c();
            k3.o((k3) s10.f5671b, str2);
            int i13 = hVar.f4309b;
            if (i13 != 0) {
                s10.c();
                k3.p((k3) s10.f5671b, i13);
            }
            if (i10 != 0) {
                s10.c();
                k3.q((k3) s10.f5671b, i10);
            }
            if (str != null) {
                s10.c();
                k3.n((k3) s10.f5671b, str);
            }
            f3 u10 = g3.u();
            u10.d(s10);
            u10.c();
            g3.t((g3) u10.f5671b, i11);
            if (!m3Var.equals(m3.BROADCAST_ACTION_UNSPECIFIED)) {
                u10.c();
                g3.p((g3) u10.f5671b, m3Var);
            }
            return (g3) u10.a();
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to create logging payload", th2);
            return null;
        }
    }

    public static i3 c(int i10, m3 m3Var) {
        try {
            h3 s10 = i3.s();
            s10.c();
            i3.r((i3) s10.f5671b, i10);
            if (!m3Var.equals(m3.BROADCAST_ACTION_UNSPECIFIED)) {
                s10.c();
                i3.o((i3) s10.f5671b, m3Var);
            }
            return (i3) s10.a();
        } catch (Exception e) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to create logging payload", e);
            return null;
        }
    }
}
