package k0;

import android.hardware.fingerprint.FingerprintManager;
import androidx.biometric.a0;
import androidx.biometric.e;
import androidx.biometric.v;
import androidx.biometric.w;
import androidx.biometric.y;
import androidx.lifecycle.z;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import y5.h;
public final class a extends FingerprintManager.AuthenticationCallback {
    public final h f10246a;

    public a(h hVar) {
        this.f10246a = hVar;
    }

    @Override
    public final void onAuthenticationError(int i10, CharSequence charSequence) {
        ((y) ((e) this.f10246a.f50776b).d).a(i10, charSequence);
    }

    @Override
    public final void onAuthenticationFailed() {
        WeakReference weakReference = ((y) ((e) this.f10246a.f50776b).d).f560a;
        if (weakReference.get() != null && ((a0) weakReference.get()).f513n) {
            a0 a0Var = (a0) weakReference.get();
            if (a0Var.f520u == null) {
                a0Var.f520u = new z();
            }
            a0.h(a0Var.f520u, Boolean.TRUE);
        }
    }

    @Override
    public final void onAuthenticationHelp(int i10, CharSequence charSequence) {
        WeakReference weakReference = ((y) ((e) this.f10246a.f50776b).d).f560a;
        if (weakReference.get() != null) {
            a0 a0Var = (a0) weakReference.get();
            if (a0Var.f519t == null) {
                a0Var.f519t = new z();
            }
            a0.h(a0Var.f519t, charSequence);
        }
    }

    @Override
    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        h hVar = this.f10246a;
        e B = e0.b.B(e0.b.e(authenticationResult));
        hVar.getClass();
        w wVar = null;
        if (B != null) {
            Cipher cipher = (Cipher) B.f528c;
            if (cipher != null) {
                wVar = new w(cipher);
            } else {
                Signature signature = (Signature) B.f527b;
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
        ((y) ((e) hVar.f50776b).d).b(new v(wVar, 2));
    }
}
