package org.telegram.messenger;

import android.os.Bundle;
public final class aa implements com.google.android.gms.common.api.k {
    public final pa f21409a;

    public aa(pa paVar) {
        this.f21409a = paVar;
    }

    @Override
    public final void onConnected(Bundle bundle) {
        sd sdVar = (sd) this.f21409a;
        sdVar.L = true;
        try {
            ((h6.m) t0.j()).checkLocationSettings(sdVar.N, new ld(sdVar, 1));
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }

    @Override
    public final void onConnectionSuspended(int i7) {
        this.f21409a.getClass();
    }
}
