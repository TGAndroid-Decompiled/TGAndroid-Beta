package d5;

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
public final class f0 extends BroadcastReceiver {
    public boolean f7973a;
    public final boolean f7974b;
    public final h f7975c;

    public f0(h hVar, boolean z10) {
        this.f7975c = hVar;
        this.f7974b = z10;
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        int i10;
        try {
            if (this.f7973a) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                if (true != this.f7974b) {
                    i10 = 4;
                } else {
                    i10 = 2;
                }
                context.registerReceiver(this, intentFilter, i10);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.f7973a = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(Context context, IntentFilter intentFilter) {
        f0 f0Var;
        int i10;
        try {
            try {
                if (this.f7973a) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    if (true != this.f7974b) {
                        i10 = 4;
                    } else {
                        i10 = 2;
                    }
                    f0Var = this;
                    context.registerReceiver(f0Var, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, i10);
                } else {
                    f0Var = this;
                    context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                }
                f0Var.f7973a = true;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public final void c(Bundle bundle, i iVar, int i10, m3 m3Var, long j10, boolean z10) {
        o1 b10;
        try {
            if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") != null) {
                d0 d0Var = (d0) this.f7975c.d;
                byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
                int i11 = o1.f7291a;
                synchronized (o1.class) {
                    int i12 = o1.f7291a;
                    q2 q2Var = q2.f7306c;
                    b10 = s1.b();
                    int i13 = o1.f7291a;
                }
                ((rf.b) d0Var).V(g3.n(byteArray, b10), j10, z10);
                return;
            }
            ((rf.b) ((d0) this.f7975c.d)).V(c0.b(23, i10, iVar, null, m3Var), j10, z10);
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.u.h("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    @Override
    public final void onReceive(android.content.Context r19, android.content.Intent r20) {
        throw new UnsupportedOperationException("Method not decompiled: d5.f0.onReceive(android.content.Context, android.content.Intent):void");
    }
}
