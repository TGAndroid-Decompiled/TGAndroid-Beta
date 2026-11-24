package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Parcel;
import j$.util.Objects;
import java.util.concurrent.Callable;
public final class p4d implements Callable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public p4d(uh0 uh0Var, wu8 wu8Var, String str) {
        this.a = (byte) 3;
        this.b = wu8Var;
        this.c = str;
        Objects.requireNonNull(uh0Var);
        this.d = uh0Var;
    }

    private final Object a() {
        e8d e8dVar;
        int readInt;
        String str;
        uh0 uh0Var = (uh0) this.b;
        ts2 ts2Var = (ts2) this.c;
        ss2 ss2Var = (ss2) this.d;
        if (!uh0Var.n()) {
            fi0 fi0Var = qjd.h;
            uh0Var.x(2, 4, fi0Var);
            ts2Var.d(fi0Var);
            return null;
        }
        String str2 = ss2Var.a;
        try {
            xgd.g("BillingClient", "Consuming purchase with token: ".concat(str2));
            synchronized (uh0Var.a) {
                e8dVar = uh0Var.i;
            }
            if (e8dVar == null) {
                uh0Var.g(ts2Var, str2, qjd.h, 107, "Service has been reset to null.", null);
                return null;
            }
            boolean z = uh0Var.n;
            Context context = uh0Var.g;
            if (z) {
                String packageName = context.getPackageName();
                boolean z2 = uh0Var.n;
                String str3 = uh0Var.c;
                String str4 = uh0Var.d;
                long longValue = uh0Var.A.longValue();
                Bundle bundle = new Bundle();
                if (z2) {
                    xgd.b(bundle, str3, str4, longValue);
                }
                Bundle Z = ((t7d) e8dVar).Z(packageName, str2, bundle);
                readInt = Z.getInt("RESPONSE_CODE");
                str = xgd.f("BillingClient", Z);
            } else {
                String packageName2 = context.getPackageName();
                t7d t7dVar = (t7d) e8dVar;
                Parcel X = t7dVar.X();
                X.writeInt(3);
                X.writeString(packageName2);
                X.writeString(str2);
                Parcel Y = t7dVar.Y(X, 5);
                readInt = Y.readInt();
                Y.recycle();
                str = "";
            }
            fi0 a = qjd.a(readInt, str);
            if (readInt == 0) {
                xgd.g("BillingClient", "Successfully consumed purchase.");
                ts2Var.d(a);
                return null;
            }
            uh0Var.g(ts2Var, str2, a, 23, "Error consuming purchase with token. Response code: " + readInt, null);
            return null;
        } catch (DeadObjectException e) {
            uh0Var.g(ts2Var, str2, qjd.h, 29, "Error consuming purchase!", e);
            return null;
        } catch (Exception e2) {
            uh0Var.g(ts2Var, str2, qjd.f, 29, "Error consuming purchase!", e2);
            return null;
        }
    }

    private final java.lang.Object b() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p4d.b():java.lang.Object");
    }

    private final java.lang.Object c() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p4d.c():java.lang.Object");
    }

    @Override
    public final Object call() {
        Bundle c;
        e8d e8dVar;
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
                uh0 uh0Var = (uh0) this.b;
                String str = (String) this.c;
                String str2 = (String) this.d;
                try {
                    synchronized (uh0Var.a) {
                        e8dVar = uh0Var.i;
                    }
                    if (e8dVar == null) {
                        return xgd.c(107, qjd.h);
                    }
                    return ((t7d) e8dVar).a0(uh0Var.g.getPackageName(), str, str2);
                } catch (DeadObjectException e) {
                    fi0 fi0Var = qjd.h;
                    String a = yid.a(e);
                    c = xgd.c(5, fi0Var);
                    if (a != null) {
                        c.putString("ADDITIONAL_LOG_DETAILS", a);
                    }
                    return c;
                } catch (Exception e2) {
                    fi0 fi0Var2 = qjd.f;
                    String a2 = yid.a(e2);
                    c = xgd.c(5, fi0Var2);
                    if (a2 != null) {
                        c.putString("ADDITIONAL_LOG_DETAILS", a2);
                    }
                    return c;
                }
        }
    }

    public p4d(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
