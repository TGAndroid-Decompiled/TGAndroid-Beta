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
public final class h0 extends BroadcastReceiver {
    public boolean f4400a;
    public final boolean f4401b;
    public final g f4402c;

    public h0(g gVar, boolean z10) {
        this.f4402c = gVar;
        this.f4401b = z10;
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        int i10;
        try {
            if (this.f4400a) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                if (true != this.f4401b) {
                    i10 = 4;
                } else {
                    i10 = 2;
                }
                context.registerReceiver(this, intentFilter, i10);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.f4400a = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(Context context, IntentFilter intentFilter) {
        h0 h0Var;
        int i10;
        try {
            try {
                if (this.f4400a) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    if (true != this.f4401b) {
                        i10 = 4;
                    } else {
                        i10 = 2;
                    }
                    h0Var = this;
                    context.registerReceiver(h0Var, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, i10);
                } else {
                    h0Var = this;
                    context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                }
                h0Var.f4400a = true;
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
                f0 f0Var = (f0) this.f4402c.d;
                byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
                int i11 = o1.f5853a;
                synchronized (o1.class) {
                    int i12 = o1.f5853a;
                    q2 q2Var = q2.f5870c;
                    d = s1.d();
                    int i13 = o1.f5853a;
                }
                ((pf.b) f0Var).n0(g3.n(byteArray, d), j3, z10);
                return;
            }
            ((pf.b) ((f0) this.f4402c.d)).n0(e0.b(23, i10, hVar, null, m3Var), j3, z10);
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.u.h("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    @Override
    public final void onReceive(android.content.Context r19, android.content.Intent r20) {
        throw new UnsupportedOperationException("Method not decompiled: c5.h0.onReceive(android.content.Context, android.content.Intent):void");
    }
}
