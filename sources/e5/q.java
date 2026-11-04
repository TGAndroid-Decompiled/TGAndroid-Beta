package e5;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Parcel;
import j$.util.Objects;
import java.util.concurrent.Callable;
public final class q implements Callable {
    public final int f9621a;
    public final Object f9622b;
    public final Object f9623c;
    public final Object d;

    public q(Object obj, Object obj2, Object obj3, int i3) {
        this.f9621a = i3;
        this.f9622b = obj;
        this.f9623c = obj2;
        this.d = obj3;
    }

    private final java.lang.Object a() {
        throw new UnsupportedOperationException("Method not decompiled: e5.q.a():java.lang.Object");
    }

    private final java.lang.Object b() {
        throw new UnsupportedOperationException("Method not decompiled: e5.q.b():java.lang.Object");
    }

    private final Object c() {
        Bundle c2;
        com.google.android.gms.internal.play_billing.c cVar;
        b bVar = (b) this.f9622b;
        String str = (String) this.f9623c;
        String str2 = (String) this.d;
        try {
            synchronized (bVar.f9559a) {
                cVar = bVar.f9565i;
            }
            if (cVar == null) {
                return com.google.android.gms.internal.play_billing.u.c(107, z.h);
            }
            return ((com.google.android.gms.internal.play_billing.a) cVar).Z0(bVar.f9564g.getPackageName(), str, str2);
        } catch (DeadObjectException e10) {
            f fVar = z.h;
            String a10 = x.a(e10);
            c2 = com.google.android.gms.internal.play_billing.u.c(5, fVar);
            if (a10 != null) {
                c2.putString("ADDITIONAL_LOG_DETAILS", a10);
            }
            return c2;
        } catch (Exception e11) {
            f fVar2 = z.f9642f;
            String a11 = x.a(e11);
            c2 = com.google.android.gms.internal.play_billing.u.c(5, fVar2);
            if (a11 != null) {
                c2.putString("ADDITIONAL_LOG_DETAILS", a11);
            }
            return c2;
        }
    }

    @Override
    public final Object call() {
        Exception exc;
        DeadObjectException deadObjectException;
        com.google.android.gms.internal.play_billing.c cVar;
        int readInt;
        String str;
        switch (this.f9621a) {
            case 0:
                b bVar = (b) this.f9622b;
                g gVar = (g) this.f9623c;
                com.google.android.gms.internal.clearcut.e eVar = (com.google.android.gms.internal.clearcut.e) this.d;
                if (!bVar.n()) {
                    f fVar = z.h;
                    bVar.y(2, 4, fVar);
                    gVar.a(fVar);
                    return null;
                }
                String str2 = "Error consuming purchase with token. Response code: ";
                String str3 = eVar.f7212a;
                try {
                    com.google.android.gms.internal.play_billing.u.g("BillingClient", "Consuming purchase with token: ".concat(str3));
                    try {
                        synchronized (bVar.f9559a) {
                            try {
                                cVar = bVar.f9565i;
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
                                    bVar.g(gVar, str2, z.h, 107, "Service has been reset to null.", null);
                                    return null;
                                } catch (DeadObjectException e10) {
                                    e = e10;
                                    deadObjectException = e;
                                    bVar.g(gVar, str2, z.h, 29, "Error consuming purchase!", deadObjectException);
                                    return null;
                                } catch (Exception e11) {
                                    e = e11;
                                    exc = e;
                                    bVar.g(gVar, str2, z.f9642f, 29, "Error consuming purchase!", exc);
                                    return null;
                                }
                            }
                            if (bVar.f9570n) {
                                String packageName = bVar.f9564g.getPackageName();
                                boolean z10 = bVar.f9570n;
                                String str4 = bVar.f9561c;
                                String str5 = bVar.d;
                                long longValue = bVar.A.longValue();
                                Bundle bundle = new Bundle();
                                if (z10) {
                                    com.google.android.gms.internal.play_billing.u.b(bundle, str4, str5, longValue);
                                }
                                Bundle Y0 = ((com.google.android.gms.internal.play_billing.a) cVar).Y0(packageName, str3, bundle);
                                readInt = Y0.getInt("RESPONSE_CODE");
                                str = com.google.android.gms.internal.play_billing.u.f("BillingClient", Y0);
                            } else {
                                String packageName2 = bVar.f9564g.getPackageName();
                                com.google.android.gms.internal.play_billing.a aVar = (com.google.android.gms.internal.play_billing.a) cVar;
                                Parcel V0 = aVar.V0();
                                V0.writeInt(3);
                                V0.writeString(packageName2);
                                V0.writeString(str3);
                                Parcel W0 = aVar.W0(V0, 5);
                                readInt = W0.readInt();
                                W0.recycle();
                                str = "";
                            }
                            f a10 = z.a(readInt, str);
                            if (readInt == 0) {
                                com.google.android.gms.internal.play_billing.u.g("BillingClient", "Successfully consumed purchase.");
                                gVar.a(a10);
                                return null;
                            }
                            bVar.g(gVar, str3, a10, 23, "Error consuming purchase with token. Response code: " + readInt, null);
                            return null;
                        } catch (DeadObjectException e12) {
                            deadObjectException = e12;
                            str2 = str3;
                            bVar.g(gVar, str2, z.h, 29, "Error consuming purchase!", deadObjectException);
                            return null;
                        } catch (Exception e13) {
                            exc = e13;
                            str2 = str3;
                            bVar.g(gVar, str2, z.f9642f, 29, "Error consuming purchase!", exc);
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
                return Boolean.valueOf(((SharedPreferences) this.f9622b).getBoolean((String) this.f9623c, ((Boolean) this.d).booleanValue()));
            case 5:
                return Integer.valueOf(((SharedPreferences) this.f9622b).getInt((String) this.f9623c, ((Integer) this.d).intValue()));
            case 6:
                return Long.valueOf(((SharedPreferences) this.f9622b).getLong((String) this.f9623c, ((Long) this.d).longValue()));
            default:
                return ((SharedPreferences) this.f9622b).getString((String) this.f9623c, (String) this.d);
        }
    }

    public q(b bVar, m mVar, String str) {
        this.f9621a = 2;
        this.f9623c = mVar;
        this.d = str;
        Objects.requireNonNull(bVar);
        this.f9622b = bVar;
    }
}
