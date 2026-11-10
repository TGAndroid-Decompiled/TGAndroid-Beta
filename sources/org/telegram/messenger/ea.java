package org.telegram.messenger;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
public final class ea {
    public final m8.f f22204a;

    public ea(m8.f fVar) {
        this.f22204a = fVar;
    }

    public final cb a() {
        LatLng createFromParcel;
        m8.f fVar = this.f22204a;
        fVar.getClass();
        try {
            v7.i iVar = (v7.i) fVar.f19947a;
            Parcel o12 = iVar.o1(iVar.p1(), 4);
            Parcelable.Creator<LatLng> creator = LatLng.CREATOR;
            int i7 = v7.b.f57255a;
            if (o12.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = creator.createFromParcel(o12);
            }
            LatLng latLng = createFromParcel;
            o12.recycle();
            return new cb(latLng.f7699a, latLng.f7700b);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void b(cb cbVar) {
        LatLng latLng = new LatLng(cbVar.f21837a, cbVar.f21838b);
        m8.f fVar = this.f22204a;
        fVar.getClass();
        try {
            v7.i iVar = (v7.i) fVar.f19947a;
            Parcel p12 = iVar.p1();
            v7.b.b(p12, latLng);
            iVar.t1(p12, 3);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void c(int i7) {
        float f10 = i7;
        m8.f fVar = this.f22204a;
        fVar.getClass();
        try {
            v7.i iVar = (v7.i) fVar.f19947a;
            Parcel p12 = iVar.p1();
            p12.writeFloat(f10);
            iVar.t1(p12, 22);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }
}
