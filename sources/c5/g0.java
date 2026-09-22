package c5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.m3;
import com.google.android.gms.internal.play_billing.o1;
import com.google.android.gms.internal.play_billing.q2;
import com.google.android.gms.internal.play_billing.s1;
public final class g0 extends BroadcastReceiver {
    public boolean f3892a;
    public final boolean f3893b;
    public final g f3894c;

    public g0(g gVar, boolean z10) {
        this.f3894c = gVar;
        this.f3893b = z10;
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        int i10;
        try {
            if (this.f3892a) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                if (true != this.f3893b) {
                    i10 = 4;
                } else {
                    i10 = 2;
                }
                context.registerReceiver(this, intentFilter, i10);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.f3892a = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(Context context, IntentFilter intentFilter) {
        g0 g0Var;
        int i10;
        try {
            try {
                if (this.f3892a) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    if (true != this.f3893b) {
                        i10 = 4;
                    } else {
                        i10 = 2;
                    }
                    g0Var = this;
                    context.registerReceiver(g0Var, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, i10);
                } else {
                    g0Var = this;
                    context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                }
                g0Var.f3892a = true;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public final void c(Bundle bundle, h hVar, int i10, m3 m3Var, long j3, boolean z10) {
        o1 d;
        try {
            if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") != null) {
                e0 e0Var = (e0) this.f3894c.d;
                byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
                int i11 = o1.f6855a;
                synchronized (o1.class) {
                    int i12 = o1.f6855a;
                    q2 q2Var = q2.f6870c;
                    d = s1.d();
                    int i13 = o1.f6855a;
                }
                ((of.b) e0Var).d0(g3.n(byteArray, d), j3, z10);
                return;
            }
            ((of.b) ((e0) this.f3894c.d)).d0(d0.b(23, i10, hVar, null, m3Var), j3, z10);
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.u.h("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    @Override
    public final void onReceive(android.content.Context r19, android.content.Intent r20) {
        throw new UnsupportedOperationException("Method not decompiled: c5.g0.onReceive(android.content.Context, android.content.Intent):void");
    }
}
