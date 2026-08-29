package k0;

import android.hardware.fingerprint.FingerprintManager;
import androidx.biometric.e;
import androidx.biometric.u;
import androidx.biometric.v;
import androidx.biometric.x;
import androidx.biometric.z;
import ha.c;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
public final class a extends FingerprintManager.AuthenticationCallback {
    public final c f13244a;

    public a(c cVar) {
        this.f13244a = cVar;
    }

    @Override
    public final void onAuthenticationError(int i10, CharSequence charSequence) {
        ((x) ((e) this.f13244a.f7981b).d).a(i10, charSequence);
    }

    @Override
    public final void onAuthenticationFailed() {
        WeakReference weakReference = ((x) ((e) this.f13244a.f7981b).d).f1059a;
        if (weakReference.get() != null && ((z) weakReference.get()).f1070n) {
            z zVar = (z) weakReference.get();
            if (zVar.f1077u == null) {
                zVar.f1077u = new androidx.lifecycle.z();
            }
            z.h(zVar.f1077u, Boolean.TRUE);
        }
    }

    @Override
    public final void onAuthenticationHelp(int i10, CharSequence charSequence) {
        WeakReference weakReference = ((x) ((e) this.f13244a.f7981b).d).f1059a;
        if (weakReference.get() != null) {
            z zVar = (z) weakReference.get();
            if (zVar.f1076t == null) {
                zVar.f1076t = new androidx.lifecycle.z();
            }
            z.h(zVar.f1076t, charSequence);
        }
    }

    @Override
    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        c cVar = this.f13244a;
        e B = e0.b.B(e0.b.e(authenticationResult));
        cVar.getClass();
        v vVar = null;
        if (B != null) {
            Cipher cipher = (Cipher) B.f1031c;
            if (cipher != null) {
                vVar = new v(cipher);
            } else {
                Signature signature = (Signature) B.f1030b;
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
        ((x) ((e) cVar.f7981b).d).b(new u(vVar, 2));
    }
}
