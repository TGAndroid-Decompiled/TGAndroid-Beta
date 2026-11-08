package org.telegram.messenger;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import java.util.HashMap;
public final class fa {
    public wf.b f22390a;
    public HashMap f22391b;
    public HashMap f22392c;

    public final ea a(gf.g gVar) {
        v7.a aVar;
        wf.b bVar = this.f22390a;
        m8.g gVar2 = (m8.g) gVar.f13889b;
        bVar.getClass();
        try {
            q6.m.h(gVar2, "MarkerOptions must not be null.");
            l8.e eVar = (l8.e) bVar.f57654b;
            Parcel p12 = eVar.p1();
            v7.b.b(p12, gVar2);
            Parcel o12 = eVar.o1(p12, 11);
            IBinder readStrongBinder = o12.readStrongBinder();
            int i7 = v7.j.f57249b;
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
            ea eaVar = new ea(fVar);
            this.f22391b.put(fVar, eaVar);
            return eaVar;
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void b(ua uaVar) {
        wf.b bVar = this.f22390a;
        k8.a aVar = ((ca) uaVar).f21792a;
        bVar.getClass();
        try {
            l8.e eVar = (l8.e) bVar.f57654b;
            a7.a aVar2 = aVar.f17230a;
            Parcel p12 = eVar.p1();
            v7.b.c(p12, aVar2);
            eVar.t1(p12, 5);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void c(ua uaVar) {
        wf.b bVar = this.f22390a;
        k8.a aVar = ((ca) uaVar).f21792a;
        bVar.getClass();
        try {
            l8.e eVar = (l8.e) bVar.f57654b;
            a7.a aVar2 = aVar.f17230a;
            Parcel p12 = eVar.p1();
            v7.b.c(p12, aVar2);
            p12.writeInt(500);
            v7.b.c(p12, null);
            eVar.t1(p12, 7);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final fi.y4 d() {
        CameraPosition createFromParcel;
        wf.b bVar = this.f22390a;
        bVar.getClass();
        try {
            l8.e eVar = (l8.e) bVar.f57654b;
            Parcel o12 = eVar.o1(eVar.p1(), 1);
            Parcelable.Creator<CameraPosition> creator = CameraPosition.CREATOR;
            int i7 = v7.b.f57246a;
            if (o12.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = creator.createFromParcel(o12);
            }
            CameraPosition cameraPosition = createFromParcel;
            o12.recycle();
            LatLng latLng = cameraPosition.f7693a;
            return new fi.y4(new cb(latLng.f7696a, latLng.f7697b), cameraPosition.f7694b, 2);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final float e() {
        wf.b bVar = this.f22390a;
        bVar.getClass();
        try {
            l8.e eVar = (l8.e) bVar.f57654b;
            Parcel o12 = eVar.o1(eVar.p1(), 2);
            float readFloat = o12.readFloat();
            o12.recycle();
            return readFloat;
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final float f() {
        wf.b bVar = this.f22390a;
        bVar.getClass();
        try {
            l8.e eVar = (l8.e) bVar.f57654b;
            Parcel o12 = eVar.o1(eVar.p1(), 3);
            float readFloat = o12.readFloat();
            o12.recycle();
            return readFloat;
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final h9.f1 g() {
        a8.a aVar;
        wf.b bVar = this.f22390a;
        bVar.getClass();
        try {
            if (((h9.f1) bVar.f57655c) == null) {
                l8.e eVar = (l8.e) bVar.f57654b;
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
                bVar.f57655c = new h9.f1(aVar, 5);
            }
            h9.f1 f1Var = (h9.f1) bVar.f57655c;
            h9.f1 f1Var2 = new h9.f1(23, false);
            f1Var2.f14323b = f1Var;
            return f1Var2;
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void h(ua uaVar) {
        wf.b bVar = this.f22390a;
        k8.a aVar = ((ca) uaVar).f21792a;
        bVar.getClass();
        try {
            l8.e eVar = (l8.e) bVar.f57654b;
            a7.a aVar2 = aVar.f17230a;
            Parcel p12 = eVar.p1();
            v7.b.c(p12, aVar2);
            eVar.t1(p12, 4);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void i(ya yaVar) {
        m8.e eVar;
        wf.b bVar = this.f22390a;
        if (yaVar == null) {
            eVar = null;
        } else {
            eVar = ((ga) yaVar).f22634a;
        }
        bVar.getClass();
        try {
            l8.e eVar2 = (l8.e) bVar.f57654b;
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
        wf.b bVar = this.f22390a;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    return;
                }
                bVar.i0(4);
                return;
            }
            bVar.i0(2);
            return;
        }
        bVar.i0(1);
    }

    public final void k(boolean z9) {
        wf.b bVar = this.f22390a;
        bVar.getClass();
        try {
            l8.e eVar = (l8.e) bVar.f57654b;
            Parcel p12 = eVar.p1();
            int i7 = v7.b.f57246a;
            p12.writeInt(z9 ? 1 : 0);
            eVar.t1(p12, 22);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void l(db dbVar) {
        wf.b bVar = this.f22390a;
        j1 j1Var = new j1(dbVar, 8);
        l8.e eVar = (l8.e) bVar.f57654b;
        try {
            k8.c cVar = new k8.c(j1Var, (byte) 0);
            Parcel p12 = eVar.p1();
            v7.b.c(p12, cVar);
            eVar.t1(p12, 96);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void m(eb ebVar) {
        wf.b bVar = this.f22390a;
        o oVar = new o(3, this, ebVar);
        l8.e eVar = (l8.e) bVar.f57654b;
        try {
            k8.c cVar = new k8.c(oVar);
            Parcel p12 = eVar.p1();
            v7.b.c(p12, cVar);
            eVar.t1(p12, 30);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void n(q0.a aVar) {
        wf.b bVar = this.f22390a;
        y9 y9Var = new y9(aVar, 2);
        l8.e eVar = (l8.e) bVar.f57654b;
        try {
            k8.c cVar = new k8.c(y9Var);
            Parcel p12 = eVar.p1();
            v7.b.c(p12, cVar);
            eVar.t1(p12, 36);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void o(int i7, int i10, int i11, int i12) {
        wf.b bVar = this.f22390a;
        bVar.getClass();
        try {
            l8.e eVar = (l8.e) bVar.f57654b;
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
