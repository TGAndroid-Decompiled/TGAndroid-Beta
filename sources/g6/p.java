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
    public final b f10874a;
    public final String f10875b;
    public androidx.biometric.e f10876c;
    public final List d;

    public p(String str) {
        a.b(str);
        this.f10875b = str;
        this.f10874a = new b("MediaControlChannel", null);
        this.d = DesugarCollections.synchronizedList(new ArrayList());
    }

    public final void a(o oVar) {
        this.d.add(oVar);
    }

    public final long b() {
        androidx.biometric.e eVar = this.f10876c;
        if (eVar == null) {
            b bVar = this.f10874a;
            Log.e(bVar.f10844a, bVar.d("Attempt to generate requestId without a sink", new Object[0]));
            return 0L;
        }
        return ((AtomicLong) eVar.f2818c).getAndIncrement();
    }

    public final void c(long j10, String str) {
        androidx.biometric.e eVar = this.f10876c;
        if (eVar == null) {
            b bVar = this.f10874a;
            Log.e(bVar.f10844a, bVar.d("Attempt to send text message without a sink", new Object[0]));
            return;
        }
        f0 f0Var = (f0) eVar.f2817b;
        if (f0Var != null) {
            e0 e0Var = (e0) f0Var;
            String str2 = this.f10875b;
            a.b(str2);
            if (!TextUtils.isEmpty(str)) {
                if (str.length() <= 524288) {
                    com.google.android.gms.common.api.internal.u b10 = com.google.android.gms.common.api.internal.v.b();
                    b10.f6499c = new b0(e0Var, str2, str, 1);
                    b10.f6497a = 8405;
                    e0Var.e(1, b10.a()).addOnFailureListener(new ad.d(eVar, j10, 3));
                    return;
                }
                b bVar2 = e0.G;
                Log.w(bVar2.f10844a, bVar2.d("Message send failed. Message exceeds maximum size", new Object[0]));
                throw new IllegalArgumentException("Message exceeds maximum size524288");
            }
            throw new IllegalArgumentException("The message payload cannot be null or empty");
        }
        throw new IllegalStateException("Device is not connected");
    }
}
