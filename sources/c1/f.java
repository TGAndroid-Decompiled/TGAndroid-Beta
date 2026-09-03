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
import j7.a7;
import j7.x8;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import org.json.JSONException;
import org.json.JSONObject;
import v0.i;
import v0.n;
import v0.p;
public final class f extends b1.d {
    public final Context e;
    public i f1895f;
    public Executor f1896g;
    public CancellationSignal h;
    public final e f1897i;

    public f(Context context) {
        j.e(context, "context");
        this.e = context;
        this.f1897i = new e(this, new Handler(Looper.getMainLooper()), 0);
    }

    public final v0.o d(l5.g r14) {
        throw new UnsupportedOperationException("Method not decompiled: c1.f.d(l5.g):v0.o");
    }

    public final i e() {
        i iVar = this.f1895f;
        if (iVar != null) {
            return iVar;
        }
        j.h("callback");
        throw null;
    }

    public final Executor f() {
        Executor executor = this.f1896g;
        if (executor != null) {
            return executor;
        }
        j.h("executor");
        throw null;
    }

    public final void g(n request, CancellationSignal cancellationSignal, Executor executor, i callback) {
        boolean z4;
        j.e(request, "request");
        j.e(callback, "callback");
        j.e(executor, "executor");
        this.h = cancellationSignal;
        this.f1895f = callback;
        this.f1896g = executor;
        CredentialProviderPlayServicesImpl.Companion.getClass();
        if (g.a(cancellationSignal)) {
            return;
        }
        Context context = this.e;
        j.e(context, "context");
        l5.d dVar = new l5.d(false);
        l5.a aVar = new l5.a(false, null, null, true, null, null, false);
        l5.c cVar = new l5.c(false, null, null);
        l5.b bVar = new l5.b(null, false);
        PackageManager packageManager = context.getPackageManager();
        j.d(packageManager, "getPackageManager(...)");
        long j10 = packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
        l5.b bVar2 = bVar;
        boolean z10 = false;
        for (p pVar : request.f45611a) {
            if ((pVar instanceof p) && !z10) {
                if (j10 >= 231815000) {
                    LinkedHashMap linkedHashMap = d1.g.f4082a;
                    bVar2 = new l5.b(pVar.d, true);
                } else {
                    LinkedHashMap linkedHashMap2 = d1.g.f4082a;
                    JSONObject jSONObject = new JSONObject(pVar.d);
                    String optString = jSONObject.optString("rpId", "");
                    j.b(optString);
                    if (optString.length() != 0) {
                        cVar = new l5.c(true, a7.a(jSONObject), optString);
                    } else {
                        throw new JSONException("GetPublicKeyCredentialOption - rpId not specified in the request or is unexpectedly empty");
                    }
                }
                z10 = true;
            }
        }
        if (j10 > 241217000) {
            z4 = request.f45612b;
        } else {
            z4 = false;
        }
        w6.b a2 = x8.a(context);
        new l5.a(false, null, null, true, null, null, false);
        l5.e eVar = new l5.e(dVar, aVar, a2.f46546k, false, 0, cVar, bVar2, z4);
        v e = w.e();
        e.d = new y5.c[]{new y5.c("auth_api_credentials_begin_sign_in", 8L)};
        e.f2868c = new o2.i(a2, eVar, 29);
        e.f2867b = false;
        e.f2866a = 1553;
        a2.e(0, e.e()).addOnSuccessListener(new a1.c(new b1.f(1, cancellationSignal, this), 1)).addOnFailureListener(new b(0, this, cancellationSignal));
    }
}
