package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import java.util.HashMap;
public final class x05 {
    public um4 a;
    public HashMap b;
    public HashMap c;

    public final w05 a(xh4 xh4Var) {
        bad badVar;
        um4 um4Var = this.a;
        el6 el6Var = (el6) xh4Var.b;
        um4Var.getClass();
        dl6 dl6Var = null;
        try {
            xve.i(el6Var, "MarkerOptions must not be null.");
            qae qaeVar = (qae) um4Var.b;
            Parcel R = qaeVar.R();
            jld.b(R, el6Var);
            Parcel Q = qaeVar.Q(R, 11);
            IBinder readStrongBinder = Q.readStrongBinder();
            int i = omf.b;
            if (readStrongBinder == null) {
                badVar = 0;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                if (queryLocalInterface instanceof bad) {
                    badVar = (bad) queryLocalInterface;
                } else {
                    badVar = new v3d(readStrongBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate", (byte) 6);
                }
            }
            Q.recycle();
            if (badVar != 0) {
                dl6Var = new dl6(badVar);
            }
            w05 w05Var = new w05(dl6Var);
            this.b.put(dl6Var, w05Var);
            return w05Var;
        } catch (RemoteException e) {
            p3d.i(e);
            return null;
        }
    }

    public final void b(sj5 sj5Var) {
        um4 um4Var = this.a;
        wz4 wz4Var = ((u05) sj5Var).a;
        um4Var.getClass();
        try {
            xve.i(wz4Var, "CameraUpdate must not be null.");
            qae qaeVar = (qae) um4Var.b;
            Parcel R = qaeVar.R();
            jld.c(R, (al5) wz4Var.a);
            qaeVar.V(R, 5);
        } catch (RemoteException e) {
            p3d.i(e);
        }
    }

    public final void c(sj5 sj5Var) {
        um4 um4Var = this.a;
        wz4 wz4Var = ((u05) sj5Var).a;
        um4Var.getClass();
        try {
            xve.i(wz4Var, "CameraUpdate must not be null.");
            qae qaeVar = (qae) um4Var.b;
            Parcel R = qaeVar.R();
            jld.c(R, (al5) wz4Var.a);
            R.writeInt(500);
            jld.c(R, null);
            qaeVar.V(R, 7);
        } catch (RemoteException e) {
            p3d.i(e);
        }
    }

    public final ky5 d() {
        CameraPosition createFromParcel;
        um4 um4Var = this.a;
        um4Var.getClass();
        try {
            qae qaeVar = (qae) um4Var.b;
            Parcel Q = qaeVar.Q(qaeVar.R(), 1);
            Parcelable.Creator<CameraPosition> creator = CameraPosition.CREATOR;
            int i = jld.a;
            if (Q.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = creator.createFromParcel(Q);
            }
            CameraPosition cameraPosition = createFromParcel;
            Q.recycle();
            LatLng latLng = cameraPosition.a;
            return new ky5(new ak5(latLng.a, latLng.b), cameraPosition.b, (byte) 2);
        } catch (RemoteException e) {
            p3d.i(e);
            return null;
        }
    }

    public final float e() {
        um4 um4Var = this.a;
        um4Var.getClass();
        try {
            qae qaeVar = (qae) um4Var.b;
            Parcel Q = qaeVar.Q(qaeVar.R(), 2);
            float readFloat = Q.readFloat();
            Q.recycle();
            return readFloat;
        } catch (RemoteException e) {
            p3d.i(e);
            return 0.0f;
        }
    }

    public final float f() {
        um4 um4Var = this.a;
        um4Var.getClass();
        try {
            qae qaeVar = (qae) um4Var.b;
            Parcel Q = qaeVar.Q(qaeVar.R(), 3);
            float readFloat = Q.readFloat();
            Q.recycle();
            return readFloat;
        } catch (RemoteException e) {
            p3d.i(e);
            return 0.0f;
        }
    }

    public final aj3 g() {
        Object v3dVar;
        um4 um4Var = this.a;
        um4Var.getClass();
        try {
            j09 j09Var = (j09) um4Var.c;
            if (j09Var == null) {
                qae qaeVar = (qae) um4Var.b;
                Parcel Q = qaeVar.Q(qaeVar.R(), 25);
                IBinder readStrongBinder = Q.readStrongBinder();
                if (readStrongBinder == null) {
                    v3dVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    if (queryLocalInterface instanceof ykd) {
                        v3dVar = (ykd) queryLocalInterface;
                    } else {
                        v3dVar = new v3d(readStrongBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate", (byte) 6);
                    }
                }
                Q.recycle();
                j09Var = new j09(v3dVar, (byte) 21);
                um4Var.c = j09Var;
            }
            aj3 aj3Var = new aj3((byte) 10, false);
            aj3Var.b = j09Var;
            return aj3Var;
        } catch (RemoteException e) {
            p3d.i(e);
            return null;
        }
    }

    public final void h(sj5 sj5Var) {
        um4 um4Var = this.a;
        wz4 wz4Var = ((u05) sj5Var).a;
        um4Var.getClass();
        try {
            xve.i(wz4Var, "CameraUpdate must not be null.");
            qae qaeVar = (qae) um4Var.b;
            Parcel R = qaeVar.R();
            jld.c(R, (al5) wz4Var.a);
            qaeVar.V(R, 4);
        } catch (RemoteException e) {
            p3d.i(e);
        }
    }

    public final void i(wj5 wj5Var) {
        kk6 kk6Var;
        um4 um4Var = this.a;
        if (wj5Var == null) {
            kk6Var = null;
        } else {
            kk6Var = ((y05) wj5Var).a;
        }
        um4Var.getClass();
        try {
            qae qaeVar = (qae) um4Var.b;
            Parcel R = qaeVar.R();
            jld.b(R, kk6Var);
            Parcel Q = qaeVar.Q(R, 91);
            Q.readInt();
            Q.recycle();
        } catch (RemoteException e) {
            p3d.i(e);
        }
    }

    public final void j(int i) {
        um4 um4Var = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                um4Var.c0(4);
                return;
            }
            um4Var.c0(2);
            return;
        }
        um4Var.c0(1);
    }

    public final void k(boolean z) {
        um4 um4Var = this.a;
        um4Var.getClass();
        try {
            qae qaeVar = (qae) um4Var.b;
            Parcel R = qaeVar.R();
            int i = jld.a;
            R.writeInt(z ? 1 : 0);
            qaeVar.V(R, 22);
        } catch (RemoteException e) {
            p3d.i(e);
        }
    }

    public final void l(bk5 bk5Var) {
        um4 um4Var = this.a;
        e05 e05Var = new e05(bk5Var, (byte) 6);
        um4Var.getClass();
        try {
            qae qaeVar = (qae) um4Var.b;
            k9d k9dVar = new k9d(e05Var, 0);
            Parcel R = qaeVar.R();
            jld.c(R, k9dVar);
            qaeVar.V(R, 96);
        } catch (RemoteException e) {
            p3d.i(e);
        }
    }

    public final void m(c22 c22Var) {
        um4 um4Var = this.a;
        e05 e05Var = new e05(this, c22Var);
        um4Var.getClass();
        try {
            qae qaeVar = (qae) um4Var.b;
            k9d k9dVar = new k9d(e05Var);
            Parcel R = qaeVar.R();
            jld.c(R, k9dVar);
            qaeVar.V(R, 30);
        } catch (RemoteException e) {
            p3d.i(e);
        }
    }

    public final void n(int i, int i2, int i3, int i4) {
        um4 um4Var = this.a;
        um4Var.getClass();
        try {
            qae qaeVar = (qae) um4Var.b;
            Parcel R = qaeVar.R();
            R.writeInt(i);
            R.writeInt(i2);
            R.writeInt(i3);
            R.writeInt(i4);
            qaeVar.V(R, 39);
        } catch (RemoteException e) {
            p3d.i(e);
        }
    }
}
