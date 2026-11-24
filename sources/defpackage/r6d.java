package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Parcel;
import j$.util.Objects;
import java.util.concurrent.Callable;
public final class r6d implements Callable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public r6d(ui0 ui0Var, xw8 xw8Var, String str) {
        this.a = (byte) 3;
        this.b = xw8Var;
        this.c = str;
        Objects.requireNonNull(ui0Var);
        this.d = ui0Var;
    }

    private final Object a() {
        gad gadVar;
        int readInt;
        String str;
        ui0 ui0Var = (ui0) this.b;
        eu2 eu2Var = (eu2) this.c;
        du2 du2Var = (du2) this.d;
        if (!ui0Var.n()) {
            fj0 fj0Var = sld.h;
            ui0Var.x(2, 4, fj0Var);
            eu2Var.e(fj0Var);
            return null;
        }
        String str2 = du2Var.b;
        try {
            yid.g("BillingClient", "Consuming purchase with token: ".concat(str2));
            synchronized (ui0Var.a) {
                gadVar = ui0Var.i;
            }
            if (gadVar == null) {
                ui0Var.g(eu2Var, str2, sld.h, 107, "Service has been reset to null.", null);
                return null;
            }
            boolean z = ui0Var.n;
            Context context = ui0Var.g;
            if (z) {
                String packageName = context.getPackageName();
                boolean z2 = ui0Var.n;
                String str3 = ui0Var.c;
                String str4 = ui0Var.d;
                long longValue = ui0Var.A.longValue();
                Bundle bundle = new Bundle();
                if (z2) {
                    yid.b(bundle, str3, str4, longValue);
                }
                Bundle Z = ((v9d) gadVar).Z(packageName, str2, bundle);
                readInt = Z.getInt("RESPONSE_CODE");
                str = yid.f("BillingClient", Z);
            } else {
                String packageName2 = context.getPackageName();
                v9d v9dVar = (v9d) gadVar;
                Parcel X = v9dVar.X();
                X.writeInt(3);
                X.writeString(packageName2);
                X.writeString(str2);
                Parcel Y = v9dVar.Y(X, 5);
                readInt = Y.readInt();
                Y.recycle();
                str = "";
            }
            fj0 a = sld.a(readInt, str);
            if (readInt == 0) {
                yid.g("BillingClient", "Successfully consumed purchase.");
                eu2Var.e(a);
                return null;
            }
            ui0Var.g(eu2Var, str2, a, 23, "Error consuming purchase with token. Response code: " + readInt, null);
            return null;
        } catch (DeadObjectException e) {
            ui0Var.g(eu2Var, str2, sld.h, 29, "Error consuming purchase!", e);
            return null;
        } catch (Exception e2) {
            ui0Var.g(eu2Var, str2, sld.f, 29, "Error consuming purchase!", e2);
            return null;
        }
    }

    private final java.lang.Object b() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r6d.b():java.lang.Object");
    }

    private final java.lang.Object c() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r6d.c():java.lang.Object");
    }

    @Override
    public final Object call() {
        Bundle c;
        gad gadVar;
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
                ui0 ui0Var = (ui0) this.b;
                String str = (String) this.c;
                String str2 = (String) this.d;
                try {
                    synchronized (ui0Var.a) {
                        gadVar = ui0Var.i;
                    }
                    if (gadVar == null) {
                        return yid.c(107, sld.h);
                    }
                    return ((v9d) gadVar).a0(ui0Var.g.getPackageName(), str, str2);
                } catch (DeadObjectException e) {
                    fj0 fj0Var = sld.h;
                    String a = ald.a(e);
                    c = yid.c(5, fj0Var);
                    if (a != null) {
                        c.putString("ADDITIONAL_LOG_DETAILS", a);
                    }
                    return c;
                } catch (Exception e2) {
                    fj0 fj0Var2 = sld.f;
                    String a2 = ald.a(e2);
                    c = yid.c(5, fj0Var2);
                    if (a2 != null) {
                        c.putString("ADDITIONAL_LOG_DETAILS", a2);
                    }
                    return c;
                }
        }
    }

    public r6d(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
