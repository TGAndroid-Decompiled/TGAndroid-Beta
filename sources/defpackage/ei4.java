package defpackage;

import android.hardware.fingerprint.FingerprintManager;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
public final class ei4 extends FingerprintManager.AuthenticationCallback {
    public final k6d a;

    public ei4(k6d k6dVar) {
        this.a = k6dVar;
    }

    @Override
    public final void onAuthenticationError(int i, CharSequence charSequence) {
        ((u50) this.a.b).c.a(i, charSequence);
    }

    @Override
    public final void onAuthenticationFailed() {
        WeakReference weakReference = ((u50) this.a.b).c.a;
        if (weakReference.get() != null && ((lk0) weakReference.get()).l) {
            lk0 lk0Var = (lk0) weakReference.get();
            kj7 kj7Var = lk0Var.s;
            if (kj7Var == null) {
                kj7Var = new kj7();
                lk0Var.s = kj7Var;
            }
            lk0.f(kj7Var, Boolean.TRUE);
        }
    }

    @Override
    public final void onAuthenticationHelp(int i, CharSequence charSequence) {
        WeakReference weakReference = ((u50) this.a.b).c.a;
        if (weakReference.get() != null) {
            lk0 lk0Var = (lk0) weakReference.get();
            kj7 kj7Var = lk0Var.r;
            if (kj7Var == null) {
                kj7Var = new kj7();
                lk0Var.r = kj7Var;
            }
            lk0.f(kj7Var, charSequence);
        }
    }

    @Override
    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        k6d k6dVar = this.a;
        in3 f = fi4.f(fi4.b(authenticationResult));
        k6dVar.getClass();
        gk0 gk0Var = null;
        if (f != null) {
            Cipher cipher = (Cipher) f.c;
            if (cipher != null) {
                gk0Var = new gk0(cipher);
            } else {
                Signature signature = (Signature) f.b;
                if (signature != null) {
                    gk0Var = new gk0(signature);
                } else {
                    Mac mac = (Mac) f.d;
                    if (mac != null) {
                        gk0Var = new gk0(mac);
                    }
                }
            }
        }
        ((u50) k6dVar.b).c.b(new fk0(gk0Var, 2));
    }
}
