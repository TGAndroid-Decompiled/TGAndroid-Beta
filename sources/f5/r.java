package f5;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Parcel;
import j$.util.Objects;
import java.util.concurrent.Callable;
public final class r implements Callable {
    public final int f11340a;
    public final Object f11341b;
    public final Object f11342c;
    public final Object d;

    public r(Object obj, Object obj2, Object obj3, int i7) {
        this.f11340a = i7;
        this.f11341b = obj;
        this.f11342c = obj2;
        this.d = obj3;
    }

    private final java.lang.Object a() {
        throw new UnsupportedOperationException("Method not decompiled: f5.r.a():java.lang.Object");
    }

    private final java.lang.Object b() {
        throw new UnsupportedOperationException("Method not decompiled: f5.r.b():java.lang.Object");
    }

    private final Object c() {
        Bundle c10;
        com.google.android.gms.internal.play_billing.c cVar;
        b bVar = (b) this.f11341b;
        String str = (String) this.f11342c;
        String str2 = (String) this.d;
        try {
            synchronized (bVar.f11278a) {
                cVar = bVar.f11284i;
            }
            if (cVar == null) {
                return com.google.android.gms.internal.play_billing.u.c(z.h, 107);
            }
            return ((com.google.android.gms.internal.play_billing.a) cVar).z1(bVar.f11283g.getPackageName(), str, str2);
        } catch (DeadObjectException e10) {
            f fVar = z.h;
            String a10 = x.a(e10);
            c10 = com.google.android.gms.internal.play_billing.u.c(fVar, 5);
            if (a10 != null) {
                c10.putString("ADDITIONAL_LOG_DETAILS", a10);
            }
            return c10;
        } catch (Exception e11) {
            f fVar2 = z.f11359f;
            String a11 = x.a(e11);
            c10 = com.google.android.gms.internal.play_billing.u.c(fVar2, 5);
            if (a11 != null) {
                c10.putString("ADDITIONAL_LOG_DETAILS", a11);
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
        switch (this.f11340a) {
            case 0:
                b bVar = (b) this.f11341b;
                h hVar = (h) this.f11342c;
                g gVar = (g) this.d;
                if (!bVar.n()) {
                    f fVar = z.h;
                    bVar.z(2, 4, fVar);
                    hVar.a(fVar);
                    return null;
                }
                String str2 = "Error consuming purchase with token. Response code: ";
                String str3 = gVar.f11315a;
                try {
                    com.google.android.gms.internal.play_billing.u.g("BillingClient", "Consuming purchase with token: ".concat(str3));
                    try {
                        synchronized (bVar.f11278a) {
                            try {
                                cVar = bVar.f11284i;
                            } catch (Throwable th2) {
                                th = th2;
                                while (true) {
                                    try {
                                        throw th;
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                }
                            }
                        }
                        try {
                            if (cVar == null) {
                                str2 = str3;
                                try {
                                    bVar.g(hVar, str2, z.h, 107, "Service has been reset to null.", null);
                                    return null;
                                } catch (DeadObjectException e10) {
                                    e = e10;
                                    deadObjectException = e;
                                    bVar.g(hVar, str2, z.h, 29, "Error consuming purchase!", deadObjectException);
                                    return null;
                                } catch (Exception e11) {
                                    e = e11;
                                    exc = e;
                                    bVar.g(hVar, str2, z.f11359f, 29, "Error consuming purchase!", exc);
                                    return null;
                                }
                            }
                            if (bVar.f11289n) {
                                String packageName = bVar.f11283g.getPackageName();
                                boolean z10 = bVar.f11289n;
                                String str4 = bVar.f11280c;
                                String str5 = bVar.d;
                                long longValue = bVar.A.longValue();
                                Bundle bundle = new Bundle();
                                if (z10) {
                                    com.google.android.gms.internal.play_billing.u.b(bundle, str4, str5, longValue);
                                }
                                Bundle y12 = ((com.google.android.gms.internal.play_billing.a) cVar).y1(packageName, str3, bundle);
                                readInt = y12.getInt("RESPONSE_CODE");
                                str = com.google.android.gms.internal.play_billing.u.f("BillingClient", y12);
                            } else {
                                String packageName2 = bVar.f11283g.getPackageName();
                                com.google.android.gms.internal.play_billing.a aVar = (com.google.android.gms.internal.play_billing.a) cVar;
                                Parcel v12 = aVar.v1();
                                v12.writeInt(3);
                                v12.writeString(packageName2);
                                v12.writeString(str3);
                                Parcel w12 = aVar.w1(v12, 5);
                                readInt = w12.readInt();
                                w12.recycle();
                                str = "";
                            }
                            f a10 = z.a(readInt, str);
                            if (readInt == 0) {
                                com.google.android.gms.internal.play_billing.u.g("BillingClient", "Successfully consumed purchase.");
                                hVar.a(a10);
                                return null;
                            }
                            bVar.g(hVar, str3, a10, 23, "Error consuming purchase with token. Response code: " + readInt, null);
                            return null;
                        } catch (DeadObjectException e12) {
                            deadObjectException = e12;
                            str2 = str3;
                            bVar.g(hVar, str2, z.h, 29, "Error consuming purchase!", deadObjectException);
                            return null;
                        } catch (Exception e13) {
                            exc = e13;
                            str2 = str3;
                            bVar.g(hVar, str2, z.f11359f, 29, "Error consuming purchase!", exc);
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
                return Boolean.valueOf(((SharedPreferences) this.f11341b).getBoolean((String) this.f11342c, ((Boolean) this.d).booleanValue()));
            case 5:
                return Integer.valueOf(((SharedPreferences) this.f11341b).getInt((String) this.f11342c, ((Integer) this.d).intValue()));
            case 6:
                return Long.valueOf(((SharedPreferences) this.f11341b).getLong((String) this.f11342c, ((Long) this.d).longValue()));
            default:
                return ((SharedPreferences) this.f11341b).getString((String) this.f11342c, (String) this.d);
        }
    }

    public r(b bVar, n nVar, String str) {
        this.f11340a = 2;
        this.f11342c = nVar;
        this.d = str;
        Objects.requireNonNull(bVar);
        this.f11341b = bVar;
    }
}
