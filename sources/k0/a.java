package k0;

import android.hardware.fingerprint.FingerprintManager;
import androidx.biometric.v;
import androidx.biometric.x;
import androidx.lifecycle.z;
import java.lang.ref.WeakReference;
import pb.c;
public final class a extends FingerprintManager.AuthenticationCallback {
    public final c f14319a;

    public a(c cVar) {
        this.f14319a = cVar;
    }

    @Override
    public final void onAuthenticationError(int i10, CharSequence charSequence) {
        ((v) ((aa.a) this.f14319a.f45542b).d).a(i10, charSequence);
    }

    @Override
    public final void onAuthenticationFailed() {
        WeakReference weakReference = ((v) ((aa.a) this.f14319a.f45542b).d).f2323a;
        if (weakReference.get() != null && ((x) weakReference.get()).f2334n) {
            x xVar = (x) weakReference.get();
            if (xVar.f2341u == null) {
                xVar.f2341u = new z();
            }
            x.h(xVar.f2341u, Boolean.TRUE);
        }
    }

    @Override
    public final void onAuthenticationHelp(int i10, CharSequence charSequence) {
        WeakReference weakReference = ((v) ((aa.a) this.f14319a.f45542b).d).f2323a;
        if (weakReference.get() != null) {
            x xVar = (x) weakReference.get();
            if (xVar.f2340t == null) {
                xVar.f2340t = new z();
            }
            x.h(xVar.f2340t, charSequence);
        }
    }

    @Override
    public final void onAuthenticationSucceeded(android.hardware.fingerprint.FingerprintManager.AuthenticationResult r4) {
        throw new UnsupportedOperationException("Method not decompiled: k0.a.onAuthenticationSucceeded(android.hardware.fingerprint.FingerprintManager$AuthenticationResult):void");
    }
}
