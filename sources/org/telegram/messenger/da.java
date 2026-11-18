package org.telegram.messenger;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import java.util.HashMap;
public final class da {
    public k8.a f23503a;
    public HashMap f23504b;
    public HashMap f23505c;

    public final ca a(h9.g1 g1Var) {
        v7.a aVar;
        k8.a aVar2 = this.f23503a;
        m8.g gVar = (m8.g) g1Var.f13998b;
        aVar2.getClass();
        try {
            q6.m.i(gVar, "MarkerOptions must not be null.");
            l8.e eVar = (l8.e) aVar2.f18180b;
            Parcel p12 = eVar.p1();
            v7.b.b(p12, gVar);
            Parcel o12 = eVar.o1(p12, 11);
            IBinder readStrongBinder = o12.readStrongBinder();
            int i7 = v7.j.f59301b;
            m8.f fVar = null;
            if (readStrongBinder == null) {
                aVar = 0;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                if (queryLocalInterface instanceof v7.a) {
                    aVar = (v7.a) queryLocalInterface;
                } else {
                    aVar = new a8.a(readStrongBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate", 11);
                }
            }
            o12.recycle();
            if (aVar != 0) {
                fVar = new m8.f(aVar);
            }
            ca caVar = new ca(fVar);
            this.f23504b.put(fVar, caVar);
            return caVar;
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void b(sa saVar) {
        k8.a aVar = this.f23503a;
        hi.w4 w4Var = ((aa) saVar).f22850a;
        aVar.getClass();
        try {
            l8.e eVar = (l8.e) aVar.f18180b;
            Parcel p12 = eVar.p1();
            v7.b.c(p12, (a7.a) w4Var.f15642b);
            eVar.t1(p12, 5);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void c(sa saVar) {
        k8.a aVar = this.f23503a;
        hi.w4 w4Var = ((aa) saVar).f22850a;
        aVar.getClass();
        try {
            l8.e eVar = (l8.e) aVar.f18180b;
            Parcel p12 = eVar.p1();
            v7.b.c(p12, (a7.a) w4Var.f15642b);
            p12.writeInt(500);
            v7.b.c(p12, null);
            eVar.t1(p12, 7);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final hi.u4 d() {
        CameraPosition createFromParcel;
        k8.a aVar = this.f23503a;
        aVar.getClass();
        try {
            l8.e eVar = (l8.e) aVar.f18180b;
            Parcel o12 = eVar.o1(eVar.p1(), 1);
            Parcelable.Creator<CameraPosition> creator = CameraPosition.CREATOR;
            int i7 = v7.b.f59298a;
            if (o12.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = creator.createFromParcel(o12);
            }
            CameraPosition cameraPosition = createFromParcel;
            o12.recycle();
            LatLng latLng = cameraPosition.f7363a;
            return new hi.u4(new ab(latLng.f7366a, latLng.f7367b), cameraPosition.f7364b, 2);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final float e() {
        k8.a aVar = this.f23503a;
        aVar.getClass();
        try {
            l8.e eVar = (l8.e) aVar.f18180b;
            Parcel o12 = eVar.o1(eVar.p1(), 2);
            float readFloat = o12.readFloat();
            o12.recycle();
            return readFloat;
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final float f() {
        k8.a aVar = this.f23503a;
        aVar.getClass();
        try {
            l8.e eVar = (l8.e) aVar.f18180b;
            Parcel o12 = eVar.o1(eVar.p1(), 3);
            float readFloat = o12.readFloat();
            o12.recycle();
            return readFloat;
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final hi.w4 g() {
        a8.a aVar;
        k8.a aVar2 = this.f23503a;
        aVar2.getClass();
        try {
            if (((hi.u5) aVar2.f18181c) == null) {
                l8.e eVar = (l8.e) aVar2.f18180b;
                Parcel o12 = eVar.o1(eVar.p1(), 25);
                IBinder readStrongBinder = o12.readStrongBinder();
                if (readStrongBinder == null) {
                    aVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    if (queryLocalInterface instanceof l8.b) {
                        aVar = (l8.b) queryLocalInterface;
                    } else {
                        aVar = new a8.a(readStrongBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate", 11);
                    }
                }
                o12.recycle();
                aVar2.f18181c = new hi.u5(aVar, 8);
            }
            hi.u5 u5Var = (hi.u5) aVar2.f18181c;
            hi.w4 w4Var = new hi.w4(24, false);
            w4Var.f15642b = u5Var;
            return w4Var;
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void h(sa saVar) {
        k8.a aVar = this.f23503a;
        hi.w4 w4Var = ((aa) saVar).f22850a;
        aVar.getClass();
        try {
            l8.e eVar = (l8.e) aVar.f18180b;
            Parcel p12 = eVar.p1();
            v7.b.c(p12, (a7.a) w4Var.f15642b);
            eVar.t1(p12, 4);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void i(wa waVar) {
        m8.e eVar;
        k8.a aVar = this.f23503a;
        if (waVar == null) {
            eVar = null;
        } else {
            eVar = ((ea) waVar).f23675a;
        }
        aVar.getClass();
        try {
            l8.e eVar2 = (l8.e) aVar.f18180b;
            Parcel p12 = eVar2.p1();
            v7.b.b(p12, eVar);
            Parcel o12 = eVar2.o1(p12, 91);
            o12.readInt();
            o12.recycle();
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void j(int i7) {
        k8.a aVar = this.f23503a;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    return;
                }
                aVar.d1(4);
                return;
            }
            aVar.d1(2);
            return;
        }
        aVar.d1(1);
    }

    public final void k(boolean z10) {
        k8.a aVar = this.f23503a;
        aVar.getClass();
        try {
            l8.e eVar = (l8.e) aVar.f18180b;
            Parcel p12 = eVar.p1();
            int i7 = v7.b.f59298a;
            p12.writeInt(z10 ? 1 : 0);
            eVar.t1(p12, 22);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void l(bb bbVar) {
        k8.a aVar = this.f23503a;
        j1 j1Var = new j1(bbVar, 9);
        l8.e eVar = (l8.e) aVar.f18180b;
        try {
            k8.c cVar = new k8.c(j1Var, (char) 0);
            Parcel p12 = eVar.p1();
            v7.b.c(p12, cVar);
            eVar.t1(p12, 96);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void m(cb cbVar) {
        k8.a aVar = this.f23503a;
        o oVar = new o(3, this, cbVar);
        l8.e eVar = (l8.e) aVar.f18180b;
        try {
            k8.c cVar = new k8.c(oVar);
            Parcel p12 = eVar.p1();
            v7.b.c(p12, cVar);
            eVar.t1(p12, 30);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void n(int i7, int i10, int i11, int i12) {
        k8.a aVar = this.f23503a;
        aVar.getClass();
        try {
            l8.e eVar = (l8.e) aVar.f18180b;
            Parcel p12 = eVar.p1();
            p12.writeInt(i7);
            p12.writeInt(i10);
            p12.writeInt(i11);
            p12.writeInt(i12);
            eVar.t1(p12, 39);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }
}
