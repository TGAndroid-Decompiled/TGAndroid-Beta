package k0;

import a5.m;
import android.hardware.fingerprint.FingerprintManager;
import androidx.biometric.t;
import androidx.biometric.u;
import androidx.biometric.w;
import androidx.biometric.y;
import androidx.lifecycle.z;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import xa.c;
public final class a extends FingerprintManager.AuthenticationCallback {
    public final c f14434a;

    public a(c cVar) {
        this.f14434a = cVar;
    }

    @Override
    public final void onAuthenticationError(int i9, CharSequence charSequence) {
        ((w) ((m) this.f14434a.f49099b).d).a(i9, charSequence);
    }

    @Override
    public final void onAuthenticationFailed() {
        WeakReference weakReference = ((w) ((m) this.f14434a.f49099b).d).f565a;
        if (weakReference.get() != null && ((y) weakReference.get()).f576n) {
            y yVar = (y) weakReference.get();
            if (yVar.f583u == null) {
                yVar.f583u = new z();
            }
            y.h(yVar.f583u, Boolean.TRUE);
        }
    }

    @Override
    public final void onAuthenticationHelp(int i9, CharSequence charSequence) {
        WeakReference weakReference = ((w) ((m) this.f14434a.f49099b).d).f565a;
        if (weakReference.get() != null) {
            y yVar = (y) weakReference.get();
            if (yVar.f582t == null) {
                yVar.f582t = new z();
            }
            y.h(yVar.f582t, charSequence);
        }
    }

    @Override
    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        c cVar = this.f14434a;
        j4.c B = e0.b.B(e0.b.e(authenticationResult));
        cVar.getClass();
        u uVar = null;
        if (B != null) {
            Cipher cipher = (Cipher) B.f13432c;
            if (cipher != null) {
                uVar = new u(cipher);
            } else {
                Signature signature = (Signature) B.f13431b;
                if (signature != null) {
                    uVar = new u(signature);
                } else {
                    Mac mac = (Mac) B.d;
                    if (mac != null) {
                        uVar = new u(mac);
                    }
                }
            }
        }
        ((w) ((m) cVar.f49099b).d).b(new t(uVar, 2));
    }
}
