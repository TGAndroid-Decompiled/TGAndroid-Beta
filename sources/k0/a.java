package k0;

import a6.m;
import android.hardware.fingerprint.FingerprintManager;
import androidx.biometric.s;
import androidx.biometric.t;
import androidx.biometric.v;
import androidx.biometric.x;
import androidx.lifecycle.z;
import e0.b;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
public final class a extends FingerprintManager.AuthenticationCallback {
    public final m f13145a;

    public a(m mVar) {
        this.f13145a = mVar;
    }

    @Override
    public final void onAuthenticationError(int i10, CharSequence charSequence) {
        ((v) ((aa.a) this.f13145a.f305b).d).a(i10, charSequence);
    }

    @Override
    public final void onAuthenticationFailed() {
        WeakReference weakReference = ((v) ((aa.a) this.f13145a.f305b).d).f2069a;
        if (weakReference.get() != null && ((x) weakReference.get()).f2079n) {
            x xVar = (x) weakReference.get();
            if (xVar.f2086u == null) {
                xVar.f2086u = new z();
            }
            x.h(xVar.f2086u, Boolean.TRUE);
        }
    }

    @Override
    public final void onAuthenticationHelp(int i10, CharSequence charSequence) {
        WeakReference weakReference = ((v) ((aa.a) this.f13145a.f305b).d).f2069a;
        if (weakReference.get() != null) {
            x xVar = (x) weakReference.get();
            if (xVar.f2085t == null) {
                xVar.f2085t = new z();
            }
            x.h(xVar.f2085t, charSequence);
        }
    }

    @Override
    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        m mVar = this.f13145a;
        aa.a L = b.L(b.f(authenticationResult));
        mVar.getClass();
        t tVar = null;
        if (L != null) {
            Cipher cipher = (Cipher) L.f358c;
            if (cipher != null) {
                tVar = new t(cipher);
            } else {
                Signature signature = (Signature) L.f357b;
                if (signature != null) {
                    tVar = new t(signature);
                } else {
                    Mac mac = (Mac) L.d;
                    if (mac != null) {
                        tVar = new t(mac);
                    }
                }
            }
        }
        ((v) ((aa.a) mVar.f305b).d).b(new s(tVar, 2));
    }
}
