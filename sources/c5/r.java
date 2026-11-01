package c5;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Parcel;
import j$.util.Objects;
import java.util.concurrent.Callable;
public final class r implements Callable {
    public final int f3810a;
    public final Object f3811b;
    public final Object f3812c;
    public final Object d;

    public r(Object obj, Object obj2, Object obj3, int i10) {
        this.f3810a = i10;
        this.f3811b = obj;
        this.f3812c = obj2;
        this.d = obj3;
    }

    private final java.lang.Object a() {
        throw new UnsupportedOperationException("Method not decompiled: c5.r.a():java.lang.Object");
    }

    private final java.lang.Object b() {
        throw new UnsupportedOperationException("Method not decompiled: c5.r.b():java.lang.Object");
    }

    private final Object c() {
        Bundle c10;
        com.google.android.gms.internal.play_billing.c cVar;
        b bVar = (b) this.f3811b;
        String str = (String) this.f3812c;
        String str2 = (String) this.d;
        try {
            synchronized (bVar.f3734a) {
                cVar = bVar.f3739i;
            }
            if (cVar == null) {
                return com.google.android.gms.internal.play_billing.u.c(107, c0.h);
            }
            return ((com.google.android.gms.internal.play_billing.a) cVar).Z0(bVar.f3738g.getPackageName(), str, str2);
        } catch (DeadObjectException e) {
            g gVar = c0.h;
            String a2 = a0.a(e);
            c10 = com.google.android.gms.internal.play_billing.u.c(5, gVar);
            if (a2 != null) {
                c10.putString("ADDITIONAL_LOG_DETAILS", a2);
            }
            return c10;
        } catch (Exception e7) {
            g gVar2 = c0.f3760f;
            String a10 = a0.a(e7);
            c10 = com.google.android.gms.internal.play_billing.u.c(5, gVar2);
            if (a10 != null) {
                c10.putString("ADDITIONAL_LOG_DETAILS", a10);
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
        switch (this.f3810a) {
            case 0:
                b bVar = (b) this.f3811b;
                h hVar = (h) this.f3812c;
                k6.h hVar2 = (k6.h) this.d;
                if (!bVar.n()) {
                    g gVar = c0.h;
                    bVar.y(2, 4, gVar);
                    hVar.a(gVar);
                    return null;
                }
                String str2 = "Error consuming purchase with token. Response code: ";
                String str3 = (String) hVar2.f10944b;
                try {
                    com.google.android.gms.internal.play_billing.u.g("BillingClient", "Consuming purchase with token: ".concat(str3));
                    try {
                        synchronized (bVar.f3734a) {
                            try {
                                cVar = bVar.f3739i;
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
                                    bVar.g(hVar, str2, c0.h, 107, "Service has been reset to null.", null);
                                    return null;
                                } catch (DeadObjectException e) {
                                    e = e;
                                    deadObjectException = e;
                                    bVar.g(hVar, str2, c0.h, 29, "Error consuming purchase!", deadObjectException);
                                    return null;
                                } catch (Exception e7) {
                                    e = e7;
                                    exc = e;
                                    bVar.g(hVar, str2, c0.f3760f, 29, "Error consuming purchase!", exc);
                                    return null;
                                }
                            }
                            if (bVar.f3744n) {
                                String packageName = bVar.f3738g.getPackageName();
                                boolean z10 = bVar.f3744n;
                                String str4 = bVar.f3736c;
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
                                String packageName2 = bVar.f3738g.getPackageName();
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
                            g a2 = c0.a(readInt, str);
                            if (readInt == 0) {
                                com.google.android.gms.internal.play_billing.u.g("BillingClient", "Successfully consumed purchase.");
                                hVar.a(a2);
                                return null;
                            }
                            bVar.g(hVar, str3, a2, 23, "Error consuming purchase with token. Response code: " + readInt, null);
                            return null;
                        } catch (DeadObjectException e10) {
                            deadObjectException = e10;
                            str2 = str3;
                            bVar.g(hVar, str2, c0.h, 29, "Error consuming purchase!", deadObjectException);
                            return null;
                        } catch (Exception e11) {
                            exc = e11;
                            str2 = str3;
                            bVar.g(hVar, str2, c0.f3760f, 29, "Error consuming purchase!", exc);
                            return null;
                        }
                    } catch (DeadObjectException e12) {
                        e = e12;
                    } catch (Exception e13) {
                        e = e13;
                    }
                } catch (DeadObjectException e14) {
                    e = e14;
                    str2 = str3;
                } catch (Exception e15) {
                    e = e15;
                    str2 = str3;
                }
            case 1:
                return a();
            case 2:
                return b();
            case 3:
                return c();
            case 4:
                return Boolean.valueOf(((SharedPreferences) this.f3811b).getBoolean((String) this.f3812c, ((Boolean) this.d).booleanValue()));
            case 5:
                return Integer.valueOf(((SharedPreferences) this.f3811b).getInt((String) this.f3812c, ((Integer) this.d).intValue()));
            case 6:
                return Long.valueOf(((SharedPreferences) this.f3811b).getLong((String) this.f3812c, ((Long) this.d).longValue()));
            default:
                return ((SharedPreferences) this.f3811b).getString((String) this.f3812c, (String) this.d);
        }
    }

    public r(b bVar, n nVar, String str) {
        this.f3810a = 2;
        this.f3812c = nVar;
        this.d = str;
        Objects.requireNonNull(bVar);
        this.f3811b = bVar;
    }
}
