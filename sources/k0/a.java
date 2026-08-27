package k0;

import a5.n;
import a9.i;
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

    public final i f14256a;

    public a(i iVar) {
        this.f14256a = iVar;
    }

    @Override
    public final void onAuthenticationError(int i10, CharSequence charSequence) {
        ((w) ((n) this.f14256a.f181b).d).a(i10, charSequence);
    }

    @Override
    public final void onAuthenticationFailed() {
        WeakReference weakReference = ((w) ((n) this.f14256a.f181b).d).f1069a;
        if (weakReference.get() == null || !((y) weakReference.get()).f1080n) {
            return;
        }
        y yVar = (y) weakReference.get();
        if (yVar.f1087u == null) {
            yVar.f1087u = new z();
        }
        y.h(yVar.f1087u, Boolean.TRUE);
    }

    @Override
    public final void onAuthenticationHelp(int i10, CharSequence charSequence) {
        WeakReference weakReference = ((w) ((n) this.f14256a.f181b).d).f1069a;
        if (weakReference.get() != null) {
            y yVar = (y) weakReference.get();
            if (yVar.f1086t == null) {
                yVar.f1086t = new z();
            }
            y.h(yVar.f1086t, charSequence);
        }
    }

    @Override
    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        i iVar = this.f14256a;
        j9.a aVarB = b.B(b.e(authenticationResult));
        iVar.getClass();
        u uVar = null;
        if (aVarB != null) {
            Cipher cipher = (Cipher) aVarB.f12864c;
            if (cipher != null) {
                uVar = new u(cipher);
            } else {
                Signature signature = (Signature) aVarB.f12863b;
                if (signature != null) {
                    uVar = new u(signature);
                } else {
                    Mac mac = (Mac) aVarB.d;
                    if (mac != null) {
                        uVar = new u(mac);
                    }
                }
            }
        }
        ((w) ((n) iVar.f181b).d).b(new t(uVar, 2));
    }
}
