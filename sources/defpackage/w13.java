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
public final class w13 extends y13 {
    public final Context e;
    public o13 f;
    public Executor g;
    public CancellationSignal h;
    public final x03 i;

    public w13(Context context) {
        context.getClass();
        this.e = context;
        this.i = new x03(this, new Handler(Looper.getMainLooper()), (byte) 1);
    }

    public final defpackage.xs4 d(defpackage.fha r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w13.d(fha):xs4");
    }

    public final o13 e() {
        o13 o13Var = this.f;
        if (o13Var != null) {
            return o13Var;
        }
        rp5.e("callback");
        throw null;
    }

    public final Executor f() {
        Executor executor = this.g;
        if (executor != null) {
            return executor;
        }
        rp5.e("executor");
        throw null;
    }

    public final void g(ws4 ws4Var, CancellationSignal cancellationSignal, Executor executor, o13 o13Var) {
        boolean z;
        ws4Var.getClass();
        o13Var.getClass();
        executor.getClass();
        this.h = cancellationSignal;
        this.f = o13Var;
        this.g = executor;
        CredentialProviderPlayServicesImpl.Companion.getClass();
        if (l23.a(cancellationSignal)) {
            return;
        }
        Context context = this.e;
        context.getClass();
        gh0 gh0Var = new gh0(false);
        dh0 dh0Var = new dh0(false, null, null, true, null, null, false);
        fh0 fh0Var = new fh0(false, null, null);
        eh0 eh0Var = new eh0(null, false);
        PackageManager packageManager = context.getPackageManager();
        packageManager.getClass();
        long j = packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
        fh0 fh0Var2 = fh0Var;
        eh0 eh0Var2 = eh0Var;
        boolean z2 = false;
        for (r13 r13Var : ws4Var.a) {
            if ((r13Var instanceof bt4) && !z2) {
                if (j >= 231815000) {
                    LinkedHashMap linkedHashMap = lu8.a;
                    eh0Var2 = new eh0(((bt4) r13Var).e, true);
                } else {
                    LinkedHashMap linkedHashMap2 = lu8.a;
                    JSONObject jSONObject = new JSONObject(((bt4) r13Var).e);
                    String optString = jSONObject.optString("rpId", "");
                    optString.getClass();
                    if (optString.length() != 0) {
                        fh0Var2 = new fh0(true, ure.a(jSONObject), optString);
                    } else {
                        throw new JSONException("GetPublicKeyCredentialOption - rpId not specified in the request or is unexpectedly empty");
                    }
                }
                z2 = true;
            }
        }
        if (j > 241217000) {
            z = ws4Var.b;
        } else {
            z = false;
        }
        q3d a = ske.a(context);
        new dh0(false, null, null, true, null, null, false);
        hh0 hh0Var = new hh0(gh0Var, dh0Var, a.l, false, 0, fh0Var2, eh0Var2, z);
        agb b = bgb.b();
        b.c = new f84[]{new f84("auth_api_credentials_begin_sign_in", 8L)};
        b.a = new ln8(a, hh0Var);
        b.b = false;
        b.d = (char) 1553;
        a.e(0, b.a()).addOnSuccessListener(new vu2(new u13(cancellationSignal, this, (byte) 0), (byte) 6)).addOnFailureListener(new v82(this, cancellationSignal, (byte) 11));
    }
}
