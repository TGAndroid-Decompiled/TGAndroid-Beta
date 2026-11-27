package defpackage;

import android.hardware.fingerprint.FingerprintManager;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
public final class bi4 extends FingerprintManager.AuthenticationCallback {
    public final z8d a;

    public bi4(z8d z8dVar) {
        this.a = z8dVar;
    }

    @Override
    public final void onAuthenticationError(int i, CharSequence charSequence) {
        ((w40) this.a.b).c.a(i, charSequence);
    }

    @Override
    public final void onAuthenticationFailed() {
        WeakReference weakReference = ((w40) this.a.b).c.a;
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

    @Override
    public final void onAuthenticationHelp(int i, CharSequence charSequence) {
        WeakReference weakReference = ((w40) this.a.b).c.a;
        if (weakReference.get() != null) {
            mj0 mj0Var = (mj0) weakReference.get();
            qj7 qj7Var = mj0Var.r;
            if (qj7Var == null) {
                qj7Var = new qj7();
                mj0Var.r = qj7Var;
            }
            mj0.f(qj7Var, charSequence);
        }
    }

    @Override
    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        z8d z8dVar = this.a;
        pm3 f = ci4.f(ci4.b(authenticationResult));
        z8dVar.getClass();
        hj0 hj0Var = null;
        if (f != null) {
            Cipher cipher = (Cipher) f.c;
            if (cipher != null) {
                hj0Var = new hj0(cipher);
            } else {
                Signature signature = (Signature) f.b;
                if (signature != null) {
                    hj0Var = new hj0(signature);
                } else {
                    Mac mac = (Mac) f.d;
                    if (mac != null) {
                        hj0Var = new hj0(mac);
                    }
                }
            }
        }
        ((w40) z8dVar.b).c.b(new gj0(hj0Var, 2));
    }
}
