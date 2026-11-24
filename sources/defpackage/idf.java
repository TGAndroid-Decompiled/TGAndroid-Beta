package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
public final class idf extends BroadcastReceiver {
    public boolean a;
    public final boolean b;
    public final ej0 c;

    public idf(ej0 ej0Var, boolean z) {
        this.c = ej0Var;
        this.b = z;
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        int i;
        if (!this.a) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (true != this.b) {
                    i = 4;
                } else {
                    i = 2;
                }
                context.registerReceiver(this, intentFilter, i);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.a = true;
        }
    }

    public final synchronized void b(Context context, IntentFilter intentFilter) {
        idf idfVar;
        int i;
        try {
            try {
                if (this.a) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    if (true != this.b) {
                        i = 4;
                    } else {
                        i = 2;
                    }
                    idfVar = this;
                    context.registerReceiver(idfVar, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, i);
                } else {
                    idfVar = this;
                    context.registerReceiver(idfVar, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                }
                idfVar.a = true;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final void c(Bundle bundle, fj0 fj0Var, int i, fme fmeVar, long j, boolean z) {
        qzd d;
        try {
            byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
            ej0 ej0Var = this.c;
            if (byteArray != null) {
                rhb rhbVar = (rhb) ej0Var.d;
                byte[] byteArray2 = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
                int i2 = qzd.a;
                synchronized (qzd.class) {
                    int i3 = qzd.a;
                    kce kceVar = kce.c;
                    d = t1e.d();
                    int i4 = qzd.a;
                }
                rhbVar.x(gje.n(byteArray2, d), j, z);
                return;
            }
            ((rhb) ej0Var.d).x(ald.b(23, i, fj0Var, null, fmeVar), j, z);
        } catch (Throwable unused) {
            yid.h("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    @Override
    public final void onReceive(android.content.Context r19, android.content.Intent r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.idf.onReceive(android.content.Context, android.content.Intent):void");
    }
}
