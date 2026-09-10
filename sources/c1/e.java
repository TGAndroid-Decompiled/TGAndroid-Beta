package c1;

import a1.g;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import bi.cb;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.internal.w;
import d1.f;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
import v0.i;
import v0.n;
import v0.p;
import v7.o6;
import w7.g8;
public final class e extends b1.d {
    public final Context e;
    public i f4067f;
    public Executor f4068g;
    public CancellationSignal h;
    public final d f4069i;

    public e(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        this.e = context;
        this.f4069i = new d(this, new Handler(Looper.getMainLooper()), 0);
    }

    public final v0.o d(x5.g r14) {
        throw new UnsupportedOperationException("Method not decompiled: c1.e.d(x5.g):v0.o");
    }

    public final i e() {
        i iVar = this.f4067f;
        if (iVar != null) {
            return iVar;
        }
        kotlin.jvm.internal.i.h("callback");
        throw null;
    }

    public final Executor f() {
        Executor executor = this.f4068g;
        if (executor != null) {
            return executor;
        }
        kotlin.jvm.internal.i.h("executor");
        throw null;
    }

    public final void g(n request, CancellationSignal cancellationSignal, Executor executor, i callback) {
        boolean z10;
        kotlin.jvm.internal.i.e(request, "request");
        kotlin.jvm.internal.i.e(callback, "callback");
        kotlin.jvm.internal.i.e(executor, "executor");
        this.h = cancellationSignal;
        this.f4067f = callback;
        this.f4068g = executor;
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
        for (p pVar : request.f42837a) {
            if ((pVar instanceof p) && !z11) {
                if (j3 >= 231815000) {
                    LinkedHashMap linkedHashMap = f.f6186a;
                    bVar2 = new x5.b(pVar.d, true);
                } else {
                    LinkedHashMap linkedHashMap2 = f.f6186a;
                    JSONObject jSONObject = new JSONObject(pVar.d);
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
            z10 = request.f42838b;
        } else {
            z10 = false;
        }
        i7.b a2 = g8.a(context);
        new x5.a(false, null, null, true, null, null, false);
        x5.e eVar = new x5.e(dVar, aVar, a2.f10498k, false, 0, cVar, bVar2, z10);
        v e = w.e();
        e.d = new k6.c[]{new k6.c("auth_api_credentials_begin_sign_in", 8L)};
        e.f4957c = new pb.c(a2, eVar, 27);
        e.f4956b = false;
        e.f4955a = 1553;
        a2.e(0, e.a()).addOnSuccessListener(new a1.c(new b1.f(1, cancellationSignal, this), 11)).addOnFailureListener(new cb(1, this, cancellationSignal));
    }
}
