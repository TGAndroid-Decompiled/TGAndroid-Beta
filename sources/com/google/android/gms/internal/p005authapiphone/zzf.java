package com.google.android.gms.internal.p005authapiphone;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzf extends zza implements zze {
    public zzf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
    }

    @Override
    public final void zza(zzg zzgVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzc.zza(obtainAndWriteInterfaceToken, zzgVar);
        transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
    }
}
