package c1;

import a1.g;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import b1.f;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.internal.w;
import f7.p6;
import f7.v7;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import n5.e0;
import org.json.JSONException;
import org.json.JSONObject;
import v0.i;
import v0.o;
import v0.q;
public final class e extends b1.d {
    public final Context f2086e;
    public i f2087f;
    public Executor f2088g;
    public CancellationSignal h;
    public final d f2089i;

    public e(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        this.f2086e = context;
        this.f2089i = new d(this, new Handler(Looper.getMainLooper()), 0);
    }

    public final v0.p d(h5.g r14) {
        throw new UnsupportedOperationException("Method not decompiled: c1.e.d(h5.g):v0.p");
    }

    public final i e() {
        i iVar = this.f2087f;
        if (iVar != null) {
            return iVar;
        }
        kotlin.jvm.internal.i.h("callback");
        throw null;
    }

    public final Executor f() {
        Executor executor = this.f2088g;
        if (executor != null) {
            return executor;
        }
        kotlin.jvm.internal.i.h("executor");
        throw null;
    }

    public final void g(o request, CancellationSignal cancellationSignal, Executor executor, i callback) {
        boolean z10;
        kotlin.jvm.internal.i.e(request, "request");
        kotlin.jvm.internal.i.e(callback, "callback");
        kotlin.jvm.internal.i.e(executor, "executor");
        this.h = cancellationSignal;
        this.f2087f = callback;
        this.f2088g = executor;
        CredentialProviderPlayServicesImpl.Companion.getClass();
        if (g.a(cancellationSignal)) {
            return;
        }
        Context context = this.f2086e;
        kotlin.jvm.internal.i.e(context, "context");
        h5.d dVar = new h5.d(false);
        h5.a aVar = new h5.a(false, null, null, true, null, null, false);
        h5.c cVar = new h5.c(false, null, null);
        h5.b bVar = new h5.b(null, false);
        PackageManager packageManager = context.getPackageManager();
        kotlin.jvm.internal.i.d(packageManager, "getPackageManager(...)");
        long j10 = packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
        h5.b bVar2 = bVar;
        boolean z11 = false;
        for (q qVar : request.f48239a) {
            if ((qVar instanceof q) && !z11) {
                if (j10 >= 231815000) {
                    LinkedHashMap linkedHashMap = d1.g.f4257a;
                    bVar2 = new h5.b(qVar.d, true);
                } else {
                    LinkedHashMap linkedHashMap2 = d1.g.f4257a;
                    JSONObject jSONObject = new JSONObject(qVar.d);
                    String optString = jSONObject.optString("rpId", "");
                    kotlin.jvm.internal.i.b(optString);
                    if (optString.length() != 0) {
                        cVar = new h5.c(true, p6.a(jSONObject), optString);
                    } else {
                        throw new JSONException("GetPublicKeyCredentialOption - rpId not specified in the request or is unexpectedly empty");
                    }
                }
                z11 = true;
            }
        }
        if (j10 > 241217000) {
            z10 = request.f48240b;
        } else {
            z10 = false;
        }
        s6.b a2 = v7.a(context);
        new h5.a(false, null, null, true, null, null, false);
        h5.e eVar = new h5.e(dVar, aVar, a2.f47453k, false, 0, cVar, bVar2, z10);
        v b10 = w.b();
        b10.d = new u5.c[]{new u5.c("auth_api_credentials_begin_sign_in", 8L)};
        b10.f2914c = new e0(a2, eVar);
        b10.f2913b = false;
        b10.f2912a = 1553;
        a2.e(0, b10.b()).addOnSuccessListener(new a1.c(new f(1, cancellationSignal, this), 7)).addOnFailureListener(new b5.d(7, this, cancellationSignal));
    }
}
