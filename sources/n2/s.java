package n2;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Parcel;
import f7.d7;
import j$.util.Objects;
import java.util.concurrent.Callable;
public final class s implements Callable {
    public final int f18349a;
    public final Object f18350b;
    public final Object f18351c;
    public final Object d;

    public s(Object obj, Object obj2, Object obj3, int i9) {
        this.f18349a = i9;
        this.f18350b = obj;
        this.f18351c = obj2;
        this.d = obj3;
    }

    private final java.lang.Object a() {
        throw new UnsupportedOperationException("Method not decompiled: n2.s.a():java.lang.Object");
    }

    private final java.lang.Object b() {
        throw new UnsupportedOperationException("Method not decompiled: n2.s.b():java.lang.Object");
    }

    private final Object c() {
        Bundle c10;
        com.google.android.gms.internal.play_billing.c cVar;
        b bVar = (b) this.f18350b;
        String str = (String) this.f18351c;
        String str2 = (String) this.d;
        try {
            synchronized (bVar.f18266a) {
                cVar = bVar.f18272i;
            }
            if (cVar == null) {
                return com.google.android.gms.internal.play_billing.u.c(107, b0.h);
            }
            return ((com.google.android.gms.internal.play_billing.a) cVar).W0(bVar.f18271g.getPackageName(), str, str2);
        } catch (DeadObjectException e10) {
            g gVar = b0.h;
            String a2 = z.a(e10);
            c10 = com.google.android.gms.internal.play_billing.u.c(5, gVar);
            if (a2 != null) {
                c10.putString("ADDITIONAL_LOG_DETAILS", a2);
            }
            return c10;
        } catch (Exception e11) {
            g gVar2 = b0.f18293f;
            String a3 = z.a(e11);
            c10 = com.google.android.gms.internal.play_billing.u.c(5, gVar2);
            if (a3 != null) {
                c10.putString("ADDITIONAL_LOG_DETAILS", a3);
            }
            return c10;
        }
    }

    @Override
    public final Object call() {
        Exception exc;
        DeadObjectException deadObjectException;
        com.google.android.gms.internal.play_billing.c cVar;
        int readInt;
        String str;
        switch (this.f18349a) {
            case 0:
                b bVar = (b) this.f18350b;
                h hVar = (h) this.f18351c;
                d7 d7Var = (d7) this.d;
                if (!bVar.n()) {
                    g gVar = b0.h;
                    bVar.y(2, 4, gVar);
                    hVar.a(gVar, d7Var.f5642a);
                    return null;
                }
                String str2 = "Error consuming purchase with token. Response code: ";
                String str3 = d7Var.f5642a;
                try {
                    com.google.android.gms.internal.play_billing.u.g("BillingClient", "Consuming purchase with token: ".concat(str3));
                    try {
                        synchronized (bVar.f18266a) {
                            try {
                                cVar = bVar.f18272i;
                            } catch (Throwable th) {
                                th = th;
                                while (true) {
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                }
                            }
                        }
                        try {
                            if (cVar == null) {
                                str2 = str3;
                                try {
                                    bVar.g(hVar, str2, b0.h, 107, "Service has been reset to null.", null);
                                    return null;
                                } catch (DeadObjectException e10) {
                                    e = e10;
                                    deadObjectException = e;
                                    bVar.g(hVar, str2, b0.h, 29, "Error consuming purchase!", deadObjectException);
                                    return null;
                                } catch (Exception e11) {
                                    e = e11;
                                    exc = e;
                                    bVar.g(hVar, str2, b0.f18293f, 29, "Error consuming purchase!", exc);
                                    return null;
                                }
                            }
                            if (bVar.f18277n) {
                                String packageName = bVar.f18271g.getPackageName();
                                boolean z10 = bVar.f18277n;
                                String str4 = bVar.f18268c;
                                String str5 = bVar.d;
                                long longValue = bVar.A.longValue();
                                Bundle bundle = new Bundle();
                                if (z10) {
                                    com.google.android.gms.internal.play_billing.u.b(bundle, str4, str5, longValue);
                                }
                                Bundle V0 = ((com.google.android.gms.internal.play_billing.a) cVar).V0(packageName, str3, bundle);
                                readInt = V0.getInt("RESPONSE_CODE");
                                str = com.google.android.gms.internal.play_billing.u.f("BillingClient", V0);
                            } else {
                                String packageName2 = bVar.f18271g.getPackageName();
                                com.google.android.gms.internal.play_billing.a aVar = (com.google.android.gms.internal.play_billing.a) cVar;
                                Parcel S0 = aVar.S0();
                                S0.writeInt(3);
                                S0.writeString(packageName2);
                                S0.writeString(str3);
                                Parcel T0 = aVar.T0(S0, 5);
                                readInt = T0.readInt();
                                T0.recycle();
                                str = "";
                            }
                            g a2 = b0.a(readInt, str);
                            if (readInt == 0) {
                                com.google.android.gms.internal.play_billing.u.g("BillingClient", "Successfully consumed purchase.");
                                hVar.a(a2, str3);
                                return null;
                            }
                            bVar.g(hVar, str3, a2, 23, "Error consuming purchase with token. Response code: " + readInt, null);
                            return null;
                        } catch (DeadObjectException e12) {
                            deadObjectException = e12;
                            str2 = str3;
                            bVar.g(hVar, str2, b0.h, 29, "Error consuming purchase!", deadObjectException);
                            return null;
                        } catch (Exception e13) {
                            exc = e13;
                            str2 = str3;
                            bVar.g(hVar, str2, b0.f18293f, 29, "Error consuming purchase!", exc);
                            return null;
                        }
                    } catch (DeadObjectException e14) {
                        e = e14;
                    } catch (Exception e15) {
                        e = e15;
                    }
                } catch (DeadObjectException e16) {
                    e = e16;
                    str2 = str3;
                } catch (Exception e17) {
                    e = e17;
                    str2 = str3;
                }
            case 1:
                return a();
            case 2:
                return b();
            case 3:
                return c();
            case 4:
                return Boolean.valueOf(((SharedPreferences) this.f18350b).getBoolean((String) this.f18351c, ((Boolean) this.d).booleanValue()));
            case 5:
                return Integer.valueOf(((SharedPreferences) this.f18350b).getInt((String) this.f18351c, ((Integer) this.d).intValue()));
            case 6:
                return Long.valueOf(((SharedPreferences) this.f18350b).getLong((String) this.f18351c, ((Long) this.d).longValue()));
            default:
                return ((SharedPreferences) this.f18350b).getString((String) this.f18351c, (String) this.d);
        }
    }

    public s(b bVar, m mVar, String str) {
        this.f18349a = 2;
        this.f18351c = mVar;
        this.d = str;
        Objects.requireNonNull(bVar);
        this.f18350b = bVar;
    }
}
