package h6;

import a8.h0;
import a8.lg;
import android.text.TextUtils;
import android.util.Log;
import d6.b0;
import d6.e0;
import d6.f0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
public abstract class p {
    public final b f12650a;
    public final String f12651b;
    public h0 f12652c;
    public final List d;

    public p(String str) {
        a.b(str);
        this.f12651b = str;
        this.f12650a = new b("MediaControlChannel", null);
        this.d = DesugarCollections.synchronizedList(new ArrayList());
    }

    public final void a(o oVar) {
        this.d.add(oVar);
    }

    public final long b() {
        h0 h0Var = this.f12652c;
        if (h0Var == null) {
            b bVar = this.f12650a;
            Log.e(bVar.f12620a, bVar.d("Attempt to generate requestId without a sink", new Object[0]));
            return 0L;
        }
        return ((AtomicLong) h0Var.f512c).getAndIncrement();
    }

    public final void c(long j10, String str) {
        h0 h0Var = this.f12652c;
        if (h0Var == null) {
            b bVar = this.f12650a;
            Log.e(bVar.f12620a, bVar.d("Attempt to send text message without a sink", new Object[0]));
            return;
        }
        f0 f0Var = (f0) h0Var.f511b;
        if (f0Var != null) {
            e0 e0Var = (e0) f0Var;
            String str2 = this.f12651b;
            a.b(str2);
            if (!TextUtils.isEmpty(str)) {
                if (str.length() <= 524288) {
                    com.google.android.gms.common.api.internal.u b10 = com.google.android.gms.common.api.internal.v.b();
                    b10.f6622c = new b0(e0Var, str2, str, 1);
                    b10.f6620a = 8405;
                    e0Var.e(1, b10.a()).addOnFailureListener(new lg(h0Var, j10, 4));
                    return;
                }
                b bVar2 = e0.G;
                Log.w(bVar2.f12620a, bVar2.d("Message send failed. Message exceeds maximum size", new Object[0]));
                throw new IllegalArgumentException("Message exceeds maximum size524288");
            }
            throw new IllegalArgumentException("The message payload cannot be null or empty");
        }
        throw new IllegalStateException("Device is not connected");
    }
}
