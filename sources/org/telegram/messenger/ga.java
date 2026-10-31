package org.telegram.messenger;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import java.util.HashMap;
public final class ga {
    public n4.q f15689a;
    public HashMap f15690b;
    public HashMap f15691c;

    public final fa a(l2.f fVar) {
        s7.a aVar;
        n4.q qVar = this.f15689a;
        j8.f fVar2 = (j8.f) fVar.f11587b;
        qVar.getClass();
        try {
            n6.l.h(fVar2, "MarkerOptions must not be null.");
            i8.f fVar3 = (i8.f) qVar.f13526a;
            Parcel P0 = fVar3.P0();
            s7.b.b(P0, fVar2);
            Parcel O0 = fVar3.O0(P0, 11);
            IBinder readStrongBinder = O0.readStrongBinder();
            int i10 = s7.j.f48091b;
            j8.e eVar = null;
            if (readStrongBinder == null) {
                aVar = 0;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                if (queryLocalInterface instanceof s7.a) {
                    aVar = (s7.a) queryLocalInterface;
                } else {
                    aVar = new a9.a(readStrongBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate", 9);
                }
            }
            O0.recycle();
            if (aVar != 0) {
                eVar = new j8.e(aVar);
            }
            fa faVar = new fa(this, eVar);
            this.f15690b.put(eVar, faVar);
            return faVar;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final void b(ua uaVar) {
        n4.q qVar = this.f15689a;
        za.c cVar = ((da) uaVar).f15217a;
        qVar.getClass();
        try {
            i8.f fVar = (i8.f) qVar.f13526a;
            Parcel P0 = fVar.P0();
            s7.b.c(P0, (x6.a) cVar.f55432b);
            fVar.T0(P0, 5);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final void c(ua uaVar, int i10) {
        n4.q qVar = this.f15689a;
        za.c cVar = ((da) uaVar).f15217a;
        qVar.getClass();
        try {
            i8.f fVar = (i8.f) qVar.f13526a;
            Parcel P0 = fVar.P0();
            s7.b.c(P0, (x6.a) cVar.f55432b);
            P0.writeInt(i10);
            s7.b.c(P0, null);
            fVar.T0(P0, 7);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final jg.c0 d() {
        CameraPosition createFromParcel;
        n4.q qVar = this.f15689a;
        qVar.getClass();
        try {
            i8.f fVar = (i8.f) qVar.f13526a;
            Parcel O0 = fVar.O0(fVar.P0(), 1);
            Parcelable.Creator<CameraPosition> creator = CameraPosition.CREATOR;
            int i10 = s7.b.f48088a;
            if (O0.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = creator.createFromParcel(O0);
            }
            CameraPosition cameraPosition = createFromParcel;
            O0.recycle();
            LatLng latLng = cameraPosition.f5413a;
            return new jg.c0(new cb(latLng.f5416a, latLng.f5417b), cameraPosition.f5414b, 2);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final float e() {
        n4.q qVar = this.f15689a;
        qVar.getClass();
        try {
            i8.f fVar = (i8.f) qVar.f13526a;
            Parcel O0 = fVar.O0(fVar.P0(), 2);
            float readFloat = O0.readFloat();
            O0.recycle();
            return readFloat;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final float f() {
        n4.q qVar = this.f15689a;
        qVar.getClass();
        try {
            i8.f fVar = (i8.f) qVar.f13526a;
            Parcel O0 = fVar.O0(fVar.P0(), 3);
            float readFloat = O0.readFloat();
            O0.recycle();
            return readFloat;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final n2.u g() {
        a9.a aVar;
        n4.q qVar = this.f15689a;
        qVar.getClass();
        try {
            i8.f fVar = (i8.f) qVar.f13526a;
            Parcel O0 = fVar.O0(fVar.P0(), 26);
            IBinder readStrongBinder = O0.readStrongBinder();
            if (readStrongBinder == null) {
                aVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
                if (queryLocalInterface instanceof i8.b) {
                    aVar = (i8.b) queryLocalInterface;
                } else {
                    aVar = new a9.a(readStrongBinder, "com.google.android.gms.maps.internal.IProjectionDelegate", 9);
                }
            }
            O0.recycle();
            a6.i iVar = new a6.i(aVar, 25);
            n2.u uVar = new n2.u(5);
            uVar.f13480b = iVar;
            return uVar;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final k2.m0 h() {
        a9.a aVar;
        n4.q qVar = this.f15689a;
        qVar.getClass();
        try {
            if (((a4.l) qVar.f13527b) == null) {
                i8.f fVar = (i8.f) qVar.f13526a;
                Parcel O0 = fVar.O0(fVar.P0(), 25);
                IBinder readStrongBinder = O0.readStrongBinder();
                if (readStrongBinder == null) {
                    aVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    if (queryLocalInterface instanceof i8.c) {
                        aVar = (i8.c) queryLocalInterface;
                    } else {
                        aVar = new a9.a(readStrongBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate", 9);
                    }
                }
                O0.recycle();
                qVar.f13527b = new a4.l(aVar, 19);
            }
            a4.l lVar = (a4.l) qVar.f13527b;
            ?? obj = new Object();
            obj.f10700a = lVar;
            return obj;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final void i(ua uaVar) {
        n4.q qVar = this.f15689a;
        za.c cVar = ((da) uaVar).f15217a;
        qVar.getClass();
        try {
            i8.f fVar = (i8.f) qVar.f13526a;
            Parcel P0 = fVar.P0();
            s7.b.c(P0, (x6.a) cVar.f55432b);
            fVar.T0(P0, 4);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final void j(ya yaVar) {
        j8.d dVar;
        n4.q qVar = this.f15689a;
        if (yaVar == null) {
            dVar = null;
        } else {
            dVar = ((ha) yaVar).f15852a;
        }
        qVar.getClass();
        try {
            i8.f fVar = (i8.f) qVar.f13526a;
            Parcel P0 = fVar.P0();
            s7.b.b(P0, dVar);
            Parcel O0 = fVar.O0(P0, 91);
            O0.readInt();
            O0.recycle();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final void k(int i10) {
        n4.q qVar = this.f15689a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return;
                }
                qVar.G(4);
                return;
            }
            qVar.G(2);
            return;
        }
        qVar.G(1);
    }

    public final void l(boolean z10) {
        n4.q qVar = this.f15689a;
        qVar.getClass();
        try {
            i8.f fVar = (i8.f) qVar.f13526a;
            Parcel P0 = fVar.P0();
            int i10 = s7.b.f48088a;
            P0.writeInt(z10 ? 1 : 0);
            fVar.T0(P0, 22);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final void m(Runnable runnable) {
        n4.q qVar = this.f15689a;
        s1 s1Var = new s1(runnable, 5);
        i8.f fVar = (i8.f) qVar.f13526a;
        try {
            h8.b bVar = new h8.b(s1Var, (char) 0);
            Parcel P0 = fVar.P0();
            s7.b.c(P0, bVar);
            fVar.T0(P0, 97);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final void n(db dbVar) {
        n4.q qVar = this.f15689a;
        s1 s1Var = new s1(dbVar, 7);
        i8.f fVar = (i8.f) qVar.f13526a;
        try {
            h8.b bVar = new h8.b(s1Var, (byte) 0);
            Parcel P0 = fVar.P0();
            s7.b.c(P0, bVar);
            fVar.T0(P0, 96);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final void o(eb ebVar) {
        n4.q qVar = this.f15689a;
        p pVar = new p(3, this, ebVar);
        i8.f fVar = (i8.f) qVar.f13526a;
        try {
            h8.b bVar = new h8.b(pVar);
            Parcel P0 = fVar.P0();
            s7.b.c(P0, bVar);
            fVar.T0(P0, 30);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final void p(q0.a aVar) {
        n4.q qVar = this.f15689a;
        z9 z9Var = new z9(aVar, 2);
        i8.f fVar = (i8.f) qVar.f13526a;
        try {
            h8.b bVar = new h8.b(z9Var);
            Parcel P0 = fVar.P0();
            s7.b.c(P0, bVar);
            fVar.T0(P0, 36);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final void q(int i10, int i11, int i12, int i13) {
        n4.q qVar = this.f15689a;
        qVar.getClass();
        try {
            i8.f fVar = (i8.f) qVar.f13526a;
            Parcel P0 = fVar.P0();
            P0.writeInt(i10);
            P0.writeInt(i11);
            P0.writeInt(i12);
            P0.writeInt(i13);
            fVar.T0(P0, 39);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
