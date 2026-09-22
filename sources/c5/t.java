package c5;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Parcel;
import j$.util.Objects;
import java.util.concurrent.Callable;
public final class t implements Callable {
    public final int f3925a;
    public final Object f3926b;
    public final Object f3927c;
    public final Object d;

    public t(Object obj, Object obj2, Object obj3, int i10) {
        this.f3925a = i10;
        this.f3926b = obj;
        this.f3927c = obj2;
        this.d = obj3;
    }

    private final java.lang.Object a() {
        throw new UnsupportedOperationException("Method not decompiled: c5.t.a():java.lang.Object");
    }

    private final java.lang.Object b() {
        throw new UnsupportedOperationException("Method not decompiled: c5.t.b():java.lang.Object");
    }

    private final Object c() {
        Bundle c10;
        com.google.android.gms.internal.play_billing.c cVar;
        c cVar2 = (c) this.f3926b;
        String str = (String) this.f3927c;
        String str2 = (String) this.d;
        try {
            synchronized (cVar2.f3847a) {
                cVar = cVar2.f3852i;
            }
            if (cVar == null) {
                return com.google.android.gms.internal.play_billing.u.c(107, f0.h);
            }
            return ((com.google.android.gms.internal.play_billing.a) cVar).Y0(cVar2.f3851g.getPackageName(), str, str2);
        } catch (DeadObjectException e) {
            h hVar = f0.h;
            String a2 = d0.a(e);
            c10 = com.google.android.gms.internal.play_billing.u.c(5, hVar);
            if (a2 != null) {
                c10.putString("ADDITIONAL_LOG_DETAILS", a2);
            }
            return c10;
        } catch (Exception e7) {
            h hVar2 = f0.f3878f;
            String a10 = d0.a(e7);
            c10 = com.google.android.gms.internal.play_billing.u.c(5, hVar2);
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
        switch (this.f3925a) {
            case 0:
                c cVar2 = (c) this.f3926b;
                j jVar = (j) this.f3927c;
                i iVar = (i) this.d;
                if (!cVar2.n()) {
                    h hVar = f0.h;
                    cVar2.y(2, 4, hVar);
                    jVar.a(hVar, iVar.f3901a);
                    return null;
                }
                String str2 = "Error consuming purchase with token. Response code: ";
                String str3 = iVar.f3901a;
                try {
                    com.google.android.gms.internal.play_billing.u.g("BillingClient", "Consuming purchase with token: ".concat(str3));
                    try {
                        synchronized (cVar2.f3847a) {
                            try {
                                cVar = cVar2.f3852i;
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
                                    cVar2.g(jVar, str2, f0.h, 107, "Service has been reset to null.", null);
                                    return null;
                                } catch (DeadObjectException e) {
                                    e = e;
                                    deadObjectException = e;
                                    cVar2.g(jVar, str2, f0.h, 29, "Error consuming purchase!", deadObjectException);
                                    return null;
                                } catch (Exception e7) {
                                    e = e7;
                                    exc = e;
                                    cVar2.g(jVar, str2, f0.f3878f, 29, "Error consuming purchase!", exc);
                                    return null;
                                }
                            }
                            if (cVar2.f3857n) {
                                String packageName = cVar2.f3851g.getPackageName();
                                boolean z10 = cVar2.f3857n;
                                String str4 = cVar2.f3849c;
                                String str5 = cVar2.d;
                                long longValue = cVar2.A.longValue();
                                Bundle bundle = new Bundle();
                                if (z10) {
                                    com.google.android.gms.internal.play_billing.u.b(bundle, str4, str5, longValue);
                                }
                                Bundle X0 = ((com.google.android.gms.internal.play_billing.a) cVar).X0(packageName, str3, bundle);
                                readInt = X0.getInt("RESPONSE_CODE");
                                str = com.google.android.gms.internal.play_billing.u.f("BillingClient", X0);
                            } else {
                                String packageName2 = cVar2.f3851g.getPackageName();
                                com.google.android.gms.internal.play_billing.a aVar = (com.google.android.gms.internal.play_billing.a) cVar;
                                Parcel U0 = aVar.U0();
                                U0.writeInt(3);
                                U0.writeString(packageName2);
                                U0.writeString(str3);
                                Parcel V0 = aVar.V0(U0, 5);
                                readInt = V0.readInt();
                                V0.recycle();
                                str = "";
                            }
                            h a2 = f0.a(readInt, str);
                            if (readInt == 0) {
                                com.google.android.gms.internal.play_billing.u.g("BillingClient", "Successfully consumed purchase.");
                                jVar.a(a2, str3);
                                return null;
                            }
                            cVar2.g(jVar, str3, a2, 23, "Error consuming purchase with token. Response code: " + readInt, null);
                            return null;
                        } catch (DeadObjectException e10) {
                            deadObjectException = e10;
                            str2 = str3;
                            cVar2.g(jVar, str2, f0.h, 29, "Error consuming purchase!", deadObjectException);
                            return null;
                        } catch (Exception e11) {
                            exc = e11;
                            str2 = str3;
                            cVar2.g(jVar, str2, f0.f3878f, 29, "Error consuming purchase!", exc);
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
                return Boolean.valueOf(((SharedPreferences) this.f3926b).getBoolean((String) this.f3927c, ((Boolean) this.d).booleanValue()));
            case 5:
                return Integer.valueOf(((SharedPreferences) this.f3926b).getInt((String) this.f3927c, ((Integer) this.d).intValue()));
            case 6:
                return Long.valueOf(((SharedPreferences) this.f3926b).getLong((String) this.f3927c, ((Long) this.d).longValue()));
            default:
                return ((SharedPreferences) this.f3926b).getString((String) this.f3927c, (String) this.d);
        }
    }

    public t(c cVar, o oVar, String str) {
        this.f3925a = 2;
        this.f3927c = oVar;
        this.d = str;
        Objects.requireNonNull(cVar);
        this.f3926b = cVar;
    }
}
