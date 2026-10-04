package k0;

import a6.m;
import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import b2.p;
import id.c;
import kotlin.jvm.internal.i;
import v0.e;
import v0.h;
import v0.j;
import v0.k;
import w7.g;
public final class b implements h {
    public final Context f14284a;

    public b(Context context, boolean z10) {
        this.f14284a = context;
    }

    public static int c(b2.s r5) {
        throw new UnsupportedOperationException("Method not decompiled: k0.b.c(b2.s):int");
    }

    public void a(aa.a aVar, p pVar, m mVar) {
        CancellationSignal cancellationSignal;
        FingerprintManager g10;
        if (pVar != null) {
            synchronized (pVar) {
                try {
                    if (((CancellationSignal) pVar.f3427c) == null) {
                        CancellationSignal cancellationSignal2 = new CancellationSignal();
                        pVar.f3427c = cancellationSignal2;
                        if (pVar.f3426b) {
                            cancellationSignal2.cancel();
                        }
                    }
                    cancellationSignal = (CancellationSignal) pVar.f3427c;
                } finally {
                }
            }
        } else {
            cancellationSignal = null;
        }
        if (Build.VERSION.SDK_INT >= 23 && (g10 = e0.b.g(this.f14284a)) != null) {
            e0.b.a(g10, e0.b.M(aVar), cancellationSignal, new a(mVar));
        }
    }

    public Object b(Context context, e eVar, c cVar) {
        zd.m mVar = new zd.m(1, g.b(cVar));
        mVar.s();
        CancellationSignal cancellationSignal = new CancellationSignal();
        mVar.u(new v0.g(cancellationSignal));
        je.b bVar = new je.b(mVar);
        a3.b bVar2 = new a3.b(2);
        i.e(context, "context");
        j a2 = k.a(new k(this.f14284a, 0), eVar);
        if (a2 == null) {
            bVar.onError(new w0.c("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", 1));
        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            bVar.onError(new w0.c("createCredential is not supported on this device", 3));
        } else {
            a2.onCreateCredential(context, eVar, cancellationSignal, bVar2, bVar);
        }
        Object r10 = mVar.r();
        jd.a aVar = jd.a.f14088a;
        return r10;
    }

    public b(Context context) {
        i.e(context, "context");
        this.f14284a = context;
    }
}
