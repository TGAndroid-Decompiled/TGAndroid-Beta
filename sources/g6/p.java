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
    public final b f9443a;
    public final String f9444b;
    public aa.a f9445c;
    public final List d;

    public p(String str) {
        a.b(str);
        this.f9444b = str;
        this.f9443a = new b("MediaControlChannel", null);
        this.d = DesugarCollections.synchronizedList(new ArrayList());
    }

    public final void a(o oVar) {
        this.d.add(oVar);
    }

    public final long b() {
        aa.a aVar = this.f9445c;
        if (aVar == null) {
            b bVar = this.f9443a;
            Log.e(bVar.f9413a, bVar.d("Attempt to generate requestId without a sink", new Object[0]));
            return 0L;
        }
        return ((AtomicLong) aVar.f360c).getAndIncrement();
    }

    public final void c(long j3, String str) {
        aa.a aVar = this.f9445c;
        if (aVar == null) {
            b bVar = this.f9443a;
            Log.e(bVar.f9413a, bVar.d("Attempt to send text message without a sink", new Object[0]));
            return;
        }
        f0 f0Var = (f0) aVar.f359b;
        if (f0Var != null) {
            e0 e0Var = (e0) f0Var;
            String str2 = this.f9444b;
            a.b(str2);
            if (!TextUtils.isEmpty(str)) {
                if (str.length() <= 524288) {
                    com.google.android.gms.common.api.internal.v e = com.google.android.gms.common.api.internal.w.e();
                    e.f6166c = new b0(e0Var, str2, str, 1);
                    e.f6164a = 8405;
                    e0Var.e(1, e.a()).addOnFailureListener(new e6.n(aVar, j3, 0));
                    return;
                }
                b bVar2 = e0.G;
                Log.w(bVar2.f9413a, bVar2.d("Message send failed. Message exceeds maximum size", new Object[0]));
                throw new IllegalArgumentException("Message exceeds maximum size524288");
            }
            throw new IllegalArgumentException("The message payload cannot be null or empty");
        }
        throw new IllegalStateException("Device is not connected");
    }
}
