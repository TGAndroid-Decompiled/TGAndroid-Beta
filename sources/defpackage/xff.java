package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
public final class xff extends BroadcastReceiver {
    public boolean a;
    public final boolean b;
    public final fi0 c;

    public xff(fi0 fi0Var, boolean z) {
        this.c = fi0Var;
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
        xff xffVar;
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
                    xffVar = this;
                    context.registerReceiver(xffVar, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, i);
                } else {
                    xffVar = this;
                    context.registerReceiver(xffVar, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                }
                xffVar.a = true;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final void c(Bundle bundle, gi0 gi0Var, int i, uoe uoeVar, long j, boolean z) {
        d2e d;
        try {
            byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
            fi0 fi0Var = this.c;
            if (byteArray != null) {
                zhc zhcVar = (zhc) fi0Var.d;
                byte[] byteArray2 = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
                int i2 = d2e.a;
                synchronized (d2e.class) {
                    int i3 = d2e.a;
                    zee zeeVar = zee.c;
                    d = g4e.d();
                    int i4 = d2e.a;
                }
                zhcVar.k(wle.n(byteArray2, d), j, z);
                return;
            }
            ((zhc) fi0Var.d).k(pnd.b(23, i, gi0Var, null, uoeVar), j, z);
        } catch (Throwable unused) {
            old.h("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    @Override
    public final void onReceive(android.content.Context r19, android.content.Intent r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xff.onReceive(android.content.Context, android.content.Intent):void");
    }
}
