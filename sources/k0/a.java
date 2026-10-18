package k0;

import a6.m;
import android.hardware.fingerprint.FingerprintManager;
import androidx.biometric.e;
import androidx.biometric.w;
import androidx.biometric.y;
import androidx.lifecycle.z;
import java.lang.ref.WeakReference;
public final class a extends FingerprintManager.AuthenticationCallback {
    public final m f14562a;

    public a(m mVar) {
        this.f14562a = mVar;
    }

    @Override
    public final void onAuthenticationError(int i10, CharSequence charSequence) {
        ((w) ((e) this.f14562a.f310b).d).a(i10, charSequence);
    }

    @Override
    public final void onAuthenticationFailed() {
        WeakReference weakReference = ((w) ((e) this.f14562a.f310b).d).f2843a;
        if (weakReference.get() != null && ((y) weakReference.get()).f2853n) {
            y yVar = (y) weakReference.get();
            if (yVar.f2860u == null) {
                yVar.f2860u = new z();
            }
            y.h(yVar.f2860u, Boolean.TRUE);
        }
    }

    @Override
    public final void onAuthenticationHelp(int i10, CharSequence charSequence) {
        WeakReference weakReference = ((w) ((e) this.f14562a.f310b).d).f2843a;
        if (weakReference.get() != null) {
            y yVar = (y) weakReference.get();
            if (yVar.f2859t == null) {
                yVar.f2859t = new z();
            }
            y.h(yVar.f2859t, charSequence);
        }
    }

    @Override
    public final void onAuthenticationSucceeded(android.hardware.fingerprint.FingerprintManager.AuthenticationResult r4) {
        throw new UnsupportedOperationException("Method not decompiled: k0.a.onAuthenticationSucceeded(android.hardware.fingerprint.FingerprintManager$AuthenticationResult):void");
    }
}
