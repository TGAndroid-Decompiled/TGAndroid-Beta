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
public final class d0 extends BroadcastReceiver {
    public boolean f3772a;
    public final boolean f3773b;
    public final f f3774c;

    public d0(f fVar, boolean z10) {
        this.f3774c = fVar;
        this.f3773b = z10;
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        int i10;
        try {
            if (this.f3772a) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                if (true != this.f3773b) {
                    i10 = 4;
                } else {
                    i10 = 2;
                }
                context.registerReceiver(this, intentFilter, i10);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.f3772a = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(Context context, IntentFilter intentFilter) {
        d0 d0Var;
        int i10;
        try {
            try {
                if (this.f3772a) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    if (true != this.f3773b) {
                        i10 = 4;
                    } else {
                        i10 = 2;
                    }
                    d0Var = this;
                    context.registerReceiver(d0Var, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, i10);
                } else {
                    d0Var = this;
                    context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                }
                d0Var.f3772a = true;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public final void c(Bundle bundle, g gVar, int i10, m3 m3Var, long j10, boolean z10) {
        o1 d;
        try {
            if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") != null) {
                b0 b0Var = (b0) this.f3774c.d;
                byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
                int i11 = o1.f5173a;
                synchronized (o1.class) {
                    int i12 = o1.f5173a;
                    q2 q2Var = q2.f5188c;
                    d = s1.d();
                    int i13 = o1.f5173a;
                }
                ((hf.b) b0Var).u0(g3.n(byteArray, d), j10, z10);
                return;
            }
            ((hf.b) ((b0) this.f3774c.d)).u0(a0.b(23, i10, gVar, null, m3Var), j10, z10);
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.u.h("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    @Override
    public final void onReceive(android.content.Context r19, android.content.Intent r20) {
        throw new UnsupportedOperationException("Method not decompiled: c5.d0.onReceive(android.content.Context, android.content.Intent):void");
    }
}
