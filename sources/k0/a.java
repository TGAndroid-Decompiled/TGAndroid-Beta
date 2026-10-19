package k0;

import android.hardware.fingerprint.FingerprintManager;
import androidx.biometric.e;
import androidx.biometric.w;
import androidx.biometric.y;
import androidx.lifecycle.z;
import java.lang.ref.WeakReference;
import qb.c;
public final class a extends FingerprintManager.AuthenticationCallback {
    public final c f14564a;

    public a(c cVar) {
        this.f14564a = cVar;
    }

    @Override
    public final void onAuthenticationError(int i10, CharSequence charSequence) {
        ((w) ((e) this.f14564a.f44425b).d).a(i10, charSequence);
    }

    @Override
    public final void onAuthenticationFailed() {
        WeakReference weakReference = ((w) ((e) this.f14564a.f44425b).d).f2841a;
        if (weakReference.get() != null && ((y) weakReference.get()).f2851n) {
            y yVar = (y) weakReference.get();
            if (yVar.f2858u == null) {
                yVar.f2858u = new z();
            }
            y.h(yVar.f2858u, Boolean.TRUE);
        }
    }

    @Override
    public final void onAuthenticationHelp(int i10, CharSequence charSequence) {
        WeakReference weakReference = ((w) ((e) this.f14564a.f44425b).d).f2841a;
        if (weakReference.get() != null) {
            y yVar = (y) weakReference.get();
            if (yVar.f2857t == null) {
                yVar.f2857t = new z();
            }
            y.h(yVar.f2857t, charSequence);
        }
    }

    @Override
    public final void onAuthenticationSucceeded(android.hardware.fingerprint.FingerprintManager.AuthenticationResult r4) {
        throw new UnsupportedOperationException("Method not decompiled: k0.a.onAuthenticationSucceeded(android.hardware.fingerprint.FingerprintManager$AuthenticationResult):void");
    }
}
