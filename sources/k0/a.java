package k0;

import android.hardware.fingerprint.FingerprintManager;
import androidx.biometric.e;
import androidx.biometric.x;
import androidx.biometric.z;
import java.lang.ref.WeakReference;
import k6.h;
public final class a extends FingerprintManager.AuthenticationCallback {
    public final h f13760a;

    public a(h hVar) {
        this.f13760a = hVar;
    }

    @Override
    public final void onAuthenticationError(int i10, CharSequence charSequence) {
        ((x) ((e) this.f13760a.f14176b).d).a(i10, charSequence);
    }

    @Override
    public final void onAuthenticationFailed() {
        WeakReference weakReference = ((x) ((e) this.f13760a.f14176b).d).f1221a;
        if (weakReference.get() != null && ((z) weakReference.get()).f1231n) {
            z zVar = (z) weakReference.get();
            if (zVar.f1238u == null) {
                zVar.f1238u = new androidx.lifecycle.z();
            }
            z.h(zVar.f1238u, Boolean.TRUE);
        }
    }

    @Override
    public final void onAuthenticationHelp(int i10, CharSequence charSequence) {
        WeakReference weakReference = ((x) ((e) this.f13760a.f14176b).d).f1221a;
        if (weakReference.get() != null) {
            z zVar = (z) weakReference.get();
            if (zVar.f1237t == null) {
                zVar.f1237t = new androidx.lifecycle.z();
            }
            z.h(zVar.f1237t, charSequence);
        }
    }

    @Override
    public final void onAuthenticationSucceeded(android.hardware.fingerprint.FingerprintManager.AuthenticationResult r4) {
        throw new UnsupportedOperationException("Method not decompiled: k0.a.onAuthenticationSucceeded(android.hardware.fingerprint.FingerprintManager$AuthenticationResult):void");
    }
}
