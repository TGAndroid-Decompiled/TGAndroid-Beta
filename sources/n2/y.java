package n2;

import com.google.android.gms.internal.play_billing.e3;
import com.google.android.gms.internal.play_billing.f3;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.h3;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.j3;
import com.google.android.gms.internal.play_billing.l3;

public abstract class y {

    public static final int f18189a = 0;

    static {
        int i10 = z.f18190u;
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
            int i10 = com.google.android.gms.internal.play_billing.u.f4131a;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to get truncated exception info", th);
            return null;
        }
    }

    public static f3 b(int i10, int i11, g gVar, String str, l3 l3Var) {
        try {
            i3 i3VarS = j3.s();
            int i12 = gVar.f18147a;
            i3VarS.c();
            j3.r((j3) i3VarS.f4129b, i12);
            String str2 = gVar.f18149c;
            i3VarS.c();
            j3.o((j3) i3VarS.f4129b, str2);
            int i13 = gVar.f18148b;
            if (i13 != 0) {
                i3VarS.c();
                j3.p((j3) i3VarS.f4129b, i13);
            }
            if (i10 != 0) {
                i3VarS.c();
                j3.q((j3) i3VarS.f4129b, i10);
            }
            if (str != null) {
                i3VarS.c();
                j3.n((j3) i3VarS.f4129b, str);
            }
            e3 e3VarU = f3.u();
            e3VarU.d(i3VarS);
            e3VarU.c();
            f3.t((f3) e3VarU.f4129b, i11);
            if (!l3Var.equals(l3.BROADCAST_ACTION_UNSPECIFIED)) {
                e3VarU.c();
                f3.p((f3) e3VarU.f4129b, l3Var);
            }
            return (f3) e3VarU.a();
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to create logging payload", th);
            return null;
        }
    }

    public static h3 c(int i10, l3 l3Var) {
        try {
            g3 g3VarS = h3.s();
            g3VarS.c();
            h3.r((h3) g3VarS.f4129b, i10);
            if (!l3Var.equals(l3.BROADCAST_ACTION_UNSPECIFIED)) {
                g3VarS.c();
                h3.o((h3) g3VarS.f4129b, l3Var);
            }
            return (h3) g3VarS.a();
        } catch (Exception e9) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to create logging payload", e9);
            return null;
        }
    }
}
