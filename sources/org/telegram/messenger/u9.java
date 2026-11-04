package org.telegram.messenger;

import android.os.Bundle;
public final class u9 implements com.google.android.gms.common.api.k {
    public final ia f25665a;

    public u9(ia iaVar) {
        this.f25665a = iaVar;
    }

    @Override
    public final void onConnected(Bundle bundle) {
        ld ldVar = (ld) this.f25665a;
        ldVar.M = true;
        try {
            ((k4.j) t0.j()).checkLocationSettings(ldVar.O, new fd(ldVar, 1));
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }

    @Override
    public final void onConnectionSuspended(int i3) {
        this.f25665a.getClass();
    }
}
