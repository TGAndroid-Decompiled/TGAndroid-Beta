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
public class ak0 extends dp4 {
    public final Handler l0 = new Handler(Looper.getMainLooper());
    public lk0 m0;

    @Override
    public final void H() {
        this.V = true;
        if (Build.VERSION.SDK_INT == 29 && zod.b(this.m0.c())) {
            lk0 lk0Var = this.m0;
            lk0Var.o = true;
            this.l0.postDelayed(new zj0(lk0Var, (byte) 2), 250L);
        }
    }

    @Override
    public final void I() {
        this.V = true;
        if (Build.VERSION.SDK_INT < 29 && !this.m0.m) {
            gp4 k = k();
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
                    V(10, qhe.a(n(), 10));
                }
            }
            lk0 lk0Var = this.m0;
            lx6 lx6Var = lk0Var.g;
            if (lx6Var == null) {
                lx6Var = new lx6((byte) 13);
                lk0Var.g = lx6Var;
            }
            CancellationSignal cancellationSignal = (CancellationSignal) lx6Var.b;
            if (cancellationSignal != null) {
                try {
                    wb1.a(cancellationSignal);
                } catch (NullPointerException e) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e);
                }
                lx6Var.b = null;
            }
            m41 m41Var = (m41) lx6Var.c;
            if (m41Var != null) {
                try {
                    m41Var.g();
                } catch (NullPointerException e2) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling fingerprint authentication.", e2);
                }
                lx6Var.c = null;
            }
        }
    }

    public final void P() {
        this.m0.k = false;
        Q();
        if (!this.m0.m && t()) {
            ie0 ie0Var = new ie0(p());
            ie0Var.h(this);
            ie0Var.e(true, true);
        }
        Context n = n();
        if (n != null) {
            String str = Build.MODEL;
            if (Build.VERSION.SDK_INT == 29 && str != null) {
                for (String str2 : n.getResources().getStringArray(2130903046)) {
                    if (str.equals(str2)) {
                        lk0 lk0Var = this.m0;
                        lk0Var.n = true;
                        this.l0.postDelayed(new zj0(lk0Var, (byte) 1), 600L);
                        return;
                    }
                }
            }
        }
    }

    public final void Q() {
        this.m0.k = false;
        if (t()) {
            hq4 p = p();
            di4 di4Var = (di4) p.D("androidx.biometric.FingerprintDialogFragment");
            if (di4Var != null) {
                if (di4Var.t()) {
                    di4Var.O(false);
                    return;
                }
                ie0 ie0Var = new ie0(p);
                ie0Var.h(di4Var);
                ie0Var.e(true, true);
            }
        }
    }

    public final boolean R() {
        if (Build.VERSION.SDK_INT <= 28 && zod.b(this.m0.c())) {
            return true;
        }
        return false;
    }

    public final boolean S() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            gp4 k = k();
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
            if (n == null || n.getPackageManager() == null || !lt7.a(n.getPackageManager())) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void T() {
        String str;
        gp4 k = k();
        if (k == null) {
            Log.e("BiometricFragment", "Failed to check device credential. Client FragmentActivity not found.");
            return;
        }
        KeyguardManager a = ox5.a(k);
        if (a == null) {
            U(12, q(2131689618));
            return;
        }
        lk0 lk0Var = this.m0;
        hk0 hk0Var = lk0Var.d;
        String str2 = null;
        if (hk0Var != null) {
            str = hk0Var.a;
        } else {
            str = null;
        }
        lk0Var.getClass();
        hk0 hk0Var2 = this.m0.d;
        if (hk0Var2 != null) {
            str2 = hk0Var2.b;
        }
        Intent a2 = uj0.a(a, str, str2);
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
        lk0 lk0Var = this.m0;
        if (lk0Var.m) {
            Log.v("BiometricFragment", "Error not sent to client. User is confirming their device credential.");
        } else if (!lk0Var.l) {
            Log.w("BiometricFragment", "Error not sent to client. Client is not awaiting a result.");
        } else {
            lk0Var.l = false;
            Executor executor = lk0Var.b;
            if (executor == null) {
                executor = new yj0((byte) 1);
            }
            executor.execute(new qj0(this, i, charSequence, (byte) 0));
        }
    }

    public final void W(fk0 fk0Var) {
        lk0 lk0Var = this.m0;
        if (!lk0Var.l) {
            Log.w("BiometricFragment", "Success not sent to client. Client is not awaiting a result.");
        } else {
            lk0Var.l = false;
            Executor executor = lk0Var.b;
            if (executor == null) {
                executor = new yj0((byte) 1);
            }
            executor.execute(new us4(this, fk0Var, false, (byte) 3));
        }
        P();
    }

    public final void X(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = q(2131689578);
        }
        this.m0.d(2);
        lk0 lk0Var = this.m0;
        kj7 kj7Var = lk0Var.y;
        if (kj7Var == null) {
            kj7Var = new kj7();
            lk0Var.y = kj7Var;
        }
        lk0.f(kj7Var, charSequence);
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
            lk0 lk0Var = this.m0;
            lk0Var.k = true;
            lk0Var.l = true;
            String str4 = null;
            r5 = null;
            r5 = null;
            r5 = null;
            in3 in3Var = null;
            if (S()) {
                Context applicationContext = K().getApplicationContext();
                FingerprintManager c = fi4.c(applicationContext);
                if (c != null && fi4.e(c)) {
                    FingerprintManager c2 = fi4.c(applicationContext);
                    if (c2 != null && fi4.d(c2)) {
                        i = 0;
                    } else {
                        i = 11;
                    }
                } else {
                    i = 12;
                }
                if (i != 0) {
                    U(i, qhe.a(applicationContext, i));
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
                    this.l0.postDelayed(new rj0(this, (byte) 1), 500L);
                    di4 di4Var = new di4();
                    hq4 p = p();
                    di4Var.y0 = false;
                    di4Var.z0 = true;
                    ie0 ie0Var = new ie0(p);
                    ie0Var.o = true;
                    ie0Var.f(0, di4Var, "androidx.biometric.FingerprintDialogFragment");
                    ie0Var.e(false, true);
                    lk0 lk0Var2 = this.m0;
                    lk0Var2.j = (byte) 0;
                    gk0 gk0Var = lk0Var2.e;
                    if (gk0Var != null) {
                        Cipher cipher = gk0Var.b;
                        if (cipher != null) {
                            in3Var = new in3(cipher);
                        } else {
                            Signature signature = gk0Var.a;
                            if (signature != null) {
                                in3Var = new in3(signature);
                            } else {
                                Mac mac = gk0Var.c;
                                if (mac != null) {
                                    in3Var = new in3(mac);
                                } else if (Build.VERSION.SDK_INT >= 30 && gk0Var.d != null) {
                                    Log.e("CryptoObjectUtils", "Identity credential is not supported by FingerprintManager.");
                                }
                            }
                        }
                    }
                    lk0 lk0Var3 = this.m0;
                    lx6 lx6Var = lk0Var3.g;
                    if (lx6Var == null) {
                        lx6Var = new lx6((byte) 13);
                        lk0Var3.g = lx6Var;
                    }
                    m41 m41Var = (m41) lx6Var.c;
                    if (m41Var == null) {
                        m41Var = new m41((byte) 1);
                        lx6Var.c = m41Var;
                    }
                    lk0 lk0Var4 = this.m0;
                    u50 u50Var = lk0Var4.f;
                    if (u50Var == null) {
                        u50Var = new u50(new jk0(lk0Var4));
                        lk0Var4.f = u50Var;
                    }
                    k6d k6dVar = u50Var.b;
                    if (k6dVar == null) {
                        k6dVar = new k6d(u50Var, (byte) 8);
                        u50Var.b = k6dVar;
                    }
                    try {
                        synchronized (m41Var) {
                            if (((CancellationSignal) m41Var.c) == null) {
                                CancellationSignal cancellationSignal2 = new CancellationSignal();
                                m41Var.c = cancellationSignal2;
                                if (m41Var.b) {
                                    cancellationSignal2.cancel();
                                }
                            }
                            cancellationSignal = (CancellationSignal) m41Var.c;
                        }
                        FingerprintManager c3 = fi4.c(applicationContext);
                        if (c3 != null) {
                            fi4.a(c3, fi4.g(in3Var), cancellationSignal, new ei4(k6dVar));
                            return;
                        }
                        return;
                    } catch (NullPointerException e) {
                        Log.e("BiometricFragment", "Got NPE while authenticating with fingerprint.", e);
                        U(1, qhe.a(applicationContext, 1));
                        return;
                    }
                } else {
                    return;
                }
            }
            BiometricPrompt.Builder d = vj0.d(K().getApplicationContext());
            lk0 lk0Var5 = this.m0;
            hk0 hk0Var = lk0Var5.d;
            if (hk0Var != null) {
                str = hk0Var.a;
            } else {
                str = null;
            }
            lk0Var5.getClass();
            hk0 hk0Var2 = this.m0.d;
            if (hk0Var2 != null) {
                str2 = hk0Var2.b;
            } else {
                str2 = null;
            }
            if (str != null) {
                vj0.g(d, str);
            }
            if (str2 != null) {
                vj0.e(d, str2);
            }
            lk0 lk0Var6 = this.m0;
            String str7 = lk0Var6.i;
            if (str7 != null) {
                str4 = str7;
            } else {
                hk0 hk0Var3 = lk0Var6.d;
                if (hk0Var3 != null && (str4 = hk0Var3.c) == null) {
                    str4 = "";
                }
            }
            if (!TextUtils.isEmpty(str4)) {
                Executor executor = this.m0.b;
                if (executor == null) {
                    executor = new yj0((byte) 1);
                }
                lk0 lk0Var7 = this.m0;
                kk0 kk0Var = lk0Var7.h;
                if (kk0Var == null) {
                    kk0Var = new kk0(lk0Var7);
                    lk0Var7.h = kk0Var;
                }
                vj0.f(d, str4, executor, kk0Var);
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 29) {
                hk0 hk0Var4 = this.m0.d;
                wj0.a(d, true);
            }
            int c4 = this.m0.c();
            if (i2 >= 30) {
                xj0.a(d, c4);
            } else if (i2 >= 29) {
                wj0.b(d, zod.b(c4));
            }
            BiometricPrompt c5 = vj0.c(d);
            Context n = n();
            BiometricPrompt.CryptoObject b = sce.b(this.m0.e);
            lk0 lk0Var8 = this.m0;
            lx6 lx6Var2 = lk0Var8.g;
            if (lx6Var2 == null) {
                lx6Var2 = new lx6((byte) 13);
                lk0Var8.g = lx6Var2;
            }
            CancellationSignal cancellationSignal3 = (CancellationSignal) lx6Var2.b;
            if (cancellationSignal3 == null) {
                cancellationSignal3 = wb1.b();
                lx6Var2.b = cancellationSignal3;
            }
            yj0 yj0Var = new yj0((byte) 0);
            lk0 lk0Var9 = this.m0;
            u50 u50Var2 = lk0Var9.f;
            if (u50Var2 == null) {
                u50Var2 = new u50(new jk0(lk0Var9));
                lk0Var9.f = u50Var2;
            }
            BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback = u50Var2.a;
            if (biometricPrompt$AuthenticationCallback == null) {
                biometricPrompt$AuthenticationCallback = r50.a(u50Var2.c);
                u50Var2.a = biometricPrompt$AuthenticationCallback;
            }
            try {
                if (b == null) {
                    vj0.b(c5, cancellationSignal3, yj0Var, biometricPrompt$AuthenticationCallback);
                } else {
                    vj0.a(c5, b, cancellationSignal3, yj0Var, biometricPrompt$AuthenticationCallback);
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
                W(new fk0(null, 1));
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
        lk0 lk0Var = (lk0) new et8(k()).l(lk0.class);
        this.m0 = lk0Var;
        kj7 kj7Var = lk0Var.p;
        if (kj7Var == null) {
            kj7Var = new kj7();
            lk0Var.p = kj7Var;
        }
        kj7Var.d(this, new sj0(this, (byte) 0));
        lk0 lk0Var2 = this.m0;
        kj7 kj7Var2 = lk0Var2.q;
        if (kj7Var2 == null) {
            kj7Var2 = new kj7();
            lk0Var2.q = kj7Var2;
        }
        kj7Var2.d(this, new tj0(this, (byte) 0));
        lk0 lk0Var3 = this.m0;
        kj7 kj7Var3 = lk0Var3.r;
        if (kj7Var3 == null) {
            kj7Var3 = new kj7();
            lk0Var3.r = kj7Var3;
        }
        kj7Var3.d(this, new ni6(this, (byte) 9));
        lk0 lk0Var4 = this.m0;
        kj7 kj7Var4 = lk0Var4.s;
        if (kj7Var4 == null) {
            kj7Var4 = new kj7();
            lk0Var4.s = kj7Var4;
        }
        kj7Var4.d(this, new k6d(this, (byte) 10));
        lk0 lk0Var5 = this.m0;
        kj7 kj7Var5 = lk0Var5.t;
        if (kj7Var5 == null) {
            kj7Var5 = new kj7();
            lk0Var5.t = kj7Var5;
        }
        kj7Var5.d(this, new sj0(this, (byte) 1));
        lk0 lk0Var6 = this.m0;
        kj7 kj7Var6 = lk0Var6.v;
        if (kj7Var6 == null) {
            kj7Var6 = new kj7();
            lk0Var6.v = kj7Var6;
        }
        kj7Var6.d(this, new tj0(this, (byte) 1));
    }
}
