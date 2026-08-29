package c1;

import a1.g;
import a9.s;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import b1.f;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.internal.w;
import h7.o8;
import h7.w6;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import nh.d6;
import org.json.JSONException;
import org.json.JSONObject;
import v0.i;
import v0.n;
import v0.p;
public final class e extends b1.d {
    public final Context f2755e;
    public i f2756f;
    public Executor f2757g;
    public CancellationSignal h;
    public final d f2758i;

    public e(Context context) {
        j.e(context, "context");
        this.f2755e = context;
        this.f2758i = new d(this, new Handler(Looper.getMainLooper()), 0);
    }

    public final v0.o d(j5.g r14) {
        throw new UnsupportedOperationException("Method not decompiled: c1.e.d(j5.g):v0.o");
    }

    public final i e() {
        i iVar = this.f2756f;
        if (iVar != null) {
            return iVar;
        }
        j.h("callback");
        throw null;
    }

    public final Executor f() {
        Executor executor = this.f2757g;
        if (executor != null) {
            return executor;
        }
        j.h("executor");
        throw null;
    }

    public final void g(n request, CancellationSignal cancellationSignal, Executor executor, i callback) {
        boolean z10;
        j.e(request, "request");
        j.e(callback, "callback");
        j.e(executor, "executor");
        this.h = cancellationSignal;
        this.f2756f = callback;
        this.f2757g = executor;
        CredentialProviderPlayServicesImpl.Companion.getClass();
        if (g.a(cancellationSignal)) {
            return;
        }
        Context context = this.f2755e;
        j.e(context, "context");
        j5.d dVar = new j5.d(false);
        j5.a aVar = new j5.a(false, null, null, true, null, null, false);
        j5.c cVar = new j5.c(false, null, null);
        j5.b bVar = new j5.b(null, false);
        PackageManager packageManager = context.getPackageManager();
        j.d(packageManager, "getPackageManager(...)");
        long j10 = packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
        j5.b bVar2 = bVar;
        boolean z11 = false;
        for (p pVar : request.f49315a) {
            if ((pVar instanceof p) && !z11) {
                if (j10 >= 231815000) {
                    LinkedHashMap linkedHashMap = d1.g.f5266a;
                    bVar2 = new j5.b(pVar.d, true);
                } else {
                    LinkedHashMap linkedHashMap2 = d1.g.f5266a;
                    JSONObject jSONObject = new JSONObject(pVar.d);
                    String optString = jSONObject.optString("rpId", "");
                    j.b(optString);
                    if (optString.length() != 0) {
                        cVar = new j5.c(true, w6.a(jSONObject), optString);
                    } else {
                        throw new JSONException("GetPublicKeyCredentialOption - rpId not specified in the request or is unexpectedly empty");
                    }
                }
                z11 = true;
            }
        }
        if (j10 > 241217000) {
            z10 = request.f49316b;
        } else {
            z10 = false;
        }
        u6.b a2 = o8.a(context);
        new j5.a(false, null, null, true, null, null, false);
        j5.e eVar = new j5.e(dVar, aVar, a2.f49117k, false, 0, cVar, bVar2, z10);
        v b10 = w.b();
        b10.d = new w5.c[]{new w5.c("auth_api_credentials_begin_sign_in", 8L)};
        b10.f3928c = new d6(a2, eVar, 29);
        b10.f3927b = false;
        b10.f3926a = 1553;
        a2.e(0, b10.b()).addOnSuccessListener(new a1.c(new f(1, cancellationSignal, this), 13)).addOnFailureListener(new s(2, this, cancellationSignal));
    }
}
