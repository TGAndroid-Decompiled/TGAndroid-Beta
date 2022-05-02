package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.DeferredLifecycleHelper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.OnDelegateCreatedListener;
import com.google.android.gms.maps.internal.IMapViewDelegate;
import com.google.android.gms.maps.internal.zzca;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;

final class zzah extends DeferredLifecycleHelper<zzag> {
    protected OnDelegateCreatedListener<zzag> zza;
    private final ViewGroup zzb;
    private final Context zzc;
    private final GoogleMapOptions zzd;
    private final List<OnMapReadyCallback> zze = new ArrayList();

    public zzah(ViewGroup viewGroup, Context context, GoogleMapOptions googleMapOptions) {
        this.zzb = viewGroup;
        this.zzc = context;
        this.zzd = googleMapOptions;
    }

    @Override
    protected final void createDelegate(OnDelegateCreatedListener<zzag> onDelegateCreatedListener) {
        this.zza = onDelegateCreatedListener;
        zza();
    }

    public final void zza() {
        if (this.zza != null && getDelegate() == null) {
            try {
                MapsInitializer.initialize(this.zzc);
                IMapViewDelegate zze = zzca.zza(this.zzc).zze(ObjectWrapper.wrap(this.zzc), this.zzd);
                if (zze != null) {
                    this.zza.onDelegateCreated(new zzag(this.zzb, zze));
                    for (OnMapReadyCallback onMapReadyCallback : this.zze) {
                        getDelegate().getMapAsync(onMapReadyCallback);
                    }
                    this.zze.clear();
                }
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            } catch (GooglePlayServicesNotAvailableException unused) {
            }
        }
    }

    public final void zzb(OnMapReadyCallback onMapReadyCallback) {
        if (getDelegate() != null) {
            getDelegate().getMapAsync(onMapReadyCallback);
        } else {
            this.zze.add(onMapReadyCallback);
        }
    }
}
