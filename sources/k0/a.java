package k0;

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
    public final c f11991a;

    public a(c cVar) {
        this.f11991a = cVar;
    }

    @Override
    public final void onAuthenticationError(int i10, CharSequence charSequence) {
        ((w) ((aa.a) this.f11991a.f45077b).d).a(i10, charSequence);
    }

    @Override
    public final void onAuthenticationFailed() {
        WeakReference weakReference = ((w) ((aa.a) this.f11991a.f45077b).d).f760a;
        if (weakReference.get() != null && ((y) weakReference.get()).f770n) {
            y yVar = (y) weakReference.get();
            if (yVar.f777u == null) {
                yVar.f777u = new z();
            }
            y.h(yVar.f777u, Boolean.TRUE);
        }
    }

    @Override
    public final void onAuthenticationHelp(int i10, CharSequence charSequence) {
        WeakReference weakReference = ((w) ((aa.a) this.f11991a.f45077b).d).f760a;
        if (weakReference.get() != null) {
            y yVar = (y) weakReference.get();
            if (yVar.f776t == null) {
                yVar.f776t = new z();
            }
            y.h(yVar.f776t, charSequence);
        }
    }

    @Override
    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        c cVar = this.f11991a;
        aa.a L = e0.b.L(e0.b.f(authenticationResult));
        cVar.getClass();
        u uVar = null;
        if (L != null) {
            Cipher cipher = (Cipher) L.f356c;
            if (cipher != null) {
                uVar = new u(cipher);
            } else {
                Signature signature = (Signature) L.f355b;
                if (signature != null) {
                    uVar = new u(signature);
                } else {
                    Mac mac = (Mac) L.d;
                    if (mac != null) {
                        uVar = new u(mac);
                    }
                }
            }
        }
        ((w) ((aa.a) cVar.f45077b).d).b(new t(uVar, 2));
    }
}
