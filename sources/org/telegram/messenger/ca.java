package org.telegram.messenger;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
public final class ca {
    public final m8.f f23398a;

    public ca(m8.f fVar) {
        this.f23398a = fVar;
    }

    public final ab a() {
        LatLng createFromParcel;
        m8.f fVar = this.f23398a;
        fVar.getClass();
        try {
            v7.i iVar = (v7.i) fVar.f20993a;
            Parcel o12 = iVar.o1(iVar.p1(), 4);
            Parcelable.Creator<LatLng> creator = LatLng.CREATOR;
            int i7 = v7.b.f59422a;
            if (o12.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = creator.createFromParcel(o12);
            }
            LatLng latLng = createFromParcel;
            o12.recycle();
            return new ab(latLng.f7360a, latLng.f7361b);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void b(ab abVar) {
        LatLng latLng = new LatLng(abVar.f22962a, abVar.f22963b);
        m8.f fVar = this.f23398a;
        fVar.getClass();
        try {
            v7.i iVar = (v7.i) fVar.f20993a;
            Parcel p12 = iVar.p1();
            v7.b.b(p12, latLng);
            iVar.t1(p12, 3);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void c(float f10) {
        m8.f fVar = this.f23398a;
        fVar.getClass();
        try {
            v7.i iVar = (v7.i) fVar.f20993a;
            Parcel p12 = iVar.p1();
            p12.writeFloat(f10);
            iVar.t1(p12, 22);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }
}
