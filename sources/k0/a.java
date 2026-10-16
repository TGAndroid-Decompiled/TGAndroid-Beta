package k0;

import a4.l;
import android.hardware.fingerprint.FingerprintManager;
import androidx.biometric.e;
import androidx.biometric.x;
import androidx.biometric.z;
import java.lang.ref.WeakReference;
public final class a extends FingerprintManager.AuthenticationCallback {
    public final l f13763a;

    public a(l lVar) {
        this.f13763a = lVar;
    }

    @Override
    public final void onAuthenticationError(int i10, CharSequence charSequence) {
        ((x) ((e) this.f13763a.f279b).d).a(i10, charSequence);
    }

    @Override
    public final void onAuthenticationFailed() {
        WeakReference weakReference = ((x) ((e) this.f13763a.f279b).d).f1225a;
        if (weakReference.get() != null && ((z) weakReference.get()).f1235n) {
            z zVar = (z) weakReference.get();
            if (zVar.f1242u == null) {
                zVar.f1242u = new androidx.lifecycle.z();
            }
            z.h(zVar.f1242u, Boolean.TRUE);
        }
    }

    @Override
    public final void onAuthenticationHelp(int i10, CharSequence charSequence) {
        WeakReference weakReference = ((x) ((e) this.f13763a.f279b).d).f1225a;
        if (weakReference.get() != null) {
            z zVar = (z) weakReference.get();
            if (zVar.f1241t == null) {
                zVar.f1241t = new androidx.lifecycle.z();
            }
            z.h(zVar.f1241t, charSequence);
        }
    }

    @Override
    public final void onAuthenticationSucceeded(android.hardware.fingerprint.FingerprintManager.AuthenticationResult r4) {
        throw new UnsupportedOperationException("Method not decompiled: k0.a.onAuthenticationSucceeded(android.hardware.fingerprint.FingerprintManager$AuthenticationResult):void");
    }
}
