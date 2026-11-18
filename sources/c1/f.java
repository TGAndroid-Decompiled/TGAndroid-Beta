package c1;

import a8.p9;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.common.api.internal.u;
import hi.u5;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import org.json.JSONException;
import org.json.JSONObject;
import v0.g;
import v0.h;
import v0.m;
import v0.p;
public final class f extends b1.d {
    public final Context f4360e;
    public g f4361f;
    public Executor f4362g;
    public CancellationSignal h;
    public final e f4363i;

    public f(Context context) {
        j.e(context, "context");
        this.f4360e = context;
        this.f4363i = new e(this, new Handler(Looper.getMainLooper()), 0);
    }

    public final v0.n e(a6.g r14) {
        throw new UnsupportedOperationException("Method not decompiled: c1.f.e(a6.g):v0.n");
    }

    public final g f() {
        g gVar = this.f4361f;
        if (gVar != null) {
            return gVar;
        }
        j.h("callback");
        throw null;
    }

    public final Executor g() {
        Executor executor = this.f4362g;
        if (executor != null) {
            return executor;
        }
        j.h("executor");
        throw null;
    }

    public final void h(m request, CancellationSignal cancellationSignal, Executor executor, g callback) {
        boolean z10;
        j.e(request, "request");
        j.e(callback, "callback");
        j.e(executor, "executor");
        this.h = cancellationSignal;
        this.f4361f = callback;
        this.f4362g = executor;
        CredentialProviderPlayServicesImpl.Companion.getClass();
        if (a1.g.a(cancellationSignal)) {
            return;
        }
        Context context = this.f4360e;
        j.e(context, "context");
        a6.d dVar = new a6.d(false);
        a6.a aVar = new a6.a(false, null, null, true, null, null, false);
        a6.c cVar = new a6.c(false, null, null);
        a6.b bVar = new a6.b(null, false);
        PackageManager packageManager = context.getPackageManager();
        j.d(packageManager, "getPackageManager(...)");
        long j3 = packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
        a6.b bVar2 = bVar;
        boolean z11 = false;
        for (h hVar : request.f59023a) {
            if ((hVar instanceof p) && !z11) {
                if (j3 >= 231815000) {
                    LinkedHashMap linkedHashMap = d1.g.f7621a;
                    bVar2 = new a6.b(((p) hVar).f59027e, true);
                } else {
                    LinkedHashMap linkedHashMap2 = d1.g.f7621a;
                    JSONObject jSONObject = new JSONObject(((p) hVar).f59027e);
                    String optString = jSONObject.optString("rpId", "");
                    j.b(optString);
                    if (optString.length() != 0) {
                        cVar = new a6.c(true, p9.a(jSONObject), optString);
                    } else {
                        throw new JSONException("GetPublicKeyCredentialOption - rpId not specified in the request or is unexpectedly empty");
                    }
                }
                z11 = true;
            }
        }
        if (j3 > 241217000) {
            z10 = request.f59024b;
        } else {
            z10 = false;
        }
        l7.b a10 = a.a.a(context);
        new a6.a(false, null, null, true, null, null, false);
        a6.e eVar = new a6.e(dVar, aVar, a10.f19698l, false, 0, cVar, bVar2, z10);
        t b10 = u.b();
        b10.d = new n6.c[]{new n6.c("auth_api_credentials_begin_sign_in", 8L)};
        b10.f6357c = new u5(a10, eVar, 11);
        b10.f6356b = false;
        b10.f6355a = 1553;
        a10.e(0, b10.a()).addOnSuccessListener(new a1.c(new ae.d(2, cancellationSignal, this), 15)).addOnFailureListener(new ab.g(7, this, cancellationSignal));
    }
}
