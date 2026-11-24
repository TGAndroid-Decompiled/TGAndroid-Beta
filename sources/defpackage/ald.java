package defpackage;
public abstract class ald {
    public static final int a = 0;

    static {
        int i = fld.D;
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
            int i = yid.a;
            if (str.length() > 40) {
                return str.substring(0, 40);
            }
            return str;
        } catch (Throwable th) {
            yid.i("BillingLogger", "Unable to get truncated exception info", th);
            return null;
        }
    }

    public static gje b(int i, int i2, fj0 fj0Var, String str, fme fmeVar) {
        try {
            nke s = gle.s();
            int i3 = fj0Var.a;
            s.b();
            gle.r((gle) s.b, i3);
            String str2 = fj0Var.c;
            s.b();
            gle.o((gle) s.b, str2);
            int i4 = fj0Var.b;
            if (i4 != 0) {
                s.b();
                gle.p((gle) s.b, i4);
            }
            if (i != 0) {
                s.b();
                gle.q((gle) s.b, i);
            }
            if (str != null) {
                s.b();
                gle.n((gle) s.b, str);
            }
            uie u = gje.u();
            u.c(s);
            u.b();
            gje.t((gje) u.b, i2);
            if (!fmeVar.equals(fme.BROADCAST_ACTION_UNSPECIFIED)) {
                u.b();
                gje.p((gje) u.b, fmeVar);
            }
            return (gje) u.a();
        } catch (Throwable th) {
            yid.i("BillingLogger", "Unable to create logging payload", th);
            return null;
        }
    }

    public static gke c(int i, fme fmeVar) {
        try {
            oje s = gke.s();
            s.b();
            gke.r((gke) s.b, i);
            if (!fmeVar.equals(fme.BROADCAST_ACTION_UNSPECIFIED)) {
                s.b();
                gke.o((gke) s.b, fmeVar);
            }
            return (gke) s.a();
        } catch (Exception e) {
            yid.i("BillingLogger", "Unable to create logging payload", e);
            return null;
        }
    }
}
