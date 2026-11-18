package j6;

import a8.va;
import android.text.TextUtils;
import android.util.Log;
import f6.b0;
import f6.e0;
import f6.f0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
public abstract class q {
    public final b f17279a;
    public final String f17280b;
    public h6.m f17281c;
    public final List d;

    public q(String str) {
        a.b(str);
        this.f17280b = str;
        this.f17279a = new b("MediaControlChannel", null);
        this.d = DesugarCollections.synchronizedList(new ArrayList());
    }

    public final void a(p pVar) {
        this.d.add(pVar);
    }

    public final long b() {
        h6.m mVar = this.f17281c;
        if (mVar == null) {
            b bVar = this.f17279a;
            Log.e(bVar.f17244a, bVar.d("Attempt to generate requestId without a sink", new Object[0]));
            return 0L;
        }
        return ((AtomicLong) mVar.f13940c).getAndIncrement();
    }

    public final void c(long j3, String str) {
        h6.m mVar = this.f17281c;
        if (mVar == null) {
            b bVar = this.f17279a;
            Log.e(bVar.f17244a, bVar.d("Attempt to send text message without a sink", new Object[0]));
            return;
        }
        f0 f0Var = (f0) mVar.f13939b;
        if (f0Var != null) {
            e0 e0Var = (e0) f0Var;
            String str2 = this.f17280b;
            a.b(str2);
            if (!TextUtils.isEmpty(str)) {
                if (str.length() <= 524288) {
                    com.google.android.gms.common.api.internal.t b10 = com.google.android.gms.common.api.internal.u.b();
                    b10.f6357c = new b0(e0Var, str2, str, 1);
                    b10.f6355a = 8405;
                    e0Var.e(1, b10.a()).addOnFailureListener(new va(mVar, j3, 4));
                    return;
                }
                b bVar2 = e0.H;
                Log.w(bVar2.f17244a, bVar2.d("Message send failed. Message exceeds maximum size", new Object[0]));
                throw new IllegalArgumentException("Message exceeds maximum size524288");
            }
            throw new IllegalArgumentException("The message payload cannot be null or empty");
        }
        throw new IllegalStateException("Device is not connected");
    }
}
