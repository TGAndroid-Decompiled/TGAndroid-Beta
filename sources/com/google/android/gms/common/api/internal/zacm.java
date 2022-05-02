package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;

final class zacm implements Runnable {
    private final Result zaa;
    private final zacn zab;

    public zacm(zacn zacnVar, Result result) {
        this.zab = zacnVar;
        this.zaa = result;
    }

    @Override
    public final void run() {
        WeakReference weakReference;
        ResultTransform resultTransform;
        zacp unused;
        zacp unused2;
        zacp unused3;
        zacp unused4;
        try {
            try {
                BasePendingResult.zaa.set(Boolean.TRUE);
                resultTransform = this.zab.zaa;
                ((ResultTransform) Preconditions.checkNotNull(resultTransform)).onSuccess(this.zaa);
                unused = this.zab.zah;
                unused2 = this.zab.zah;
                throw null;
            } catch (RuntimeException unused5) {
                unused3 = this.zab.zah;
                unused4 = this.zab.zah;
                throw null;
            }
        } catch (Throwable th) {
            BasePendingResult.zaa.set(Boolean.FALSE);
            zacn zacnVar = this.zab;
            zacn.zaa(this.zaa);
            weakReference = this.zab.zag;
            GoogleApiClient googleApiClient = (GoogleApiClient) weakReference.get();
            if (googleApiClient != null) {
                googleApiClient.zab(this.zab);
            }
            throw th;
        }
    }
}
