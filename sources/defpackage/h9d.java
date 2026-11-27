package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Parcel;
import j$.util.Objects;
import java.util.concurrent.Callable;
public final class h9d implements Callable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public h9d(vh0 vh0Var, fy8 fy8Var, String str) {
        this.a = (byte) 3;
        this.b = fy8Var;
        this.c = str;
        Objects.requireNonNull(vh0Var);
        this.d = vh0Var;
    }

    private final Object a() {
        xcd xcdVar;
        int readInt;
        String str;
        vh0 vh0Var = (vh0) this.b;
        nt2 nt2Var = (nt2) this.c;
        mt2 mt2Var = (mt2) this.d;
        if (!vh0Var.n()) {
            gi0 gi0Var = hod.h;
            vh0Var.x(2, 4, gi0Var);
            nt2Var.e(gi0Var);
            return null;
        }
        String str2 = mt2Var.b;
        try {
            old.g("BillingClient", "Consuming purchase with token: ".concat(str2));
            synchronized (vh0Var.a) {
                xcdVar = vh0Var.i;
            }
            if (xcdVar == null) {
                vh0Var.g(nt2Var, str2, hod.h, 107, "Service has been reset to null.", null);
                return null;
            }
            boolean z = vh0Var.n;
            Context context = vh0Var.g;
            if (z) {
                String packageName = context.getPackageName();
                boolean z2 = vh0Var.n;
                String str3 = vh0Var.c;
                String str4 = vh0Var.d;
                long longValue = vh0Var.A.longValue();
                Bundle bundle = new Bundle();
                if (z2) {
                    old.b(bundle, str3, str4, longValue);
                }
                Bundle Z = ((mcd) xcdVar).Z(packageName, str2, bundle);
                readInt = Z.getInt("RESPONSE_CODE");
                str = old.f("BillingClient", Z);
            } else {
                String packageName2 = context.getPackageName();
                mcd mcdVar = (mcd) xcdVar;
                Parcel X = mcdVar.X();
                X.writeInt(3);
                X.writeString(packageName2);
                X.writeString(str2);
                Parcel Y = mcdVar.Y(X, 5);
                readInt = Y.readInt();
                Y.recycle();
                str = "";
            }
            gi0 a = hod.a(readInt, str);
            if (readInt == 0) {
                old.g("BillingClient", "Successfully consumed purchase.");
                nt2Var.e(a);
                return null;
            }
            vh0Var.g(nt2Var, str2, a, 23, "Error consuming purchase with token. Response code: " + readInt, null);
            return null;
        } catch (DeadObjectException e) {
            vh0Var.g(nt2Var, str2, hod.h, 29, "Error consuming purchase!", e);
            return null;
        } catch (Exception e2) {
            vh0Var.g(nt2Var, str2, hod.f, 29, "Error consuming purchase!", e2);
            return null;
        }
    }

    private final java.lang.Object b() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h9d.b():java.lang.Object");
    }

    private final java.lang.Object c() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h9d.c():java.lang.Object");
    }

    @Override
    public final Object call() {
        Bundle c;
        xcd xcdVar;
        switch (this.a) {
            case 0:
                return Boolean.valueOf(((SharedPreferences) this.b).getBoolean((String) this.c, ((Boolean) this.d).booleanValue()));
            case 1:
                return a();
            case 2:
                return b();
            case 3:
                return c();
            case 4:
                return Integer.valueOf(((SharedPreferences) this.b).getInt((String) this.c, ((Integer) this.d).intValue()));
            case 5:
                return Long.valueOf(((SharedPreferences) this.b).getLong((String) this.c, ((Long) this.d).longValue()));
            case 6:
                return ((SharedPreferences) this.b).getString((String) this.c, (String) this.d);
            default:
                vh0 vh0Var = (vh0) this.b;
                String str = (String) this.c;
                String str2 = (String) this.d;
                try {
                    synchronized (vh0Var.a) {
                        xcdVar = vh0Var.i;
                    }
                    if (xcdVar == null) {
                        return old.c(107, hod.h);
                    }
                    return ((mcd) xcdVar).a0(vh0Var.g.getPackageName(), str, str2);
                } catch (DeadObjectException e) {
                    gi0 gi0Var = hod.h;
                    String a = pnd.a(e);
                    c = old.c(5, gi0Var);
                    if (a != null) {
                        c.putString("ADDITIONAL_LOG_DETAILS", a);
                    }
                    return c;
                } catch (Exception e2) {
                    gi0 gi0Var2 = hod.f;
                    String a2 = pnd.a(e2);
                    c = old.c(5, gi0Var2);
                    if (a2 != null) {
                        c.putString("ADDITIONAL_LOG_DETAILS", a2);
                    }
                    return c;
                }
        }
    }

    public h9d(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
