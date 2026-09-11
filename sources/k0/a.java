package k0;

import a4.m;
import android.hardware.fingerprint.FingerprintManager;
import androidx.biometric.t;
import androidx.biometric.u;
import androidx.biometric.w;
import androidx.biometric.y;
import androidx.lifecycle.z;
import e0.b;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
public final class a extends FingerprintManager.AuthenticationCallback {
    public final m f14427a;

    public a(m mVar) {
        this.f14427a = mVar;
    }

    @Override
    public final void onAuthenticationError(int i10, CharSequence charSequence) {
        ((w) ((aa.a) this.f14427a.f283b).d).a(i10, charSequence);
    }

    @Override
    public final void onAuthenticationFailed() {
        WeakReference weakReference = ((w) ((aa.a) this.f14427a.f283b).d).f1061a;
        if (weakReference.get() != null && ((y) weakReference.get()).f1072n) {
            y yVar = (y) weakReference.get();
            if (yVar.f1079u == null) {
                yVar.f1079u = new z();
            }
            y.h(yVar.f1079u, Boolean.TRUE);
        }
    }

    @Override
    public final void onAuthenticationHelp(int i10, CharSequence charSequence) {
        WeakReference weakReference = ((w) ((aa.a) this.f14427a.f283b).d).f1061a;
        if (weakReference.get() != null) {
            y yVar = (y) weakReference.get();
            if (yVar.f1078t == null) {
                yVar.f1078t = new z();
            }
            y.h(yVar.f1078t, charSequence);
        }
    }

    @Override
    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        m mVar = this.f14427a;
        aa.a L = b.L(b.f(authenticationResult));
        mVar.getClass();
        u uVar = null;
        if (L != null) {
            Cipher cipher = (Cipher) L.f372c;
            if (cipher != null) {
                uVar = new u(cipher);
            } else {
                Signature signature = (Signature) L.f371b;
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
        ((w) ((aa.a) mVar.f283b).d).b(new t(uVar, 2));
    }
}
