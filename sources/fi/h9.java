package fi;

import android.content.Context;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.Locale;
public final class h9 implements Runnable {
    public final int f12142a;
    public final Object f12143b;

    public h9(Object obj, int i7) {
        this.f12142a = i7;
        this.f12143b = obj;
    }

    private final void a() {
        int i7;
        String d;
        TelephonyManager telephonyManager;
        h2.v vVar = (h2.v) this.f12143b;
        b3.f fVar = (b3.f) vVar.f14151a.get();
        if (fVar != null) {
            int b10 = vVar.f14153c.b();
            b3.g gVar = fVar.f2927a;
            synchronized (gVar) {
                synchronized (gVar) {
                    int i10 = gVar.f2945n;
                    if (i10 != 0 && !gVar.f2937e) {
                        return;
                    }
                    if (i10 == b10 && gVar.f2946o != null) {
                        return;
                    }
                    gVar.f2945n = b10;
                    if (b10 != 1 && b10 != 0 && b10 != 8) {
                        if (gVar.f2946o == null) {
                            Context context = gVar.f2934a;
                            String str = h2.m0.f14112a;
                            if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                if (!TextUtils.isEmpty(networkCountryIso)) {
                                    d = a8.ga.d(networkCountryIso);
                                    gVar.f2946o = d;
                                }
                            }
                            d = a8.ga.d(Locale.getDefault().getCountry());
                            gVar.f2946o = d;
                        }
                        gVar.f2943l = gVar.b(b10);
                        gVar.d.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (gVar.f2939g > 0) {
                            i7 = (int) (elapsedRealtime - gVar.h);
                        } else {
                            i7 = 0;
                        }
                        gVar.d(gVar.f2940i, i7, gVar.f2943l);
                        gVar.h = elapsedRealtime;
                        gVar.f2940i = 0L;
                        gVar.f2942k = 0L;
                        gVar.f2941j = 0L;
                        b3.t tVar = gVar.f2938f;
                        tVar.f2974a.clear();
                        tVar.f2976c = -1;
                        tVar.d = 0;
                        tVar.f2977e = 0;
                    }
                }
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: fi.h9.run():void");
    }
}
