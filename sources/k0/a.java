package k0;

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
import pb.c;
public final class a extends FingerprintManager.AuthenticationCallback {
    public final c f13149a;

    public a(c cVar) {
        this.f13149a = cVar;
    }

    @Override
    public final void onAuthenticationError(int i10, CharSequence charSequence) {
        ((v) ((aa.a) this.f13149a.f41066b).d).a(i10, charSequence);
    }

    @Override
    public final void onAuthenticationFailed() {
        WeakReference weakReference = ((v) ((aa.a) this.f13149a.f41066b).d).f2073a;
        if (weakReference.get() != null && ((x) weakReference.get()).f2083n) {
            x xVar = (x) weakReference.get();
            if (xVar.f2090u == null) {
                xVar.f2090u = new z();
            }
            x.h(xVar.f2090u, Boolean.TRUE);
        }
    }

    @Override
    public final void onAuthenticationHelp(int i10, CharSequence charSequence) {
        WeakReference weakReference = ((v) ((aa.a) this.f13149a.f41066b).d).f2073a;
        if (weakReference.get() != null) {
            x xVar = (x) weakReference.get();
            if (xVar.f2089t == null) {
                xVar.f2089t = new z();
            }
            x.h(xVar.f2089t, charSequence);
        }
    }

    @Override
    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        c cVar = this.f13149a;
        aa.a L = b.L(b.f(authenticationResult));
        cVar.getClass();
        t tVar = null;
        if (L != null) {
            Cipher cipher = (Cipher) L.f357c;
            if (cipher != null) {
                tVar = new t(cipher);
            } else {
                Signature signature = (Signature) L.f356b;
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
        ((v) ((aa.a) cVar.f41066b).d).b(new s(tVar, 2));
    }
}
