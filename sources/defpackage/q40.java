package defpackage;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.os.Build;
import android.security.identity.IdentityCredential;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
public final class q40 extends BiometricPrompt$AuthenticationCallback {
    public final t40 a;

    public q40(t40 t40Var) {
        this.a = t40Var;
    }

    public void onAuthenticationError(int i, CharSequence charSequence) {
        this.a.a(i, charSequence);
    }

    public void onAuthenticationFailed() {
        WeakReference weakReference = ((jj0) this.a).a;
        if (weakReference.get() != null && ((lj0) weakReference.get()).l) {
            lj0 lj0Var = (lj0) weakReference.get();
            hh7 hh7Var = lj0Var.s;
            if (hh7Var == null) {
                hh7Var = new hh7();
                lj0Var.s = hh7Var;
            }
            lj0.f(hh7Var, Boolean.TRUE);
        }
    }

    public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        BiometricPrompt.CryptoObject cryptoObject;
        IdentityCredential b;
        gj0 gj0Var = null;
        if (authenticationResult != null && (cryptoObject = authenticationResult.getCryptoObject()) != null) {
            Cipher d = q33.d(cryptoObject);
            if (d != null) {
                gj0Var = new gj0(d);
            } else {
                Signature f = q33.f(cryptoObject);
                if (f != null) {
                    gj0Var = new gj0(f);
                } else {
                    Mac e = q33.e(cryptoObject);
                    if (e != null) {
                        gj0Var = new gj0(e);
                    } else if (Build.VERSION.SDK_INT >= 30 && (b = r33.b(cryptoObject)) != null) {
                        gj0Var = new gj0(b);
                    }
                }
            }
        }
        int i = Build.VERSION.SDK_INT;
        int i2 = -1;
        if (i >= 30) {
            if (authenticationResult != null) {
                i2 = s40.a(authenticationResult);
            }
        } else if (i != 29) {
            i2 = 2;
        }
        this.a.b(new fj0(gj0Var, i2));
    }

    public void onAuthenticationHelp(int i, CharSequence charSequence) {
    }
}
