package defpackage;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import java.security.Signature;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;
public class aj0 extends bn4 {
    public final Handler l0 = new Handler(Looper.getMainLooper());
    public lj0 m0;

    @Override
    public final void H() {
        this.V = true;
        if (Build.VERSION.SDK_INT == 29 && wmd.b(this.m0.c())) {
            lj0 lj0Var = this.m0;
            lj0Var.o = true;
            this.l0.postDelayed(new zi0(lj0Var, (byte) 2), 250L);
        }
    }

    @Override
    public final void I() {
        this.V = true;
        if (Build.VERSION.SDK_INT < 29 && !this.m0.m) {
            en4 k = k();
            if (k == null || !k.isChangingConfigurations()) {
                O(0);
            }
        }
    }

    public final void O(int i) {
        if (i == 3 || !this.m0.o) {
            if (S()) {
                this.m0.j = i;
                if (i == 1) {
                    V(10, pfe.a(n(), 10));
                }
            }
            lj0 lj0Var = this.m0;
            tg2 tg2Var = lj0Var.g;
            if (tg2Var == null) {
                tg2Var = new tg2((byte) 14);
                lj0Var.g = tg2Var;
            }
            CancellationSignal cancellationSignal = (CancellationSignal) tg2Var.b;
            if (cancellationSignal != null) {
                try {
                    oa1.a(cancellationSignal);
                } catch (NullPointerException e) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e);
                }
                tg2Var.b = null;
            }
            e31 e31Var = (e31) tg2Var.c;
            if (e31Var != null) {
                try {
                    e31Var.g();
                } catch (NullPointerException e2) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling fingerprint authentication.", e2);
                }
                tg2Var.c = null;
            }
        }
    }

    public final void P() {
        this.m0.k = false;
        Q();
        if (!this.m0.m && t()) {
            id0 id0Var = new id0(p());
            id0Var.h(this);
            id0Var.e(true, true);
        }
        Context n = n();
        if (n != null) {
            String str = Build.MODEL;
            if (Build.VERSION.SDK_INT == 29 && str != null) {
                for (String str2 : n.getResources().getStringArray(2130903046)) {
                    if (str.equals(str2)) {
                        lj0 lj0Var = this.m0;
                        lj0Var.n = true;
                        this.l0.postDelayed(new zi0(lj0Var, (byte) 1), 600L);
                        return;
                    }
                }
            }
        }
    }

    public final void Q() {
        this.m0.k = false;
        if (t()) {
            go4 p = p();
            bg4 bg4Var = (bg4) p.D("androidx.biometric.FingerprintDialogFragment");
            if (bg4Var != null) {
                if (bg4Var.t()) {
                    bg4Var.O(false);
                    return;
                }
                id0 id0Var = new id0(p);
                id0Var.h(bg4Var);
                id0Var.e(true, true);
            }
        }
    }

    public final boolean R() {
        if (Build.VERSION.SDK_INT <= 28 && wmd.b(this.m0.c())) {
            return true;
        }
        return false;
    }

    public final boolean S() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            en4 k = k();
            if (k != null && this.m0.e != null) {
                String str = Build.MANUFACTURER;
                String str2 = Build.MODEL;
                if (i == 28) {
                    if (str != null) {
                        for (String str3 : k.getResources().getStringArray(2130903045)) {
                            if (str.equalsIgnoreCase(str3)) {
                                break;
                            }
                        }
                    }
                    String str4 = Build.MODEL;
                    if (str4 != null) {
                        for (String str5 : k.getResources().getStringArray(2130903044)) {
                            if (!str4.startsWith(str5)) {
                            }
                        }
                    }
                }
            }
            if (Build.VERSION.SDK_INT != 28) {
                return false;
            }
            Context n = n();
            if (n == null || n.getPackageManager() == null || !kr7.a(n.getPackageManager())) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void T() {
        String str;
        en4 k = k();
        if (k == null) {
            Log.e("BiometricFragment", "Failed to check device credential. Client FragmentActivity not found.");
            return;
        }
        KeyguardManager a = ov5.a(k);
        if (a == null) {
            U(12, q(2131689618));
            return;
        }
        lj0 lj0Var = this.m0;
        hj0 hj0Var = lj0Var.d;
        String str2 = null;
        if (hj0Var != null) {
            str = hj0Var.a;
        } else {
            str = null;
        }
        lj0Var.getClass();
        hj0 hj0Var2 = this.m0.d;
        if (hj0Var2 != null) {
            str2 = hj0Var2.b;
        }
        Intent a2 = ui0.a(a, str, str2);
        if (a2 == null) {
            U(14, q(2131689617));
            return;
        }
        this.m0.m = true;
        if (S()) {
            Q();
        }
        a2.setFlags(134742016);
        startActivityForResult(a2, 1);
    }

    public final void U(int i, CharSequence charSequence) {
        V(i, charSequence);
        P();
    }

    public final void V(int i, CharSequence charSequence) {
        lj0 lj0Var = this.m0;
        if (lj0Var.m) {
            Log.v("BiometricFragment", "Error not sent to client. User is confirming their device credential.");
        } else if (!lj0Var.l) {
            Log.w("BiometricFragment", "Error not sent to client. Client is not awaiting a result.");
        } else {
            lj0Var.l = false;
            Executor executor = lj0Var.b;
            if (executor == null) {
                executor = new yi0((byte) 1);
            }
            executor.execute(new qi0(this, i, charSequence, (byte) 0));
        }
    }

    public final void W(fj0 fj0Var) {
        lj0 lj0Var = this.m0;
        if (!lj0Var.l) {
            Log.w("BiometricFragment", "Success not sent to client. Client is not awaiting a result.");
        } else {
            lj0Var.l = false;
            Executor executor = lj0Var.b;
            if (executor == null) {
                executor = new yi0((byte) 1);
            }
            executor.execute(new tq4(this, fj0Var, false, (byte) 3));
        }
        P();
    }

    public final void X(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = q(2131689578);
        }
        this.m0.d(2);
        lj0 lj0Var = this.m0;
        hh7 hh7Var = lj0Var.y;
        if (hh7Var == null) {
            hh7Var = new hh7();
            lj0Var.y = hh7Var;
        }
        lj0.f(hh7Var, charSequence);
    }

    public final void Y() {
        String str;
        String str2;
        String str3;
        int i;
        CancellationSignal cancellationSignal;
        if (!this.m0.k) {
            if (n() == null) {
                Log.w("BiometricFragment", "Not showing biometric prompt. Context is null.");
                return;
            }
            lj0 lj0Var = this.m0;
            lj0Var.k = true;
            lj0Var.l = true;
            String str4 = null;
            r5 = null;
            r5 = null;
            r5 = null;
            xl3 xl3Var = null;
            if (S()) {
                Context applicationContext = K().getApplicationContext();
                FingerprintManager c = dg4.c(applicationContext);
                if (c != null && dg4.e(c)) {
                    FingerprintManager c2 = dg4.c(applicationContext);
                    if (c2 != null && dg4.d(c2)) {
                        i = 0;
                    } else {
                        i = 11;
                    }
                } else {
                    i = 12;
                }
                if (i != 0) {
                    U(i, pfe.a(applicationContext, i));
                    return;
                } else if (t()) {
                    this.m0.u = true;
                    String str5 = Build.MODEL;
                    if (Build.VERSION.SDK_INT == 28 && str5 != null) {
                        for (String str6 : applicationContext.getResources().getStringArray(2130903047)) {
                            if (str5.startsWith(str6)) {
                                break;
                            }
                        }
                    }
                    this.l0.postDelayed(new ri0(this, (byte) 1), 500L);
                    bg4 bg4Var = new bg4();
                    go4 p = p();
                    bg4Var.y0 = false;
                    bg4Var.z0 = true;
                    id0 id0Var = new id0(p);
                    id0Var.o = true;
                    id0Var.f(0, bg4Var, "androidx.biometric.FingerprintDialogFragment");
                    id0Var.e(false, true);
                    lj0 lj0Var2 = this.m0;
                    lj0Var2.j = (byte) 0;
                    gj0 gj0Var = lj0Var2.e;
                    if (gj0Var != null) {
                        Cipher cipher = gj0Var.b;
                        if (cipher != null) {
                            xl3Var = new xl3(cipher);
                        } else {
                            Signature signature = gj0Var.a;
                            if (signature != null) {
                                xl3Var = new xl3(signature);
                            } else {
                                Mac mac = gj0Var.c;
                                if (mac != null) {
                                    xl3Var = new xl3(mac);
                                } else if (Build.VERSION.SDK_INT >= 30 && gj0Var.d != null) {
                                    Log.e("CryptoObjectUtils", "Identity credential is not supported by FingerprintManager.");
                                }
                            }
                        }
                    }
                    lj0 lj0Var3 = this.m0;
                    tg2 tg2Var = lj0Var3.g;
                    if (tg2Var == null) {
                        tg2Var = new tg2((byte) 14);
                        lj0Var3.g = tg2Var;
                    }
                    e31 e31Var = (e31) tg2Var.c;
                    if (e31Var == null) {
                        e31Var = new e31((byte) 1);
                        tg2Var.c = e31Var;
                    }
                    lj0 lj0Var4 = this.m0;
                    u40 u40Var = lj0Var4.f;
                    if (u40Var == null) {
                        u40Var = new u40(new jj0(lj0Var4));
                        lj0Var4.f = u40Var;
                    }
                    i4d i4dVar = u40Var.b;
                    if (i4dVar == null) {
                        i4dVar = new i4d(u40Var);
                        u40Var.b = i4dVar;
                    }
                    try {
                        synchronized (e31Var) {
                            if (((CancellationSignal) e31Var.c) == null) {
                                CancellationSignal cancellationSignal2 = new CancellationSignal();
                                e31Var.c = cancellationSignal2;
                                if (e31Var.b) {
                                    cancellationSignal2.cancel();
                                }
                            }
                            cancellationSignal = (CancellationSignal) e31Var.c;
                        }
                        FingerprintManager c3 = dg4.c(applicationContext);
                        if (c3 != null) {
                            dg4.a(c3, dg4.g(xl3Var), cancellationSignal, new cg4(i4dVar));
                            return;
                        }
                        return;
                    } catch (NullPointerException e) {
                        Log.e("BiometricFragment", "Got NPE while authenticating with fingerprint.", e);
                        U(1, pfe.a(applicationContext, 1));
                        return;
                    }
                } else {
                    return;
                }
            }
            BiometricPrompt.Builder d = vi0.d(K().getApplicationContext());
            lj0 lj0Var5 = this.m0;
            hj0 hj0Var = lj0Var5.d;
            if (hj0Var != null) {
                str = hj0Var.a;
            } else {
                str = null;
            }
            lj0Var5.getClass();
            hj0 hj0Var2 = this.m0.d;
            if (hj0Var2 != null) {
                str2 = hj0Var2.b;
            } else {
                str2 = null;
            }
            if (str != null) {
                vi0.g(d, str);
            }
            if (str2 != null) {
                vi0.e(d, str2);
            }
            lj0 lj0Var6 = this.m0;
            String str7 = lj0Var6.i;
            if (str7 != null) {
                str4 = str7;
            } else {
                hj0 hj0Var3 = lj0Var6.d;
                if (hj0Var3 != null && (str4 = hj0Var3.c) == null) {
                    str4 = "";
                }
            }
            if (!TextUtils.isEmpty(str4)) {
                Executor executor = this.m0.b;
                if (executor == null) {
                    executor = new yi0((byte) 1);
                }
                lj0 lj0Var7 = this.m0;
                kj0 kj0Var = lj0Var7.h;
                if (kj0Var == null) {
                    kj0Var = new kj0(lj0Var7);
                    lj0Var7.h = kj0Var;
                }
                vi0.f(d, str4, executor, kj0Var);
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 29) {
                hj0 hj0Var4 = this.m0.d;
                wi0.a(d, true);
            }
            int c4 = this.m0.c();
            if (i2 >= 30) {
                xi0.a(d, c4);
            } else if (i2 >= 29) {
                wi0.b(d, wmd.b(c4));
            }
            BiometricPrompt c5 = vi0.c(d);
            Context n = n();
            BiometricPrompt.CryptoObject b = rae.b(this.m0.e);
            lj0 lj0Var8 = this.m0;
            tg2 tg2Var2 = lj0Var8.g;
            if (tg2Var2 == null) {
                tg2Var2 = new tg2((byte) 14);
                lj0Var8.g = tg2Var2;
            }
            CancellationSignal cancellationSignal3 = (CancellationSignal) tg2Var2.b;
            if (cancellationSignal3 == null) {
                cancellationSignal3 = oa1.b();
                tg2Var2.b = cancellationSignal3;
            }
            yi0 yi0Var = new yi0((byte) 0);
            lj0 lj0Var9 = this.m0;
            u40 u40Var2 = lj0Var9.f;
            if (u40Var2 == null) {
                u40Var2 = new u40(new jj0(lj0Var9));
                lj0Var9.f = u40Var2;
            }
            BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback = u40Var2.a;
            if (biometricPrompt$AuthenticationCallback == null) {
                biometricPrompt$AuthenticationCallback = r40.a(u40Var2.c);
                u40Var2.a = biometricPrompt$AuthenticationCallback;
            }
            try {
                if (b == null) {
                    vi0.b(c5, cancellationSignal3, yi0Var, biometricPrompt$AuthenticationCallback);
                } else {
                    vi0.a(c5, b, cancellationSignal3, yi0Var, biometricPrompt$AuthenticationCallback);
                }
            } catch (NullPointerException e2) {
                Log.e("BiometricFragment", "Got NPE while authenticating with biometric prompt.", e2);
                if (n != null) {
                    str3 = n.getString(2131689578);
                } else {
                    str3 = "";
                }
                U(1, str3);
            }
        }
    }

    @Override
    public final void x(int i, int i2, Intent intent) {
        super.x(i, i2, intent);
        if (i == 1) {
            this.m0.m = false;
            if (i2 == -1) {
                W(new fj0(null, 1));
            } else {
                U(10, q(2131689619));
            }
        }
    }

    @Override
    public final void z(Bundle bundle) {
        super.z(bundle);
        if (k() == null) {
            return;
        }
        lj0 lj0Var = (lj0) new g29(k()).k(lj0.class);
        this.m0 = lj0Var;
        hh7 hh7Var = lj0Var.p;
        if (hh7Var == null) {
            hh7Var = new hh7();
            lj0Var.p = hh7Var;
        }
        hh7Var.d(this, new si0(this, (byte) 0));
        lj0 lj0Var2 = this.m0;
        hh7 hh7Var2 = lj0Var2.q;
        if (hh7Var2 == null) {
            hh7Var2 = new hh7();
            lj0Var2.q = hh7Var2;
        }
        hh7Var2.d(this, new ti0(this, (byte) 0));
        lj0 lj0Var3 = this.m0;
        hh7 hh7Var3 = lj0Var3.r;
        if (hh7Var3 == null) {
            hh7Var3 = new hh7();
            lj0Var3.r = hh7Var3;
        }
        hh7Var3.d(this, new l69(this, (byte) 10));
        lj0 lj0Var4 = this.m0;
        hh7 hh7Var4 = lj0Var4.s;
        if (hh7Var4 == null) {
            hh7Var4 = new hh7();
            lj0Var4.s = hh7Var4;
        }
        hh7Var4.d(this, new i4d(this));
        lj0 lj0Var5 = this.m0;
        hh7 hh7Var5 = lj0Var5.t;
        if (hh7Var5 == null) {
            hh7Var5 = new hh7();
            lj0Var5.t = hh7Var5;
        }
        hh7Var5.d(this, new si0(this, (byte) 1));
        lj0 lj0Var6 = this.m0;
        hh7 hh7Var6 = lj0Var6.v;
        if (hh7Var6 == null) {
            hh7Var6 = new hh7();
            lj0Var6.v = hh7Var6;
        }
        hh7Var6.d(this, new ti0(this, (byte) 1));
    }
}
