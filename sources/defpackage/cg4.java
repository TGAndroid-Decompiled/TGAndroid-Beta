package defpackage;

import android.hardware.fingerprint.FingerprintManager;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
public final class cg4 extends FingerprintManager.AuthenticationCallback {
    public final i4d a;

    public cg4(i4d i4dVar) {
        this.a = i4dVar;
    }

    @Override
    public final void onAuthenticationError(int i, CharSequence charSequence) {
        ((u40) this.a.a).c.a(i, charSequence);
    }

    @Override
    public final void onAuthenticationFailed() {
        WeakReference weakReference = ((u40) this.a.a).c.a;
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

    @Override
    public final void onAuthenticationHelp(int i, CharSequence charSequence) {
        WeakReference weakReference = ((u40) this.a.a).c.a;
        if (weakReference.get() != null) {
            lj0 lj0Var = (lj0) weakReference.get();
            hh7 hh7Var = lj0Var.r;
            if (hh7Var == null) {
                hh7Var = new hh7();
                lj0Var.r = hh7Var;
            }
            lj0.f(hh7Var, charSequence);
        }
    }

    @Override
    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        i4d i4dVar = this.a;
        xl3 f = dg4.f(dg4.b(authenticationResult));
        i4dVar.getClass();
        gj0 gj0Var = null;
        if (f != null) {
            Cipher cipher = (Cipher) f.c;
            if (cipher != null) {
                gj0Var = new gj0(cipher);
            } else {
                Signature signature = (Signature) f.b;
                if (signature != null) {
                    gj0Var = new gj0(signature);
                } else {
                    Mac mac = (Mac) f.d;
                    if (mac != null) {
                        gj0Var = new gj0(mac);
                    }
                }
            }
        }
        ((u40) i4dVar.a).c.b(new fj0(gj0Var, 2));
    }
}
