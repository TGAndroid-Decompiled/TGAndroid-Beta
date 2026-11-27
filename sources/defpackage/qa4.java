package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Arrays;
public final class qa4 extends h05 implements k59 {
    public static final zn l = new zn("Fido.FIDO2_API", new rr5((byte) 22), new Object());
    public static final zn m = new zn("IdentityCredentials.API", new rr5((byte) 0), new Object());
    public static final zn n = new zn("ClientNotification.API", new rr5((byte) 5), new Object());
    public static final zn o = new zn("ClientTelemetry.API", new rr5((byte) 6), new Object());
    public static final zn p = new zn("ModuleInstall.API", new rr5((byte) 4), new Object());
    public static final zn q = new zn("SmsRetriever.API", new rr5((byte) 11), new Object());
    public static final zn r = new zn("LocationServices.API", new rr5((byte) 14), new Object());
    public static final zn s = new zn("RecaptchaBase.API", new rr5((byte) 19), new Object());
    public static final zn t = new zn("CloudMessaging.API", new rr5((byte) 17), new Object());
    public static final zn u = new zn("CastApi.API", new rr5((byte) 20), new Object());
    public static byte v = 1;

    public qa4(Context context, g05 g05Var) {
        super(context, qwc.a, pwc.a, g05Var);
    }

    public final Task f(yt7... yt7VarArr) {
        boolean z;
        if (yt7VarArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        xve.a("Please provide at least one OptionalModuleApi.", z);
        for (yt7 yt7Var : yt7VarArr) {
            xve.i(yt7Var, "Requested API must not be null.");
        }
        fo b = fo.b(Arrays.asList(yt7VarArr), false);
        if (b.a.isEmpty()) {
            return Tasks.forResult(new vg7(0, true));
        }
        wjb b2 = xjb.b();
        b2.c = new a94[]{nid.a};
        b2.d = (char) 27301;
        b2.b = false;
        b2.a = new zhc(this, b, false, (byte) 6);
        return e(0, b2.a());
    }

    public final Task g(GetCredentialRequest getCredentialRequest) {
        wjb b = xjb.b();
        b.c = new a94[]{cjd.a};
        b.a = new uae(getCredentialRequest, (byte) 3);
        b.d = (char) 32701;
        Task e = e(0, b.a());
        e.getClass();
        return e;
    }

    public final Intent h() {
        int l2 = l();
        int i = l2 - 1;
        if (l2 != 0) {
            wn wnVar = this.e;
            Context context = this.a;
            if (i != 2) {
                if (i != 3) {
                    y8d.a.a("getNoImplementationSignInIntent()", new Object[0]);
                    Intent a = y8d.a(context, (GoogleSignInOptions) wnVar);
                    a.setAction("com.google.android.gms.auth.NO_IMPL");
                    return a;
                }
                return y8d.a(context, (GoogleSignInOptions) wnVar);
            }
            y8d.a.a("getFallbackSignInIntent()", new Object[0]);
            Intent a2 = y8d.a(context, (GoogleSignInOptions) wnVar);
            a2.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
            return a2;
        }
        throw null;
    }

    public final Task i(ikb ikbVar) {
        wjb b = xjb.b();
        b.c = new a94[]{mid.a};
        b.b = false;
        b.a = new ve9(ikbVar, (byte) 22);
        return e(2, b.a());
    }

    public final void j(LocationRequest locationRequest, r05 r05Var, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            xve.i(looper, "invalid null looper");
        }
        a86 T = aj3.T(looper, r05Var, r05.class.getSimpleName());
        rx rxVar = new rx(this, T);
        zhc zhcVar = new zhc(rxVar, locationRequest, false, (byte) 10);
        ?? obj = new Object();
        obj.e = true;
        obj.a = zhcVar;
        obj.b = rxVar;
        obj.c = T;
        obj.f = (short) 2436;
        b(obj.a());
    }

    public final Task k() {
        boolean z;
        BasePendingResult basePendingResult;
        if (l() == 3) {
            z = true;
        } else {
            z = false;
        }
        y8d.a.a("Signing out", new Object[0]);
        y8d.b(this.a);
        o6d o6dVar = this.i;
        if (z) {
            BasePendingResult e2bVar = new e2b(o6dVar, (byte) 0);
            e2bVar.a(Status.e);
            basePendingResult = e2bVar;
        } else {
            w8d w8dVar = new w8d(o6dVar, (byte) 0);
            o6dVar.b.d(1, w8dVar);
            basePendingResult = w8dVar;
        }
        return pgd.a(basePendingResult, new uif((byte) 29));
    }

    public final synchronized int l() {
        byte b;
        b = v;
        if (b == 1) {
            Context context = this.a;
            i05 i05Var = i05.e;
            int c = i05Var.c(context, 12451000);
            if (c == 0) {
                b = 4;
                v = (byte) 4;
            } else if (i05Var.a(c, context, null) == null && vs3.a(context, "com.google.android.gms.auth.api.fallback") != 0) {
                b = 3;
                v = (byte) 3;
            } else {
                b = 2;
                v = (byte) 2;
            }
        }
        return b;
    }

    public final Task m(String[] strArr) {
        wjb b = xjb.b();
        b.a = new uae(this, strArr);
        b.c = new a94[]{zid.b};
        b.b = false;
        b.d = (char) 8425;
        return e(0, b.a());
    }
}
