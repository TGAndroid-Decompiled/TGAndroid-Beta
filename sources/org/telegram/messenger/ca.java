package org.telegram.messenger;

import android.os.Bundle;
public final class ca implements com.google.android.gms.common.api.k {
    public final qa f15089a;

    public ca(qa qaVar) {
        this.f15089a = qaVar;
    }

    @Override
    public final void onConnected(Bundle bundle) {
        od odVar = (od) this.f15089a;
        odVar.L = true;
        try {
            ((li.k) w0.j()).checkLocationSettings(odVar.N, new id(odVar, 1));
        } catch (Throwable th2) {
            f8.g(th2, true);
        }
    }

    @Override
    public final void onConnectionSuspended(int i10) {
        this.f15089a.getClass();
    }
}
