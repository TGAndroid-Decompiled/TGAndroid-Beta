package c1;

import a8.m9;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.t;
import h9.f1;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import org.json.JSONException;
import org.json.JSONObject;
import v0.g;
import v0.h;
import v0.n;
import v0.q;
public final class e extends b1.d {
    public final Context f5254e;
    public g f5255f;
    public Executor f5256g;
    public CancellationSignal h;
    public final d f5257i;

    public e(Context context) {
        j.e(context, "context");
        this.f5254e = context;
        this.f5257i = new d(this, new Handler(Looper.getMainLooper()), 0);
    }

    public final v0.o e(a6.g r14) {
        throw new UnsupportedOperationException("Method not decompiled: c1.e.e(a6.g):v0.o");
    }

    public final g f() {
        g gVar = this.f5255f;
        if (gVar != null) {
            return gVar;
        }
        j.h("callback");
        throw null;
    }

    public final Executor g() {
        Executor executor = this.f5256g;
        if (executor != null) {
            return executor;
        }
        j.h("executor");
        throw null;
    }

    public final void h(n request, CancellationSignal cancellationSignal, Executor executor, g callback) {
        boolean z9;
        j.e(request, "request");
        j.e(callback, "callback");
        j.e(executor, "executor");
        this.h = cancellationSignal;
        this.f5255f = callback;
        this.f5256g = executor;
        CredentialProviderPlayServicesImpl.Companion.getClass();
        if (a1.g.a(cancellationSignal)) {
            return;
        }
        Context context = this.f5254e;
        j.e(context, "context");
        a6.d dVar = new a6.d(false);
        a6.a aVar = new a6.a(false, null, null, true, null, null, false);
        a6.c cVar = new a6.c(false, null, null);
        a6.b bVar = new a6.b(null, false);
        PackageManager packageManager = context.getPackageManager();
        j.d(packageManager, "getPackageManager(...)");
        long j3 = packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
        a6.b bVar2 = bVar;
        boolean z10 = false;
        for (h hVar : request.f56882a) {
            if ((hVar instanceof q) && !z10) {
                if (j3 >= 231815000) {
                    LinkedHashMap linkedHashMap = d1.g.f7948a;
                    bVar2 = new a6.b(((q) hVar).f56886e, true);
                } else {
                    LinkedHashMap linkedHashMap2 = d1.g.f7948a;
                    JSONObject jSONObject = new JSONObject(((q) hVar).f56886e);
                    String optString = jSONObject.optString("rpId", "");
                    j.b(optString);
                    if (optString.length() != 0) {
                        cVar = new a6.c(true, m9.a(jSONObject), optString);
                    } else {
                        throw new JSONException("GetPublicKeyCredentialOption - rpId not specified in the request or is unexpectedly empty");
                    }
                }
                z10 = true;
            }
        }
        if (j3 > 241217000) {
            z9 = request.f56883b;
        } else {
            z9 = false;
        }
        l7.b a10 = a.a.a(context);
        new a6.a(false, null, null, true, null, null, false);
        a6.e eVar = new a6.e(dVar, aVar, a10.f18195l, false, 0, cVar, bVar2, z9);
        s b10 = t.b();
        b10.d = new n6.c[]{new n6.c("auth_api_credentials_begin_sign_in", 8L)};
        b10.f6682c = new f1(a10, eVar, 8);
        b10.f6681b = false;
        b10.f6680a = 1553;
        a10.e(0, b10.a()).addOnSuccessListener(new a1.c(new ae.d(2, cancellationSignal, this), 20)).addOnFailureListener(new ab.g(6, this, cancellationSignal));
    }
}
