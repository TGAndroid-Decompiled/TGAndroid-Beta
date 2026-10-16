package di;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.Locale;
public final class x8 implements Runnable {
    public final int f8094a;
    public final Object f8095b;

    public x8(i2.b0 b0Var, SurfaceTexture surfaceTexture) {
        this.f8094a = 25;
        this.f8095b = b0Var;
    }

    private final void a() {
        int i10;
        String d;
        TelephonyManager telephonyManager;
        e2.v vVar = (e2.v) this.f8095b;
        y2.e eVar = (y2.e) vVar.f8405a.get();
        if (eVar != null) {
            int b10 = vVar.f8407c.b();
            y2.f fVar = eVar.f48515a;
            synchronized (fVar) {
                synchronized (fVar) {
                    int i11 = fVar.f48532n;
                    if (i11 != 0 && !fVar.e) {
                        return;
                    }
                    if (i11 == b10 && fVar.f48533o != null) {
                        return;
                    }
                    fVar.f48532n = b10;
                    if (b10 != 1 && b10 != 0 && b10 != 8) {
                        if (fVar.f48533o == null) {
                            Context context = fVar.f48522a;
                            String str = e2.m0.f8375a;
                            if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                if (!TextUtils.isEmpty(networkCountryIso)) {
                                    d = v7.s6.d(networkCountryIso);
                                    fVar.f48533o = d;
                                }
                            }
                            d = v7.s6.d(Locale.getDefault().getCountry());
                            fVar.f48533o = d;
                        }
                        fVar.f48530l = fVar.a(b10);
                        fVar.d.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (fVar.f48526g > 0) {
                            i10 = (int) (elapsedRealtime - fVar.h);
                        } else {
                            i10 = 0;
                        }
                        fVar.c(i10, fVar.f48527i, fVar.f48530l);
                        fVar.h = elapsedRealtime;
                        fVar.f48527i = 0L;
                        fVar.f48529k = 0L;
                        fVar.f48528j = 0L;
                        y2.q qVar = fVar.f48525f;
                        qVar.f48553a.clear();
                        qVar.f48555c = -1;
                        qVar.d = 0;
                        qVar.e = 0;
                    }
                }
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: di.x8.run():void");
    }

    public x8(i2.r0 r0Var, i2.n1 n1Var) {
        this.f8094a = 26;
        this.f8095b = n1Var;
    }

    public x8(Object obj, int i10) {
        this.f8094a = i10;
        this.f8095b = obj;
    }
}
