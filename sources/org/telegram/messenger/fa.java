package org.telegram.messenger;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
public final class fa {
    public final j8.e f15533a;
    public final ga f15534b;

    public fa(ga gaVar, j8.e eVar) {
        this.f15534b = gaVar;
        this.f15533a = eVar;
    }

    public final cb a() {
        LatLng createFromParcel;
        j8.e eVar = this.f15533a;
        eVar.getClass();
        try {
            s7.i iVar = (s7.i) eVar.f9715a;
            Parcel O0 = iVar.O0(iVar.P0(), 4);
            Parcelable.Creator<LatLng> creator = LatLng.CREATOR;
            int i10 = s7.b.f48088a;
            if (O0.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = creator.createFromParcel(O0);
            }
            LatLng latLng = createFromParcel;
            O0.recycle();
            return new cb(latLng.f5416a, latLng.f5417b);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final Object b() {
        j8.e eVar = this.f15533a;
        eVar.getClass();
        try {
            s7.i iVar = (s7.i) eVar.f9715a;
            Parcel O0 = iVar.O0(iVar.P0(), 30);
            x6.a M0 = x6.b.M0(O0.readStrongBinder());
            O0.recycle();
            return x6.b.N0(M0);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final void c() {
        j8.e eVar = this.f15533a;
        eVar.getClass();
        try {
            s7.i iVar = (s7.i) eVar.f9715a;
            iVar.T0(iVar.P0(), 1);
            this.f15534b.f15690b.remove(eVar);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final void d(cb cbVar) {
        LatLng latLng = new LatLng(cbVar.f14971a, cbVar.f14972b);
        j8.e eVar = this.f15533a;
        eVar.getClass();
        try {
            s7.i iVar = (s7.i) eVar.f9715a;
            Parcel P0 = iVar.P0();
            s7.b.b(P0, latLng);
            iVar.T0(P0, 3);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final void e(int i10) {
        float f7 = i10;
        j8.e eVar = this.f15533a;
        eVar.getClass();
        try {
            s7.i iVar = (s7.i) eVar.f9715a;
            Parcel P0 = iVar.P0();
            P0.writeFloat(f7);
            iVar.T0(P0, 22);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final void f(Object obj) {
        j8.e eVar = this.f15533a;
        eVar.getClass();
        try {
            s7.a aVar = eVar.f9715a;
            x6.b bVar = new x6.b(obj);
            s7.i iVar = (s7.i) aVar;
            Parcel P0 = iVar.P0();
            s7.b.c(P0, bVar);
            iVar.T0(P0, 29);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
