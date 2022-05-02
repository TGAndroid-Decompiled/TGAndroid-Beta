package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.location.LocationListener;

final class zzv extends zzx {
    final LocationListener zza;

    public zzv(zzz zzzVar, GoogleApiClient googleApiClient, LocationListener locationListener) {
        super(googleApiClient);
        this.zza = locationListener;
    }

    @Override
    protected final void doExecute(zzaz zzazVar) throws RemoteException {
        zzazVar.zzF(ListenerHolders.createListenerKey(this.zza, LocationListener.class.getSimpleName()), new zzy(this));
    }
}
