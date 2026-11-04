package c1;

import ai.n;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import b8.db;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.t;
import d1.g;
import gi.w5;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import org.json.JSONException;
import org.json.JSONObject;
import v0.h;
import v0.m;
import v0.o;
import x7.r6;
public final class e extends b1.d {
    public final Context f3966e;
    public h f3967f;
    public Executor f3968g;
    public CancellationSignal h;
    public final d f3969i;

    public e(Context context) {
        j.e(context, "context");
        this.f3966e = context;
        this.f3969i = new d(this, new Handler(Looper.getMainLooper()), 0);
    }

    public final v0.n d(z5.g r14) {
        throw new UnsupportedOperationException("Method not decompiled: c1.e.d(z5.g):v0.n");
    }

    public final h e() {
        h hVar = this.f3967f;
        if (hVar != null) {
            return hVar;
        }
        j.h("callback");
        throw null;
    }

    public final Executor f() {
        Executor executor = this.f3968g;
        if (executor != null) {
            return executor;
        }
        j.h("executor");
        throw null;
    }

    public final void g(m request, CancellationSignal cancellationSignal, Executor executor, h callback) {
        boolean z10;
        j.e(request, "request");
        j.e(callback, "callback");
        j.e(executor, "executor");
        this.h = cancellationSignal;
        this.f3967f = callback;
        this.f3968g = executor;
        CredentialProviderPlayServicesImpl.Companion.getClass();
        if (a1.h.a(cancellationSignal)) {
            return;
        }
        Context context = this.f3966e;
        j.e(context, "context");
        z5.d dVar = new z5.d(false);
        z5.a aVar = new z5.a(false, null, null, true, null, null, false);
        z5.c cVar = new z5.c(false, null, null);
        z5.b bVar = new z5.b(null, false);
        PackageManager packageManager = context.getPackageManager();
        j.d(packageManager, "getPackageManager(...)");
        long j10 = packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
        z5.b bVar2 = bVar;
        boolean z11 = false;
        for (o oVar : request.f56431a) {
            if ((oVar instanceof o) && !z11) {
                if (j10 >= 231815000) {
                    LinkedHashMap linkedHashMap = g.f8003a;
                    bVar2 = new z5.b(oVar.d, true);
                } else {
                    LinkedHashMap linkedHashMap2 = g.f8003a;
                    JSONObject jSONObject = new JSONObject(oVar.d);
                    String optString = jSONObject.optString("rpId", "");
                    j.b(optString);
                    if (optString.length() != 0) {
                        cVar = new z5.c(true, db.a(jSONObject), optString);
                    } else {
                        throw new JSONException("GetPublicKeyCredentialOption - rpId not specified in the request or is unexpectedly empty");
                    }
                }
                z11 = true;
            }
        }
        if (j10 > 241217000) {
            z10 = request.f56432b;
        } else {
            z10 = false;
        }
        k7.b a10 = r6.a(context);
        new z5.a(false, null, null, true, null, null, false);
        z5.e eVar = new z5.e(dVar, aVar, a10.f16900l, false, 0, cVar, bVar2, z10);
        s b10 = t.b();
        b10.d = new m6.c[]{new m6.c("auth_api_credentials_begin_sign_in", 8L)};
        b10.f6737c = new w5(a10, eVar, 7);
        b10.f6736b = false;
        b10.f6735a = 1553;
        a10.e(0, b10.a()).addOnSuccessListener(new a1.c(new b1.e(1, cancellationSignal, this), 8)).addOnFailureListener(new n(8, this, cancellationSignal));
    }
}
