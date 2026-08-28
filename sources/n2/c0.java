package n2;

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
public final class c0 extends BroadcastReceiver {
    public boolean f18303a;
    public final boolean f18304b;
    public final f f18305c;

    public c0(f fVar, boolean z10) {
        this.f18305c = fVar;
        this.f18304b = z10;
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        int i9;
        try {
            if (this.f18303a) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                if (true != this.f18304b) {
                    i9 = 4;
                } else {
                    i9 = 2;
                }
                context.registerReceiver(this, intentFilter, i9);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.f18303a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Context context, IntentFilter intentFilter) {
        c0 c0Var;
        int i9;
        try {
            try {
                if (this.f18303a) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    if (true != this.f18304b) {
                        i9 = 4;
                    } else {
                        i9 = 2;
                    }
                    c0Var = this;
                    context.registerReceiver(c0Var, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, i9);
                } else {
                    c0Var = this;
                    context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                }
                c0Var.f18303a = true;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final void c(Bundle bundle, g gVar, int i9, m3 m3Var, long j10, boolean z10) {
        o1 b10;
        try {
            if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") != null) {
                a0 a0Var = (a0) this.f18305c.d;
                byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
                int i10 = o1.f3646a;
                synchronized (o1.class) {
                    int i11 = o1.f3646a;
                    q2 q2Var = q2.f3663c;
                    b10 = s1.b();
                    int i12 = o1.f3646a;
                }
                ((g5.b) a0Var).y(g3.n(byteArray, b10), j10, z10);
                return;
            }
            ((g5.b) ((a0) this.f18305c.d)).y(z.b(23, i9, gVar, null, m3Var), j10, z10);
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.u.h("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    @Override
    public final void onReceive(android.content.Context r19, android.content.Intent r20) {
        throw new UnsupportedOperationException("Method not decompiled: n2.c0.onReceive(android.content.Context, android.content.Intent):void");
    }
}
