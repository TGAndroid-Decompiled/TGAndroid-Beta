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
    public final m f14453a;

    public a(m mVar) {
        this.f14453a = mVar;
    }

    @Override
    public final void onAuthenticationError(int i10, CharSequence charSequence) {
        ((w) ((aa.a) this.f14453a.f295b).d).a(i10, charSequence);
    }

    @Override
    public final void onAuthenticationFailed() {
        WeakReference weakReference = ((w) ((aa.a) this.f14453a.f295b).d).f1073a;
        if (weakReference.get() != null && ((y) weakReference.get()).f1084n) {
            y yVar = (y) weakReference.get();
            if (yVar.f1091u == null) {
                yVar.f1091u = new z();
            }
            y.h(yVar.f1091u, Boolean.TRUE);
        }
    }

    @Override
    public final void onAuthenticationHelp(int i10, CharSequence charSequence) {
        WeakReference weakReference = ((w) ((aa.a) this.f14453a.f295b).d).f1073a;
        if (weakReference.get() != null) {
            y yVar = (y) weakReference.get();
            if (yVar.f1090t == null) {
                yVar.f1090t = new z();
            }
            y.h(yVar.f1090t, charSequence);
        }
    }

    @Override
    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        m mVar = this.f14453a;
        aa.a L = b.L(b.f(authenticationResult));
        mVar.getClass();
        u uVar = null;
        if (L != null) {
            Cipher cipher = (Cipher) L.f384c;
            if (cipher != null) {
                uVar = new u(cipher);
            } else {
                Signature signature = (Signature) L.f383b;
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
        ((w) ((aa.a) mVar.f295b).d).b(new t(uVar, 2));
    }
}
