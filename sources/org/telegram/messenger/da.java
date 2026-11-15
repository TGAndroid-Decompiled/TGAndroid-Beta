package org.telegram.messenger;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
public final class da {
    public final m8.f f23061a;

    public da(m8.f fVar) {
        this.f23061a = fVar;
    }

    public final bb a() {
        LatLng createFromParcel;
        m8.f fVar = this.f23061a;
        fVar.getClass();
        try {
            v7.i iVar = (v7.i) fVar.f20539a;
            Parcel o12 = iVar.o1(iVar.p1(), 4);
            Parcelable.Creator<LatLng> creator = LatLng.CREATOR;
            int i7 = v7.b.f58728a;
            if (o12.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = creator.createFromParcel(o12);
            }
            LatLng latLng = createFromParcel;
            o12.recycle();
            return new bb(latLng.f7086a, latLng.f7087b);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void b(bb bbVar) {
        LatLng latLng = new LatLng(bbVar.f22677a, bbVar.f22678b);
        m8.f fVar = this.f23061a;
        fVar.getClass();
        try {
            v7.i iVar = (v7.i) fVar.f20539a;
            Parcel p12 = iVar.p1();
            v7.b.b(p12, latLng);
            iVar.t1(p12, 3);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void c(int i7) {
        float f10 = i7;
        m8.f fVar = this.f23061a;
        fVar.getClass();
        try {
            v7.i iVar = (v7.i) fVar.f20539a;
            Parcel p12 = iVar.p1();
            p12.writeFloat(f10);
            iVar.t1(p12, 22);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }
}
