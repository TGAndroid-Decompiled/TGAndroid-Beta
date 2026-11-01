package org.telegram.messenger;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
public final class ga {
    public final j8.e f15874a;
    public final ha f15875b;

    public ga(ha haVar, j8.e eVar) {
        this.f15875b = haVar;
        this.f15874a = eVar;
    }

    public final db a() {
        LatLng createFromParcel;
        j8.e eVar = this.f15874a;
        eVar.getClass();
        try {
            s7.i iVar = (s7.i) eVar.f9716a;
            Parcel O0 = iVar.O0(iVar.P0(), 4);
            Parcelable.Creator<LatLng> creator = LatLng.CREATOR;
            int i10 = s7.b.f48099a;
            if (O0.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = creator.createFromParcel(O0);
            }
            LatLng latLng = createFromParcel;
            O0.recycle();
            return new db(latLng.f5416a, latLng.f5417b);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final Object b() {
        j8.e eVar = this.f15874a;
        eVar.getClass();
        try {
            s7.i iVar = (s7.i) eVar.f9716a;
            Parcel O0 = iVar.O0(iVar.P0(), 30);
            x6.a M0 = x6.b.M0(O0.readStrongBinder());
            O0.recycle();
            return x6.b.N0(M0);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final void c() {
        j8.e eVar = this.f15874a;
        eVar.getClass();
        try {
            s7.i iVar = (s7.i) eVar.f9716a;
            iVar.T0(iVar.P0(), 1);
            this.f15875b.f16039b.remove(eVar);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final void d(db dbVar) {
        LatLng latLng = new LatLng(dbVar.f15333a, dbVar.f15334b);
        j8.e eVar = this.f15874a;
        eVar.getClass();
        try {
            s7.i iVar = (s7.i) eVar.f9716a;
            Parcel P0 = iVar.P0();
            s7.b.b(P0, latLng);
            iVar.T0(P0, 3);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final void e(int i10) {
        float f7 = i10;
        j8.e eVar = this.f15874a;
        eVar.getClass();
        try {
            s7.i iVar = (s7.i) eVar.f9716a;
            Parcel P0 = iVar.P0();
            P0.writeFloat(f7);
            iVar.T0(P0, 22);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final void f(Object obj) {
        j8.e eVar = this.f15874a;
        eVar.getClass();
        try {
            s7.a aVar = eVar.f9716a;
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
