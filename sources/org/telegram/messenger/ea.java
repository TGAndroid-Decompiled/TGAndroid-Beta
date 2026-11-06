package org.telegram.messenger;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
public final class ea {
    public final m8.f f22169a;

    public ea(m8.f fVar) {
        this.f22169a = fVar;
    }

    public final cb a() {
        LatLng createFromParcel;
        m8.f fVar = this.f22169a;
        fVar.getClass();
        try {
            v7.i iVar = (v7.i) fVar.f19939a;
            Parcel O0 = iVar.O0(iVar.P0(), 4);
            Parcelable.Creator<LatLng> creator = LatLng.CREATOR;
            int i7 = v7.b.f57155a;
            if (O0.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = creator.createFromParcel(O0);
            }
            LatLng latLng = createFromParcel;
            O0.recycle();
            return new cb(latLng.f7696a, latLng.f7697b);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void b(cb cbVar) {
        LatLng latLng = new LatLng(cbVar.f21791a, cbVar.f21792b);
        m8.f fVar = this.f22169a;
        fVar.getClass();
        try {
            v7.i iVar = (v7.i) fVar.f19939a;
            Parcel P0 = iVar.P0();
            v7.b.b(P0, latLng);
            iVar.T0(P0, 3);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void c(int i7) {
        float f10 = i7;
        m8.f fVar = this.f22169a;
        fVar.getClass();
        try {
            v7.i iVar = (v7.i) fVar.f19939a;
            Parcel P0 = iVar.P0();
            P0.writeFloat(f10);
            iVar.T0(P0, 22);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }
}
