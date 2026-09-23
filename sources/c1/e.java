package c1;

import a1.g;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.internal.w;
import d1.f;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
import v0.i;
import v0.o;
import v0.q;
import v7.o6;
import w7.g8;
public final class e extends b1.d {
    public final Context e;
    public i f3645f;
    public Executor f3646g;
    public CancellationSignal h;
    public final d f3647i;

    public e(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        this.e = context;
        this.f3647i = new d(this, new Handler(Looper.getMainLooper()), 0);
    }

    public final v0.p d(x5.g r14) {
        throw new UnsupportedOperationException("Method not decompiled: c1.e.d(x5.g):v0.p");
    }

    public final i e() {
        i iVar = this.f3645f;
        if (iVar != null) {
            return iVar;
        }
        kotlin.jvm.internal.i.h("callback");
        throw null;
    }

    public final Executor f() {
        Executor executor = this.f3646g;
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
        this.f3645f = callback;
        this.f3646g = executor;
        CredentialProviderPlayServicesImpl.Companion.getClass();
        if (g.a(cancellationSignal)) {
            return;
        }
        Context context = this.e;
        kotlin.jvm.internal.i.e(context, "context");
        x5.d dVar = new x5.d(false);
        x5.a aVar = new x5.a(false, null, null, true, null, null, false);
        x5.c cVar = new x5.c(false, null, null);
        x5.b bVar = new x5.b(null, false);
        PackageManager packageManager = context.getPackageManager();
        kotlin.jvm.internal.i.d(packageManager, "getPackageManager(...)");
        long j3 = packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
        x5.b bVar2 = bVar;
        boolean z11 = false;
        for (q qVar : request.f43766a) {
            if ((qVar instanceof q) && !z11) {
                if (j3 >= 231815000) {
                    LinkedHashMap linkedHashMap = f.f7396a;
                    bVar2 = new x5.b(qVar.d, true);
                } else {
                    LinkedHashMap linkedHashMap2 = f.f7396a;
                    JSONObject jSONObject = new JSONObject(qVar.d);
                    String optString = jSONObject.optString("rpId", "");
                    kotlin.jvm.internal.i.b(optString);
                    if (optString.length() != 0) {
                        cVar = new x5.c(true, o6.a(jSONObject), optString);
                    } else {
                        throw new JSONException("GetPublicKeyCredentialOption - rpId not specified in the request or is unexpectedly empty");
                    }
                }
                z11 = true;
            }
        }
        if (j3 > 241217000) {
            z10 = request.f43767b;
        } else {
            z10 = false;
        }
        i7.b a2 = g8.a(context);
        new x5.a(false, null, null, true, null, null, false);
        x5.e eVar = new x5.e(dVar, aVar, a2.f11004k, false, 0, cVar, bVar2, z10);
        v e = w.e();
        e.d = new k6.c[]{new k6.c("auth_api_credentials_begin_sign_in", 8L)};
        e.f6166c = new a6.i(a2, eVar);
        e.f6165b = false;
        e.f6164a = 1553;
        a2.e(0, e.a()).addOnSuccessListener(new a1.c(new b1.f(1, cancellationSignal, this), 13)).addOnFailureListener(new ah.b(4, this, cancellationSignal));
    }
}
