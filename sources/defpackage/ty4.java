package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import java.util.HashMap;
public final class ty4 {
    public wk4 a;
    public HashMap b;
    public HashMap c;

    public final sy4 a(z24 z24Var) {
        i5d i5dVar;
        wk4 wk4Var = this.a;
        zi6 zi6Var = (zi6) z24Var.b;
        wk4Var.getClass();
        yi6 yi6Var = null;
        try {
            fre.i(zi6Var, "MarkerOptions must not be null.");
            a6e a6eVar = (a6e) wk4Var.b;
            Parcel R = a6eVar.R();
            sgd.b(R, zi6Var);
            Parcel Q = a6eVar.Q(R, 11);
            IBinder readStrongBinder = Q.readStrongBinder();
            int i = yhf.b;
            if (readStrongBinder == null) {
                i5dVar = 0;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                if (queryLocalInterface instanceof i5d) {
                    i5dVar = (i5d) queryLocalInterface;
                } else {
                    i5dVar = new ezc(readStrongBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate", (byte) 6);
                }
            }
            Q.recycle();
            if (i5dVar != 0) {
                yi6Var = new yi6(i5dVar);
            }
            sy4 sy4Var = new sy4(yi6Var);
            this.b.put(yi6Var, sy4Var);
            return sy4Var;
        } catch (RemoteException e) {
            fvc.g(e);
            return null;
        }
    }

    public final void b(qh5 qh5Var) {
        wk4 wk4Var = this.a;
        qx4 qx4Var = ((py4) qh5Var).a;
        wk4Var.getClass();
        try {
            fre.i(qx4Var, "CameraUpdate must not be null.");
            a6e a6eVar = (a6e) wk4Var.b;
            Parcel R = a6eVar.R();
            sgd.c(R, (yi5) qx4Var.a);
            a6eVar.V(R, 5);
        } catch (RemoteException e) {
            fvc.g(e);
        }
    }

    public final void c(qh5 qh5Var) {
        wk4 wk4Var = this.a;
        qx4 qx4Var = ((py4) qh5Var).a;
        wk4Var.getClass();
        try {
            fre.i(qx4Var, "CameraUpdate must not be null.");
            a6e a6eVar = (a6e) wk4Var.b;
            Parcel R = a6eVar.R();
            sgd.c(R, (yi5) qx4Var.a);
            R.writeInt(500);
            sgd.c(R, null);
            a6eVar.V(R, 7);
        } catch (RemoteException e) {
            fvc.g(e);
        }
    }

    public final fw5 d() {
        CameraPosition createFromParcel;
        wk4 wk4Var = this.a;
        wk4Var.getClass();
        try {
            a6e a6eVar = (a6e) wk4Var.b;
            Parcel Q = a6eVar.Q(a6eVar.R(), 1);
            Parcelable.Creator<CameraPosition> creator = CameraPosition.CREATOR;
            int i = sgd.a;
            if (Q.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = creator.createFromParcel(Q);
            }
            CameraPosition cameraPosition = createFromParcel;
            Q.recycle();
            LatLng latLng = cameraPosition.a;
            return new fw5(new yh5(latLng.a, latLng.b), cameraPosition.b, (byte) 2);
        } catch (RemoteException e) {
            fvc.g(e);
            return null;
        }
    }

    public final float e() {
        wk4 wk4Var = this.a;
        wk4Var.getClass();
        try {
            a6e a6eVar = (a6e) wk4Var.b;
            Parcel Q = a6eVar.Q(a6eVar.R(), 2);
            float readFloat = Q.readFloat();
            Q.recycle();
            return readFloat;
        } catch (RemoteException e) {
            fvc.g(e);
            return 0.0f;
        }
    }

    public final float f() {
        wk4 wk4Var = this.a;
        wk4Var.getClass();
        try {
            a6e a6eVar = (a6e) wk4Var.b;
            Parcel Q = a6eVar.Q(a6eVar.R(), 3);
            float readFloat = Q.readFloat();
            Q.recycle();
            return readFloat;
        } catch (RemoteException e) {
            fvc.g(e);
            return 0.0f;
        }
    }

    public final s34 g() {
        Object ezcVar;
        wk4 wk4Var = this.a;
        wk4Var.getClass();
        try {
            ln8 ln8Var = (ln8) wk4Var.c;
            if (ln8Var == null) {
                a6e a6eVar = (a6e) wk4Var.b;
                Parcel Q = a6eVar.Q(a6eVar.R(), 25);
                IBinder readStrongBinder = Q.readStrongBinder();
                if (readStrongBinder == null) {
                    ezcVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    if (queryLocalInterface instanceof hgd) {
                        ezcVar = (hgd) queryLocalInterface;
                    } else {
                        ezcVar = new ezc(readStrongBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate", (byte) 6);
                    }
                }
                Q.recycle();
                ln8Var = new ln8(ezcVar, (byte) 22);
                wk4Var.c = ln8Var;
            }
            s34 s34Var = new s34((byte) 6);
            s34Var.b = ln8Var;
            return s34Var;
        } catch (RemoteException e) {
            fvc.g(e);
            return null;
        }
    }

    public final void h(qh5 qh5Var) {
        wk4 wk4Var = this.a;
        qx4 qx4Var = ((py4) qh5Var).a;
        wk4Var.getClass();
        try {
            fre.i(qx4Var, "CameraUpdate must not be null.");
            a6e a6eVar = (a6e) wk4Var.b;
            Parcel R = a6eVar.R();
            sgd.c(R, (yi5) qx4Var.a);
            a6eVar.V(R, 4);
        } catch (RemoteException e) {
            fvc.g(e);
        }
    }

    public final void i(uh5 uh5Var) {
        gi6 gi6Var;
        wk4 wk4Var = this.a;
        if (uh5Var == null) {
            gi6Var = null;
        } else {
            gi6Var = ((uy4) uh5Var).a;
        }
        wk4Var.getClass();
        try {
            a6e a6eVar = (a6e) wk4Var.b;
            Parcel R = a6eVar.R();
            sgd.b(R, gi6Var);
            Parcel Q = a6eVar.Q(R, 91);
            Q.readInt();
            Q.recycle();
        } catch (RemoteException e) {
            fvc.g(e);
        }
    }

    public final void j(int i) {
        wk4 wk4Var = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                wk4Var.e0(4);
                return;
            }
            wk4Var.e0(2);
            return;
        }
        wk4Var.e0(1);
    }

    public final void k(boolean z) {
        wk4 wk4Var = this.a;
        wk4Var.getClass();
        try {
            a6e a6eVar = (a6e) wk4Var.b;
            Parcel R = a6eVar.R();
            int i = sgd.a;
            R.writeInt(z ? 1 : 0);
            a6eVar.V(R, 22);
        } catch (RemoteException e) {
            fvc.g(e);
        }
    }

    public final void l(zh5 zh5Var) {
        wk4 wk4Var = this.a;
        ry4 ry4Var = new ry4(zh5Var, (byte) 4);
        wk4Var.getClass();
        try {
            a6e a6eVar = (a6e) wk4Var.b;
            r4d r4dVar = new r4d(ry4Var, (char) 0);
            Parcel R = a6eVar.R();
            sgd.c(R, r4dVar);
            a6eVar.V(R, 96);
        } catch (RemoteException e) {
            fvc.g(e);
        }
    }

    public final void m(k32 k32Var) {
        wk4 wk4Var = this.a;
        ry4 ry4Var = new ry4(this, k32Var);
        wk4Var.getClass();
        try {
            a6e a6eVar = (a6e) wk4Var.b;
            r4d r4dVar = new r4d(ry4Var, (byte) 0);
            Parcel R = a6eVar.R();
            sgd.c(R, r4dVar);
            a6eVar.V(R, 30);
        } catch (RemoteException e) {
            fvc.g(e);
        }
    }

    public final void n(int i, int i2, int i3, int i4) {
        wk4 wk4Var = this.a;
        wk4Var.getClass();
        try {
            a6e a6eVar = (a6e) wk4Var.b;
            Parcel R = a6eVar.R();
            R.writeInt(i);
            R.writeInt(i2);
            R.writeInt(i3);
            R.writeInt(i4);
            a6eVar.V(R, 39);
        } catch (RemoteException e) {
            fvc.g(e);
        }
    }
}
