package g6;

import android.text.TextUtils;
import android.util.Log;
import c6.b0;
import c6.e0;
import c6.f0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
public abstract class p {
    public final b f9964a;
    public final String f9965b;
    public androidx.biometric.e f9966c;
    public final List d;

    public p(String str) {
        a.b(str);
        this.f9965b = str;
        this.f9964a = new b("MediaControlChannel", null);
        this.d = DesugarCollections.synchronizedList(new ArrayList());
    }

    public final void a(o oVar) {
        this.d.add(oVar);
    }

    public final long b() {
        androidx.biometric.e eVar = this.f9966c;
        if (eVar == null) {
            b bVar = this.f9964a;
            Log.e(bVar.f9934a, bVar.d("Attempt to generate requestId without a sink", new Object[0]));
            return 0L;
        }
        return ((AtomicLong) eVar.f1197c).getAndIncrement();
    }

    public final void c(long j10, String str) {
        androidx.biometric.e eVar = this.f9966c;
        if (eVar == null) {
            b bVar = this.f9964a;
            Log.e(bVar.f9934a, bVar.d("Attempt to send text message without a sink", new Object[0]));
            return;
        }
        f0 f0Var = (f0) eVar.f1196b;
        if (f0Var != null) {
            e0 e0Var = (e0) f0Var;
            String str2 = this.f9965b;
            a.b(str2);
            if (!TextUtils.isEmpty(str)) {
                if (str.length() <= 524288) {
                    com.google.android.gms.common.api.internal.v b10 = com.google.android.gms.common.api.internal.w.b();
                    b10.f5046c = new b0(e0Var, str2, str, 1);
                    b10.f5044a = 8405;
                    e0Var.e(1, b10.a()).addOnFailureListener(new ad.d(eVar, j10, 3));
                    return;
                }
                b bVar2 = e0.G;
                Log.w(bVar2.f9934a, bVar2.d("Message send failed. Message exceeds maximum size", new Object[0]));
                throw new IllegalArgumentException("Message exceeds maximum size524288");
            }
            throw new IllegalArgumentException("The message payload cannot be null or empty");
        }
        throw new IllegalStateException("Device is not connected");
    }
}
