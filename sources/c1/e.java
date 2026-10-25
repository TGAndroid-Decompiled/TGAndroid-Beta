package c1;

import a1.h;
import a8.ib;
import ai.f0;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.common.api.internal.v;
import d1.f;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
import v0.i;
import v0.n;
import v0.p;
import w7.i0;
public final class e extends b1.d {
    public final Context e;
    public i f5923f;
    public Executor f5924g;
    public CancellationSignal h;
    public final d f5925i;

    public e(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        this.e = context;
        this.f5925i = new d(this, new Handler(Looper.getMainLooper()), 0);
    }

    public final v0.o d(y5.g r14) {
        throw new UnsupportedOperationException("Method not decompiled: c1.e.d(y5.g):v0.o");
    }

    public final i e() {
        i iVar = this.f5923f;
        if (iVar != null) {
            return iVar;
        }
        kotlin.jvm.internal.i.h("callback");
        throw null;
    }

    public final Executor f() {
        Executor executor = this.f5924g;
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
        this.f5923f = callback;
        this.f5924g = executor;
        CredentialProviderPlayServicesImpl.Companion.getClass();
        if (h.a(cancellationSignal)) {
            return;
        }
        Context context = this.e;
        kotlin.jvm.internal.i.e(context, "context");
        y5.d dVar = new y5.d(false);
        y5.a aVar = new y5.a(false, null, null, true, null, null, false);
        y5.c cVar = new y5.c(false, null, null);
        y5.b bVar = new y5.b(null, false);
        PackageManager packageManager = context.getPackageManager();
        kotlin.jvm.internal.i.d(packageManager, "getPackageManager(...)");
        long j10 = packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
        y5.b bVar2 = bVar;
        boolean z11 = false;
        for (p pVar : request.f49976a) {
            if ((pVar instanceof p) && !z11) {
                if (j10 >= 231815000) {
                    LinkedHashMap linkedHashMap = f.f7835a;
                    bVar2 = new y5.b(pVar.d, true);
                } else {
                    LinkedHashMap linkedHashMap2 = f.f7835a;
                    JSONObject jSONObject = new JSONObject(pVar.d);
                    String optString = jSONObject.optString("rpId", "");
                    kotlin.jvm.internal.i.b(optString);
                    if (optString.length() != 0) {
                        cVar = new y5.c(true, ib.a(jSONObject), optString);
                    } else {
                        throw new JSONException("GetPublicKeyCredentialOption - rpId not specified in the request or is unexpectedly empty");
                    }
                }
                z11 = true;
            }
        }
        if (j10 > 241217000) {
            z10 = request.f49977b;
        } else {
            z10 = false;
        }
        j7.b a2 = i0.a(context);
        new y5.a(false, null, null, true, null, null, false);
        y5.e eVar = new y5.e(dVar, aVar, a2.f15534k, false, 0, cVar, bVar2, z10);
        u b10 = v.b();
        b10.d = new l6.c[]{new l6.c("auth_api_credentials_begin_sign_in", 8L)};
        b10.f6622c = new b6.i(a2, eVar);
        b10.f6621b = false;
        b10.f6620a = 1553;
        a2.e(0, b10.a()).addOnSuccessListener(new a1.c(new b1.f(1, cancellationSignal, this), 14)).addOnFailureListener(new f0(5, this, cancellationSignal));
    }
}
