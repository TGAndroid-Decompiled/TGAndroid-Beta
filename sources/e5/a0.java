package e5;

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
    public boolean f9556a;
    public final boolean f9557b;
    public final e f9558c;

    public a0(e eVar, boolean z10) {
        this.f9558c = eVar;
        this.f9557b = z10;
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        int i3;
        try {
            if (this.f9556a) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                if (true != this.f9557b) {
                    i3 = 4;
                } else {
                    i3 = 2;
                }
                context.registerReceiver(this, intentFilter, i3);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.f9556a = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(Context context, IntentFilter intentFilter) {
        a0 a0Var;
        int i3;
        try {
            try {
                if (this.f9556a) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    if (true != this.f9557b) {
                        i3 = 4;
                    } else {
                        i3 = 2;
                    }
                    a0Var = this;
                    context.registerReceiver(a0Var, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, i3);
                } else {
                    a0Var = this;
                    context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                }
                a0Var.f9556a = true;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public final void c(Bundle bundle, f fVar, int i3, m3 m3Var, long j10, boolean z10) {
        o1 b10;
        try {
            if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") != null) {
                y yVar = (y) this.f9558c.d;
                byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
                int i10 = o1.f7479a;
                synchronized (o1.class) {
                    int i11 = o1.f7479a;
                    q2 q2Var = q2.f7496c;
                    b10 = s1.b();
                    int i12 = o1.f7479a;
                }
                ((tf.b) yVar).H(g3.n(byteArray, b10), j10, z10);
                return;
            }
            ((tf.b) ((y) this.f9558c.d)).H(x.b(23, i3, fVar, null, m3Var), j10, z10);
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.u.h("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    @Override
    public final void onReceive(android.content.Context r19, android.content.Intent r20) {
        throw new UnsupportedOperationException("Method not decompiled: e5.a0.onReceive(android.content.Context, android.content.Intent):void");
    }
}
