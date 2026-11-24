package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
public final class hbf extends BroadcastReceiver {
    public boolean a;
    public final boolean b;
    public final ei0 c;

    public hbf(ei0 ei0Var, boolean z) {
        this.c = ei0Var;
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
        hbf hbfVar;
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
                    hbfVar = this;
                    context.registerReceiver(hbfVar, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, i);
                } else {
                    hbfVar = this;
                    context.registerReceiver(hbfVar, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                }
                hbfVar.a = true;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final void c(Bundle bundle, fi0 fi0Var, int i, dke dkeVar, long j, boolean z) {
        nxd d;
        try {
            byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
            ei0 ei0Var = this.c;
            if (byteArray != null) {
                aec aecVar = (aec) ei0Var.d;
                byte[] byteArray2 = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
                int i2 = nxd.a;
                synchronized (nxd.class) {
                    int i3 = nxd.a;
                    jae jaeVar = jae.c;
                    d = qzd.d();
                    int i4 = nxd.a;
                }
                aecVar.k(fhe.n(byteArray2, d), j, z);
                return;
            }
            ((aec) ei0Var.d).k(yid.b(23, i, fi0Var, null, dkeVar), j, z);
        } catch (Throwable unused) {
            xgd.h("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    @Override
    public final void onReceive(android.content.Context r19, android.content.Intent r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hbf.onReceive(android.content.Context, android.content.Intent):void");
    }
}
