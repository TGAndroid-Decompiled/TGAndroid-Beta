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
    public jb.m f23632a;
    public HashMap f23633b;
    public HashMap f23634c;

    public final ca a(j6.r rVar) {
        v7.a aVar;
        jb.m mVar = this.f23632a;
        m8.g gVar = (m8.g) rVar.f17372b;
        mVar.getClass();
        try {
            q6.m.i(gVar, "MarkerOptions must not be null.");
            l8.e eVar = (l8.e) mVar.f17464b;
            Parcel p12 = eVar.p1();
            v7.b.b(p12, gVar);
            Parcel o12 = eVar.o1(p12, 11);
            IBinder readStrongBinder = o12.readStrongBinder();
            int i7 = v7.j.f59425b;
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
            this.f23633b.put(fVar, caVar);
            return caVar;
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void b(sa saVar) {
        jb.m mVar = this.f23632a;
        h6.o oVar = ((aa) saVar).f22961a;
        mVar.getClass();
        try {
            l8.e eVar = (l8.e) mVar.f17464b;
            Parcel p12 = eVar.p1();
            v7.b.c(p12, (a7.a) oVar.f13936b);
            eVar.t1(p12, 5);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void c(sa saVar) {
        jb.m mVar = this.f23632a;
        h6.o oVar = ((aa) saVar).f22961a;
        mVar.getClass();
        try {
            l8.e eVar = (l8.e) mVar.f17464b;
            Parcel p12 = eVar.p1();
            v7.b.c(p12, (a7.a) oVar.f13936b);
            p12.writeInt(500);
            v7.b.c(p12, null);
            eVar.t1(p12, 7);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final hi.g5 d() {
        CameraPosition createFromParcel;
        jb.m mVar = this.f23632a;
        mVar.getClass();
        try {
            l8.e eVar = (l8.e) mVar.f17464b;
            Parcel o12 = eVar.o1(eVar.p1(), 1);
            Parcelable.Creator<CameraPosition> creator = CameraPosition.CREATOR;
            int i7 = v7.b.f59422a;
            if (o12.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = creator.createFromParcel(o12);
            }
            CameraPosition cameraPosition = createFromParcel;
            o12.recycle();
            LatLng latLng = cameraPosition.f7357a;
            return new hi.g5(new ab(latLng.f7360a, latLng.f7361b), cameraPosition.f7358b, 2);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final float e() {
        jb.m mVar = this.f23632a;
        mVar.getClass();
        try {
            l8.e eVar = (l8.e) mVar.f17464b;
            Parcel o12 = eVar.o1(eVar.p1(), 2);
            float readFloat = o12.readFloat();
            o12.recycle();
            return readFloat;
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final float f() {
        jb.m mVar = this.f23632a;
        mVar.getClass();
        try {
            l8.e eVar = (l8.e) mVar.f17464b;
            Parcel o12 = eVar.o1(eVar.p1(), 3);
            float readFloat = o12.readFloat();
            o12.recycle();
            return readFloat;
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final h6.o g() {
        a8.a aVar;
        jb.m mVar = this.f23632a;
        mVar.getClass();
        try {
            if (((hi.u0) mVar.f17465c) == null) {
                l8.e eVar = (l8.e) mVar.f17464b;
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
                mVar.f17465c = new hi.u0(aVar, 9);
            }
            hi.u0 u0Var = (hi.u0) mVar.f17465c;
            h6.o oVar = new h6.o(26, false);
            oVar.f13936b = u0Var;
            return oVar;
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void h(sa saVar) {
        jb.m mVar = this.f23632a;
        h6.o oVar = ((aa) saVar).f22961a;
        mVar.getClass();
        try {
            l8.e eVar = (l8.e) mVar.f17464b;
            Parcel p12 = eVar.p1();
            v7.b.c(p12, (a7.a) oVar.f13936b);
            eVar.t1(p12, 4);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void i(wa waVar) {
        m8.e eVar;
        jb.m mVar = this.f23632a;
        if (waVar == null) {
            eVar = null;
        } else {
            eVar = ((ea) waVar).f23780a;
        }
        mVar.getClass();
        try {
            l8.e eVar2 = (l8.e) mVar.f17464b;
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
        jb.m mVar = this.f23632a;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    return;
                }
                mVar.Y0(4);
                return;
            }
            mVar.Y0(2);
            return;
        }
        mVar.Y0(1);
    }

    public final void k(boolean z10) {
        jb.m mVar = this.f23632a;
        mVar.getClass();
        try {
            l8.e eVar = (l8.e) mVar.f17464b;
            Parcel p12 = eVar.p1();
            int i7 = v7.b.f59422a;
            p12.writeInt(z10 ? 1 : 0);
            eVar.t1(p12, 22);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void l(bb bbVar) {
        jb.m mVar = this.f23632a;
        j1 j1Var = new j1(bbVar, 9);
        l8.e eVar = (l8.e) mVar.f17464b;
        try {
            k8.b bVar = new k8.b(j1Var, (char) 0);
            Parcel p12 = eVar.p1();
            v7.b.c(p12, bVar);
            eVar.t1(p12, 96);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void m(cb cbVar) {
        jb.m mVar = this.f23632a;
        o oVar = new o(3, this, cbVar);
        l8.e eVar = (l8.e) mVar.f17464b;
        try {
            k8.b bVar = new k8.b(oVar);
            Parcel p12 = eVar.p1();
            v7.b.c(p12, bVar);
            eVar.t1(p12, 30);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void n(int i7, int i10, int i11, int i12) {
        jb.m mVar = this.f23632a;
        mVar.getClass();
        try {
            l8.e eVar = (l8.e) mVar.f17464b;
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
