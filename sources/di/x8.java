package di;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.Locale;
public final class x8 implements Runnable {
    public final int f8092a;
    public final Object f8093b;

    public x8(i2.b0 b0Var, SurfaceTexture surfaceTexture) {
        this.f8092a = 25;
        this.f8093b = b0Var;
    }

    private final void a() {
        int i10;
        String d;
        TelephonyManager telephonyManager;
        e2.v vVar = (e2.v) this.f8093b;
        y2.e eVar = (y2.e) vVar.f8402a.get();
        if (eVar != null) {
            int b10 = vVar.f8404c.b();
            y2.f fVar = eVar.f48516a;
            synchronized (fVar) {
                synchronized (fVar) {
                    int i11 = fVar.f48533n;
                    if (i11 != 0 && !fVar.e) {
                        return;
                    }
                    if (i11 == b10 && fVar.f48534o != null) {
                        return;
                    }
                    fVar.f48533n = b10;
                    if (b10 != 1 && b10 != 0 && b10 != 8) {
                        if (fVar.f48534o == null) {
                            Context context = fVar.f48523a;
                            String str = e2.m0.f8372a;
                            if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                if (!TextUtils.isEmpty(networkCountryIso)) {
                                    d = v7.s6.d(networkCountryIso);
                                    fVar.f48534o = d;
                                }
                            }
                            d = v7.s6.d(Locale.getDefault().getCountry());
                            fVar.f48534o = d;
                        }
                        fVar.f48531l = fVar.a(b10);
                        fVar.d.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (fVar.f48527g > 0) {
                            i10 = (int) (elapsedRealtime - fVar.h);
                        } else {
                            i10 = 0;
                        }
                        fVar.c(i10, fVar.f48528i, fVar.f48531l);
                        fVar.h = elapsedRealtime;
                        fVar.f48528i = 0L;
                        fVar.f48530k = 0L;
                        fVar.f48529j = 0L;
                        y2.q qVar = fVar.f48526f;
                        qVar.f48554a.clear();
                        qVar.f48556c = -1;
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
        this.f8092a = 26;
        this.f8093b = n1Var;
    }

    public x8(Object obj, int i10) {
        this.f8092a = i10;
        this.f8093b = obj;
    }
}
