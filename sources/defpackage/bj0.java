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
public class bj0 extends gp4 {
    public final Handler l0 = new Handler(Looper.getMainLooper());
    public mj0 m0;

    @Override
    public final void H() {
        this.V = true;
        if (Build.VERSION.SDK_INT == 29 && nrd.b(this.m0.c())) {
            mj0 mj0Var = this.m0;
            mj0Var.o = true;
            this.l0.postDelayed(new aj0(mj0Var, (byte) 2), 250L);
        }
    }

    @Override
    public final void I() {
        this.V = true;
        if (Build.VERSION.SDK_INT < 29 && !this.m0.m) {
            jp4 k = k();
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
                    V(10, gke.a(n(), 10));
                }
            }
            mj0 mj0Var = this.m0;
            lh2 lh2Var = mj0Var.g;
            if (lh2Var == null) {
                lh2Var = new lh2((byte) 14);
                mj0Var.g = lh2Var;
            }
            CancellationSignal cancellationSignal = (CancellationSignal) lh2Var.b;
            if (cancellationSignal != null) {
                try {
                    wa1.a(cancellationSignal);
                } catch (NullPointerException e) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e);
                }
                lh2Var.b = null;
            }
            n31 n31Var = (n31) lh2Var.c;
            if (n31Var != null) {
                try {
                    n31Var.g();
                } catch (NullPointerException e2) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling fingerprint authentication.", e2);
                }
                lh2Var.c = null;
            }
        }
    }

    public final void P() {
        this.m0.k = false;
        Q();
        if (!this.m0.m && t()) {
            kd0 kd0Var = new kd0(p());
            kd0Var.h(this);
            kd0Var.e(true, true);
        }
        Context n = n();
        if (n != null) {
            String str = Build.MODEL;
            if (Build.VERSION.SDK_INT == 29 && str != null) {
                for (String str2 : n.getResources().getStringArray(2130903046)) {
                    if (str.equals(str2)) {
                        mj0 mj0Var = this.m0;
                        mj0Var.n = true;
                        this.l0.postDelayed(new aj0(mj0Var, (byte) 1), 600L);
                        return;
                    }
                }
            }
        }
    }

    public final void Q() {
        this.m0.k = false;
        if (t()) {
            kq4 p = p();
            ai4 ai4Var = (ai4) p.D("androidx.biometric.FingerprintDialogFragment");
            if (ai4Var != null) {
                if (ai4Var.t()) {
                    ai4Var.O(false);
                    return;
                }
                kd0 kd0Var = new kd0(p);
                kd0Var.h(ai4Var);
                kd0Var.e(true, true);
            }
        }
    }

    public final boolean R() {
        if (Build.VERSION.SDK_INT <= 28 && nrd.b(this.m0.c())) {
            return true;
        }
        return false;
    }

    public final boolean S() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            jp4 k = k();
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
            if (n == null || n.getPackageManager() == null || !qu7.a(n.getPackageManager())) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void T() {
        String str;
        jp4 k = k();
        if (k == null) {
            Log.e("BiometricFragment", "Failed to check device credential. Client FragmentActivity not found.");
            return;
        }
        KeyguardManager a = tx5.a(k);
        if (a == null) {
            U(12, q(2131689618));
            return;
        }
        mj0 mj0Var = this.m0;
        ij0 ij0Var = mj0Var.d;
        String str2 = null;
        if (ij0Var != null) {
            str = ij0Var.a;
        } else {
            str = null;
        }
        mj0Var.getClass();
        ij0 ij0Var2 = this.m0.d;
        if (ij0Var2 != null) {
            str2 = ij0Var2.b;
        }
        Intent a2 = vi0.a(a, str, str2);
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
        mj0 mj0Var = this.m0;
        if (mj0Var.m) {
            Log.v("BiometricFragment", "Error not sent to client. User is confirming their device credential.");
        } else if (!mj0Var.l) {
            Log.w("BiometricFragment", "Error not sent to client. Client is not awaiting a result.");
        } else {
            mj0Var.l = false;
            Executor executor = mj0Var.b;
            if (executor == null) {
                executor = new zi0((byte) 1);
            }
            executor.execute(new ri0(this, i, charSequence, (byte) 0));
        }
    }

    public final void W(gj0 gj0Var) {
        mj0 mj0Var = this.m0;
        if (!mj0Var.l) {
            Log.w("BiometricFragment", "Success not sent to client. Client is not awaiting a result.");
        } else {
            mj0Var.l = false;
            Executor executor = mj0Var.b;
            if (executor == null) {
                executor = new zi0((byte) 1);
            }
            executor.execute(new xs4(this, gj0Var, false, (byte) 3));
        }
        P();
    }

    public final void X(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = q(2131689578);
        }
        this.m0.d(2);
        mj0 mj0Var = this.m0;
        qj7 qj7Var = mj0Var.y;
        if (qj7Var == null) {
            qj7Var = new qj7();
            mj0Var.y = qj7Var;
        }
        mj0.f(qj7Var, charSequence);
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
            mj0 mj0Var = this.m0;
            mj0Var.k = true;
            mj0Var.l = true;
            String str4 = null;
            r5 = null;
            r5 = null;
            r5 = null;
            pm3 pm3Var = null;
            if (S()) {
                Context applicationContext = K().getApplicationContext();
                FingerprintManager c = ci4.c(applicationContext);
                if (c != null && ci4.e(c)) {
                    FingerprintManager c2 = ci4.c(applicationContext);
                    if (c2 != null && ci4.d(c2)) {
                        i = 0;
                    } else {
                        i = 11;
                    }
                } else {
                    i = 12;
                }
                if (i != 0) {
                    U(i, gke.a(applicationContext, i));
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
                    this.l0.postDelayed(new si0(this, (byte) 1), 500L);
                    ai4 ai4Var = new ai4();
                    kq4 p = p();
                    ai4Var.y0 = false;
                    ai4Var.z0 = true;
                    kd0 kd0Var = new kd0(p);
                    kd0Var.o = true;
                    kd0Var.f(0, ai4Var, "androidx.biometric.FingerprintDialogFragment");
                    kd0Var.e(false, true);
                    mj0 mj0Var2 = this.m0;
                    mj0Var2.j = (byte) 0;
                    hj0 hj0Var = mj0Var2.e;
                    if (hj0Var != null) {
                        Cipher cipher = hj0Var.b;
                        if (cipher != null) {
                            pm3Var = new pm3(cipher);
                        } else {
                            Signature signature = hj0Var.a;
                            if (signature != null) {
                                pm3Var = new pm3(signature);
                            } else {
                                Mac mac = hj0Var.c;
                                if (mac != null) {
                                    pm3Var = new pm3(mac);
                                } else if (Build.VERSION.SDK_INT >= 30 && hj0Var.d != null) {
                                    Log.e("CryptoObjectUtils", "Identity credential is not supported by FingerprintManager.");
                                }
                            }
                        }
                    }
                    mj0 mj0Var3 = this.m0;
                    lh2 lh2Var = mj0Var3.g;
                    if (lh2Var == null) {
                        lh2Var = new lh2((byte) 14);
                        mj0Var3.g = lh2Var;
                    }
                    n31 n31Var = (n31) lh2Var.c;
                    if (n31Var == null) {
                        n31Var = new n31((byte) 1);
                        lh2Var.c = n31Var;
                    }
                    mj0 mj0Var4 = this.m0;
                    w40 w40Var = mj0Var4.f;
                    if (w40Var == null) {
                        w40Var = new w40(new kj0(mj0Var4));
                        mj0Var4.f = w40Var;
                    }
                    z8d z8dVar = w40Var.b;
                    if (z8dVar == null) {
                        z8dVar = new z8d(w40Var, (byte) 8);
                        w40Var.b = z8dVar;
                    }
                    try {
                        synchronized (n31Var) {
                            if (((CancellationSignal) n31Var.c) == null) {
                                CancellationSignal cancellationSignal2 = new CancellationSignal();
                                n31Var.c = cancellationSignal2;
                                if (n31Var.b) {
                                    cancellationSignal2.cancel();
                                }
                            }
                            cancellationSignal = (CancellationSignal) n31Var.c;
                        }
                        FingerprintManager c3 = ci4.c(applicationContext);
                        if (c3 != null) {
                            ci4.a(c3, ci4.g(pm3Var), cancellationSignal, new bi4(z8dVar));
                            return;
                        }
                        return;
                    } catch (NullPointerException e) {
                        Log.e("BiometricFragment", "Got NPE while authenticating with fingerprint.", e);
                        U(1, gke.a(applicationContext, 1));
                        return;
                    }
                } else {
                    return;
                }
            }
            BiometricPrompt.Builder d = wi0.d(K().getApplicationContext());
            mj0 mj0Var5 = this.m0;
            ij0 ij0Var = mj0Var5.d;
            if (ij0Var != null) {
                str = ij0Var.a;
            } else {
                str = null;
            }
            mj0Var5.getClass();
            ij0 ij0Var2 = this.m0.d;
            if (ij0Var2 != null) {
                str2 = ij0Var2.b;
            } else {
                str2 = null;
            }
            if (str != null) {
                wi0.g(d, str);
            }
            if (str2 != null) {
                wi0.e(d, str2);
            }
            mj0 mj0Var6 = this.m0;
            String str7 = mj0Var6.i;
            if (str7 != null) {
                str4 = str7;
            } else {
                ij0 ij0Var3 = mj0Var6.d;
                if (ij0Var3 != null && (str4 = ij0Var3.c) == null) {
                    str4 = "";
                }
            }
            if (!TextUtils.isEmpty(str4)) {
                Executor executor = this.m0.b;
                if (executor == null) {
                    executor = new zi0((byte) 1);
                }
                mj0 mj0Var7 = this.m0;
                lj0 lj0Var = mj0Var7.h;
                if (lj0Var == null) {
                    lj0Var = new lj0(mj0Var7);
                    mj0Var7.h = lj0Var;
                }
                wi0.f(d, str4, executor, lj0Var);
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 29) {
                ij0 ij0Var4 = this.m0.d;
                xi0.a(d, true);
            }
            int c4 = this.m0.c();
            if (i2 >= 30) {
                yi0.a(d, c4);
            } else if (i2 >= 29) {
                xi0.b(d, nrd.b(c4));
            }
            BiometricPrompt c5 = wi0.c(d);
            Context n = n();
            BiometricPrompt.CryptoObject b = hfe.b(this.m0.e);
            mj0 mj0Var8 = this.m0;
            lh2 lh2Var2 = mj0Var8.g;
            if (lh2Var2 == null) {
                lh2Var2 = new lh2((byte) 14);
                mj0Var8.g = lh2Var2;
            }
            CancellationSignal cancellationSignal3 = (CancellationSignal) lh2Var2.b;
            if (cancellationSignal3 == null) {
                cancellationSignal3 = wa1.b();
                lh2Var2.b = cancellationSignal3;
            }
            zi0 zi0Var = new zi0((byte) 0);
            mj0 mj0Var9 = this.m0;
            w40 w40Var2 = mj0Var9.f;
            if (w40Var2 == null) {
                w40Var2 = new w40(new kj0(mj0Var9));
                mj0Var9.f = w40Var2;
            }
            BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback = w40Var2.a;
            if (biometricPrompt$AuthenticationCallback == null) {
                biometricPrompt$AuthenticationCallback = t40.a(w40Var2.c);
                w40Var2.a = biometricPrompt$AuthenticationCallback;
            }
            try {
                if (b == null) {
                    wi0.b(c5, cancellationSignal3, zi0Var, biometricPrompt$AuthenticationCallback);
                } else {
                    wi0.a(c5, b, cancellationSignal3, zi0Var, biometricPrompt$AuthenticationCallback);
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
                W(new gj0(null, 1));
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
        mj0 mj0Var = (mj0) new pq8(k()).n(mj0.class);
        this.m0 = mj0Var;
        qj7 qj7Var = mj0Var.p;
        if (qj7Var == null) {
            qj7Var = new qj7();
            mj0Var.p = qj7Var;
        }
        qj7Var.d(this, new ti0(this, (byte) 0));
        mj0 mj0Var2 = this.m0;
        qj7 qj7Var2 = mj0Var2.q;
        if (qj7Var2 == null) {
            qj7Var2 = new qj7();
            mj0Var2.q = qj7Var2;
        }
        qj7Var2.d(this, new ui0(this, (byte) 0));
        mj0 mj0Var3 = this.m0;
        qj7 qj7Var3 = mj0Var3.r;
        if (qj7Var3 == null) {
            qj7Var3 = new qj7();
            mj0Var3.r = qj7Var3;
        }
        qj7Var3.d(this, new ri6(this, (byte) 9));
        mj0 mj0Var4 = this.m0;
        qj7 qj7Var4 = mj0Var4.s;
        if (qj7Var4 == null) {
            qj7Var4 = new qj7();
            mj0Var4.s = qj7Var4;
        }
        qj7Var4.d(this, new z8d(this, (byte) 10));
        mj0 mj0Var5 = this.m0;
        qj7 qj7Var5 = mj0Var5.t;
        if (qj7Var5 == null) {
            qj7Var5 = new qj7();
            mj0Var5.t = qj7Var5;
        }
        qj7Var5.d(this, new ti0(this, (byte) 1));
        mj0 mj0Var6 = this.m0;
        qj7 qj7Var6 = mj0Var6.v;
        if (qj7Var6 == null) {
            qj7Var6 = new qj7();
            mj0Var6.v = qj7Var6;
        }
        qj7Var6.d(this, new ui0(this, (byte) 1));
    }
}
