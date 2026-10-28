package k0;

import a8.h0;
import android.hardware.fingerprint.FingerprintManager;
import androidx.biometric.v;
import androidx.biometric.x;
import androidx.lifecycle.z;
import java.lang.ref.WeakReference;
import rb.c;
public final class a extends FingerprintManager.AuthenticationCallback {
    public final c f16041a;

    public a(c cVar) {
        this.f16041a = cVar;
    }

    @Override
    public final void onAuthenticationError(int i10, CharSequence charSequence) {
        ((v) ((h0) this.f16041a.f47358b).d).a(i10, charSequence);
    }

    @Override
    public final void onAuthenticationFailed() {
        WeakReference weakReference = ((v) ((h0) this.f16041a.f47358b).d).f2289a;
        if (weakReference.get() != null && ((x) weakReference.get()).f2299n) {
            x xVar = (x) weakReference.get();
            if (xVar.f2306u == null) {
                xVar.f2306u = new z();
            }
            x.h(xVar.f2306u, Boolean.TRUE);
        }
    }

    @Override
    public final void onAuthenticationHelp(int i10, CharSequence charSequence) {
        WeakReference weakReference = ((v) ((h0) this.f16041a.f47358b).d).f2289a;
        if (weakReference.get() != null) {
            x xVar = (x) weakReference.get();
            if (xVar.f2305t == null) {
                xVar.f2305t = new z();
            }
            x.h(xVar.f2305t, charSequence);
        }
    }

    @Override
    public final void onAuthenticationSucceeded(android.hardware.fingerprint.FingerprintManager.AuthenticationResult r4) {
        throw new UnsupportedOperationException("Method not decompiled: k0.a.onAuthenticationSucceeded(android.hardware.fingerprint.FingerprintManager$AuthenticationResult):void");
    }
}
