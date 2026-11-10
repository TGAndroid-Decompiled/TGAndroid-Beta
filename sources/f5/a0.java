package f5;

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
public final class a0 extends BroadcastReceiver {
    public boolean f11119a;
    public final boolean f11120b;
    public final e f11121c;

    public a0(e eVar, boolean z9) {
        this.f11121c = eVar;
        this.f11120b = z9;
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        int i7;
        try {
            if (this.f11119a) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                if (true != this.f11120b) {
                    i7 = 4;
                } else {
                    i7 = 2;
                }
                context.registerReceiver(this, intentFilter, i7);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.f11119a = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(Context context, IntentFilter intentFilter) {
        a0 a0Var;
        int i7;
        try {
            try {
                if (this.f11119a) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    if (true != this.f11120b) {
                        i7 = 4;
                    } else {
                        i7 = 2;
                    }
                    a0Var = this;
                    context.registerReceiver(a0Var, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, i7);
                } else {
                    a0Var = this;
                    context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                }
                a0Var.f11119a = true;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public final void c(Bundle bundle, f fVar, int i7, m3 m3Var, long j3, boolean z9) {
        o1 a10;
        try {
            if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") != null) {
                y yVar = (y) this.f11121c.d;
                byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
                int i10 = o1.f7427a;
                synchronized (o1.class) {
                    int i11 = o1.f7427a;
                    q2 q2Var = q2.f7444c;
                    a10 = s1.a();
                    int i12 = o1.f7427a;
                }
                ((q4.q) yVar).j(g3.n(byteArray, a10), j3, z9);
                return;
            }
            ((q4.q) ((y) this.f11121c.d)).j(x.b(23, i7, fVar, null, m3Var), j3, z9);
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.u.h("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    @Override
    public final void onReceive(android.content.Context r19, android.content.Intent r20) {
        throw new UnsupportedOperationException("Method not decompiled: f5.a0.onReceive(android.content.Context, android.content.Intent):void");
    }
}
