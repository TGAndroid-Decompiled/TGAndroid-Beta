package k0;

import af.d;
import android.hardware.fingerprint.FingerprintManager;
import androidx.biometric.u;
import androidx.biometric.v;
import androidx.biometric.x;
import androidx.biometric.z;
import e0.b;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import o5.i;
public final class a extends FingerprintManager.AuthenticationCallback {
    public final i f9528a;

    public a(i iVar) {
        this.f9528a = iVar;
    }

    @Override
    public final void onAuthenticationError(int i10, CharSequence charSequence) {
        ((x) ((d) this.f9528a.f16439b).d).a(i10, charSequence);
    }

    @Override
    public final void onAuthenticationFailed() {
        WeakReference weakReference = ((x) ((d) this.f9528a.f16439b).d).f504a;
        if (weakReference.get() != null && ((z) weakReference.get()).f514n) {
            z zVar = (z) weakReference.get();
            if (zVar.f521u == null) {
                zVar.f521u = new androidx.lifecycle.z();
            }
            z.h(zVar.f521u, Boolean.TRUE);
        }
    }

    @Override
    public final void onAuthenticationHelp(int i10, CharSequence charSequence) {
        WeakReference weakReference = ((x) ((d) this.f9528a.f16439b).d).f504a;
        if (weakReference.get() != null) {
            z zVar = (z) weakReference.get();
            if (zVar.f520t == null) {
                zVar.f520t = new androidx.lifecycle.z();
            }
            z.h(zVar.f520t, charSequence);
        }
    }

    @Override
    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        i iVar = this.f9528a;
        d B = b.B(b.e(authenticationResult));
        iVar.getClass();
        v vVar = null;
        if (B != null) {
            Cipher cipher = (Cipher) B.f160c;
            if (cipher != null) {
                vVar = new v(cipher);
            } else {
                Signature signature = (Signature) B.f159b;
                if (signature != null) {
                    vVar = new v(signature);
                } else {
                    Mac mac = (Mac) B.d;
                    if (mac != null) {
                        vVar = new v(mac);
                    }
                }
            }
        }
        ((x) ((d) iVar.f16439b).d).b(new u(vVar, 2));
    }
}
