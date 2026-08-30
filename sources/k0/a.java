package k0;

import android.hardware.fingerprint.FingerprintManager;
import androidx.biometric.a0;
import androidx.biometric.e;
import androidx.biometric.v;
import androidx.biometric.w;
import androidx.biometric.y;
import androidx.lifecycle.z;
import e0.b;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import o5.i;
public final class a extends FingerprintManager.AuthenticationCallback {
    public final i f9547a;

    public a(i iVar) {
        this.f9547a = iVar;
    }

    @Override
    public final void onAuthenticationError(int i10, CharSequence charSequence) {
        ((y) ((e) this.f9547a.f16457b).d).a(i10, charSequence);
    }

    @Override
    public final void onAuthenticationFailed() {
        WeakReference weakReference = ((y) ((e) this.f9547a.f16457b).d).f511a;
        if (weakReference.get() != null && ((a0) weakReference.get()).f465n) {
            a0 a0Var = (a0) weakReference.get();
            if (a0Var.f472u == null) {
                a0Var.f472u = new z();
            }
            a0.h(a0Var.f472u, Boolean.TRUE);
        }
    }

    @Override
    public final void onAuthenticationHelp(int i10, CharSequence charSequence) {
        WeakReference weakReference = ((y) ((e) this.f9547a.f16457b).d).f511a;
        if (weakReference.get() != null) {
            a0 a0Var = (a0) weakReference.get();
            if (a0Var.f471t == null) {
                a0Var.f471t = new z();
            }
            a0.h(a0Var.f471t, charSequence);
        }
    }

    @Override
    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        i iVar = this.f9547a;
        e B = b.B(b.e(authenticationResult));
        iVar.getClass();
        w wVar = null;
        if (B != null) {
            Cipher cipher = (Cipher) B.f479c;
            if (cipher != null) {
                wVar = new w(cipher);
            } else {
                Signature signature = (Signature) B.f478b;
                if (signature != null) {
                    wVar = new w(signature);
                } else {
                    Mac mac = (Mac) B.d;
                    if (mac != null) {
                        wVar = new w(mac);
                    }
                }
            }
        }
        ((y) ((e) iVar.f16457b).d).b(new v(wVar, 2));
    }
}
