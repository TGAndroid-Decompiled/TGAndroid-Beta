package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
public final class h33 extends j33 {
    public final Context e;
    public a33 f;
    public Executor g;
    public CancellationSignal h;
    public final j23 i;

    public h33(Context context) {
        context.getClass();
        this.e = context;
        this.i = new j23(this, new Handler(Looper.getMainLooper()), (byte) 1);
    }

    public final defpackage.yu4 d(defpackage.hja r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h33.d(hja):yu4");
    }

    public final a33 e() {
        a33 a33Var = this.f;
        if (a33Var != null) {
            return a33Var;
        }
        rr5.e("callback");
        throw null;
    }

    public final Executor f() {
        Executor executor = this.g;
        if (executor != null) {
            return executor;
        }
        rr5.e("executor");
        throw null;
    }

    public final void g(xu4 xu4Var, CancellationSignal cancellationSignal, Executor executor, a33 a33Var) {
        boolean z;
        xu4Var.getClass();
        a33Var.getClass();
        executor.getClass();
        this.h = cancellationSignal;
        this.f = a33Var;
        this.g = executor;
        CredentialProviderPlayServicesImpl.Companion.getClass();
        if (w33.a(cancellationSignal)) {
            return;
        }
        Context context = this.e;
        context.getClass();
        gi0 gi0Var = new gi0(false);
        di0 di0Var = new di0(false, null, null, true, null, null, false);
        fi0 fi0Var = new fi0(false, null, null);
        ei0 ei0Var = new ei0(null, false);
        PackageManager packageManager = context.getPackageManager();
        packageManager.getClass();
        long j = packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
        fi0 fi0Var2 = fi0Var;
        ei0 ei0Var2 = ei0Var;
        boolean z2 = false;
        for (c33 c33Var : xu4Var.a) {
            if ((c33Var instanceof cv4) && !z2) {
                if (j >= 231815000) {
                    LinkedHashMap linkedHashMap = mw8.a;
                    ei0Var2 = new ei0(((cv4) c33Var).e, true);
                } else {
                    LinkedHashMap linkedHashMap2 = mw8.a;
                    JSONObject jSONObject = new JSONObject(((cv4) c33Var).e);
                    String optString = jSONObject.optString("rpId", "");
                    optString.getClass();
                    if (optString.length() != 0) {
                        fi0Var2 = new fi0(true, xte.a(jSONObject), optString);
                    } else {
                        throw new JSONException("GetPublicKeyCredentialOption - rpId not specified in the request or is unexpectedly empty");
                    }
                }
                z2 = true;
            }
        }
        if (j > 241217000) {
            z = xu4Var.b;
        } else {
            z = false;
        }
        s5d a = ume.a(context);
        new di0(false, null, null, true, null, null, false);
        hi0 hi0Var = new hi0(gi0Var, di0Var, a.l, false, 0, fi0Var2, ei0Var2, z);
        bib b = cib.b();
        b.c = new o94[]{new o94("auth_api_credentials_begin_sign_in", 8L)};
        b.a = new cf9(a, hi0Var);
        b.b = false;
        b.d = (char) 1553;
        a.e(0, b.a()).addOnSuccessListener(new wm2(new f33(cancellationSignal, this, (byte) 0), (byte) 9)).addOnFailureListener(new x92(this, cancellationSignal, (byte) 12));
    }
}
