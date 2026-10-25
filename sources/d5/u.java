package d5;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Parcel;
import j$.util.Objects;
import java.util.concurrent.Callable;
public final class u implements Callable {
    public final int f8012a;
    public final Object f8013b;
    public final Object f8014c;
    public final Object d;

    public u(Object obj, Object obj2, Object obj3, int i10) {
        this.f8012a = i10;
        this.f8013b = obj;
        this.f8014c = obj2;
        this.d = obj3;
    }

    private final java.lang.Object a() {
        throw new UnsupportedOperationException("Method not decompiled: d5.u.a():java.lang.Object");
    }

    private final java.lang.Object b() {
        throw new UnsupportedOperationException("Method not decompiled: d5.u.b():java.lang.Object");
    }

    private final Object c() {
        Bundle c10;
        com.google.android.gms.internal.play_billing.c cVar;
        c cVar2 = (c) this.f8013b;
        String str = (String) this.f8014c;
        String str2 = (String) this.d;
        try {
            synchronized (cVar2.f7931a) {
                cVar = cVar2.f7936i;
            }
            if (cVar == null) {
                return com.google.android.gms.internal.play_billing.u.c(107, e0.h);
            }
            return ((com.google.android.gms.internal.play_billing.a) cVar).X0(cVar2.f7935g.getPackageName(), str, str2);
        } catch (DeadObjectException e) {
            i iVar = e0.h;
            String a2 = c0.a(e);
            c10 = com.google.android.gms.internal.play_billing.u.c(5, iVar);
            if (a2 != null) {
                c10.putString("ADDITIONAL_LOG_DETAILS", a2);
            }
            return c10;
        } catch (Exception e10) {
            i iVar2 = e0.f7960f;
            String a10 = c0.a(e10);
            c10 = com.google.android.gms.internal.play_billing.u.c(5, iVar2);
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
        switch (this.f8012a) {
            case 0:
                c cVar2 = (c) this.f8013b;
                k kVar = (k) this.f8014c;
                j jVar = (j) this.d;
                if (!cVar2.n()) {
                    i iVar = e0.h;
                    cVar2.y(2, 4, iVar);
                    kVar.a(iVar, jVar.f7988a);
                    return null;
                }
                String str2 = "Error consuming purchase with token. Response code: ";
                String str3 = jVar.f7988a;
                try {
                    com.google.android.gms.internal.play_billing.u.g("BillingClient", "Consuming purchase with token: ".concat(str3));
                    try {
                        synchronized (cVar2.f7931a) {
                            try {
                                cVar = cVar2.f7936i;
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
                                    cVar2.g(kVar, str2, e0.h, 107, "Service has been reset to null.", null);
                                    return null;
                                } catch (DeadObjectException e) {
                                    e = e;
                                    deadObjectException = e;
                                    cVar2.g(kVar, str2, e0.h, 29, "Error consuming purchase!", deadObjectException);
                                    return null;
                                } catch (Exception e10) {
                                    e = e10;
                                    exc = e;
                                    cVar2.g(kVar, str2, e0.f7960f, 29, "Error consuming purchase!", exc);
                                    return null;
                                }
                            }
                            if (cVar2.f7941n) {
                                String packageName = cVar2.f7935g.getPackageName();
                                boolean z10 = cVar2.f7941n;
                                String str4 = cVar2.f7933c;
                                String str5 = cVar2.d;
                                long longValue = cVar2.A.longValue();
                                Bundle bundle = new Bundle();
                                if (z10) {
                                    com.google.android.gms.internal.play_billing.u.b(bundle, str4, str5, longValue);
                                }
                                Bundle W0 = ((com.google.android.gms.internal.play_billing.a) cVar).W0(packageName, str3, bundle);
                                readInt = W0.getInt("RESPONSE_CODE");
                                str = com.google.android.gms.internal.play_billing.u.f("BillingClient", W0);
                            } else {
                                String packageName2 = cVar2.f7935g.getPackageName();
                                com.google.android.gms.internal.play_billing.a aVar = (com.google.android.gms.internal.play_billing.a) cVar;
                                Parcel T0 = aVar.T0();
                                T0.writeInt(3);
                                T0.writeString(packageName2);
                                T0.writeString(str3);
                                Parcel U0 = aVar.U0(T0, 5);
                                readInt = U0.readInt();
                                U0.recycle();
                                str = "";
                            }
                            i a2 = e0.a(readInt, str);
                            if (readInt == 0) {
                                com.google.android.gms.internal.play_billing.u.g("BillingClient", "Successfully consumed purchase.");
                                kVar.a(a2, str3);
                                return null;
                            }
                            cVar2.g(kVar, str3, a2, 23, "Error consuming purchase with token. Response code: " + readInt, null);
                            return null;
                        } catch (DeadObjectException e11) {
                            deadObjectException = e11;
                            str2 = str3;
                            cVar2.g(kVar, str2, e0.h, 29, "Error consuming purchase!", deadObjectException);
                            return null;
                        } catch (Exception e12) {
                            exc = e12;
                            str2 = str3;
                            cVar2.g(kVar, str2, e0.f7960f, 29, "Error consuming purchase!", exc);
                            return null;
                        }
                    } catch (DeadObjectException e13) {
                        e = e13;
                    } catch (Exception e14) {
                        e = e14;
                    }
                } catch (DeadObjectException e15) {
                    e = e15;
                    str2 = str3;
                } catch (Exception e16) {
                    e = e16;
                    str2 = str3;
                }
            case 1:
                return a();
            case 2:
                return b();
            case 3:
                return c();
            case 4:
                return Boolean.valueOf(((SharedPreferences) this.f8013b).getBoolean((String) this.f8014c, ((Boolean) this.d).booleanValue()));
            case 5:
                return Integer.valueOf(((SharedPreferences) this.f8013b).getInt((String) this.f8014c, ((Integer) this.d).intValue()));
            case 6:
                return Long.valueOf(((SharedPreferences) this.f8013b).getLong((String) this.f8014c, ((Long) this.d).longValue()));
            default:
                return ((SharedPreferences) this.f8013b).getString((String) this.f8014c, (String) this.d);
        }
    }

    public u(c cVar, p pVar, String str) {
        this.f8012a = 2;
        this.f8014c = pVar;
        this.d = str;
        Objects.requireNonNull(cVar);
        this.f8013b = cVar;
    }
}
