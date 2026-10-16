package c5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.n3;
import com.google.android.gms.internal.play_billing.o1;
import com.google.android.gms.internal.play_billing.q2;
import com.google.android.gms.internal.play_billing.s1;
public final class i0 extends BroadcastReceiver {
    public boolean f4387a;
    public final boolean f4388b;
    public final h f4389c;

    public i0(h hVar, boolean z10) {
        this.f4389c = hVar;
        this.f4388b = z10;
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        int i10;
        try {
            if (this.f4387a) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                if (true != this.f4388b) {
                    i10 = 4;
                } else {
                    i10 = 2;
                }
                context.registerReceiver(this, intentFilter, i10);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.f4387a = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(Context context, IntentFilter intentFilter) {
        i0 i0Var;
        int i10;
        try {
            try {
                if (this.f4387a) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    if (true != this.f4388b) {
                        i10 = 4;
                    } else {
                        i10 = 2;
                    }
                    i0Var = this;
                    context.registerReceiver(i0Var, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, i10);
                } else {
                    i0Var = this;
                    context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                }
                i0Var.f4387a = true;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public final void c(Bundle bundle, i iVar, int i10, n3 n3Var, long j10, boolean z10) {
        o1 d;
        try {
            if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") != null) {
                g0 g0Var = (g0) this.f4389c.d;
                byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
                int i11 = o1.f5726a;
                synchronized (o1.class) {
                    int i12 = o1.f5726a;
                    q2 q2Var = q2.f5741c;
                    d = s1.d();
                    int i13 = o1.f5726a;
                }
                ((qf.b) g0Var).k0(g3.n(byteArray, d), j10, z10);
                return;
            }
            ((qf.b) ((g0) this.f4389c.d)).k0(f0.b(23, i10, iVar, null, n3Var), j10, z10);
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.u.h("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    @Override
    public final void onReceive(android.content.Context r19, android.content.Intent r20) {
        throw new UnsupportedOperationException("Method not decompiled: c5.i0.onReceive(android.content.Context, android.content.Intent):void");
    }
}
