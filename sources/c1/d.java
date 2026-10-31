package c1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import b1.f;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.internal.w;
import d1.g;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.i;
import org.json.JSONException;
import org.json.JSONObject;
import v0.h;
import v0.m;
import v0.o;
import v7.o6;
import w7.p8;
import x5.e;
public final class d extends b1.d {
    public final Context e;
    public h f3520f;
    public Executor f3521g;
    public CancellationSignal h;
    public final c f3522i;

    public d(Context context) {
        i.e(context, "context");
        this.e = context;
        this.f3522i = new c(this, new Handler(Looper.getMainLooper()), 0);
    }

    public final v0.n d(x5.g r14) {
        throw new UnsupportedOperationException("Method not decompiled: c1.d.d(x5.g):v0.n");
    }

    public final h e() {
        h hVar = this.f3520f;
        if (hVar != null) {
            return hVar;
        }
        i.h("callback");
        throw null;
    }

    public final Executor f() {
        Executor executor = this.f3521g;
        if (executor != null) {
            return executor;
        }
        i.h("executor");
        throw null;
    }

    public final void g(m request, CancellationSignal cancellationSignal, Executor executor, h callback) {
        boolean z10;
        i.e(request, "request");
        i.e(callback, "callback");
        i.e(executor, "executor");
        this.h = cancellationSignal;
        this.f3520f = callback;
        this.f3521g = executor;
        CredentialProviderPlayServicesImpl.Companion.getClass();
        if (a1.h.a(cancellationSignal)) {
            return;
        }
        Context context = this.e;
        i.e(context, "context");
        x5.d dVar = new x5.d(false);
        x5.a aVar = new x5.a(false, null, null, true, null, null, false);
        x5.c cVar = new x5.c(false, null, null);
        x5.b bVar = new x5.b(null, false);
        PackageManager packageManager = context.getPackageManager();
        i.d(packageManager, "getPackageManager(...)");
        long j10 = packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
        x5.b bVar2 = bVar;
        boolean z11 = false;
        for (o oVar : request.f50277a) {
            if ((oVar instanceof o) && !z11) {
                if (j10 >= 231815000) {
                    LinkedHashMap linkedHashMap = g.f5644a;
                    bVar2 = new x5.b(oVar.d, true);
                } else {
                    LinkedHashMap linkedHashMap2 = g.f5644a;
                    JSONObject jSONObject = new JSONObject(oVar.d);
                    String optString = jSONObject.optString("rpId", "");
                    i.b(optString);
                    if (optString.length() != 0) {
                        cVar = new x5.c(true, o6.a(jSONObject), optString);
                    } else {
                        throw new JSONException("GetPublicKeyCredentialOption - rpId not specified in the request or is unexpectedly empty");
                    }
                }
                z11 = true;
            }
        }
        if (j10 > 241217000) {
            z10 = request.f50278b;
        } else {
            z10 = false;
        }
        i7.b a2 = p8.a(context);
        new x5.a(false, null, null, true, null, null, false);
        e eVar = new e(dVar, aVar, a2.f8227k, false, 0, cVar, bVar2, z10);
        v b10 = w.b();
        b10.d = new k6.c[]{new k6.c("auth_api_credentials_begin_sign_in", 8L)};
        b10.f4496c = new a6.i(a2, eVar, 27);
        b10.f4495b = false;
        b10.f4494a = 1553;
        a2.e(0, b10.a()).addOnSuccessListener(new a1.c(new f(1, cancellationSignal, this), 16)).addOnFailureListener(new ag.m(7, this, cancellationSignal));
    }
}
