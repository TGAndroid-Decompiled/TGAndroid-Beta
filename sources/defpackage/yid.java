package defpackage;
public abstract class yid {
    public static final int a = 0;

    static {
        int i = djd.D;
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
            int i = xgd.a;
            if (str.length() > 40) {
                return str.substring(0, 40);
            }
            return str;
        } catch (Throwable th) {
            xgd.i("BillingLogger", "Unable to get truncated exception info", th);
            return null;
        }
    }

    public static fhe b(int i, int i2, fi0 fi0Var, String str, dke dkeVar) {
        try {
            mie s = fje.s();
            int i3 = fi0Var.a;
            s.b();
            fje.r((fje) s.b, i3);
            String str2 = fi0Var.c;
            s.b();
            fje.o((fje) s.b, str2);
            int i4 = fi0Var.b;
            if (i4 != 0) {
                s.b();
                fje.p((fje) s.b, i4);
            }
            if (i != 0) {
                s.b();
                fje.q((fje) s.b, i);
            }
            if (str != null) {
                s.b();
                fje.n((fje) s.b, str);
            }
            tge u = fhe.u();
            u.c(s);
            u.b();
            fhe.t((fhe) u.b, i2);
            if (!dkeVar.equals(dke.BROADCAST_ACTION_UNSPECIFIED)) {
                u.b();
                fhe.p((fhe) u.b, dkeVar);
            }
            return (fhe) u.a();
        } catch (Throwable th) {
            xgd.i("BillingLogger", "Unable to create logging payload", th);
            return null;
        }
    }

    public static fie c(int i, dke dkeVar) {
        try {
            nhe s = fie.s();
            s.b();
            fie.r((fie) s.b, i);
            if (!dkeVar.equals(dke.BROADCAST_ACTION_UNSPECIFIED)) {
                s.b();
                fie.o((fie) s.b, dkeVar);
            }
            return (fie) s.a();
        } catch (Exception e) {
            xgd.i("BillingLogger", "Unable to create logging payload", e);
            return null;
        }
    }
}
