package defpackage;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.os.Build;
import android.security.identity.IdentityCredential;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
public final class s40 extends BiometricPrompt$AuthenticationCallback {
    public final v40 a;

    public s40(v40 v40Var) {
        this.a = v40Var;
    }

    public void onAuthenticationError(int i, CharSequence charSequence) {
        this.a.a(i, charSequence);
    }

    public void onAuthenticationFailed() {
        WeakReference weakReference = ((kj0) this.a).a;
        if (weakReference.get() != null && ((mj0) weakReference.get()).l) {
            mj0 mj0Var = (mj0) weakReference.get();
            qj7 qj7Var = mj0Var.s;
            if (qj7Var == null) {
                qj7Var = new qj7();
                mj0Var.s = qj7Var;
            }
            mj0.f(qj7Var, Boolean.TRUE);
        }
    }

    public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        BiometricPrompt.CryptoObject cryptoObject;
        IdentityCredential b;
        hj0 hj0Var = null;
        if (authenticationResult != null && (cryptoObject = authenticationResult.getCryptoObject()) != null) {
            Cipher d = i43.d(cryptoObject);
            if (d != null) {
                hj0Var = new hj0(d);
            } else {
                Signature f = i43.f(cryptoObject);
                if (f != null) {
                    hj0Var = new hj0(f);
                } else {
                    Mac e = i43.e(cryptoObject);
                    if (e != null) {
                        hj0Var = new hj0(e);
                    } else if (Build.VERSION.SDK_INT >= 30 && (b = j43.b(cryptoObject)) != null) {
                        hj0Var = new hj0(b);
                    }
                }
            }
        }
        int i = Build.VERSION.SDK_INT;
        int i2 = -1;
        if (i >= 30) {
            if (authenticationResult != null) {
                i2 = u40.a(authenticationResult);
            }
        } else if (i != 29) {
            i2 = 2;
        }
        this.a.b(new gj0(hj0Var, i2));
    }

    public void onAuthenticationHelp(int i, CharSequence charSequence) {
    }
}
