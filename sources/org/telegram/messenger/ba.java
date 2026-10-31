package org.telegram.messenger;

import android.os.Bundle;
public final class ba implements com.google.android.gms.common.api.k {
    public final pa f14752a;

    public ba(pa paVar) {
        this.f14752a = paVar;
    }

    @Override
    public final void onConnected(Bundle bundle) {
        nd ndVar = (nd) this.f14752a;
        ndVar.L = true;
        try {
            ((li.k) w0.j()).checkLocationSettings(ndVar.N, new hd(ndVar, 1));
        } catch (Throwable th2) {
            f8.g(th2, true);
        }
    }

    @Override
    public final void onConnectionSuspended(int i10) {
        this.f14752a.getClass();
    }
}
