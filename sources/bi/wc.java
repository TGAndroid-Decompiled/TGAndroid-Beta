package bi;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Locale;
public final class wc implements Runnable {
    public final int f3845a;
    public final Object f3846b;

    public wc(com.google.firebase.messaging.k kVar, Intent intent) {
        this.f3845a = 9;
        this.f3846b = intent;
    }

    private final void a() {
        u6 u6Var = (u6) this.f3846b;
        synchronized (((ArrayDeque) u6Var.d)) {
            SharedPreferences.Editor edit = ((SharedPreferences) u6Var.f3719a).edit();
            String str = (String) u6Var.f3720b;
            StringBuilder sb2 = new StringBuilder();
            Iterator it = ((ArrayDeque) u6Var.d).iterator();
            while (it.hasNext()) {
                sb2.append((String) it.next());
                sb2.append((String) u6Var.f3721c);
            }
            edit.putString(str, sb2.toString()).commit();
        }
    }

    private final void b() {
        int i10;
        String c10;
        TelephonyManager telephonyManager;
        e2.t tVar = (e2.t) this.f3846b;
        y2.e eVar = (y2.e) tVar.f7226a.get();
        if (eVar != null) {
            int b10 = tVar.f7228c.b();
            y2.f fVar = eVar.f46414a;
            synchronized (fVar) {
                synchronized (fVar) {
                    int i11 = fVar.f46431n;
                    if (i11 != 0 && !fVar.e) {
                        return;
                    }
                    if (i11 == b10 && fVar.f46432o != null) {
                        return;
                    }
                    fVar.f46431n = b10;
                    if (b10 != 1 && b10 != 0 && b10 != 8) {
                        if (fVar.f46432o == null) {
                            Context context = fVar.f46421a;
                            String str = e2.d0.f7188a;
                            if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                if (!TextUtils.isEmpty(networkCountryIso)) {
                                    c10 = v7.r6.c(networkCountryIso);
                                    fVar.f46432o = c10;
                                }
                            }
                            c10 = v7.r6.c(Locale.getDefault().getCountry());
                            fVar.f46432o = c10;
                        }
                        fVar.f46429l = fVar.a(b10);
                        fVar.d.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (fVar.f46425g > 0) {
                            i10 = (int) (elapsedRealtime - fVar.h);
                        } else {
                            i10 = 0;
                        }
                        fVar.c(i10, fVar.f46426i, fVar.f46429l);
                        fVar.h = elapsedRealtime;
                        fVar.f46426i = 0L;
                        fVar.f46428k = 0L;
                        fVar.f46427j = 0L;
                        y2.s sVar = fVar.f46424f;
                        sVar.f46456a.clear();
                        sVar.f46458c = -1;
                        sVar.d = 0;
                        sVar.e = 0;
                    }
                }
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bi.wc.run():void");
    }

    public wc(Object obj, int i10) {
        this.f3845a = i10;
        this.f3846b = obj;
    }
}
