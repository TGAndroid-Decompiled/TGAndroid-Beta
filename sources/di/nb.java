package di;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.Locale;
public final class nb implements Runnable {
    public final int f7729a;
    public final Object f7730b;

    public nb(i2.c0 c0Var, SurfaceTexture surfaceTexture) {
        this.f7729a = 25;
        this.f7730b = c0Var;
    }

    private final void a() {
        int i10;
        String c10;
        TelephonyManager telephonyManager;
        e2.t tVar = (e2.t) this.f7730b;
        y2.e eVar = (y2.e) tVar.f8807a.get();
        if (eVar != null) {
            int b10 = tVar.f8809c.b();
            y2.f fVar = eVar.f49515a;
            synchronized (fVar) {
                synchronized (fVar) {
                    int i11 = fVar.f49533n;
                    if (i11 != 0 && !fVar.f49525e) {
                        return;
                    }
                    if (i11 == b10 && fVar.f49534o != null) {
                        return;
                    }
                    fVar.f49533n = b10;
                    if (b10 != 1 && b10 != 0 && b10 != 8) {
                        if (fVar.f49534o == null) {
                            Context context = fVar.f49522a;
                            String str = e2.d0.f8765a;
                            if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                if (!TextUtils.isEmpty(networkCountryIso)) {
                                    c10 = v7.r6.c(networkCountryIso);
                                    fVar.f49534o = c10;
                                }
                            }
                            c10 = v7.r6.c(Locale.getDefault().getCountry());
                            fVar.f49534o = c10;
                        }
                        fVar.f49531l = fVar.a(b10);
                        fVar.d.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (fVar.f49527g > 0) {
                            i10 = (int) (elapsedRealtime - fVar.h);
                        } else {
                            i10 = 0;
                        }
                        fVar.c(i10, fVar.f49528i, fVar.f49531l);
                        fVar.h = elapsedRealtime;
                        fVar.f49528i = 0L;
                        fVar.f49530k = 0L;
                        fVar.f49529j = 0L;
                        y2.r rVar = fVar.f49526f;
                        rVar.f49560a.clear();
                        rVar.f49562c = -1;
                        rVar.d = 0;
                        rVar.f49563e = 0;
                    }
                }
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: di.nb.run():void");
    }

    public nb(i2.o0 o0Var, i2.j1 j1Var) {
        this.f7729a = 26;
        this.f7730b = j1Var;
    }

    public nb(Object obj, int i10) {
        this.f7729a = i10;
        this.f7730b = obj;
    }
}
