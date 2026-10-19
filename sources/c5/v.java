package c5;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Parcel;
import j$.util.Objects;
import java.util.concurrent.Callable;
public final class v implements Callable {
    public final int f4788a;
    public final Object f4789b;
    public final Object f4790c;
    public final Object d;

    public v(Object obj, Object obj2, Object obj3, int i10) {
        this.f4788a = i10;
        this.f4789b = obj;
        this.f4790c = obj2;
        this.d = obj3;
    }

    private final java.lang.Object a() {
        throw new UnsupportedOperationException("Method not decompiled: c5.v.a():java.lang.Object");
    }

    private final java.lang.Object b() {
        throw new UnsupportedOperationException("Method not decompiled: c5.v.b():java.lang.Object");
    }

    private final Object c() {
        Bundle c10;
        com.google.android.gms.internal.play_billing.c cVar;
        c cVar2 = (c) this.f4789b;
        String str = (String) this.f4790c;
        String str2 = (String) this.d;
        try {
            synchronized (cVar2.f4702a) {
                cVar = cVar2.f4707i;
            }
            if (cVar == null) {
                return com.google.android.gms.internal.play_billing.u.c(107, h0.h);
            }
            return ((com.google.android.gms.internal.play_billing.a) cVar).X0(cVar2.f4706g.getPackageName(), str, str2);
        } catch (DeadObjectException e) {
            i iVar = h0.h;
            String a2 = f0.a(e);
            c10 = com.google.android.gms.internal.play_billing.u.c(5, iVar);
            if (a2 != null) {
                c10.putString("ADDITIONAL_LOG_DETAILS", a2);
            }
            return c10;
        } catch (Exception e7) {
            i iVar2 = h0.f4744f;
            String a10 = f0.a(e7);
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
        switch (this.f4788a) {
            case 0:
                c cVar2 = (c) this.f4789b;
                k kVar = (k) this.f4790c;
                j jVar = (j) this.d;
                if (!cVar2.n()) {
                    i iVar = h0.h;
                    cVar2.y(2, 4, iVar);
                    kVar.a(iVar, jVar.f4760a);
                    return null;
                }
                String str2 = "Error consuming purchase with token. Response code: ";
                String str3 = jVar.f4760a;
                try {
                    com.google.android.gms.internal.play_billing.u.g("BillingClient", "Consuming purchase with token: ".concat(str3));
                    try {
                        synchronized (cVar2.f4702a) {
                            try {
                                cVar = cVar2.f4707i;
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
                                    cVar2.g(kVar, str2, h0.h, 107, "Service has been reset to null.", null);
                                    return null;
                                } catch (DeadObjectException e) {
                                    e = e;
                                    deadObjectException = e;
                                    cVar2.g(kVar, str2, h0.h, 29, "Error consuming purchase!", deadObjectException);
                                    return null;
                                } catch (Exception e7) {
                                    e = e7;
                                    exc = e;
                                    cVar2.g(kVar, str2, h0.f4744f, 29, "Error consuming purchase!", exc);
                                    return null;
                                }
                            }
                            if (cVar2.f4712n) {
                                String packageName = cVar2.f4706g.getPackageName();
                                boolean z10 = cVar2.f4712n;
                                String str4 = cVar2.f4704c;
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
                                String packageName2 = cVar2.f4706g.getPackageName();
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
                            i a2 = h0.a(readInt, str);
                            if (readInt == 0) {
                                com.google.android.gms.internal.play_billing.u.g("BillingClient", "Successfully consumed purchase.");
                                kVar.a(a2, str3);
                                return null;
                            }
                            cVar2.g(kVar, str3, a2, 23, "Error consuming purchase with token. Response code: " + readInt, null);
                            return null;
                        } catch (DeadObjectException e10) {
                            deadObjectException = e10;
                            str2 = str3;
                            cVar2.g(kVar, str2, h0.h, 29, "Error consuming purchase!", deadObjectException);
                            return null;
                        } catch (Exception e11) {
                            exc = e11;
                            str2 = str3;
                            cVar2.g(kVar, str2, h0.f4744f, 29, "Error consuming purchase!", exc);
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
                return Boolean.valueOf(((SharedPreferences) this.f4789b).getBoolean((String) this.f4790c, ((Boolean) this.d).booleanValue()));
            case 5:
                return Integer.valueOf(((SharedPreferences) this.f4789b).getInt((String) this.f4790c, ((Integer) this.d).intValue()));
            case 6:
                return Long.valueOf(((SharedPreferences) this.f4789b).getLong((String) this.f4790c, ((Long) this.d).longValue()));
            default:
                return ((SharedPreferences) this.f4789b).getString((String) this.f4790c, (String) this.d);
        }
    }

    public v(c cVar, q qVar, String str) {
        this.f4788a = 2;
        this.f4790c = qVar;
        this.d = str;
        Objects.requireNonNull(cVar);
        this.f4789b = cVar;
    }
}
