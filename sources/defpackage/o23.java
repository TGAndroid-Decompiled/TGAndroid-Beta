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
public final class o23 extends q23 {
    public final Context e;
    public h23 f;
    public Executor g;
    public CancellationSignal h;
    public final q13 i;

    public o23(Context context) {
        context.getClass();
        this.e = context;
        this.i = new q13(this, new Handler(Looper.getMainLooper()), (byte) 1);
    }

    public final defpackage.bv4 d(defpackage.yka r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o23.d(yka):bv4");
    }

    public final h23 e() {
        h23 h23Var = this.f;
        if (h23Var != null) {
            return h23Var;
        }
        ur5.e("callback");
        throw null;
    }

    public final Executor f() {
        Executor executor = this.g;
        if (executor != null) {
            return executor;
        }
        ur5.e("executor");
        throw null;
    }

    public final void g(av4 av4Var, CancellationSignal cancellationSignal, Executor executor, h23 h23Var) {
        boolean z;
        av4Var.getClass();
        h23Var.getClass();
        executor.getClass();
        this.h = cancellationSignal;
        this.f = h23Var;
        this.g = executor;
        CredentialProviderPlayServicesImpl.Companion.getClass();
        if (d33.a(cancellationSignal)) {
            return;
        }
        Context context = this.e;
        context.getClass();
        hh0 hh0Var = new hh0(false);
        eh0 eh0Var = new eh0(false, null, null, true, null, null, false);
        gh0 gh0Var = new gh0(false, null, null);
        fh0 fh0Var = new fh0(null, false);
        PackageManager packageManager = context.getPackageManager();
        packageManager.getClass();
        long j = packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
        gh0 gh0Var2 = gh0Var;
        fh0 fh0Var2 = fh0Var;
        boolean z2 = false;
        for (j23 j23Var : av4Var.a) {
            if ((j23Var instanceof fv4) && !z2) {
                if (j >= 231815000) {
                    LinkedHashMap linkedHashMap = ux8.a;
                    fh0Var2 = new fh0(((fv4) j23Var).e, true);
                } else {
                    LinkedHashMap linkedHashMap2 = ux8.a;
                    JSONObject jSONObject = new JSONObject(((fv4) j23Var).e);
                    String optString = jSONObject.optString("rpId", "");
                    optString.getClass();
                    if (optString.length() != 0) {
                        gh0Var2 = new gh0(true, mwe.a(jSONObject), optString);
                    } else {
                        throw new JSONException("GetPublicKeyCredentialOption - rpId not specified in the request or is unexpectedly empty");
                    }
                }
                z2 = true;
            }
        }
        if (j > 241217000) {
            z = av4Var.b;
        } else {
            z = false;
        }
        h8d a = kpe.a(context);
        new eh0(false, null, null, true, null, null, false);
        ih0 ih0Var = new ih0(hh0Var, eh0Var, a.l, false, 0, gh0Var2, fh0Var2, z);
        wjb b = xjb.b();
        b.c = new a94[]{new a94("auth_api_credentials_begin_sign_in", 8L)};
        b.a = new j09(a, ih0Var);
        b.b = false;
        b.d = (char) 1553;
        a.e(0, b.a()).addOnSuccessListener(new ht2(new m23(cancellationSignal, this, (byte) 0), (byte) 8)).addOnFailureListener(new q72(this, cancellationSignal, (byte) 13));
    }
}
