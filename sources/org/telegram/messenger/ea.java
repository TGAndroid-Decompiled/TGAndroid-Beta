package org.telegram.messenger;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import java.util.HashMap;
public final class ea {
    public k8.a f23281a;
    public HashMap f23282b;
    public HashMap f23283c;

    public final da a(hi.l0 l0Var) {
        v7.a aVar;
        k8.a aVar2 = this.f23281a;
        m8.g gVar = (m8.g) l0Var.f14544b;
        aVar2.getClass();
        try {
            q6.m.h(gVar, "MarkerOptions must not be null.");
            l8.e eVar = (l8.e) aVar2.f17788b;
            Parcel p12 = eVar.p1();
            v7.b.b(p12, gVar);
            Parcel o12 = eVar.o1(p12, 11);
            IBinder readStrongBinder = o12.readStrongBinder();
            int i7 = v7.j.f58731b;
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
            da daVar = new da(fVar);
            this.f23282b.put(fVar, daVar);
            return daVar;
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void b(ta taVar) {
        k8.a aVar = this.f23281a;
        gc.b bVar = ((ba) taVar).f22676a;
        aVar.getClass();
        try {
            l8.e eVar = (l8.e) aVar.f17788b;
            Parcel p12 = eVar.p1();
            v7.b.c(p12, (a7.a) bVar.f13134b);
            eVar.t1(p12, 5);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void c(ta taVar) {
        k8.a aVar = this.f23281a;
        gc.b bVar = ((ba) taVar).f22676a;
        aVar.getClass();
        try {
            l8.e eVar = (l8.e) aVar.f17788b;
            Parcel p12 = eVar.p1();
            v7.b.c(p12, (a7.a) bVar.f13134b);
            p12.writeInt(500);
            v7.b.c(p12, null);
            eVar.t1(p12, 7);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final hi.w4 d() {
        CameraPosition createFromParcel;
        k8.a aVar = this.f23281a;
        aVar.getClass();
        try {
            l8.e eVar = (l8.e) aVar.f17788b;
            Parcel o12 = eVar.o1(eVar.p1(), 1);
            Parcelable.Creator<CameraPosition> creator = CameraPosition.CREATOR;
            int i7 = v7.b.f58728a;
            if (o12.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = creator.createFromParcel(o12);
            }
            CameraPosition cameraPosition = createFromParcel;
            o12.recycle();
            LatLng latLng = cameraPosition.f7080a;
            return new hi.w4(new bb(latLng.f7083a, latLng.f7084b), cameraPosition.f7081b, 2);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final float e() {
        k8.a aVar = this.f23281a;
        aVar.getClass();
        try {
            l8.e eVar = (l8.e) aVar.f17788b;
            Parcel o12 = eVar.o1(eVar.p1(), 2);
            float readFloat = o12.readFloat();
            o12.recycle();
            return readFloat;
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final float f() {
        k8.a aVar = this.f23281a;
        aVar.getClass();
        try {
            l8.e eVar = (l8.e) aVar.f17788b;
            Parcel o12 = eVar.o1(eVar.p1(), 3);
            float readFloat = o12.readFloat();
            o12.recycle();
            return readFloat;
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final gc.b g() {
        a8.a aVar;
        k8.a aVar2 = this.f23281a;
        aVar2.getClass();
        try {
            if (((ia.d) aVar2.f17789c) == null) {
                l8.e eVar = (l8.e) aVar2.f17788b;
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
                aVar2.f17789c = new ia.d(aVar, 5);
            }
            ia.d dVar = (ia.d) aVar2.f17789c;
            gc.b bVar = new gc.b(29, false);
            bVar.f13134b = dVar;
            return bVar;
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void h(ta taVar) {
        k8.a aVar = this.f23281a;
        gc.b bVar = ((ba) taVar).f22676a;
        aVar.getClass();
        try {
            l8.e eVar = (l8.e) aVar.f17788b;
            Parcel p12 = eVar.p1();
            v7.b.c(p12, (a7.a) bVar.f13134b);
            eVar.t1(p12, 4);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void i(xa xaVar) {
        m8.e eVar;
        k8.a aVar = this.f23281a;
        if (xaVar == null) {
            eVar = null;
        } else {
            eVar = ((fa) xaVar).f23459a;
        }
        aVar.getClass();
        try {
            l8.e eVar2 = (l8.e) aVar.f17788b;
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
        k8.a aVar = this.f23281a;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    return;
                }
                aVar.e1(4);
                return;
            }
            aVar.e1(2);
            return;
        }
        aVar.e1(1);
    }

    public final void k(boolean z10) {
        k8.a aVar = this.f23281a;
        aVar.getClass();
        try {
            l8.e eVar = (l8.e) aVar.f17788b;
            Parcel p12 = eVar.p1();
            int i7 = v7.b.f58728a;
            p12.writeInt(z10 ? 1 : 0);
            eVar.t1(p12, 22);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void l(cb cbVar) {
        k8.a aVar = this.f23281a;
        j1 j1Var = new j1(cbVar, 8);
        l8.e eVar = (l8.e) aVar.f17788b;
        try {
            k8.c cVar = new k8.c(j1Var, (byte) 0);
            Parcel p12 = eVar.p1();
            v7.b.c(p12, cVar);
            eVar.t1(p12, 96);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void m(db dbVar) {
        k8.a aVar = this.f23281a;
        o oVar = new o(3, this, dbVar);
        l8.e eVar = (l8.e) aVar.f17788b;
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
        k8.a aVar2 = this.f23281a;
        x9 x9Var = new x9(aVar, 2);
        l8.e eVar = (l8.e) aVar2.f17788b;
        try {
            k8.c cVar = new k8.c(x9Var);
            Parcel p12 = eVar.p1();
            v7.b.c(p12, cVar);
            eVar.t1(p12, 36);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void o(int i7, int i10, int i11, int i12) {
        k8.a aVar = this.f23281a;
        aVar.getClass();
        try {
            l8.e eVar = (l8.e) aVar.f17788b;
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
