package c5;

import com.google.android.gms.internal.play_billing.f3;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.h3;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.j3;
import com.google.android.gms.internal.play_billing.l3;
import com.google.android.gms.internal.play_billing.n3;
public abstract class f0 {
    public static final int f4736a = 0;

    static {
        int i10 = g0.f4739j;
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
            int i10 = com.google.android.gms.internal.play_billing.u.f7230a;
            if (str.length() > 40) {
                return str.substring(0, 40);
            }
            return str;
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to get truncated exception info", th2);
            return null;
        }
    }

    public static g3 b(int i10, int i11, i iVar, String str, n3 n3Var) {
        try {
            j3 s10 = l3.s();
            int i12 = iVar.f4757a;
            s10.c();
            l3.r((l3) s10.f7233b, i12);
            String str2 = iVar.f4759c;
            s10.c();
            l3.o((l3) s10.f7233b, str2);
            int i13 = iVar.f4758b;
            if (i13 != 0) {
                s10.c();
                l3.p((l3) s10.f7233b, i13);
            }
            if (i10 != 0) {
                s10.c();
                l3.q((l3) s10.f7233b, i10);
            }
            if (str != null) {
                s10.c();
                l3.n((l3) s10.f7233b, str);
            }
            f3 u10 = g3.u();
            u10.d(s10);
            u10.c();
            g3.t((g3) u10.f7233b, i11);
            if (!n3Var.equals(n3.BROADCAST_ACTION_UNSPECIFIED)) {
                u10.c();
                g3.p((g3) u10.f7233b, n3Var);
            }
            return (g3) u10.a();
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to create logging payload", th2);
            return null;
        }
    }

    public static i3 c(int i10, n3 n3Var) {
        try {
            h3 s10 = i3.s();
            s10.c();
            i3.r((i3) s10.f7233b, i10);
            if (!n3Var.equals(n3.BROADCAST_ACTION_UNSPECIFIED)) {
                s10.c();
                i3.o((i3) s10.f7233b, n3Var);
            }
            return (i3) s10.a();
        } catch (Exception e) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to create logging payload", e);
            return null;
        }
    }
}
