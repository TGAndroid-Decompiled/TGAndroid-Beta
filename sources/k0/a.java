package k0;

import a6.m;
import android.hardware.fingerprint.FingerprintManager;
import androidx.biometric.s;
import androidx.biometric.t;
import androidx.biometric.v;
import androidx.biometric.x;
import androidx.lifecycle.z;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
public final class a extends FingerprintManager.AuthenticationCallback {
    public final m f14282a;

    public a(m mVar) {
        this.f14282a = mVar;
    }

    @Override
    public final void onAuthenticationError(int i10, CharSequence charSequence) {
        ((v) ((aa.a) this.f14282a.f330b).d).a(i10, charSequence);
    }

    @Override
    public final void onAuthenticationFailed() {
        WeakReference weakReference = ((v) ((aa.a) this.f14282a.f330b).d).f2244a;
        if (weakReference.get() != null && ((x) weakReference.get()).f2255n) {
            x xVar = (x) weakReference.get();
            if (xVar.f2262u == null) {
                xVar.f2262u = new z();
            }
            x.h(xVar.f2262u, Boolean.TRUE);
        }
    }

    @Override
    public final void onAuthenticationHelp(int i10, CharSequence charSequence) {
        WeakReference weakReference = ((v) ((aa.a) this.f14282a.f330b).d).f2244a;
        if (weakReference.get() != null) {
            x xVar = (x) weakReference.get();
            if (xVar.f2261t == null) {
                xVar.f2261t = new z();
            }
            x.h(xVar.f2261t, charSequence);
        }
    }

    @Override
    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        m mVar = this.f14282a;
        aa.a L = e0.b.L(e0.b.f(authenticationResult));
        mVar.getClass();
        t tVar = null;
        if (L != null) {
            Cipher cipher = (Cipher) L.f387c;
            if (cipher != null) {
                tVar = new t(cipher);
            } else {
                Signature signature = (Signature) L.f386b;
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
        ((v) ((aa.a) mVar.f330b).d).b(new s(tVar, 2));
    }
}
