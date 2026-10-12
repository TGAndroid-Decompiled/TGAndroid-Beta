package k0;

import a6.m;
import android.hardware.fingerprint.FingerprintManager;
import androidx.biometric.v;
import androidx.biometric.x;
import androidx.lifecycle.z;
import java.lang.ref.WeakReference;
public final class a extends FingerprintManager.AuthenticationCallback {
    public final m f14317a;

    public a(m mVar) {
        this.f14317a = mVar;
    }

    @Override
    public final void onAuthenticationError(int i10, CharSequence charSequence) {
        ((v) ((aa.a) this.f14317a.f330b).d).a(i10, charSequence);
    }

    @Override
    public final void onAuthenticationFailed() {
        WeakReference weakReference = ((v) ((aa.a) this.f14317a.f330b).d).f2321a;
        if (weakReference.get() != null && ((x) weakReference.get()).f2332n) {
            x xVar = (x) weakReference.get();
            if (xVar.f2339u == null) {
                xVar.f2339u = new z();
            }
            x.h(xVar.f2339u, Boolean.TRUE);
        }
    }

    @Override
    public final void onAuthenticationHelp(int i10, CharSequence charSequence) {
        WeakReference weakReference = ((v) ((aa.a) this.f14317a.f330b).d).f2321a;
        if (weakReference.get() != null) {
            x xVar = (x) weakReference.get();
            if (xVar.f2338t == null) {
                xVar.f2338t = new z();
            }
            x.h(xVar.f2338t, charSequence);
        }
    }

    @Override
    public final void onAuthenticationSucceeded(android.hardware.fingerprint.FingerprintManager.AuthenticationResult r4) {
        throw new UnsupportedOperationException("Method not decompiled: k0.a.onAuthenticationSucceeded(android.hardware.fingerprint.FingerprintManager$AuthenticationResult):void");
    }
}
